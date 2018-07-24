using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using Banco.Contas;
using Banco.Usuarios;

namespace Banco
{
    public partial class CaixaEletronico : Form
    {
        BancoContext contexto = new BancoContext();
        CaixaEletronicoEntity querys = new CaixaEletronicoEntity();

        public CaixaEletronico()
        {
            InitializeComponent();
        }

        public void CarregaDados()
        {
            //Carrega combo de contas

            comboContas.DataSource = contexto.Contas.OrderBy(x => x.cliente.Nome).ToList(); // lambda - linq
            comboContas.ValueMember = "cliente";
            comboContas.DisplayMember = "Nome";
            comboContas.Refresh();
            comboContas.SelectedIndex = -1;

            //Carrega combo de contas para trasferencia

            comboTransferir.DataSource = contexto.Contas.OrderBy(x => x.cliente.Nome).ToList(); // lambda - linq
            comboTransferir.ValueMember = "cliente";
            comboTransferir.DisplayMember = "Nome";
            comboTransferir.Refresh();
            comboTransferir.SelectedIndex = -1;
        }
        private void CaixaEletronico_Load(object sender, EventArgs e)
        {
            CarregaDados();

        }



        private Conta RetornaContaSelecionadaTransfere()
        {
            var contaSelecionada = ((Conta)comboTransferir.SelectedItem);
            return contaSelecionada;
        }

        private Cliente RetornarClienteSelecionado()
        {
            var clienteSelecionado = ((Cliente)comboContas.SelectedValue);
            return clienteSelecionado;
        }

        private Conta RetornaContaSelecionada()
        {
            var contaSelecionada = ((Conta)comboContas.SelectedItem);
            return contaSelecionada;
        }



        private void label3_Click(object sender, EventArgs e)
        {

        }

        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {

            contexto.Clientes.ToList();
            contexto.TiposConta.ToList();


            txtTitular.Text = "";
            txtNumero.Text = "";
            txtSaldo.Text = "";
            txtTipoDeConta.Text = "";

            if (comboContas.SelectedIndex != -1)
            {

                Conta visualizaConta = ((Conta)comboContas.SelectedItem);
                txtTitular.Text = visualizaConta.cliente.Nome;

                txtSaldo.Text = Convert.ToString(visualizaConta.saldo);
                txtNumero.Text = visualizaConta.numero.ToString();
                txtTipoDeConta.Text = visualizaConta.tipoConta.descricao;
            }

        }

        private void btnNovaConta_Click(object sender, EventArgs e)
        {

            CadastroDeContas cadastro = new CadastroDeContas(this);
            cadastro.ShowDialog();
            CarregaDados();

        }

        public void LimparCampos()
        {
            txtNumero.Text = "";
            txtSaldo.Text = "";
            txtTipoDeConta.Text = "";
            txtTitular.Text = "";
            txtValor.Text = "";
            comboContas.Text = "";
            comboTransferir.Text = "";
        }



        private void btnMostrarQtdContas(object sender, EventArgs e)
        {
            using (BancoContext contexto = new BancoContext())
            {


                var listaC = contexto.Contas.ToList();

                MessageBox.Show("Existem " + contexto.Contas.Count() + " contas cadastradas");
            }
        }

        private void btn_Remover_Click(object sender, EventArgs e)
        {
            try 
            {
                querys.Remover((Cliente)RetornarClienteSelecionado(), (Conta)RetornaContaSelecionada());
                LimparCampos();
                MessageBox.Show("Conta Removida com Sucesso");
                CarregaDados();
            }
            catch(Exception ex)
            {
                MessageBox.Show(ex.Message);
            }

        }

        private void btnRemoveTudo_Click(object sender, EventArgs e)
        {
            if (comboContas.Items.Count > 0)
            {
                for (int i = 0; i < comboContas.Items.Count; i++)
                {
                    var excluirCliente = contexto.Clientes.FirstOrDefault();
                    var excluirConta = contexto.Contas.FirstOrDefault();
                    //var excluirEndereco = contexto.Enderecos.FirstOrDefault();

                    contexto.Remove(excluirConta);
                    contexto.Remove(excluirCliente);
                    //contexto.Remove(excluirEndereco);
                    contexto.SaveChanges();
                }

                CarregaDados();
                LimparCampos();
                MessageBox.Show("Contas excluídas com Sucesso!!");
            }
            else
            {
                MessageBox.Show("Não existem contas cadastradas");
            }

           
        }

        private void btnDepositar_Click_1(object sender, EventArgs e)
        {
            if (txtValor.Text == "")
            {
                MessageBox.Show("Digite o Valor do Deposito");
            }
            else
            {
                double saldoAtual = Convert.ToDouble(txtSaldo.Text);

                double valor = Convert.ToDouble(txtValor.Text);
                RetornaContaSelecionada().Deposita(valor);
                txtSaldo.Text = Convert.ToString(RetornaContaSelecionada().saldo);
                querys.AtualizarSaldo(RetornaContaSelecionada());

                txtValor.Text = "";
            }
        }

        private void btnSacar_Click(object sender, EventArgs e)
        {
            if (txtValor.Text == "")
            {
                MessageBox.Show("Digite o Valor do Saque");
            }
            else
            {

                double saldoAtual = Convert.ToDouble(txtSaldo.Text);

                double valor = Convert.ToDouble(txtValor.Text);
                RetornaContaSelecionada().Saca(valor);
                txtSaldo.Text = Convert.ToString(RetornaContaSelecionada().saldo);
                querys.AtualizarSaldo(RetornaContaSelecionada());
                txtValor.Text = "";

            }
        }

        private void Transferir_Click_1(object sender, EventArgs e)
        {
            if (Convert.ToString(comboTransferir.Text) == "")
            {
                MessageBox.Show("Escolha a conta destino");

            }
            else if (RetornaContaSelecionada() == RetornaContaSelecionadaTransfere())
            {
                MessageBox.Show("Escolha uma conta destino válida");
            }
            else
            {
                RetornaContaSelecionada().Transfere(Convert.ToDouble(txtValor.Text), RetornaContaSelecionadaTransfere());
                txtSaldo.Text = Convert.ToString(RetornaContaSelecionada().saldo);
                querys.AtualizarSaldo(RetornaContaSelecionada());
                querys.AtualizarSaldo(RetornaContaSelecionadaTransfere());
            }
            txtValor.Text = "";
        }

        private void txtValor_KeyPress(object sender, KeyPressEventArgs e)
        {
            if (!char.IsControl(e.KeyChar) && !char.IsDigit(e.KeyChar) && (e.KeyChar != ','))
            {
                e.Handled = true;
            }
        }

       
    }
}

