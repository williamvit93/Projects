using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GestaoMarilucia
{
    public class VendaProduto
    {
        public int id { get; set; }
        public string produto { get; set; }
        public double precoUnitario { get; set; }
        public int codigo { get; set; }
        public string observacao { get; set; }
        public int quantidade { get; set; }
        public string dataVenda { get; set; }
        

        //AVON ou NATURA
        public Tipo tipo { get; set; }
        public Cliente cliente { get; set; }
    }

}
