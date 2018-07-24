using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Microsoft.EntityFrameworkCore;

namespace GestaoMarilucia
{
    public class GestaoContext:DbContext
    {
        public DbSet<Cliente> Clientes { get; set; }
        public DbSet<VendaProduto> VendaProdutos { get; set; }
        public DbSet<Tipo> Tipos { get; set; }
        public DbSet<Endereco> Enderecos { get; set; }


        protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
        {
            optionsBuilder.UseSqlServer("Server=(localdb)\\mssqllocaldb;Database=GestaoMarilucia;Trusted_Connection=true;");
        }
    }
}
