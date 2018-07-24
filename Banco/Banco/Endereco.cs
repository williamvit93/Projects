using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace Banco.Usuarios
{
    public class Endereco
    {
        public int id { get; set; }
        public Cliente cliente { get; set; }
        public int numero { get; set; }
        public string cidade { get; set; }
        public string cep { get; set; }
        public string estado { get; set; }
        public string bairro { get; set; }
        public string rua { get; set; }

    }
}