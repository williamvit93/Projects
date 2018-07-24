using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Banco.Usuarios
{
    public class Cliente
    {
        
        public int id { get; set; }
        public string Nome { get; set; }
        public string Cpf { get; set; }
        public string Rg { get; set; }
        public int Idade { get; set; }
        public Endereco endereco;


        public bool MaiorDeIdade()
        {

            return this.Idade >= 18;
        }

        public override string ToString()
        {
            return Nome;
        }

    }
}

