using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Banco.Contas;
using Banco.Usuarios;


namespace Banco
{
    class CaixaEletronicoEntity : ICaixaEletronico, IDisposable
    {
        private BancoContext contexto;

        public CaixaEletronicoEntity()
        {
            this.contexto = new BancoContext();
        }

        public void Adicionar(Cliente cl, Conta c)
        {
            contexto.Clientes.Add(cl);
            contexto.Contas.Add(c);
            contexto.SaveChanges();

        }

        public void Atualizar(Cliente cl, Conta c)
        {
            contexto.Clientes.Update(cl);
            contexto.Contas.Update(c);
            contexto.SaveChanges();
        }

        public void AtualizarSaldo(Conta c)
        {
            contexto.Contas.Update(c);
            contexto.SaveChanges();
        }

        public void Dispose()
        {
            contexto.Dispose();
        }

        public IList<Cliente> Clientes()
        {
            return contexto.Clientes.ToList();
        }

        public void Remover(Cliente cl, Conta c)
        {
            contexto.Clientes.Remove(cl);
            contexto.Contas.Remove(c);
            contexto.SaveChanges();
            
        }

        public IList<Conta> Contas()
        {
            return contexto.Contas.ToList();
        }

        public IList<TipoConta> TiposConta()
        {
            return contexto.TiposConta.ToList();
        }

        

        //public IList<Endereco> Enderecos()
        //{
        //    //return contexto.Enderecos.ToList();
        //}
    }
}
