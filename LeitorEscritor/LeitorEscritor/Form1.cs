using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using System.IO;

namespace LeitorEscritor
{
    
    public partial class Form1 : Form
    {

        // Cria o nome do arquivo com ano, mês, dia, hora minuto e segundo
        HashSet<Arquivo> arquivos = new HashSet<Arquivo>();
        

        string caminhoteste = @"C:\Users\willi\OneDrive\Documentos\TESTES\";
        string nome = DateTime.Now.ToString("yyyy") + ".txt";
        
        //string folder = System.Configuration.ConfigurationManager.AppSettings.

        public Form1()
        {
            InitializeComponent();
        }

        private void Listar()
        {
            DirectoryInfo Dir = new DirectoryInfo(@"C:\Users\willi\OneDrive\Documentos\TESTES\");


            // Busca automaticamente todos os arquivos em todos os subdiretórios
            FileInfo[] Files = Dir.GetFiles("*", SearchOption.AllDirectories);
            foreach (FileInfo File in Files)
            {
                string FileName = File.FullName.Replace(Dir.FullName, "");
                comboArquivos.Items.Add(FileName);
            }
        }
        private void Form1_Load_1(object sender, EventArgs e)
        {
            Listar();
        }
        private void btnSalvar_Click(object sender, EventArgs e)
        {
            string arquivo = caminhoteste + nome;
            //adicionar o ponteiro da lista arquivos
            Stream saida = File.Open(arquivo, FileMode.Create);
            StreamWriter escritor = new StreamWriter(saida);

            escritor.Write(txttexto.Text);
            escritor.Close();
            saida.Close();
            TextWriter escritores = Console.Out;
        }

        private void btnAbrir_Click(object sender, EventArgs e)
        {
            string arquivo = caminhoteste + nome;
            if (File.Exists(arquivo))
            {
                txttexto.Text = "";
                Stream entrada = File.Open(arquivo, FileMode.Open);
                StreamReader leitor = new StreamReader(entrada);

                string texto = leitor.ReadToEnd();

                txttexto.Text += texto;

                leitor.Close();
                entrada.Close();
            }
            else
            {
                MessageBox.Show("O arquivo não existe");
            }
        }

        private void btnLimpar_Click(object sender, EventArgs e)
        {
            txttexto.Text = "";
        }

        private void btnNovo_Click(object sender, EventArgs e)
        {
            Arquivo arquivo = new Arquivo("novo", DateTime.Now.ToString("ddMMYYYY"));

            arquivos.Add(arquivo);
            arquivo.CriarArquivo();
            comboArquivos.Items.Add(arquivo.nomeDoArquivo);
        }

        private void btnAtualizar_Click(object sender, EventArgs e)
        {
            Listar();
        }
    }
}


