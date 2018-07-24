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
    public partial class RegistrarRecebimento : Form
    {
        Gestao contexto = new Gestao();
        public RegistrarRecebimento()
        {
            InitializeComponent();
        }

        public void LimparCampos()
        {
            txtValorRecebido.Text = "";
            comboClientes.SelectedIndex = -1;
            comboClientes.Text = "";
        }

        private void RegistrarRecebimento_Load(object sender, EventArgs e)
        {
            using (Gestao contexto = new Gestao())
            {
                comboClientes.DataSource = contexto.Clientes.OrderBy(c => c.nome).ToList();
                comboClientes.ValueMember = "id";
                comboClientes.DisplayMember = "nome";
                comboClientes.Refresh();
                comboClientes.SelectedIndex = -1;
            }
        }

        public void ReceberPagamento()
        {
            if (txtValorRecebido.Text != "")
            {
                try
                {

                    double valorRecebido = Convert.ToDouble(txtValorRecebido.Text);
                    Clientes cliente = new Clientes();
                    cliente.id = Convert.ToInt16(comboClientes.SelectedValue);
                    var atualizaCliente = contexto.Clientes.Find(cliente.id);


                    if (atualizaCliente.divida >= valorRecebido)
                    {

                        atualizaCliente.divida = atualizaCliente.divida - valorRecebido;
                        atualizaCliente.ultimoRec = Convert.ToString(DateTime.Now);


                        contexto.SaveChanges();

                        MessageBox.Show("Recebimento Registrado com Sucesso");
                        LimparCampos();
                    }

                    else
                    {
                        MessageBox.Show("O Valor recebido é maior que a divida do Cliente");
                    }
                }
                catch (Exception ex)
                {
                    MessageBox.Show(ex.Message);
                }
            }
            else
            {
                MessageBox.Show("Insira o valor à receber");
            }
        }


        private void txtValorRecebido_KeyPress(object sender, KeyPressEventArgs e)
        {
            if (!char.IsControl(e.KeyChar) && !char.IsDigit(e.KeyChar) && (e.KeyChar != ','))
            {
                e.Handled = true;
            }
        }

        private void btnSalvar_Click(object sender, EventArgs e)
        {
            ReceberPagamento();
        }

        private void comboClientes_KeyPress(object sender, KeyPressEventArgs e)
        {
            e.Handled = true;
        }
    }
}
