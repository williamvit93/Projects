using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using CadastroBD;
using Microsoft.EntityFrameworkCore;

namespace CadastroBD
{
    public class CadastroContext : DbContext
    {
        public DbSet<Pessoa> Pessoas { get; set; }
        


        protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
        {
            optionsBuilder.UseSqlServer("Server=(localdb)\\mssqllocaldb;Database=CadastroDB;Trusted_Connection=true;");
        }
    }
}
