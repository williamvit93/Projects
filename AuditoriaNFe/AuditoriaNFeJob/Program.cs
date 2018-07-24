using System;
using System.Linq;
using System.Text;
using System.IO;
using System.Configuration;
using System.Threading.Tasks;
using System.Timers;
using System.Collections.Concurrent;

namespace AuditoriaNFeJob
{
    class Program
    {
        static void Main(string[] args)
        {
            try
            {
                var arquivoChave = ConfigurationManager.AppSettings["ArquivoChave"];
                var caminhoNFE = ConfigurationManager.AppSettings["CaminhoNFE"];
                var caminhoCTE = ConfigurationManager.AppSettings["CaminhoCTE"];
                var caminhoCTEFatura = ConfigurationManager.AppSettings["CaminhoCTEFatura"];
                
                var arquivosNFE = Directory.GetFiles(caminhoNFE, "*", SearchOption.AllDirectories);
                var arquivosCTE = Directory.GetFiles(caminhoCTE, "*", SearchOption.AllDirectories);
                var arquivosCTEFatura = Directory.GetFiles(caminhoCTEFatura, "*", SearchOption.AllDirectories);

                var linhaFormato = "\'{0};{1};{2};{3};";

                // lê o arquivo de chave única de comparação
                var arquivoChaveUnica = File.ReadAllLines(Path.Combine(AppDomain.CurrentDomain.BaseDirectory, arquivoChave)).Distinct();
                
                var sb = new StringBuilder();
                var sbTime = new StringBuilder();

                //Controle de tempo
                System.DateTime horario = DateTime.Now;

                sb.AppendLine("chave;achou_xml;achou_pdf;tipo");

                var chavesRestantes = arquivoChaveUnica.Count();
                
                // loop em paralelo 
<<<<<<< .mine
                Parallel.ForEach(arquivoChaveUnica.Distinct(), new ParallelOptions() { MaxDegreeOfParallelism = 1 }, (chaveUnica) =>
=======
                Parallel.ForEach(arquivoChaveUnica, new ParallelOptions() { MaxDegreeOfParallelism = 20 }, (chaveUnica) =>
>>>>>>> .r8762
                {
                    Console.Clear();
                    Console.WriteLine("Chaves restantes: " + chavesRestantes--);
                 
                    var encontrouPDF = "não";
                    var encontrouXML = "não";
                    var tipo = "?";

                    var arquivosNFeEncontrados = arquivosNFE.Where(x => x.Contains(chaveUnica));
                    var arquivosCTeEncontrados = arquivosCTE.Where(x => x.Contains(chaveUnica));
                    var arquivosCTeFaturaEncontrados = arquivosCTEFatura.Where(x => x.Contains(chaveUnica));

                    if (arquivosNFeEncontrados != null && arquivosNFeEncontrados.Count() > 0)
                    {
                        tipo = "NFe";
                        
                        if (arquivosNFeEncontrados.FirstOrDefault(x => x.Contains("pdf")) != null)
                        {
                            encontrouPDF = "sim";
                        }

                        if (arquivosNFeEncontrados.FirstOrDefault(x => x.Contains("xml")) != null)
                        {
                            encontrouXML = "sim";
                        }
                    }
                    else if (arquivosCTeEncontrados != null && arquivosCTeEncontrados.Count() > 0)
                    {
                        tipo = "CTe";

                        if (arquivosCTeEncontrados.FirstOrDefault(x => x.Contains("pdf")) != null)
                        {
                            encontrouPDF = "sim";
                        }

                        if (arquivosCTeEncontrados.FirstOrDefault(x => x.Contains("xml")) != null)
                        {
                            encontrouXML = "sim";
                        }
                    }
                    else if (arquivosCTeFaturaEncontrados != null && arquivosCTeFaturaEncontrados.Count() > 0)
                    {
                        tipo = "CTeFatura";

                        if (arquivosCTeFaturaEncontrados.FirstOrDefault(x => x.Contains("pdf")) != null)
                        {
                            encontrouPDF = "sim";
                        }

                        if (arquivosCTeFaturaEncontrados.FirstOrDefault(x => x.Contains("xml")) != null)
                        {
                            encontrouXML = "sim";
                        }
                    }

                    lock (sb)
                    {
                        sb.AppendLine(string.Format(linhaFormato, chaveUnica, encontrouXML, encontrouPDF, tipo));
                    }
                });

                System.DateTime horarioTermino = DateTime.Now;
                System.TimeSpan tempoTotal = horarioTermino.Subtract(horario);
                                
                sbTime.AppendLine("Início " + horario.ToString("hh:mm:ss") +
                          " \n" + "Término " + horarioTermino.ToString("hh:mm:ss") +
                          " \n" + "Tempo Total: " + tempoTotal);
                
                File.WriteAllText(Path.Combine(AppDomain.CurrentDomain.BaseDirectory, "Resultado.csv"), sb.ToString(), Encoding.UTF8);
                File.WriteAllText(Path.Combine(AppDomain.CurrentDomain.BaseDirectory, "Tempo de Execução.txt"), sbTime.ToString(), Encoding.UTF8);
            }
            catch (Exception ex)
            {
                File.WriteAllText(Path.Combine(AppDomain.CurrentDomain.BaseDirectory, "Erro.txt"), "Erro ao gerar comparação\r\n\r\nDetalhes:\r\n\r\n" + ex.ToString());
            }
        }
    }
}
