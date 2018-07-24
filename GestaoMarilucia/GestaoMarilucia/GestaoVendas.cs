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
    public partial class GestaoVendas : Form
    {
        public GestaoVendas()
        {
            InitializeComponent();
        }

        private void btnCadCliente_Click(object sender, EventArgs e)
        {
            CadastrarCliente cadCliente = new CadastrarCliente();
            cadCliente.ShowDialog();
        }

        private void btnCadVenda_Click(object sender, EventArgs e)
        {
            CadastrarVenda cadVenda = new CadastrarVenda();
            cadVenda.ShowDialog();
        }

        private void btnReceber_Click(object sender, EventArgs e)
        {
            RegistrarRecebimento regRec = new RegistrarRecebimento();
            regRec.ShowDialog();
        }

        private void btnRelatorios_Click(object sender, EventArgs e)
        {
            VerRelatorios vrela = new VerRelatorios();
            vrela.ShowDialog();
        }
    }
}
