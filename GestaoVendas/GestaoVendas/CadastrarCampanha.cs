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
    public partial class CadastrarCampanha : Form
    {
        public CadastrarCampanha()
        {
            InitializeComponent();
        }

        public void NovaCampanha()
        {
            var data = dateTermino.Value.Date.CompareTo(dateInicio.Value.Date);
            Random randomico = new Random();
            var newId = randomico.GetHashCode();

            if (txtTitulo.Text == "")
            {
                MessageBox.Show("Insira o Titulo da Campanha");
            }
            else if (data <= 0)
            {
                MessageBox.Show("Insira um Período Válido");

            }
            else
            {
                try
                {
                    Campanha camp = new Campanha()
                    {
                        Id = newId,
                        Inicio = dateInicio.Text,
                        Termino = dateTermino.Text,
                        Titulo = txtTitulo.Text,
                        Tiposid = Convert.ToInt32(comboRevista.SelectedValue)

                    };



                    using (Gestao contexto = new Gestao())
                    {
                        contexto.Campanhas.Add(camp);
                        contexto.SaveChanges();
                    }
                    MessageBox.Show("Campanha Cadastrada com Sucesso");
                }
                catch (Exception ex)
                {
                    MessageBox.Show(ex.Message);
                }
                LimparCampos();
            }
        }

        public void LimparCampos()
        {
            txtTitulo.Text = "";
            comboRevista.Text = "";
            comboRevista.SelectedIndex = -1;
        }

        private void btnCadCampanha_Click(object sender, EventArgs e)
        {
            NovaCampanha();
        }

        private void CadastrarCampanha_Load(object sender, EventArgs e)
        {
            using (Gestao contexto = new Gestao())
            {
                comboRevista.DataSource = contexto.Tipos.Where(r => r.descricao == "AVON" || r.descricao == "NATURA").ToList();
                comboRevista.ValueMember = "id";
                comboRevista.DisplayMember = "descricao";
                comboRevista.Refresh();
                comboRevista.SelectedIndex = -1;
            }
        }

        private void comboRevista_KeyPress(object sender, KeyPressEventArgs e)
        {
            e.Handled = true;
        }
    }
}
