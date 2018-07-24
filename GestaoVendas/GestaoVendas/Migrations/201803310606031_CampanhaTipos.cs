namespace GestaoVendas.Migrations
{
    using System;
    using System.Data.Entity.Migrations;
    
    public partial class CampanhaTipos : DbMigration
    {
        public override void Up()
        {
            AddColumn("dbo.Campanhas", "Tiposid", c => c.Int(nullable: false));
            CreateIndex("dbo.Campanhas", "Tiposid");
            AddForeignKey("dbo.Campanhas", "Tiposid", "dbo.Tipos", "id", cascadeDelete: true);
        }

        public override void Down()
        {
            DropForeignKey("dbo.Campanhas", "Tiposid", "dbo.Tipos");
            DropIndex("dbo.Campanhas", new[] { "Tiposid" });
            DropColumn("dbo.Campanhas", "Tiposid");
        }
    }
}
