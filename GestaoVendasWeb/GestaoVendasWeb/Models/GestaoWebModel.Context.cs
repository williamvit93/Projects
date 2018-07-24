namespace GestaoVendasWeb.Models
{
    using System.Data.Entity;
    using System.Data.Entity.Infrastructure;

    public partial class GestaoMariluciaEntities : DbContext
    {
        public GestaoMariluciaEntities()
            : base("name=GestaoMariluciaEntities")
        {
        }
    
        protected override void OnModelCreating(DbModelBuilder modelBuilder)
        {
            throw new UnintentionalCodeFirstException();
        }
    
        public virtual DbSet<C__MigrationHistory> C__MigrationHistory { get; set; }
        public virtual DbSet<Campanhas> Campanhas { get; set; }
        public virtual DbSet<Clientes> Clientes { get; set; }
        public virtual DbSet<Enderecos> Enderecos { get; set; }
        public virtual DbSet<Tipos> Tipos { get; set; }
        public virtual DbSet<Unidades> Unidades { get; set; }
        public virtual DbSet<VendaProdutos> VendaProdutos { get; set; }
    }
}
