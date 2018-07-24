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
using Banco.ServicoCep;
using LinqToExcel;

namespace Banco
{
    public partial class CadastroDeContas : Form
    {
        private CaixaEletronico aplicacaoPrincipal;
        List<Cliente> clientes = new List<Cliente>();
        BancoContext db = new BancoContext();

        public CadastroDeContas(CaixaEletronico aplicacaoPrincipal)
        {
            this.aplicacaoPrincipal = aplicacaoPrincipal;
            InitializeComponent();
        }

        private void CadastroDeContas_Load(object sender, EventArgs e)
        {

            using (BancoContext contexto = new BancoContext())
            {
                comboTipoConta.DataSource = contexto.TiposConta.ToList();

                comboTipoConta.DisplayMember = "descricao";
                comboTipoConta.Refresh();
                comboTipoConta.SelectedIndex = -1;

            }
        }

        public void Limpar()
        {

            txtTitularNovaConta.Text = "";
            txtCpf.Text = "";
            comboTipoConta.Text = "";
            txtRua.Text = "";
            txtNasc.Text = "";
            txtRg.Text = "";
            txtBairro.Text = "";
            txtCep.Text = "";
            txtCidade.Text = "";
            txtNumeroCasa.Text = "";
            txtUf.Text = "";

        }


        public void btnCadastrar_Click(object sender, EventArgs e)
        {


            if (txtTitularNovaConta.Text != "")
            {

                //converte os textos de entrada

                string nome = txtTitularNovaConta.Text;
                string cpf = txtCpf.Text;
                string rua = txtRua.Text;
                string cep = txtCep.Text;
                string estado = txtUf.Text;
                int numero = Convert.ToInt16(txtNumeroCasa.Text);
                string cidade = txtCidade.Text;
                string bairro = txtBairro.Text;
                string rg = txtRg.Text;
                TimeSpan intervalo = DateTime.Now.Subtract(Convert.ToDateTime(txtNasc.Text));
                var idade = intervalo.Days / 365;

                try
                {
                    Cliente cliente = new Cliente()
                    {
                        Cpf = cpf,
                        Nome = nome,
                        Rg = rg,
                        Idade = idade,


                    };
                    Endereco endereco = new Endereco()
                    {

                        rua = rua,
                        numero = numero,
                        cidade = cidade,
                        cep = cep,
                        bairro = bairro,
                        estado = estado,
                        cliente = cliente
                    };


                    Conta conta = new Conta()
                    {
                        cliente = cliente,
                        tipoConta = comboTipoConta.SelectedValue as TipoConta
                    };

                    using (var contexto = new BancoContext())
                    {
                        contexto.Enderecos.Add(endereco);
                        contexto.Clientes.Add(cliente);
                        contexto.Contas.Add(conta);

                        contexto.Remove(conta.tipoConta);
                        contexto.SaveChanges();


                    }
                    MessageBox.Show("Conta " + comboTipoConta.Text + " cadastrada com Sucesso");

                    Limpar();
                    aplicacaoPrincipal.CarregaDados();



                }
                catch (System.Exception ex)
                {
                    MessageBox.Show(ex.Message);
                }

            }
            else
            {
                MessageBox.Show("Preencha todos os campos");
            }
        }

        private void txtNumeroNovaConta_KeyPress(object sender, KeyPressEventArgs e)
        {

        }

        private void txtTitularNovaConta_KeyPress(object sender, KeyPressEventArgs e)
        {
            if (Char.IsDigit(e.KeyChar) && e.KeyChar != 08)
            {
                e.Handled = true;
            }
        }

        private void comboTipoConta_KeyPress(object sender, KeyPressEventArgs e)
        {
            e.Handled = true;
        }

        private void txtRua_TextChanged(object sender, EventArgs e)
        {

        }

        private void txtCpf_KeyPress(object sender, KeyPressEventArgs e)
        {
            if (!Char.IsDigit(e.KeyChar) && e.KeyChar != 08)
            {
                e.Handled = true;
            }
        }

        private void txtRg_KeyPress(object sender, KeyPressEventArgs e)
        {
            if (!Char.IsDigit(e.KeyChar) && e.KeyChar != 08)
            {
                e.Handled = true;
            }
        }

        private void btn_CarrContas_Click(object sender, EventArgs e)
        {
            CarregarContas();
        }

        private void btnCep_Click(object sender, EventArgs e)
        {
            ServicoCep.AtendeClienteClient ws = new ServicoCep.AtendeClienteClient("AtendeClientePort");

            try
            {
                var dados = ws.consultaCEP(txtCep.Text);
                txtRua.Text = dados.end;
                txtBairro.Text = dados.bairro;
                txtCidade.Text = dados.cidade;
                txtUf.Text = dados.uf;
            }
            catch (System.ServiceModel.FaultException ex)
            {
                MessageBox.Show(ex.Message);
            }
        }

        private void CarregarContas()
        {
            OpenFileDialog file = new OpenFileDialog();
            file.ShowDialog();
            var arquivo = file.FileName;
            var excel = new ExcelQueryFactory(arquivo);
            var listaClientes = from listaCl in excel.Worksheet<Cliente>("Planilha1") select listaCl;
            var listaEnderecos = from listaE in excel.Worksheet<Endereco>("Planilha1") select listaE;
            var listaContas = from lista in excel.Worksheet<Conta>("Planilha1") select lista;
            var listaTipoContas = from lista in excel.Worksheet<TipoConta>("Planilha1") select lista;

            foreach (var cliente in listaClientes)
            {
                var cl = new Cliente()
                {
                    Nome = cliente.Nome,
                    Cpf = cliente.Cpf,
                    Idade = cliente.Idade,
                    Rg = cliente.Rg
                };
                db.Clientes.Add(cl);

                foreach (var tipo in listaTipoContas)
                {
                    var tc = new TipoConta()
                    {
                        descricao = tipo.descricao
                    };
                    db.TiposConta.Add(tc);

                    foreach (var conta in listaContas)
                    {
                        var c = new Conta()
                        {
                            cliente = cl,
                            tipoConta = tc
                        };
                        db.Contas.Add(c);
                        foreach (var endereco in listaEnderecos)
                        {
                            var end = new Endereco()
                            {
                                rua = endereco.rua,
                                numero = endereco.numero,
                                estado = endereco.estado,
                                cidade = endereco.cidade,
                                cep = endereco.cep,
                                bairro = endereco.bairro,
                                cliente = cl
                            };
                            db.Enderecos.Add(end);
                        }
                    }
                }
            }
            db.SaveChanges();
        }
    }
}


