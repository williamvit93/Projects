namespace GestaoVendas.Migrations
{
    using System;
    using System.Data.Entity.Migrations;
    
    public partial class VendaUnidadeChaves : DbMigration
    {
        public override void Up()
        {
            DropIndex("dbo.VendaProdutos", new[] { "Unidades_id" });
            DropColumn("dbo.VendaProdutos", "Unidadeid");
            RenameColumn(table: "dbo.VendaProdutos", name: "Unidades_id", newName: "Unidadeid");
            AlterColumn("dbo.VendaProdutos", "Unidadeid", c => c.Int(nullable: false));
            CreateIndex("dbo.VendaProdutos", "Unidadeid");
        }
        
        public override void Down()
        {
            DropIndex("dbo.VendaProdutos", new[] { "Unidadeid" });
            AlterColumn("dbo.VendaProdutos", "Unidadeid", c => c.Int());
            RenameColumn(table: "dbo.VendaProdutos", name: "Unidadeid", newName: "Unidades_id");
            AddColumn("dbo.VendaProdutos", "Unidadeid", c => c.Int(nullable: false));
            CreateIndex("dbo.VendaProdutos", "Unidades_id");
        }
    }
}
