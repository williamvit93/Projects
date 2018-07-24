using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace WA.CursoMvc.Domain.Models
{
    public class Cliente : Entity
    {
        //O Id está referenciado na classe Entity
                
        public string Nome { get; set; }
        public string Cpf { get; set; }
        public string Email { get; set; }
        public DateTime DataNascimento { get; set; }
        public DateTime DataCadastro { get; set; }
        public bool Ativo { get; set; }
        public bool Excluido { get; set; }
        public virtual ICollection<Endereco> Enderecos { get; set; }

    }
}
