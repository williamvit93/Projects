namespace GestaoVendas.Migrations
{
    using System;
    using System.Data.Entity.Migrations;
    
    public partial class Campanha : DbMigration
    {
        public override void Up()
        {
            CreateTable(
                "dbo.Campanhas",
                c => new
                    {
                        Id = c.Int(nullable: false),
                        Titulo = c.String(),
                        Inicio = c.String(),
                        Termino = c.String(),
                    })
                .PrimaryKey(t => t.Id);
            
            AddColumn("dbo.VendaProdutos", "Campanhaid", c => c.Int(nullable: true));
            CreateIndex("dbo.VendaProdutos", "Campanhaid");
            AddForeignKey("dbo.VendaProdutos", "Campanhaid", "dbo.Campanhas", "Id");
        }
        
        public override void Down()
        {
            DropForeignKey("dbo.VendaProdutos", "Campanhaid", "dbo.Campanhas");
            DropIndex("dbo.VendaProdutos", new[] { "Campanhaid" });
            DropColumn("dbo.VendaProdutos", "Campanhaid");
            DropTable("dbo.Campanhas");
        }
    }
}
