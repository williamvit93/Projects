using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Data.Entity;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace GestaoVendas
{
    public partial class VerRelatorios : Form
    {
        public VerRelatorios()
        {
            InitializeComponent();
        }

        public void CarregarTabelaClientes()
        {


            try
            {
                using (Gestao contexto = new Gestao())
                {

                    var clientes = contexto.Clientes.OrderBy(c => c.nome).Include(x => x.Enderecos).Include(x => x.VendaProdutos).ToList();
                    dataRelatorios.DataSource = clientes;

                    dataRelatorios.Columns["id"].Visible = false;
                    dataRelatorios.Columns["Enderecos"].Visible = false;
                    dataRelatorios.Columns["VendaProdutos"].Visible = false;

                    //mostra colunas
                    dataRelatorios.Columns["nome"].Visible = true;
                    dataRelatorios.Columns["divida"].Visible = true;
                    dataRelatorios.Columns["ultimoRec"].Visible = true;

                    dataRelatorios.Columns["nome"].HeaderText = "CLIENTE";
                    dataRelatorios.Columns["divida"].HeaderText = "DIVIDA";
                    dataRelatorios.Columns["ultimoRec"].HeaderText = "ULTIMO PAGAMENTO";

                    dataRelatorios.Columns["ultimoRec"].Width = 120;
                }
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }

        }

        public void CarregarTabelaCampanhas()
        {
            using (Gestao contexto = new Gestao())
            {
                var camp = contexto.Campanhas.Where(c => c.Id != 1).Include(t => t.Tipos).OrderBy(c => c.Inicio).ToList();

                dataRelatorios.DataSource = camp;

                //Organiza Colunas
                dataRelatorios.Columns["Titulo"].DisplayIndex = 1;
                dataRelatorios.Columns["Inicio"].DisplayIndex = 2;
                dataRelatorios.Columns["Termino"].DisplayIndex = 3;
                dataRelatorios.Columns["Tipos"].DisplayIndex = 4;

                //Exclui colunas
                dataRelatorios.Columns["Tiposid"].Visible = false;
                dataRelatorios.Columns["Id"].Visible = false;
                dataRelatorios.Columns["VendaProdutos"].Visible = false;

                //Mostra Colunas
                dataRelatorios.Columns["Titulo"].Visible = true;
                dataRelatorios.Columns["Inicio"].Visible = true;
                dataRelatorios.Columns["Termino"].Visible = true;
                dataRelatorios.Columns["Tipos"].Visible = true;

                //Renomeando colunas
                dataRelatorios.Columns["Titulo"].HeaderText = "TITULO";
                dataRelatorios.Columns["Inicio"].HeaderText = "INÍCIO";
                dataRelatorios.Columns["Termino"].HeaderText = "TÉRMINO";
                dataRelatorios.Columns["Tipos"].HeaderText = "REVISTA";

            }
        }

        public void CarregarCampanhasAvon()
        {
            using (Gestao contexto = new Gestao())
            {
                var camp = contexto.Campanhas.Where(c => c.Id != 1 && c.Tiposid == 1).Include(t => t.Tipos).OrderBy(c => c.Inicio).ToList();

                dataRelatorios.DataSource = camp;

                //Organiza Colunas
                dataRelatorios.Columns["Titulo"].DisplayIndex = 1;
                dataRelatorios.Columns["Inicio"].DisplayIndex = 2;
                dataRelatorios.Columns["Termino"].DisplayIndex = 3;
                dataRelatorios.Columns["Tipos"].DisplayIndex = 4;

                //Exclui colunas
                dataRelatorios.Columns["Tiposid"].Visible = false;
                dataRelatorios.Columns["Id"].Visible = false;
                dataRelatorios.Columns["VendaProdutos"].Visible = false;

                //Mostra Colunas
                dataRelatorios.Columns["Titulo"].Visible = true;
                dataRelatorios.Columns["Inicio"].Visible = true;
                dataRelatorios.Columns["Termino"].Visible = true;
                dataRelatorios.Columns["Tipos"].Visible = true;

                //Renomeando colunas
                dataRelatorios.Columns["Titulo"].HeaderText = "TITULO";
                dataRelatorios.Columns["Inicio"].HeaderText = "INÍCIO";
                dataRelatorios.Columns["Termino"].HeaderText = "TÉRMINO";
                dataRelatorios.Columns["Tipos"].HeaderText = "REVISTA";

            }
        }

        public void CarregarCampanhasNatura()
        {
            using (Gestao contexto = new Gestao())
            {
                var camp = contexto.Campanhas.Where(c => c.Id != 1 && c.Tiposid == 2).Include(t => t.Tipos).OrderBy(c => c.Inicio).ToList();

                dataRelatorios.DataSource = camp;

                //Organiza Colunas
                dataRelatorios.Columns["Titulo"].DisplayIndex = 1;
                dataRelatorios.Columns["Inicio"].DisplayIndex = 2;
                dataRelatorios.Columns["Termino"].DisplayIndex = 3;
                dataRelatorios.Columns["Tipos"].DisplayIndex = 4;

                //Exclui colunas
                dataRelatorios.Columns["Tiposid"].Visible = false;
                dataRelatorios.Columns["Id"].Visible = false;
                dataRelatorios.Columns["VendaProdutos"].Visible = false;

                //Mostra Colunas
                dataRelatorios.Columns["Titulo"].Visible = true;
                dataRelatorios.Columns["Inicio"].Visible = true;
                dataRelatorios.Columns["Termino"].Visible = true;
                dataRelatorios.Columns["Tipos"].Visible = true;

                //Renomeando colunas
                dataRelatorios.Columns["Titulo"].HeaderText = "TITULO";
                dataRelatorios.Columns["Inicio"].HeaderText = "INÍCIO";
                dataRelatorios.Columns["Termino"].HeaderText = "TÉRMINO";
                dataRelatorios.Columns["Tipos"].HeaderText = "REVISTA";

            }
        }

        public void CarregarTabelaVendaProdutos()
        {

            using (Gestao contexto = new Gestao())
            {


                var vendProd = contexto.VendaProdutos.OrderBy(c => c.Id)
                    .Include(v => v.Clientes)
                    .Include(v => v.Tipos)
                    .Include(u => u.Unidades)
                    .Include(c => c.Campanhas).ToList();

                dataRelatorios.DataSource = vendProd;

                //Organiza colunas
                dataRelatorios.Columns["Clientes"].DisplayIndex = 1;
                dataRelatorios.Columns["produto"].DisplayIndex = 2;
                dataRelatorios.Columns["precoUnitario"].DisplayIndex = 3;
                dataRelatorios.Columns["Unidades"].DisplayIndex = 4;
                dataRelatorios.Columns["quantidade"].DisplayIndex = 5;
                dataRelatorios.Columns["observacao"].DisplayIndex = 6;
                dataRelatorios.Columns["codigo"].DisplayIndex = 7;
                dataRelatorios.Columns["Tipos"].DisplayIndex = 8;
                dataRelatorios.Columns["Campanhas"].DisplayIndex = 9;
                dataRelatorios.Columns["dataVenda"].DisplayIndex = 10;

                //Exclui colunas
                dataRelatorios.Columns["id"].Visible = false;
                dataRelatorios.Columns["tipoid"].Visible = false;
                dataRelatorios.Columns["clienteid"].Visible = false;
                dataRelatorios.Columns["Unidadeid"].Visible = false;
                dataRelatorios.Columns["Campanhaid"].Visible = false;

                //mostra colunas
                dataRelatorios.Columns["Clientes"].Visible = true;
                dataRelatorios.Columns["produto"].Visible = true;
                dataRelatorios.Columns["precoUnitario"].Visible = true;
                dataRelatorios.Columns["Unidades"].Visible = true;
                dataRelatorios.Columns["quantidade"].Visible = true;
                dataRelatorios.Columns["observacao"].Visible = true;
                dataRelatorios.Columns["codigo"].Visible = true;
                dataRelatorios.Columns["Tipos"].Visible = true;
                dataRelatorios.Columns["dataVenda"].Visible = true;
                dataRelatorios.Columns["Campanhas"].Visible = true;

                //renomeia colunas
                dataRelatorios.Columns["Clientes"].HeaderText = "CLIENTE";
                dataRelatorios.Columns["produto"].HeaderText = "PRODUTO";
                dataRelatorios.Columns["precoUnitario"].HeaderText = "PREÇO";
                dataRelatorios.Columns["Unidades"].HeaderText = "UNIDADE";
                dataRelatorios.Columns["quantidade"].HeaderText = "QTD COMPRADA";
                dataRelatorios.Columns["observacao"].HeaderText = "DETALHES";
                dataRelatorios.Columns["codigo"].HeaderText = "COD. PRODUTO";
                dataRelatorios.Columns["dataVenda"].HeaderText = "DATA";
                dataRelatorios.Columns["Tipos"].HeaderText = "TIPO";
                dataRelatorios.Columns["Campanhas"].HeaderText = "CAMPANHA";

                dataRelatorios.Columns["dataVenda"].Width = 120;
                dataRelatorios.Columns["codigo"].Width = 70;
                dataRelatorios.Columns["Tipos"].Width = 60;
                dataRelatorios.Columns["quantidade"].Width = 75;
                dataRelatorios.Columns["precoUnitario"].Width = 60;
            }
        }

        public void LancarPedidos()
        {
            using (Gestao contexto = new Gestao())
            {


                var vendProd = contexto.VendaProdutos.OrderByDescending(c => c.DataVenda)
                    .Where(x => x.Tipoid == 1 || x.Tipoid == 2)
                    .Include(v => v.Clientes)
                    .Include(v => v.Tipos)
                    .Include(c => c.Campanhas).ToList();

                dataRelatorios.DataSource = vendProd;

                //Organiza colunas

                dataRelatorios.Columns["codigo"].DisplayIndex = 1;
                dataRelatorios.Columns["quantidade"].DisplayIndex = 2;
                dataRelatorios.Columns["produto"].DisplayIndex = 3;
                dataRelatorios.Columns["observacao"].DisplayIndex = 4;
                dataRelatorios.Columns["Campanhas"].DisplayIndex = 5;
                dataRelatorios.Columns["Tipos"].DisplayIndex = 6;
                dataRelatorios.Columns["dataVenda"].DisplayIndex = 7;

                //Exclui colunas
                dataRelatorios.Columns["id"].Visible = false;
                dataRelatorios.Columns["tipoid"].Visible = false;
                dataRelatorios.Columns["clienteid"].Visible = false;
                dataRelatorios.Columns["Clientes"].Visible = false;
                dataRelatorios.Columns["precoUnitario"].Visible = false;
                dataRelatorios.Columns["Unidadeid"].Visible = false;
                dataRelatorios.Columns["Unidades"].Visible = false;
                dataRelatorios.Columns["Campanhaid"].Visible = false;

                //mostra colunas
                dataRelatorios.Columns["codigo"].Visible = true;
                dataRelatorios.Columns["quantidade"].Visible = true;
                dataRelatorios.Columns["produto"].Visible = true;
                dataRelatorios.Columns["observacao"].Visible = true;
                dataRelatorios.Columns["Tipos"].Visible = true;
                dataRelatorios.Columns["dataVenda"].Visible = true;
                dataRelatorios.Columns["Campanhas"].Visible = true;

                //renomeia colunas
                dataRelatorios.Columns["produto"].HeaderText = "PRODUTO";
                dataRelatorios.Columns["precoUnitario"].HeaderText = "PREÇO";
                dataRelatorios.Columns["quantidade"].HeaderText = "QTD COMPRADA";
                dataRelatorios.Columns["observacao"].HeaderText = "DETALHES";
                dataRelatorios.Columns["codigo"].HeaderText = "COD. PRODUTO";
                dataRelatorios.Columns["dataVenda"].HeaderText = "DATA";
                dataRelatorios.Columns["Tipos"].HeaderText = "REVISTA";
                dataRelatorios.Columns["Campanhas"].HeaderText = "CAMPANHA";

                dataRelatorios.Columns["dataVenda"].Width = 120;
                dataRelatorios.Columns["codigo"].Width = 70;
                dataRelatorios.Columns["Tipos"].Width = 60;
                dataRelatorios.Columns["quantidade"].Width = 75;
                dataRelatorios.Columns["precoUnitario"].Width = 60;
            }
        }

        public void MostrarAlimentos()
        {

            using (Gestao contexto = new Gestao())
            {
                var vendProd = contexto.VendaProdutos.OrderByDescending(c => c.DataVenda)
                    .Where(x => x.Tipoid == 3 || x.Tipoid == 4).Include(v => v.Clientes)
                    .Include(v => v.Tipos)
                    .Include(u => u.Unidades).Include(c => c.Campanhas).ToList();

                dataRelatorios.DataSource = vendProd;

                //Organiza colunas
                dataRelatorios.Columns["produto"].DisplayIndex = 1;
                dataRelatorios.Columns["Unidades"].DisplayIndex = 2;
                dataRelatorios.Columns["quantidade"].DisplayIndex = 3;
                dataRelatorios.Columns["precoUnitario"].DisplayIndex = 4;
                dataRelatorios.Columns["observacao"].DisplayIndex = 5;
                dataRelatorios.Columns["Tipos"].DisplayIndex = 6;
                dataRelatorios.Columns["dataVenda"].DisplayIndex = 7;

                //Exclui colunas
                dataRelatorios.Columns["id"].Visible = false;
                dataRelatorios.Columns["tipoid"].Visible = false;
                dataRelatorios.Columns["clienteid"].Visible = false;
                dataRelatorios.Columns["Clientes"].Visible = false;
                dataRelatorios.Columns["Tipos"].Visible = false;
                dataRelatorios.Columns["Codigo"].Visible = false;
                dataRelatorios.Columns["Unidadeid"].Visible = false;
                dataRelatorios.Columns["Campanhaid"].Visible = false;
                dataRelatorios.Columns["Campanhas"].Visible = false;


                //Mostra Colunas
                dataRelatorios.Columns["produto"].Visible = true;
                dataRelatorios.Columns["precoUnitario"].Visible = true;
                dataRelatorios.Columns["quantidade"].Visible = true;
                dataRelatorios.Columns["observacao"].Visible = true;
                dataRelatorios.Columns["Tipos"].Visible = true;
                dataRelatorios.Columns["dataVenda"].Visible = true;
                dataRelatorios.Columns["Unidades"].Visible = true;


                //renomeia colunas
                dataRelatorios.Columns["produto"].HeaderText = "PRODUTO";
                dataRelatorios.Columns["precoUnitario"].HeaderText = "PREÇO";
                dataRelatorios.Columns["quantidade"].HeaderText = "QUANTIDADE";
                dataRelatorios.Columns["observacao"].HeaderText = "DETALHES";
                dataRelatorios.Columns["dataVenda"].HeaderText = "DATA";
                dataRelatorios.Columns["Tipos"].HeaderText = "TIPO";
                dataRelatorios.Columns["Unidades"].HeaderText = "UNIDADE";


                dataRelatorios.Columns["dataVenda"].Width = 120;
                dataRelatorios.Columns["codigo"].Width = 70;
                dataRelatorios.Columns["Tipos"].Width = 60;
                dataRelatorios.Columns["quantidade"].Width = 75;
                dataRelatorios.Columns["precoUnitario"].Width = 60;
            }

        }

        private void VerRelatorios_Load(object sender, EventArgs e)
        {
            dataRelatorios.BackgroundColor = Color.DarkCyan;


        }

        public void ExcluirCampanha()
        {
            try
            {
                using (Gestao contexto = new Gestao())
                {
                    if (dataRelatorios.CurrentRow != null)
                    {

                        var linha = (Campanha)dataRelatorios.CurrentRow.DataBoundItem;
                        var campanhaSelecionada = linha.Id;

                        var campanha = contexto.Campanhas.Find(campanhaSelecionada);

                        contexto.Campanhas.Remove(campanha);
                        contexto.SaveChanges();

                        MessageBox.Show("Campanha Excluída com Sucesso");

                        CarregarTabelaCampanhas();
                    }
                    else
                    {
                        MessageBox.Show("Selecione uma Campanha");
                    }

                }
            }
            catch (Exception)
            {
                MessageBox.Show("Você Não Pode Excluir uma Campanha que Contenha Vendas Cadastradas");

            }

        }

        public void ExcluirVenda()
        {
            using (Gestao contexto = new Gestao())
            {
                if (dataRelatorios.CurrentRow != null)
                {

                    var linha = (VendaProdutos)dataRelatorios.CurrentRow.DataBoundItem;
                    var VendaSelecionada = linha.Id;

                    var venda = contexto.VendaProdutos.Find(VendaSelecionada);

                    //Atualiza divida
                    var novaDivida = venda.PrecoUnitario * venda.Quantidade;
                    var cliente = contexto.Clientes.Find(venda.Clienteid);
                    cliente.divida = cliente.divida - novaDivida;


                    contexto.VendaProdutos.Remove(venda);
                    contexto.SaveChanges();

                    MessageBox.Show("Venda Excluída com Sucesso");

                    CarregarTabelaVendaProdutos();
                }
                else
                {
                    MessageBox.Show("Selecione uma Venda");
                }
            }
        }

        public void ExcluirCliente()
        {
            using (Gestao contexto = new Gestao())
            {
                if (dataRelatorios.CurrentRow != null)
                {

                    var linha = (Clientes)dataRelatorios.CurrentRow.DataBoundItem;
                    var clienteSelecionado = linha.id;

                    var cliente = contexto.Clientes.Find(clienteSelecionado);

                    contexto.Clientes.Remove(cliente);
                    contexto.SaveChanges();

                    MessageBox.Show("Cliente Excluído com Sucesso");

                    CarregarTabelaClientes();
                }
                else
                {
                    MessageBox.Show("Selecione um Cliente");
                }
            }
        }

        private void button1_Click(object sender, EventArgs e)
        {
            ExcluirCliente();
        }

        private void btnExcluirVenda_Click(object sender, EventArgs e)
        {
            ExcluirVenda();
        }




        private void btnExcluirCampanha_Click(object sender, EventArgs e)
        {
            ExcluirCampanha();
        }



        private void mostrarClientesToolStripMenuItem1_Click(object sender, EventArgs e)
        {
            CarregarTabelaClientes();
            btnExcluir.Visible = true;
            btnExcluirVenda.Visible = false;
            btnExcluirCampanha.Visible = false;
        }

        private void mostrarVendasToolStripMenuItem1_Click(object sender, EventArgs e)
        {
            CarregarTabelaVendaProdutos();
            btnExcluirVenda.Visible = true;
            btnExcluir.Visible = false;
            btnExcluirCampanha.Visible = false;
        }

        private void mostrarCampanhasToolStripMenuItem1_Click(object sender, EventArgs e)
        {
            CarregarTabelaCampanhas();
            btnExcluir.Visible = false;
            btnExcluirVenda.Visible = false;
            btnExcluirCampanha.Visible = true;
        }

        private void lançarPedidosToolStripMenuItem1_Click(object sender, EventArgs e)
        {
            LancarPedidos();
            btnExcluir.Visible = false;
            btnExcluirVenda.Visible = true;
            btnExcluirCampanha.Visible = false;
        }

        private void docesESalgadosToolStripMenuItem1_Click(object sender, EventArgs e)
        {
            MostrarAlimentos();
            btnExcluir.Visible = false;
            btnExcluirVenda.Visible = true;
            btnExcluirCampanha.Visible = false;
        }

        private void campanhasAvonToolStripMenuItem1_Click(object sender, EventArgs e)
        {
            CarregarCampanhasAvon();
            btnExcluir.Visible = false;
            btnExcluirVenda.Visible = false;
            btnExcluirCampanha.Visible = true;
        }

        private void campanhasNaturaToolStripMenuItem1_Click(object sender, EventArgs e)
        {
            CarregarCampanhasNatura();
            btnExcluir.Visible = false;
            btnExcluirVenda.Visible = false;
            btnExcluirCampanha.Visible = true;
        }
    }
}

