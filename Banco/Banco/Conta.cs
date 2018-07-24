using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using Banco.Usuarios;

namespace Banco.Contas
{
    public class Conta
    {
        [Key]
        public int numero  { get; set; }

        public double saldo { get; protected set; }
        public TipoConta tipoConta { get; set; }
        public Cliente cliente { get;  set; }


        public Conta(Cliente idCliente)
        {
            this.cliente = idCliente;
            this.numero = numero;
            this.saldo = saldo;
            this.tipoConta = tipoConta;
            
        }


        public Conta()
        {

        }

        public virtual void Saca(double valorASerSacado)
        {
            if (this.saldo >= valorASerSacado && valorASerSacado >= 0)
            {
                if (cliente.Idade >= 18 || (cliente.Idade > -1 && cliente.Idade < 1))
                {
                    this.saldo -= valorASerSacado;
                    MessageBox.Show("Saque Realizado com Sucesso");
                }
                else if (cliente.Idade < 18 && valorASerSacado <= 200)
                {
                    this.saldo -= valorASerSacado;
                    MessageBox.Show("Saque Realizado com Sucesso");
                }
                else
                {
                    MessageBox.Show("Limite de Saque excedido para sua Idade");
                }
            }
            else
            {
                MessageBox.Show("Você não possui saldo sufuciente");
            }
        }

        public virtual void Deposita(double valor)
        {
            if (valor > 0)
            {
                this.saldo += valor;
                MessageBox.Show("Deposito Realizado com Sucesso");
            }
            else
            {
                MessageBox.Show("Valor Inválido");
            }
        }

        public void Transfere(double valor, Conta destino)
        {
            if (this.saldo >= valor)
            {
                this.saldo -= valor;
                destino.saldo += valor;
                MessageBox.Show("Transferência Realizada com Sucesso");
            }
            else
            {
                MessageBox.Show("Saldo Insuficiente");
            }



        }
       

    }
}
