using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations.Schema;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GestaoVendas
{
    public class Campanha
    {

        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Usage", "CA2214:DoNotCallOverridableMethodsInConstructors")]
        public Campanha()
        {
            VendaProdutos = new HashSet<VendaProdutos>();
            
        }

        [DatabaseGenerated(DatabaseGeneratedOption.None)]
        public int Id { get; set; }
        public string Titulo { get; set; }
        public string Inicio { get; set; }
        public string Termino { get; set; }
        public int Tiposid { get; set; }
        public Tipos Tipos { get; set; }


        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Usage", "CA2227:CollectionPropertiesShouldBeReadOnly")]
        public virtual ICollection<VendaProdutos> VendaProdutos { get; set; }
        

        public override string ToString()
        {
            return Titulo;
        }
    }
}
