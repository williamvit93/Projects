namespace GestaoVendas
{
    using System;
    using System.Collections.Generic;
    using System.ComponentModel.DataAnnotations;
    using System.ComponentModel.DataAnnotations.Schema;
    using System.Data.Entity.Spatial;

    public partial class Enderecos
    {
        public int id { get; set; }

        public int numero { get; set; }

        public string rua { get; set; }

        public string bairro { get; set; }

        public string cidade { get; set; }

        public string cep { get; set; }

        public int clienteid { get; set; }

        public virtual Clientes Clientes { get; set; }
    }
}
