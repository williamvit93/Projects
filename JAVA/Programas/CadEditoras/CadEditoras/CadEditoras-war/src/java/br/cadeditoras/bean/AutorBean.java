/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cadeditoras.bean;

import br.cadeditoras.logicaNegocio.AutorLN;
import br.cadeditoras.modelos.Autor;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Atanes
 */
@ManagedBean
@SessionScoped
public class AutorBean {
    @EJB
    private AutorLN autorLN;

    private List<Autor> autores;
    private Autor autor;

    /**
     * Creates a new instance of EditoraBean
     */
    public AutorBean() {
    }

    public String setarAutor() {
        autor = new Autor();
        return "/cadastrarAutores";
    }

    public List<Autor> getAutores() {
        autores = autorLN.getTodosAutores();
        return autores;
    }

    public String incluirAutor() throws Exception {
        autorLN.incluirAutor(autor);
        return "listaAutores";
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    
    public String editarAutor(){    
        return "listaAutores";
    }
    
    public String excluirAutor(){
        autorLN.excluirAutor(autor);
        return "listaAutores";
    }

    
}
