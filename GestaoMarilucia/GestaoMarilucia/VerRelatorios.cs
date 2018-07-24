using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using Microsoft.EntityFrameworkCore;



namespace GestaoMarilucia
{
    public partial class VerRelatorios : Form
    {
        public VerRelatorios()
        {
            InitializeComponent();
        }

        public void CarregarTabelaClientes()
        {
            using (GestaoContext contexto = new GestaoContext())
            {

                var clientes = contexto.Clientes.OrderBy(c => c.nome).ToList();
                dataRelatorios.DataSource = clientes;
                dataRelatorios.BackgroundColor = Color.White;
                
                dataRelatorios.Columns["id"].Visible = false;
                dataRelatorios.Columns["nome"].HeaderText = "CLIENTE";
                dataRelatorios.Columns["divida"].HeaderText = "DIVIDA";
                dataRelatorios.Columns["ultimoRec"].HeaderText = "ULTIMO PAGAMENTO";
            }
        }

        public void CarregarTabelaVendaProdutos()
        {
            using (GestaoContext contexto = new GestaoContext())
            {
              

                var vendProd = contexto.VendaProdutos.OrderBy(c => c.cliente.nome).Include(c => c.cliente).ToList();
                dataRelatorios.DataSource = vendProd;

                //Organiza colunas
                dataRelatorios.Columns["cliente"].DisplayIndex = 1;
                dataRelatorios.Columns["produto"].DisplayIndex = 2;
                dataRelatorios.Columns["precoUnitario"].DisplayIndex = 3;
                dataRelatorios.Columns["quantidade"].DisplayIndex = 4;
                dataRelatorios.Columns["observacao"].DisplayIndex = 5;
                dataRelatorios.Columns["codigo"].DisplayIndex = 6;

                //Exclui colunas
                dataRelatorios.Columns["id"].Visible = false;
                dataRelatorios.Columns["tipo"].Visible = false;

                //renomeia colunas
                dataRelatorios.Columns["cliente"].HeaderText = "CLIENTE";
                dataRelatorios.Columns["produto"].HeaderText = "PRODUTO";
                dataRelatorios.Columns["precoUnitario"].HeaderText = "PREÇO";
                dataRelatorios.Columns["quantidade"].HeaderText = "QUANTIDADE COMPRADA";
                dataRelatorios.Columns["observacao"].HeaderText = "DETALHES";
                dataRelatorios.Columns["codigo"].HeaderText = "COD. PRODUTO";
                dataRelatorios.Columns["dataVenda"].HeaderText = "DATA";

            }
        }

        private void VerRelatorios_Load(object sender, EventArgs e)
        {


        }


        private void btnClien_Click(object sender, EventArgs e)
        {
            CarregarTabelaClientes();
        }

        private void btnVendas_Click(object sender, EventArgs e)
        {
            CarregarTabelaVendaProdutos();
        }
    }
}
