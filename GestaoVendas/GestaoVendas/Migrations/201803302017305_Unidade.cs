namespace GestaoVendas.Migrations
{
    using System;
    using System.Data.Entity.Migrations;
    
    public partial class Unidade : DbMigration
    {
        public override void Up()
        {
            CreateTable(
                "dbo.Unidades",
                c => new
                    {
                        id = c.Int(nullable: false),
                        descricao = c.String(),
                    })
                .PrimaryKey(t => t.id);
            
            AddColumn("dbo.VendaProdutos", "Unidades_id", c => c.Int());
            CreateIndex("dbo.VendaProdutos", "Unidades_id");
            AddForeignKey("dbo.VendaProdutos", "Unidades_id", "dbo.Unidades", "id");
        }
        
        public override void Down()
        {
            DropForeignKey("dbo.VendaProdutos", "Unidades_id", "dbo.Unidades");
            DropIndex("dbo.VendaProdutos", new[] { "Unidades_id" });
            DropColumn("dbo.VendaProdutos", "Unidades_id");
            DropTable("dbo.Unidades");
        }
    }
}
