namespace GestaoVendas.Migrations
{
    using System;
    using System.Data.Entity.Migrations;
    
    public partial class _new : DbMigration
    {
        public override void Up()
        {
            CreateTable(
                "dbo.Clientes",
                c => new
                    {
                        id = c.Int(nullable: false, identity: true),
                        nome = c.String(),
                        divida = c.Double(nullable: false),
                        ultimoRec = c.String(),
                    })
                .PrimaryKey(t => t.id);
            
            CreateTable(
                "dbo.Enderecos",
                c => new
                    {
                        id = c.Int(nullable: false, identity: true),
                        numero = c.Int(nullable: false),
                        rua = c.String(),
                        bairro = c.String(),
                        cidade = c.String(),
                        cep = c.String(),
                        clienteid = c.Int(nullable: false),
                    })
                .PrimaryKey(t => t.id)
                .ForeignKey("dbo.Clientes", t => t.clienteid)
                .Index(t => t.clienteid);
            
            CreateTable(
                "dbo.VendaProdutos",
                c => new
                    {
                        Id = c.Int(nullable: false, identity: true),
                        Produto = c.String(),
                        PrecoUnitario = c.Double(nullable: false),
                        Codigo = c.Int(nullable: false),
                        Observacao = c.String(),
                        Quantidade = c.Int(nullable: false),
                        DataVenda = c.String(),
                        Clienteid = c.Int(nullable: false),
                        Tipoid = c.Int(nullable: false),
                    })
                .PrimaryKey(t => t.Id)
                .ForeignKey("dbo.Tipos", t => t.Tipoid)
                .ForeignKey("dbo.Clientes", t => t.Clienteid)
                .Index(t => t.Clienteid)
                .Index(t => t.Tipoid);
            
            //CreateTable(
            //    "dbo.Tipos",
            //    c => new
            //        {
            //            id = c.Int(nullable: false),
            //            descricao = c.String(),
            //        })
            //    .PrimaryKey(t => t.id);
            
        }
        
        public override void Down()
        {
            DropForeignKey("dbo.VendaProdutos", "Clienteid", "dbo.Clientes");
            DropForeignKey("dbo.VendaProdutos", "Tipoid", "dbo.Tipos");
            DropForeignKey("dbo.Enderecos", "clienteid", "dbo.Clientes");
            DropIndex("dbo.VendaProdutos", new[] { "Tipoid" });
            DropIndex("dbo.VendaProdutos", new[] { "Clienteid" });
            DropIndex("dbo.Enderecos", new[] { "clienteid" });
            DropTable("dbo.Tipos");
            DropTable("dbo.VendaProdutos");
            DropTable("dbo.Enderecos");
            DropTable("dbo.Clientes");
        }
    }
}
