using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CadastroBD
{
    public class Pessoa
    {
        public int Id { get; internal set; }
        public string nome { get; internal set; }
        public string idade{ get; internal set; }

        public Pessoa (string nome, string idade)
        {
            this.nome = nome;
            this.idade = idade;
        }
    }
}
