namespace GestaoVendas
{
    using System;
    using System.Collections.Generic;
    using System.ComponentModel.DataAnnotations;
    using System.ComponentModel.DataAnnotations.Schema;
    using System.Data.Entity.Spatial;

    public partial class Clientes
    {
        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Usage", "CA2214:DoNotCallOverridableMethodsInConstructors")]
        public Clientes()
        {
            Enderecos = new HashSet<Enderecos>();
            VendaProdutos = new HashSet<VendaProdutos>();
        }

        public int id { get; set; }

        public string nome { get; set; }

        public double divida { get; set; }

        public string ultimoRec { get; set; }

        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Usage", "CA2227:CollectionPropertiesShouldBeReadOnly")]
        public virtual ICollection<Enderecos> Enderecos { get; set; }

        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Usage", "CA2227:CollectionPropertiesShouldBeReadOnly")]
        public virtual ICollection<VendaProdutos> VendaProdutos { get; set; }

        public override string ToString()
        {
            return nome;
        }
    }
}
