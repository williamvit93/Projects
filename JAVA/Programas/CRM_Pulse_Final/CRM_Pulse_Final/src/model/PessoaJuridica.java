

package model;

import view.BuscarCadastro;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import javax.swing.JOptionPane;


public class PessoaJuridica extends model.Cliente {
    
      private String cnpj;
      private String tipoOrg;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTipoOrg() {
        return tipoOrg;
    }

    public void setTipoOrg(String tipoOrg) {
        this.tipoOrg = tipoOrg;
    }
    
      public static String gerarCodClientePJ(){   
     Random geradorCodClientePJ = new Random();
     String CodClientePJ;
     int numero = geradorCodClientePJ.nextInt(9999);
     CodClientePJ = "PJ" + String.valueOf(numero);
     return CodClientePJ;    
     }  
    
    
     public void inserirClientePJ(String codCliente, String codCliPJ, String cnpj, String tipoOrg) {
        abreConexao();
        String cmdSQL = ("INSERT INTO PJ(CODCLIENTE, CODPJ, CNPJ, TIPOORGANIZACAO) VALUES"
                + "('"+codCliente+"','"+codCliPJ+"','"+cnpj+"','"+tipoOrg+"')");
        System.out.println(cmdSQL);
        try {
            getStatement().executeUpdate(cmdSQL);
            JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!\n\n O código do cliente é: "+ codCliente);
                   
        } catch (SQLException e) {
            System.out.println("Erro SQL :" + e.getMessage());
        }
        fechaConexao();
    }
     
      public ResultSet retornarPj(String codPj) {
        abreConexao();
        String cmdSQL = "SELECT cliente.CODCLIENTE,TELEFONE, CELULAR, CEP, BAIRRO, RUA, UF, CIDADE, NUMEROENDERECO, NOME, EMAIL, EFETIVO, POTENCIAL, CODPJ, CNPJ, TIPOORGANIZACAO " +
"from cliente inner JOIN PJ  ON(cliente.CODCLIENTE = pj.CODCLIENTE)" +
"where   pj.CODCLIENTE like '%"+ codPj +"%'";
        System.out.println(cmdSQL);
        ResultSet resultado = null;
        try {
            
            resultado = getStatement().executeQuery(cmdSQL);
        } catch (SQLException e) {
            System.out.println("Erro SQL :" + e.getMessage());
           
        }

        return resultado;
    }
      
      public void excluirPj(String codigo) {
        abreConexao();
        String cmdSQL = "DELETE FROM PJ WHERE CODCLIENTE = '" + codigo + "'";
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
      
      public void alterarPj(String tipoCliente, String codPj, String campoSelecionado, String novoCampo) {
        abreConexao();
        BuscarCadastro a = new BuscarCadastro();
        String cmdSQL = "UPDATE " + tipoCliente + " SET " + campoSelecionado + " = '" + novoCampo + "' "
                + " WHERE CODCLIENTE = '" + codPj + "'";
        System.out.println(codPj);
        System.out.println(cmdSQL);
        //
        
        try {
        if(retornarPj(codPj).getStatement().executeUpdate(cmdSQL) == 0){
       
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
      
      public ResultSet retornarPotencialPj() {
        abreConexao();
        String cmdSQL = "SELECT cliente.CODCLIENTE,TELEFONE, CELULAR, CEP, BAIRRO, RUA, UF, CIDADE, NUMEROENDERECO, NOME, EMAIL, EFETIVO, POTENCIAL, CODPJ, CNPJ, TIPOORGANIZACAO " +
"from cliente inner JOIN PJ  ON(cliente.CODCLIENTE = pj.CODCLIENTE)" +
"where   cliente.POTENCIAL like '%S%'";
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
