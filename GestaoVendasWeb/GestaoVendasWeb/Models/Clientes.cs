
namespace GestaoVendasWeb.Models
{
    using System.Collections.Generic;
    using System.ComponentModel;
    using System.ComponentModel.DataAnnotations;

    public partial class Clientes
    {
        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Usage", "CA2214:DoNotCallOverridableMethodsInConstructors")]
        public Clientes()
        {
            this.Enderecos = new HashSet<Enderecos>();
            this.VendaProdutos = new HashSet<VendaProdutos>();
        }
        [ScaffoldColumn(false)]
        
        public int id { get; set; }

        [DisplayName("Nome")]
        [Required(ErrorMessage = "O campo nome é obrigatório")]
        public string nome { get; set; }

        [DisplayName("Dívida Atual")]
        [ScaffoldColumn(false)]
        public double divida { get; set; }

        [DisplayName("Último Pagamento")]
        [ScaffoldColumn(false)]
        public string ultimoRec { get; set; }
    
        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Usage", "CA2227:CollectionPropertiesShouldBeReadOnly")]
        public virtual ICollection<Enderecos> Enderecos { get; set; }
        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Usage", "CA2227:CollectionPropertiesShouldBeReadOnly")]
        public virtual ICollection<VendaProdutos> VendaProdutos { get; set; }
    }
}
