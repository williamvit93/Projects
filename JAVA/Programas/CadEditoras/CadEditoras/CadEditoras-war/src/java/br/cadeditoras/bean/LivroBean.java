/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cadeditoras.bean;

import br.cadeditoras.logicaNegocio.AutorLN;
import br.cadeditoras.logicaNegocio.LivroLN;
import br.cadeditoras.modelos.Autor;
import br.cadeditoras.modelos.Livro;
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
public class LivroBean {

    @EJB
    private LivroLN livroLN;
    @EJB
    private AutorLN autorLN;

    private List<Livro> livros;
    private List<Autor> autores;
    private Autor autor;
    private Livro livro;

    /**
     * Creates a new instance of EditoraBean
     */
    public LivroBean() {
    }

    public String setarLivro() {
        autor = new Autor();
        livro = new Livro();
        return "/cadastrarLivros";
    }

    public List<Livro> getLivros() {
        livros = livroLN.getTodosLivros();
        return livros;
    }

    public List<Autor> getAutores() {
        autores = autorLN.getTodosAutores();
        return autores;
    }

    public String incluirLivro() throws Exception {
        livro.setAutorId(autor);
        livroLN.incluirLivro(livro);
        return "listaLivros";
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public String editarLivro() {
        return "listaLivros";
    }

    public String excluirLivro() {
        livroLN.excluirLivro(livro);
        return "listaLivros";
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getNomeAutor() {
        return autor.getNome();
    }
}
