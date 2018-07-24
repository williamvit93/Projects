using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace GestaoMarilucia
{
    public partial class CadastrarVenda : Form
    {

        public CadastrarVenda()
        {
            InitializeComponent();
        }

        public void LimparCampos()
        {
            txtCodigo.Text = "";
            txtObservacoes.Text = "";
            txtPrecoUnit.Text = "";
            txtProduto.Text = "";
            txtQtd.Text = "";
            comboClientes.SelectedIndex = -1;
            comboClientes.Text = "";
            comboTipo.Text = "";
            comboTipo.SelectedIndex = -1;
            
        }

        private void txtPrecoUnit_TextChanged(object sender, EventArgs e)
        {

        }

        private void CadastrarVenda_Load(object sender, EventArgs e)
        {
            using (GestaoContext contexto = new GestaoContext())
            {
                comboClientes.DataSource = contexto.Clientes.OrderBy(x => x.nome).ToList(); // lambda - linq
                comboClientes.ValueMember = "id";
                comboClientes.DisplayMember = "nome";
                comboClientes.Refresh();
                comboClientes.SelectedIndex = -1;

                comboTipo.DataSource = contexto.Tipos.OrderBy(x => x.descricao).ToList(); // lambda - linq
                comboTipo.ValueMember = "id";
                comboTipo.DisplayMember = "descricao";
                comboTipo.Refresh();
                comboTipo.SelectedIndex = -1;
            }

        }

        public Cliente AtualizaDivida()
        {
            using (GestaoContext contexto = new GestaoContext())
            {
                double precoUnitario = Convert.ToDouble(txtPrecoUnit.Text);
                int qtd = Convert.ToInt16(txtQtd.Text);
                var clienteID = Convert.ToInt32(comboClientes.SelectedValue);
                var clienteChange = (Cliente)comboClientes.SelectedItem;

                var cliente = contexto.Clientes.Where(c => c.id == clienteID).FirstOrDefault();
                cliente.divida = cliente.divida + (precoUnitario * qtd);
                return cliente;
            }
        }

        public void CadastraVenda()
        {

            if (txtCodigo.Text == "" || txtPrecoUnit.Text == "" || txtProduto.Text == "" || txtQtd.Text == "")
            {
                MessageBox.Show("Preencha todos os campos");
            }
            else
            {
                try
                {
                    VendaProduto produto = new VendaProduto()
                    {

                        codigo = Convert.ToInt32(txtCodigo.Text),
                        produto = txtProduto.Text,
                        observacao = txtObservacoes.Text,
                        precoUnitario = Convert.ToDouble(txtPrecoUnit.Text),
                        quantidade = Convert.ToInt32(txtQtd.Text),
                        cliente = comboClientes.SelectedItem as Cliente,
                        tipo = comboTipo.SelectedItem as Tipo,
                        dataVenda = Convert.ToString(DateTime.Now)
                    };

                    using (GestaoContext contexto = new GestaoContext())
                    {
                        contexto.Clientes.Update(AtualizaDivida());

                        contexto.VendaProdutos.Add(produto);
                        contexto.Remove(produto.tipo);
                        contexto.SaveChanges();
                        MessageBox.Show("Venda Registrada com Sucesso");
                        LimparCampos();
                    }
                }
                catch (Exception ex)
                {
                    MessageBox.Show(ex.Message);

                }
            }
        }

    private void btnRegVenda_Click(object sender, EventArgs e)
    {

        CadastraVenda();
    }

    private void txtPrecoUnit_KeyPress(object sender, KeyPressEventArgs e)
    {
        if (!char.IsControl(e.KeyChar) && !char.IsDigit(e.KeyChar) && (e.KeyChar != ','))
        {
            e.Handled = true;
        }
    }

    private void txtQtd_KeyPress(object sender, KeyPressEventArgs e)
    {
        if (!Char.IsDigit(e.KeyChar) && e.KeyChar != 08)
        {
            e.Handled = true;
        }
    }

    private void txtCodigo_KeyPress(object sender, KeyPressEventArgs e)
    {
        if (!Char.IsDigit(e.KeyChar) && e.KeyChar != 08)
        {
            e.Handled = true;
        }
    }

    private void txtProduto_KeyPress(object sender, KeyPressEventArgs e)
    {
        if (Char.IsDigit(e.KeyChar) && e.KeyChar != 08)
        {
            e.Handled = true;
        }
    }


}
}
