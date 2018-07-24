using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Banco.Contas;
using Banco.Usuarios;

namespace Banco
{
    interface ICaixaEletronico
    {
        void Adicionar(Cliente cl, Conta c);
        void Atualizar(Cliente cl, Conta c);
        void Remover(Cliente cl, Conta c);
        IList<Conta> Contas();
        IList<Cliente> Clientes();
        IList<TipoConta> TiposConta();
      
        //IList<Endereco> Enderecos();
        
    }
}
