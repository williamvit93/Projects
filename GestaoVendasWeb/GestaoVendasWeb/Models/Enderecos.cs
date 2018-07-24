//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated from a template.
//
//     Manual changes to this file may cause unexpected behavior in your application.
//     Manual changes to this file will be overwritten if the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

namespace GestaoVendasWeb.Models
{
    using System;
    using System.Collections.Generic;
    using System.ComponentModel;
    using System.ComponentModel.DataAnnotations;

    public partial class Enderecos
    {
        [ScaffoldColumn(false)]
        public int id { get; set; }

        [Required(ErrorMessage = "O campo Numero � obrigat�rio")]
        [DisplayName("Numero")]
        public int numero { get; set; }

        [DisplayName("Rua")]
        [Required(ErrorMessage = "O campo Rua � obrigat�rio")]
        public string rua { get; set; }

        [DisplayName("Bairro")]
        [Required(ErrorMessage = "O campo Bairro � obrigat�rio")]
        public string bairro { get; set; }

        [DisplayName("Cidade")]
        [Required(ErrorMessage = "O campo Cidade � obrigat�rio")]
        public string cidade { get; set; }

        [MaxLength(8, ErrorMessage = "Digite um CEP v�lido")]
        [MinLength(8, ErrorMessage = "Digite um CEP v�lido")]
        [DisplayName("CEP")]
        [Required(ErrorMessage = "O campo CEP � obrigat�rio")]
        public string cep { get; set; }

        [ScaffoldColumn(false)]
        public int clienteid { get; set; }

        [ScaffoldColumn(false)]
        public virtual Clientes Clientes { get; set; }
    }
}