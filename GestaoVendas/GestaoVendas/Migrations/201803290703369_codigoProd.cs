namespace GestaoVendas.Migrations
{
    using System;
    using System.Data.Entity.Migrations;
    
    public partial class codigoProd : DbMigration
    {
        public override void Up()
        {
            AlterColumn("dbo.VendaProdutos", "Codigo", c => c.String());
        }
        
        public override void Down()
        {
            AlterColumn("dbo.VendaProdutos", "Codigo", c => c.Int(nullable: false));
        }
    }
}
