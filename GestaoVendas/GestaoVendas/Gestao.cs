namespace GestaoVendas
{
    using System;
    using System.Data.Entity;
    using System.ComponentModel.DataAnnotations.Schema;
    using System.Linq;

    public partial class Gestao : DbContext
    {
        public Gestao()
            : base("name=Gestao")
        {
        }

        public virtual DbSet<Clientes> Clientes { get; set; }
        public virtual DbSet<Enderecos> Enderecos { get; set; }
        public virtual DbSet<Tipos> Tipos { get; set; }
        public virtual DbSet<VendaProdutos> VendaProdutos { get; set; }
        public virtual DbSet<Unidades> Unidades { get; set; }
        public virtual DbSet<Campanha> Campanhas { get; set; }

        protected override void OnModelCreating(DbModelBuilder modelBuilder)
        {
            modelBuilder.Entity<Clientes>()
                .HasMany(e => e.Enderecos)
                .WithRequired(e => e.Clientes)
                .HasForeignKey(e => e.clienteid)
                .WillCascadeOnDelete(false);

            modelBuilder.Entity<Clientes>()
                .HasMany(e => e.VendaProdutos)
                .WithRequired(e => e.Clientes)
                .HasForeignKey(e => e.Clienteid)
                .WillCascadeOnDelete(false);

            modelBuilder.Entity<Tipos>()
                .HasMany(e => e.VendaProdutos)
                .WithRequired(e => e.Tipos)
                .HasForeignKey(e => e.Tipoid)
                .WillCascadeOnDelete(false);

            modelBuilder.Entity<Unidades>()
                .HasMany(e=> e.VendaProdutos)
                .WithRequired(e => e.Unidades)
                .HasForeignKey(e => e.Unidadeid)
                .WillCascadeOnDelete(false);

            modelBuilder.Entity<Campanha>()
                .HasMany(e => e.VendaProdutos)
                .WithRequired(e => e.Campanhas)
                .HasForeignKey(e => e.Campanhaid)
                .WillCascadeOnDelete(false);
        }
    }
}
