/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.Size;

@Entity
public class Cliente extends Pessoa {

    
    @Size(max = 255)
    @Column(name = "email")
    private String email;

    @Size(max = 255)
    @Column(name = "usuario")
    private String usuario;

    @Size(max = 50)
    @Column(name = "senha")
    private String senha;

    private String confirmasenha;

    @Size(max = 50)
    @Column(name = "rua")
    private String rua;

    @Column(name = "numero")
    private int numero;

    @Size(max = 50)
    @Column(name = "cidade")
    private String cidade;

    @Size(max = 2)
    @Column(name = "uf")
    private String uf;

    @Size(max = 50)
    @Column(name = "pais")
    private String pais;

    @Size(max = 8)
    @Column(name = "cep")
    private String cep;

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

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
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

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getConfirmasenha() {
        return confirmasenha;
    }

    public void setConfirmasenha(String confirmasenha) {
        this.confirmasenha = confirmasenha;
    }

}
