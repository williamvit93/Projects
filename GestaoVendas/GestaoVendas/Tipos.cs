namespace GestaoVendas
{
    using System;
    using System.Collections.Generic;
    using System.ComponentModel.DataAnnotations;
    using System.ComponentModel.DataAnnotations.Schema;
    using System.Data.Entity.Spatial;

    public partial class Tipos
    {
        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Usage", "CA2214:DoNotCallOverridableMethodsInConstructors")]
        public Tipos()
        {
            VendaProdutos = new HashSet<VendaProdutos>();
            Campanhas = new HashSet<Campanha>();
        }

        [DatabaseGenerated(DatabaseGeneratedOption.None)]
        public int id { get; set; }

        public string descricao { get; set; }

        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Usage", "CA2227:CollectionPropertiesShouldBeReadOnly")]
        public virtual ICollection<VendaProdutos> VendaProdutos { get; set; }
        public virtual ICollection<Campanha> Campanhas{ get; set; }

        public override string ToString()
        {
            return descricao;
        }
    }
}
