using System.Collections.Generic;

namespace GestaoMarilucia
{
    public class Endereco 
    {
        public int id { get; set; }
        public Cliente cliente { get; set; }
        
        public int numero { get; set; }
        public string rua { get; set; }
        public string bairro { get; set; }
        public string cidade { get; set; }
        public string cep { get; set; }
        
    }
}