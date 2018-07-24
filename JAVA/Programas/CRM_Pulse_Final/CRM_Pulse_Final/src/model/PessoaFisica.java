package model;

import view.BuscarCadastro;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import javax.swing.JOptionPane;

public class PessoaFisica extends model.Cliente {

    private String codPf;
    private String cpf;
    private String estadoCivil;
    private char sexo;
    private String dataNascimento;

    public String getCodPf() {
        return codPf;
    }

    public void setCodPf(String codPf) {
        this.codPf = codPf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public static String gerarCodClientePF() {
        Random geradorCodClientePF = new Random();
        String CodClientePF;
        int numero = geradorCodClientePF.nextInt(9999);
        CodClientePF = "PF" + String.valueOf(numero);
        return CodClientePF;
    }

    public void inserirClientePF(String codCliente, String codCliPF, String cpf, char sexo, String estadoCivil, String dataNascimento) {
        abreConexao();
        String cmdSQL = ("INSERT INTO PF(CODCLIENTE, CODPF, CPF, SEXO, ESTADOCIVIL, DATANASCIMENTO) VALUES"
                + "('" + codCliente + "','" + codCliPF + "','" + cpf + "','" + sexo + "','" + estadoCivil + "','" + dataNascimento + "')");

        System.out.println(cmdSQL);
        try {
            getStatement().executeUpdate(cmdSQL);
            JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!\n\n O código do cliente é: "+codCliente);
          
        } catch (SQLException e) {
            System.out.println("Erro SQL :" + e.getMessage());
        }
        fechaConexao();
    }

    public ResultSet retornarPf(String codPf) {
        abreConexao();
        String cmdSQL = "SELECT cliente.CODCLIENTE,TELEFONE, CELULAR, CEP,SEXO, DATANASCIMENTO, BAIRRO, RUA, UF, CIDADE, NUMEROENDERECO, NOME, EMAIL, EFETIVO, POTENCIAL, CODPF, CPF, ESTADOCIVIL "
                + "from cliente inner JOIN PF  ON(cliente.CODCLIENTE = pf.CODCLIENTE)"
                + "where   pf.CODCLIENTE like '%" + codPf + "%'";
        System.out.println(cmdSQL);
        ResultSet resultado = null;
        try {
           
            resultado = getStatement().executeQuery(cmdSQL);
        } catch (SQLException e) {
            System.out.println("Erro SQL :" + e.getMessage());
        }

        return resultado;
    }

    public void excluirPf(String codigo) {
        abreConexao();
        String cmdSQL = "DELETE FROM PF WHERE CODCLIENTE = '" + codigo + "'";
        System.out.println(cmdSQL);
        try {
           if(getStatement().executeUpdate(cmdSQL) == 0){
             JOptionPane.showMessageDialog(null, "Este cliente não existe!");
                    
            } else
            
            JOptionPane.showMessageDialog(null, "Exclusão efetuada com sucesso!");
                   
        } catch (SQLException e) {
            System.out.println("Erro SQL :" + e.getMessage());
        }
        fechaConexao();
    }

    public void alterarPf(String tipoCliente, String codPf, String campoSelecionado, String novoCampo) {
        abreConexao();
        BuscarCadastro a = new BuscarCadastro();
        String cmdSQL = "UPDATE " + tipoCliente + " SET " + campoSelecionado + " = '" + novoCampo + "' "
                + " WHERE CODCLIENTE = '" + codPf + "'";
        System.out.println(codPf);
        System.out.println(cmdSQL);
        //
        
        try {
        if(retornarPf(codPf).getStatement().executeUpdate(cmdSQL) == 0){
       
        JOptionPane.showMessageDialog(null, "Selecione um Código de cliente válido!");
                     
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
    
    public ResultSet retornarPotencialPf() {
        abreConexao();
        String cmdSQL = "SELECT cliente.CODCLIENTE,TELEFONE, CELULAR, CEP,SEXO, DATANASCIMENTO, BAIRRO, RUA, UF, CIDADE, NUMEROENDERECO, NOME, EMAIL, EFETIVO, POTENCIAL, CODPF, CPF, ESTADOCIVIL "
                + "from cliente inner JOIN PF  ON(cliente.CODCLIENTE = pf.CODCLIENTE)"
                + "where   cliente.POTENCIAL like '%S%'";
        System.out.println(cmdSQL);
        ResultSet resultado = null;
        try {
           
            resultado = getStatement().executeQuery(cmdSQL);
        } catch (SQLException e) {
            System.out.println("Erro SQL :" + e.getMessage());
        }

        return resultado;
    }
}



