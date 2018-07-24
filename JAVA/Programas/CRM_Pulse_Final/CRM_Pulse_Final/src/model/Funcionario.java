

package model;

import view.BuscarCadastro;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import javax.swing.JOptionPane;


public class Funcionario extends Conexao {
    
    
        private String codFunc = gerarCodFunc();              
        private String senhaFunc;
        private String confirmaSenha;
        private String nome;
        private String cpf;
        private String cargoEntrada;
        private String setor;
        private int baseSalarial;
        private String cargoAtual;
        private String dataAdmissao;
        private String rua;
        private String numero;
        private String bairro;
        private String cidade;
        private String uf;
        private String cep;

    public String getCodFunc() {
        return codFunc;
    }

    public void setCodFunc(String codFunc) {
        this.codFunc = codFunc;
    }

    public String getSenhaFunc() {
        return senhaFunc;
    }

    public void setSenhaFunc(String senhaFunc) {
        this.senhaFunc = senhaFunc;
    }

    public String getConfirmaSenha() {
        return confirmaSenha;
    }

    public void setConfirmaSenha(String confirmaSenha) {
        this.confirmaSenha = confirmaSenha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCargoEntrada() {
        return cargoEntrada;
    }

    public void setCargoEntrada(String cargoEntrada) {
        this.cargoEntrada = cargoEntrada;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public int getBaseSalarial() {
        return baseSalarial;
    }

    public void setBaseSalarial(int baseSalarial) {
        this.baseSalarial = baseSalarial;
    }

    public String getCargoAtual() {
        return cargoAtual;
    }

    public void setCargoAtual(String cargoAtual) {
        this.cargoAtual = cargoAtual;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
       
    
   
       
    
    
    public static String gerarCodFunc(){   
     Random geradorCodFunc = new Random();
     String codFunc;
     int numero = geradorCodFunc.nextInt(9999);
     codFunc = "FUNC" + String.valueOf(numero);
     return codFunc;
     }  
    
    

    public void inserir(String codFunc, String nome, String senhaFunc, String cpf, String cargoEntrada, String setor, int baseSalarial, String cargoAtual, String dataAdmissao, String cep, String rua, String numero, String bairro, String cidade, String uf) {
        abreConexao();
        String cmdSQL = ("INSERT INTO FUNCIONARIO(CODFUNC, NOME, SENHA, CPFFUN, CARGOENTRADA, SETOR, BASESALARIAL, CARGOATUAL, DATAADMISSAO, CEP, RUA, NUMERO, BAIRRO, CIDADE, UF) VALUES"
                + "('"+codFunc+"','"+nome+"','"+senhaFunc+"','"+cpf+"','"+cargoEntrada+"','"+setor+"',"+baseSalarial+",'"+cargoAtual+"','"+dataAdmissao+"','"+cep+"','"+rua+"','"+numero+"','"+bairro+"','"+cidade+"','"+uf+"')");
        System.out.println(cmdSQL);
        try {
            getStatement().executeUpdate(cmdSQL);
            JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!\n\n Seu usuário para acesso é: "+ codFunc);
                    
        } catch (SQLException e) {
            System.out.println("Erro SQL :" + e.getMessage());
        }
        fechaConexao();
    }
    
 public ResultSet logar(String codFunc) {
        abreConexao();
        String cmdSQL = ("select CODFUNC, SENHA from FUNCIONARIO where codFunc like '%" + codFunc + "%'");
        System.out.println(cmdSQL);
        ResultSet resultado = null;
        try {
            resultado = getStatement().executeQuery(cmdSQL);
        } catch (SQLException e) {
            System.out.println("Erro SQL :" + e.getMessage());
        }

        return resultado;
    }

 public ResultSet retornaNome(String codFunc) {
        abreConexao();
        String cmdSQL = ("select NOME from FUNCIONARIO where codFunc = '"+codFunc+"'");
        System.out.println(cmdSQL);
        ResultSet resultado = null;
        try {
            resultado = getStatement().executeQuery(cmdSQL);
        } catch (SQLException e) {
            System.out.println("Erro SQL :" + e.getMessage());
        }

        return resultado;
    }
 
  public ResultSet retornarFunc(String codFunc) {
        abreConexao();
        String cmdSQL = "select * from FUNCIONARIO where codFunc like '%" + codFunc + "%'";
        System.out.println(cmdSQL);
        ResultSet resultado = null;
        try {
            if(getStatement().executeUpdate(cmdSQL) == 0){
             JOptionPane.showMessageDialog(null, "Este Funcionário não existe!");
                    
            }
            
            resultado = getStatement().executeQuery(cmdSQL);
        } catch (SQLException e) {
            System.out.println("Erro SQL :" + e.getMessage());
        }

        return resultado;
    }
  
  public void excluirFunc(String codFunc) {
        abreConexao();
        String cmdSQL = "DELETE FROM FUNCIONARIO WHERE CODFUNC = '" + codFunc + "'";
        System.out.println(cmdSQL);
        try {
           if(getStatement().executeUpdate(cmdSQL) == 0){
             JOptionPane.showMessageDialog(null, "Este Funcionário não existe!");
                    
            } else
            
            JOptionPane.showMessageDialog(null, "Exclusão efetuada com sucesso!");
                   
        } catch (SQLException e) {
            System.out.println("Erro SQL :" + e.getMessage());
        }
        fechaConexao();
    }
  
  public void alterarFunc(String codFunc, String campoSelecionado, String novoCampo) {
        abreConexao();
        BuscarCadastro a = new BuscarCadastro();
        String cmdSQL = "UPDATE FUNCIONARIO SET " + campoSelecionado + " = '" + novoCampo + "' "
                + " WHERE CODFUNC = '" + codFunc + "'";
        System.out.println(codFunc);
        System.out.println(cmdSQL);
        //
        
        try {
        if(retornarFunc(codFunc).getStatement().executeUpdate(cmdSQL) == 0){
       
        JOptionPane.showMessageDialog(null, "Selecione um Código de Funcionário válido!");
                     
        return;
        }
         } catch (SQLException e) {
            System.out.println("Erro SQL :" + e.getMessage());
        }
        //
        try {
            getStatement().executeUpdate(cmdSQL);
            JOptionPane.showMessageDialog(null, "Alteração efetuada com sucesso!");
                   
        } catch (SQLException e) {
            System.out.println("Erro SQL :" + e.getMessage());
        }
        fechaConexao();
    }
 
}



