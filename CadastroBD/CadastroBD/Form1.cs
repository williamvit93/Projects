using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace CadastroBD
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }
        List<Pessoa> pessoas = new List<Pessoa>();
        private void btnSalvar_Click(object sender, EventArgs e)
        {
            string nome = txtNome.Text;
            string idade = txtIdade.Text;

            var p = new Pessoa(nome, idade);

            using (var contexto = new CadastroContext())
            {
                contexto.Pessoas.Add(p);

                contexto.SaveChanges();

            }

        }

        private void Form1_Load(object sender, EventArgs e)
        {
            using (CadastroContext contexto = new CadastroContext())
            {
                comboPessoa.DataSource = contexto.Pessoas.ToList();
                comboPessoa.ValueMember = "id";
                comboPessoa.DisplayMember = "Nome";
                comboPessoa.Refresh();
            }
        }
    }
    }

