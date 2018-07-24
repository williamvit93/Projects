using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.IO;

namespace LeitorEscritor
{
    class Arquivo
    {
        public string nomeDoArquivo;
        private string dataCriacao { get; set; }
        private string caminho { get; set; }

        public Arquivo(string nomeDoArquivo, string dataCriacao)
        {
            this.nomeDoArquivo = nomeDoArquivo;
            this.dataCriacao = dataCriacao;
        }

        public void CriarArquivo()
        {
            caminho = @"C:\Users\willi\OneDrive\Documentos\TESTES\";
            nomeDoArquivo = DateTime.Now.ToString("yyyy") + "-" + DateTime.Now.ToString("MM") + "-" + DateTime.Now.ToString("dd") + " " + DateTime.Now.ToString("HH") + "H" + DateTime.Now.ToString("mm") + "M" + DateTime.Now.ToString("ss") + "S" + ".txt";
            string novoArquivo = caminho + nomeDoArquivo;
            // Cria um novo arquivo e devolve um StreamWriter para ele
            StreamWriter writer = new StreamWriter(novoArquivo);

        }
        
    }
}

