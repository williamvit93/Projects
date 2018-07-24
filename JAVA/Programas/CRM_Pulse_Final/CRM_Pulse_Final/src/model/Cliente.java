
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import javax.swing.JOptionPane;


public class Cliente extends Conexao {
        
        private String codCliente;
        private String nome;
        private String email;
        private String telefone;
        private String celular;
        private String cep;
        private String bairro;
        private String rua; 
        private String cidade;
        private String numero;
        private String uf;
        private char efetivo;
        private char potencial;

    public char getEfetivo() {
        return efetivo;
    }

    public void setEfetivo(char efetivo) {
        this.efetivo = efetivo;
    }

    public char getPotencial() {
        return potencial;
    }

    public void setPotencial(char potencial) {
        this.potencial = potencial;
    }
        

    public String getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(String codCliente) {
        this.codCliente = codCliente;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
        
        
         public static String gerarCodCliente(){   
     Random geradorCodFunc = new Random();
     String codCliente;
     int numero = geradorCodFunc.nextInt(9999);
     codCliente = "CL" + String.valueOf(numero);
     return codCliente;
     } 

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    
 // 
    public void inserirCliente (String codCliente,String nome,String email,String telefone,String celular, String rua, String cep,String numero,String bairro,String cidade,String uf, char efetivo, char potencial) {
        abreConexao();
        String cmdSQL = ("INSERT INTO CLIENTE(CODCLIENTE, NOME, EMAIL, TELEFONE, CELULAR, RUA, CEP, NUMEROENDERECO, BAIRRO, CIDADE, UF, EFETIVO, POTENCIAL) VALUES"
                + "('"+codCliente+"','"+nome+"','"+email+"','"+telefone+"','"+celular+"','"+rua+"','"+cep+"','"+numero+"','"+bairro+"','"+cidade+"','"+uf+"','"+efetivo+"','"+potencial+"')");
        
        System.out.println(cmdSQL);
        try {
            getStatement().executeUpdate(cmdSQL);
            
        } catch (SQLException e) {
            System.out.println("Erro SQL :" + e.getMessage());
        }
        fechaConexao();
    }
    
}
