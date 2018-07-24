using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Banco.Contas
{
    public class ContaPoupanca : Conta
    {
        public override void Saca(double valorASerSacado)
        {
            this.saldo -= valorASerSacado + 0.1;
        }

        public override void Deposita(double valor)
        {
            this.saldo += valor - 0.1;
        }
    }
}
