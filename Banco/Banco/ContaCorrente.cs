using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Banco.Contas
{
    
    public class ContaCorrente : Conta
    {
        

        public override void Saca(double valorASerSacado)
        {
            this.saldo -= valorASerSacado;
        }

        public override void Deposita(double valor)
        {
            this.saldo += valor;
        }
        
    }
}
