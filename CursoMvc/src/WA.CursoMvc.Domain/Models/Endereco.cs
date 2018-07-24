using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace WA.CursoMvc.Domain.Models
{
    public class Endereco : Entity
    {
        //O Id está referenciado na classe Entity

        public string Logradouro { get; set; }
        public string Numero { get; set; }
        public string Complemento { get; set; }
        public string Bairro { get; set; }
        public string Cep { get; set; }
        public string Cidade { get; set; }
        public string Estado { get; set; }
        public Guid ClienteId { get; set; }
        public virtual Cliente Cliente { get; set; }
    }
}
