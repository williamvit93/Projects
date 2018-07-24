namespace GestaoVendas
{
    using System;
    using System.Collections.Generic;
    using System.ComponentModel.DataAnnotations;
    using System.ComponentModel.DataAnnotations.Schema;
    using System.Data.Entity.Spatial;

    public partial class VendaProdutos
    {
        public int Id { get; set; }

        public string Produto { get; set; }

        public double PrecoUnitario { get; set; }

        public string Codigo { get; set; }

        public string Observacao { get; set; }

        public int Quantidade { get; set; }

        public string DataVenda { get; set; }

        public int Clienteid { get; set; }

        public int Tipoid { get; set; }

        public int Unidadeid { get; set; }

        public int Campanhaid { get; set; }

        public virtual Clientes Clientes { get; set; }

        public virtual Tipos Tipos { get; set; }

        public virtual Unidades Unidades { get; set; }

        public virtual Campanha Campanhas { get; set; }
    }
}
