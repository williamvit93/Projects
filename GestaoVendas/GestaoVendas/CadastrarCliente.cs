using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace GestaoVendas
{
    public partial class CadastrarCliente : Form
    {
        Gestao contexto = new Gestao();

        public CadastrarCliente()
        {

            InitializeComponent();
        }

        public void LimparCampos()
        {
            txtBairro.Text = "";
            txtCep.Text = "";
            txtCidade.Text = "";
            txtNome.Text = "";
            txtNum.Text = "";
            txtRua.Text = "";
        }

        public void CadastraCliente()
        {

            if (txtBairro.Text == "" || txtCep.Text == "" || txtCidade.Text == "" || txtNome.Text == "" || txtNum.Text == "" || txtRua.Text == "")
            {
                MessageBox.Show("Preencha todos os campos");
            }
            else
            {
                //try
                //{

                    Enderecos endereco = new Enderecos() { bairro = txtBairro.Text };

                    Clientes cliente = new Clientes() { nome = txtNome.Text };

                    endereco.cidade = txtCidade.Text;
                    endereco.numero = Convert.ToInt16(txtNum.Text);
                    endereco.cep = txtCep.Text;
                    endereco.clienteid = cliente.id;
                    endereco.rua = txtRua.Text;


                    contexto.Clientes.Add(cliente);
                    contexto.Enderecos.Add(endereco);
                    contexto.SaveChanges();
                    MessageBox.Show("Cliente Cadastrado com Sucesso");
                    LimparCampos();
                //}
                //catch (Exception ex)
                //{
                //    MessageBox.Show(ex.Message);
                //}
            }
        }


        private void btnCadastrar_Click(object sender, EventArgs e)


        {
            CadastraCliente();

        }

        private void txtNome_KeyPress(object sender, KeyPressEventArgs e)
        {
            if (Char.IsDigit(e.KeyChar) && e.KeyChar != 08)
            {
                e.Handled = true;
            }
        }

        private void txtRua_KeyPress(object sender, KeyPressEventArgs e)
        {
            if (Char.IsDigit(e.KeyChar) && e.KeyChar != 08)
            {
                e.Handled = true;
            }
        }

        private void txtBairro_KeyPress(object sender, KeyPressEventArgs e)
        {
            if (Char.IsDigit(e.KeyChar) && e.KeyChar != 08)
            {
                e.Handled = true;
            }
        }

        private void txtCidade_KeyPress(object sender, KeyPressEventArgs e)
        {
            if (Char.IsDigit(e.KeyChar) && e.KeyChar != 08)
            {
                e.Handled = true;
            }
        }

        private void txtCep_KeyPress(object sender, KeyPressEventArgs e)
        {
            if (!Char.IsDigit(e.KeyChar) && e.KeyChar != 08)
            {
                e.Handled = true;
            }
        }

        private void txtNum_KeyPress(object sender, KeyPressEventArgs e)
        {
            if (!Char.IsDigit(e.KeyChar) && e.KeyChar != 08)
            {
                e.Handled = true;
            }
        }

        private void CadastrarCliente_Load(object sender, EventArgs e)
        {

        }

        private void btnBuscaCep_Click(object sender, EventArgs e)
        {
            ServicoCep.AtendeClienteClient ws = new ServicoCep.AtendeClienteClient("AtendeClientePort");
            lblCarregando.Visible = true;
            try
            {
                var dados = ws.consultaCEP(txtCep.Text);
                txtRua.Text = dados.end;
                txtBairro.Text = dados.bairro;
                txtCidade.Text = dados.cidade;

            }
            catch (System.ServiceModel.FaultException ex)
            {
                MessageBox.Show(ex.Message);
            }
            lblCarregando.Visible = false;
        }

        private void lblCarregando_Click(object sender, EventArgs e)
        {

        }
    }
}