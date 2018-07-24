using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GestaoMarilucia
{
    public class Cliente
    {
        public int id { get; set; }
        public string nome { get; set; }
        public double divida { get; set; }
        internal Endereco endereco { get; set; }
        public string ultimoRec { get; set; }


        public Cliente()
        {

        }

        public void CalcularDivida(double precoUnitario, int quantidade)
        {
            this.divida = divida + (precoUnitario * quantidade);
           
        }

        public override string ToString()
        {
            return nome;
        }

        
    }


}
