

package model;

import model.Funcionario;
import model.PessoaFisica;
import model.PessoaJuridica;
import view.NovoAtendimento;
import view.BuscarAtendimento;
import view.BuscarCadastro;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import javax.swing.JOptionPane;


public class Atendimento extends Conexao{
    
    private String codAtendimento;
    private String codCliente;
    private String codFunc;
    private String assunto;
    private String Status;
    private String dataInicio;
    private String dataFim;
    private String reclamacao;
    private String sugestao;
        
    public String getCodAtendimento() {
        return codAtendimento;
    }

    public void setCodAtendimento(String codAtendimento) {
        this.codAtendimento = codAtendimento;
    }

    public String getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(String codCliente) {
        this.codCliente = codCliente;
    }

    public String getCodFunc() {
        return codFunc;
    }

    public void setCodFunc(String codFunc) {
        this.codFunc = codFunc;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public String getReclamacao() {
        return reclamacao;
    }

    public void setReclamacao(String reclamacao) {
        this.reclamacao = reclamacao;
    }
    
    public String getSugestao() {
        return sugestao;
    }

    public void setSugestao(String sugestao) {
        this.sugestao = sugestao;
    }
    
     public static String gerarCodAtendimento(){   
     Random geradorCodAtend = new Random();
     String codAtendimento;
     int numero = geradorCodAtend.nextInt(9999);
     codAtendimento = "AT" + String.valueOf(numero);
     return codAtendimento;
     }
     
     //
     
     public void inserirAtendimento (String codAtendimento,String codCliente,String codFunc,String assunto,String status, String dataInicio, String sugestao, String reclamacao) {
                              
         abreConexao();
        String cmdSQL = ("INSERT INTO ATENDIMENTO(CODATEN, CODCLIENTE, CODFUNC, ASSUNTO, STATUS, DATAINICIO, SUGESTAO, RECLAMACAO) VALUES"
                + "('"+codAtendimento+"','"+codCliente+"','"+codFunc+"','"+assunto+"','"+status+"','"+dataInicio+"','"+sugestao+"','"+reclamacao+"')");
        
        System.out.println(cmdSQL);
        try {
            getStatement().executeUpdate(cmdSQL);

            {
            JOptionPane.showMessageDialog(null, "Novo Atendimento gerado com sucesso! \n\nCódigo do Atendimento: "+ codAtendimento);
            }
        } catch (SQLException e) {
            System.out.println("Erro SQL :" + e.getMessage());
        }
        fechaConexao();
    }
     
     public ResultSet retornarAtend(String codAtendimento, String tipoAtend) {

        abreConexao();
        String cmdSQL = "SELECT CODATEN, CODCLIENTE, CODFUNC, ASSUNTO, STATUS, DATAINICIO, DATAFIM, SUGESTAO, RECLAMACAO FROM ATENDIMENTO WHERE "+ tipoAtend +" like '%" + codAtendimento + "%'";
        System.out.println(cmdSQL);
        ResultSet resultado = null;
        try {
           
            resultado = getStatement().executeQuery(cmdSQL);
        } catch (SQLException e) {
            System.out.println("Erro SQL :" + e.getMessage());
        }

        return resultado;
    }
     
     
     public ResultSet retornarTipoAt(String tipoAtend) {

        abreConexao();
        String cmdSQL = "select * from atendimento where "+tipoAtend+" like '%%' ";
        System.out.println(cmdSQL);
        ResultSet resultado = null;
        try {
           
            resultado = getStatement().executeQuery(cmdSQL);
        } catch (SQLException e) {
            System.out.println("Erro SQL :" + e.getMessage());
        }

        return resultado;
    }
     
     
     public ResultSet retornarTipoStatus(String tipoStatus) {

        abreConexao();
        String cmdSQL = "select * from atendimento where status like '%"+tipoStatus+"%' ";
        System.out.println(cmdSQL);
        ResultSet resultado = null;
        try {
           
            resultado = getStatement().executeQuery(cmdSQL);
        } catch (SQLException e) {
            System.out.println("Erro SQL :" + e.getMessage());
        }

        return resultado;
    }
     
     
     public ResultSet retornarDataAbertura(String tipoStatus) {

        abreConexao();
        String cmdSQL = "select * from atendimento TO_CHAR (DATAINICIO, 'DD-MM-YYYYY'";
        System.out.println(cmdSQL);
        ResultSet resultado = null;
        try {
           
            resultado = getStatement().executeQuery(cmdSQL);
        } catch (SQLException e) {
            System.out.println("Erro SQL :" + e.getMessage());
        }

        return resultado;
    }
     
     
     public ResultSet retornarReSu(String codAtendimento) {

        abreConexao();
        String cmdSQL = "SELECT SUGESTAO, RECLAMACAO FROM ATENDIMENTO WHERE CODATEN like '%" + codAtendimento + "%'";
        System.out.println(cmdSQL);
        ResultSet resultado = null;
        try {
           
            resultado = getStatement().executeQuery(cmdSQL);
        } catch (SQLException e) {
            System.out.println("Erro SQL :" + e.getMessage());
        }

        return resultado;
    }

     
      public void encerrarAt(String codAtendimento) {
        abreConexao();
        BuscarAtendimento tela = new BuscarAtendimento();
        String cmdSQL = "UPDATE ATENDIMENTO SET STATUS = 'Concluído' " +
                 "WHERE CODATEN = '" + codAtendimento + "'";
         String cmdSQL2 = " UPDATE ATENDIMENTO SET DATAFIM = SYSDATE WHERE CODATEN = '"+codAtendimento+ "'";
        
        System.out.println(cmdSQL);
        //
        
        try {
        if(retornarAtend(codAtendimento, "CODATEN").getStatement().executeUpdate(cmdSQL) == 0){
       
        JOptionPane.showMessageDialog(null, "Selecione um Código de atendimento válido!");
                     
        return;
        }
         } catch (SQLException e) {
            System.out.println("Erro SQL :" + e.getMessage());
        }
        //
        try {
            getStatement().executeUpdate(cmdSQL);
            getStatement().executeUpdate(cmdSQL2);
            JOptionPane.showMessageDialog(null, "Atendimento encerrado com sucesso!");
                   
        } catch (SQLException e) {
            System.out.println("Erro SQL :" + e.getMessage());
        }
        fechaConexao();
    }
    
}
