using Microsoft.EntityFrameworkCore.Metadata;
using Microsoft.EntityFrameworkCore.Migrations;
using System;
using System.Collections.Generic;

namespace Banco.Migrations
{
    public partial class full : Migration
    {
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.CreateTable(
                name: "Clientes",
                columns: table => new
                {
                    id = table.Column<int>(nullable: false)
                        .Annotation("SqlServer:ValueGenerationStrategy", SqlServerValueGenerationStrategy.IdentityColumn),
                    Cpf = table.Column<string>(nullable: true),
                    Idade = table.Column<int>(nullable: false),
                    Nome = table.Column<string>(nullable: true),
                    Rg = table.Column<string>(nullable: true)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_Clientes", x => x.id);
                });

            migrationBuilder.CreateTable(
                name: "TiposConta",
                columns: table => new
                {
                    id = table.Column<int>(nullable: false)
                        .Annotation("SqlServer:ValueGenerationStrategy", SqlServerValueGenerationStrategy.IdentityColumn),
                    descricao = table.Column<string>(nullable: true)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_TiposConta", x => x.id);
                });

            migrationBuilder.CreateTable(
                name: "Enderecos",
                columns: table => new
                {
                    id = table.Column<int>(nullable: false)
                        .Annotation("SqlServer:ValueGenerationStrategy", SqlServerValueGenerationStrategy.IdentityColumn),
                    bairro = table.Column<string>(nullable: true),
                    cep = table.Column<string>(nullable: true),
                    cidade = table.Column<string>(nullable: true),
                    clienteid = table.Column<int>(nullable: true),
                    estado = table.Column<string>(nullable: true),
                    numero = table.Column<int>(nullable: false),
                    rua = table.Column<string>(nullable: true)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_Enderecos", x => x.id);
                    table.ForeignKey(
                        name: "FK_Enderecos_Clientes_clienteid",
                        column: x => x.clienteid,
                        principalTable: "Clientes",
                        principalColumn: "id",
                        onDelete: ReferentialAction.Cascade);
                });

            migrationBuilder.CreateTable(
                name: "Contas",
                columns: table => new
                {
                    numero = table.Column<int>(nullable: false)
                        .Annotation("SqlServer:ValueGenerationStrategy", SqlServerValueGenerationStrategy.IdentityColumn),
                    clienteid = table.Column<int>(nullable: true),
                    saldo = table.Column<double>(nullable: false),
                    tipoContaid = table.Column<int>(nullable: true)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_Contas", x => x.numero);
                    table.ForeignKey(
                        name: "FK_Contas_Clientes_clienteid",
                        column: x => x.clienteid,
                        principalTable: "Clientes",
                        principalColumn: "id",
                        onDelete: ReferentialAction.Restrict);
                    table.ForeignKey(
                        name: "FK_Contas_TiposConta_tipoContaid",
                        column: x => x.tipoContaid,
                        principalTable: "TiposConta",
                        principalColumn: "id",
                        onDelete: ReferentialAction.Restrict);
                });

            migrationBuilder.CreateIndex(
                name: "IX_Contas_clienteid",
                table: "Contas",
                column: "clienteid");

            migrationBuilder.CreateIndex(
                name: "IX_Contas_tipoContaid",
                table: "Contas",
                column: "tipoContaid");

            migrationBuilder.CreateIndex(
                name: "IX_Enderecos_clienteid",
                table: "Enderecos",
                column: "clienteid");
        }

        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropTable(
                name: "Contas");

            migrationBuilder.DropTable(
                name: "Enderecos");

            migrationBuilder.DropTable(
                name: "TiposConta");

            migrationBuilder.DropTable(
                name: "Clientes");
        }
    }
}
