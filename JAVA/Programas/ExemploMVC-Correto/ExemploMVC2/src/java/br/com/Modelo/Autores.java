/* Plain Old Java Objects (Os Singelos Clássicos Objetos Java), ou POJOs, são 
 objetos Java que seguem um desenho simplificado em contraposição aos EJBs, por 
 exemplo. Um JavaBean é um POJO que segue definições rígidas de estrutura 
 (construtor default sem argumentos e métodos que seguem o padrão de getters e 
 setters para seus atributos).*/
package br.com.Modelo;

public class Autores {

    public int idAutores;
    public String primeiroNome;
    public String segundoNome;

    public Autores() {
        idAutores = 0;
        primeiroNome = "";
        segundoNome = "";
    }

    public Autores(String primeiroNome, String segundoNome) {
        this.primeiroNome = primeiroNome;
        this.segundoNome = segundoNome;
    }

    public Autores(int idAutores, String primeiroNome, String segundoNome) {
        this.idAutores = idAutores;
        this.primeiroNome = primeiroNome;
        this.segundoNome = segundoNome;
    }

    public Autores(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public Autores(int idAutores) {
        this.idAutores = idAutores;
    }

    public int getIdAutores() {
        return idAutores;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public String getSegundoNome() {
        return segundoNome;
    }

    public void setIdAutores(int idAutores) {
        this.idAutores = idAutores;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public void setSegundoNome(String segundoNome) {
        this.segundoNome = segundoNome;
    }

}
