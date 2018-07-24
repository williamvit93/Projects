

package model;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Venda extends Conexao {
    
    private String codVenda;
    private String codPedido;
    private double valor;
    private String dataPagto;
    private String dataEnvio;
    private String cep;
    private String rua;
    private String numero;
    private String bairro;
    private String uf;

    public String getCodVenda() {
        return codVenda;
    }

    public void setCodVenda(String codVenda) {
        this.codVenda = codVenda;
    }

    public String getCodPedido() {
        return codPedido;
    }

    public void setCodPedido(String codPedido) {
        this.codPedido = codPedido;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDataPagto() {
        return dataPagto;
    }

    public void setDataPagto(String dataPagto) {
        this.dataPagto = dataPagto;
    }

    public String getDataEnvio() {
        return dataEnvio;
    }

    public void setDataEnvio(String dataEnvio) {
        this.dataEnvio = dataEnvio;
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

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
    
     public ResultSet retornarVenda(String codVenda) {
        abreConexao();
        String cmdSQL = "SELECT * FROM VENDA WHERE CODVENDA LIKE '%" + codVenda + "%'";
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
