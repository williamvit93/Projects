namespace GestaoVendas.Migrations
{
    using System;
    using System.Data.Entity.Migrations;
    
    public partial class VendaUnidade2 : DbMigration
    {
        public override void Up()
        {
            DropForeignKey("dbo.VendaProdutos", "Unidades_id", "dbo.Unidades");
            DropIndex("dbo.VendaProdutos", new[] { "Unidades_id" });
            DropColumn("dbo.VendaProdutos", "Unidades_id");
            AddColumn("dbo.VendaProdutos", "Unidadeid", c => c.Int(nullable: false));
        }
        
        public override void Down()
        {
            DropColumn("dbo.VendaProdutos", "Unidadeid");
        }
    }
}
