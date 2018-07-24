using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations.Schema;
using System.Data.Entity.Infrastructure.Annotations;
using System.Data.Entity.ModelConfiguration;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using WA.CursoMvc.Domain.Models;

namespace WA.CursoMvc.Data.EntityConfig
{
    public class ClienteConfig : EntityTypeConfiguration<Cliente>
    {
        public ClienteConfig()
        {
            //referencia o atributo como chave primaria
            HasKey(c => c.Id);

            Property(c=> c.Id)
                .HasColumnName("ClienteId");

            //Cria chave composta//HasKey(c => new { c.ClienteId, c.Cpf }); 

            Property(c => c.Nome)
                .IsRequired()
                .HasMaxLength(150)
                .HasColumnType("nvarchar")
                .HasColumnName("STR_NOME");

            //Configura as propriedade do CPF na base de dados
            Property(c => c.Cpf)

                // campo obrigatório
                .IsRequired()
                //tamanho fixo e único, gerará um erro se digitar um dado menor que o requerido
                .HasMaxLength(11)
                .IsFixedLength()
                // cria um indice para acelerar a busca por CPF
                .HasColumnAnnotation("Index", new IndexAnnotation(new IndexAttribute("IX_Cpf") { IsUnique = true }));

            ToTable("Clientes");
        }
    }
}
