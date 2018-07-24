using System;
using System.Collections.Generic;
using System.Data.Entity.ModelConfiguration;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using WA.CursoMvc.Domain.Models;

namespace WA.CursoMvc.Data.EntityConfig
{
    public class EnderecoConfig : EntityTypeConfiguration<Endereco>
    {
        public EnderecoConfig()
        {
            HasKey(e => e.Id);

            Property(c => c.Id)
                .HasColumnName("EnderecoId");

            Property(e => e.Logradouro)
                .IsRequired()
                .HasMaxLength(150);

            Property(e => e.Numero)
                .IsRequired()
                .HasMaxLength(20);

            Property(e => e.Bairro)
                .IsRequired()
                .HasMaxLength(50);

            Property(e => e.Cep)
                .HasMaxLength(8)
                .IsFixedLength();

            Property(e => e.Complemento)
                .HasMaxLength(100);

            //HasOptional()
            HasRequired(e => e.Cliente)
                .WithMany(c => c.Enderecos)
                .HasForeignKey(e => e.ClienteId);

            ToTable("Enderecos");
        }
    }
}
