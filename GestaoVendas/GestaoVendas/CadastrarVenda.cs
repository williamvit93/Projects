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

            comboTipo.Text = "";
            comboTipo.SelectedIndex = -1;
            comboCampanha.SelectedIndex = -1;
            comboUnidade.SelectedIndex = -1;

        }

        public void CarregarClientes()
        {
            using (Gestao contexto = new Gestao())
            {

                comboClientes.DataSource = contexto.Clientes.OrderBy(x => x.nome).ToList();
                comboClientes.ValueMember = "id";
                comboClientes.DisplayMember = "nome";
                comboClientes.Refresh();
                comboClientes.SelectedIndex = -1;
            }
        }

        public void CarregarTipos()
        {
            using (Gestao contexto = new Gestao())
            {

                comboTipo.DataSource = contexto.Tipos.Where(t => t.id != 10).ToList();
                comboTipo.ValueMember = "id";
                comboTipo.DisplayMember = "descricao";
                comboTipo.Refresh();
                comboTipo.SelectedIndex = -1;

            }
        }

        public void CarregarUnidades()
        {
            using (Gestao contexto = new Gestao())
            {
                comboUnidade.DataSource = contexto.Unidades.ToList();
                comboUnidade.ValueMember = "id";
                comboUnidade.DisplayMember = "descricao";
                comboUnidade.Refresh();
                comboUnidade.SelectedIndex = -1;
            }
        }

        public void CarregarCampanhas()
        {
            using (Gestao contexto = new Gestao())
            {
                var campanhasAvon = contexto.Campanhas.Where(t => t.Id != 1 && t.Tiposid == 1).ToList();
                var campanhasNatura = contexto.Campanhas.Where(t => t.Id != 1 && t.Tiposid == 2).ToList();

                if (comboTipo.SelectedIndex == 0)
                {
                    comboCampanha.DataSource = campanhasAvon;
                    comboCampanha.ValueMember = "Id";
                    comboCampanha.DisplayMember = "Titulo";
                    comboCampanha.Refresh();
                    comboCampanha.SelectedIndex = -1;

                    txtCodigo.MaxLength = 6;
                }
                else if (comboTipo.SelectedIndex == 1)
                {
                    comboCampanha.DataSource = campanhasNatura;
                    comboCampanha.ValueMember = "Id";
                    comboCampanha.DisplayMember = "Titulo";
                    comboCampanha.Refresh();
                    comboCampanha.SelectedIndex = -1;

                    txtCodigo.MaxLength = 5;
                }

            }
        }

        private void txtPrecoUnit_TextChanged(object sender, EventArgs e)
        {

        }

        private void CadastrarVenda_Load(object sender, EventArgs e)
        {
            CarregarClientes();
            CarregarTipos();
            CarregarUnidades();
        }

        public void CadastraVenda()
        {

            if (txtProduto.Text == "")
            {
                MessageBox.Show("Insira o Nome do Produto");

            }
            else if (txtPrecoUnit.Text == "")
            {
                MessageBox.Show("Insira o Preço do Produto");

            }
            else if (txtQtd.Text == "")
            {
                MessageBox.Show("Insira a Quantidade Vendida");
            }
            else
            {
                try
                {
                    Tipos newTipo = new Tipos();
                    newTipo.descricao = comboTipo.SelectedText;
                    newTipo.id = Convert.ToInt16(comboTipo.SelectedValue);
                    VendaProdutos produto = new VendaProdutos();

                    if (comboTipo.SelectedIndex == 0 || comboTipo.SelectedIndex == 1)
                    {
                        produto.Codigo = txtCodigo.Text;
                        produto.Produto = txtProduto.Text;
                        produto.Observacao = txtObservacoes.Text;
                        produto.PrecoUnitario = Convert.ToDouble(txtPrecoUnit.Text);
                        produto.Quantidade = Convert.ToInt32(txtQtd.Text);
                        produto.Clienteid = Convert.ToInt32(comboClientes.SelectedValue);
                        produto.Tipoid = newTipo.id;
                        produto.DataVenda = Convert.ToString(DateTime.Now);
                        produto.Unidadeid = Convert.ToInt32(comboUnidade.SelectedValue);
                        produto.Campanhaid = Convert.ToInt32(comboCampanha.SelectedValue);
                    }
                    else
                    {
                        produto.Codigo = null;
                        produto.Produto = txtProduto.Text;
                        produto.Observacao = txtObservacoes.Text;
                        produto.PrecoUnitario = Convert.ToDouble(txtPrecoUnit.Text);
                        produto.Quantidade = Convert.ToInt32(txtQtd.Text);
                        produto.Clienteid = Convert.ToInt32(comboClientes.SelectedValue);
                        produto.Tipoid = newTipo.id;
                        produto.DataVenda = Convert.ToString(DateTime.Now);
                        produto.Unidadeid = Convert.ToInt32(comboUnidade.SelectedValue);
                        produto.Campanhaid = 1;
                    }

                    using (Gestao contexto = new Gestao())
                    {

                        var cliente = contexto.Clientes.Find(produto.Clienteid);
                        var novaDivida = produto.PrecoUnitario * produto.Quantidade;
                        cliente.divida = cliente.divida + novaDivida;



                        contexto.VendaProdutos.Add(produto);

                        contexto.SaveChanges();
                        MessageBox.Show("Venda Registrada Com Sucesso");
                        LimparCampos();
                    }
                }
                catch (Exception)
                {
                    MessageBox.Show("Preencha Todos os Campos".ToUpper());

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

        private void comboTipo_SelectedIndexChanged(object sender, EventArgs e)
        {
            if (comboTipo.SelectedIndex == 2 || comboTipo.SelectedIndex == 3)
            {
                txtCodigo.Hide();
                lblCod.Hide();
                lblCampanha.Hide();
                comboCampanha.Hide();

            }
            else
            {
                txtCodigo.Show();

                //Mostras as campanhas
                CarregarCampanhas();
                lblCampanha.Show();
                comboCampanha.Show();

                lblQtd.Show();
                lblPrecoUnit.Text = "Preço Unit.";
                lblKg.Hide();
                lblCod.Show();
            }
        }

        private void comboUnidade_SelectedIndexChanged(object sender, EventArgs e)
        {
            if (comboUnidade.SelectedIndex == 0)
            {
                lblKg.Show();
                lblPrecoUnit.Text = "Preço/KG";
                lblQtd.Hide();
                lblCampanha.Hide();
                comboCampanha.Hide();

            }
            else
            {
                lblCampanha.Show();
                comboCampanha.Show();
                lblQtd.Show();
                lblKg.Hide();
                lblPrecoUnit.Text = "Preço Unit.";
            }
        }

        private void comboTipo_KeyPress(object sender, KeyPressEventArgs e)
        {
            e.Handled = true;
        }

        private void comboCampanha_KeyPress(object sender, KeyPressEventArgs e)
        {
            e.Handled = true;
        }

        private void comboUnidade_KeyPress(object sender, KeyPressEventArgs e)
        {
            e.Handled = true;
        }

        private void comboClientes_KeyPress(object sender, KeyPressEventArgs e)
        {
            e.Handled = true;
        }
    }
}
