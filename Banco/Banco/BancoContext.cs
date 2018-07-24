using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Banco.Contas;
using Banco.Usuarios;
using Microsoft.EntityFrameworkCore;

namespace Banco
{
    public class BancoContext : DbContext
    {
        public DbSet<Cliente> Clientes { get; set; }
        public DbSet<Conta> Contas { get; set; }
        public DbSet<TipoConta> TiposConta { get; set; }
        public DbSet<Endereco> Enderecos{ get; set; }

        protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
        {
            optionsBuilder.UseSqlServer("Server=(localdb)\\mssqllocaldb;Database=BancoDB;Trusted_Connection=true;");
        }
    }
}
