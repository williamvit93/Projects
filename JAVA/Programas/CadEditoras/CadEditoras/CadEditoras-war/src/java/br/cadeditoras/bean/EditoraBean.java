/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cadeditoras.bean;

import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import br.cadeditoras.logicaNegocio.EditoraLN;
import br.cadeditoras.modelos.Editora;

/**
 *
 * @author Atanes
 */
@ManagedBean
@SessionScoped
public class EditoraBean {

    @EJB
    private EditoraLN editoraLN;

    private List<Editora> editoras;
    private Editora editora;

    /**
     * Creates a new instance of EditoraBean
     */
    public EditoraBean() {
    }

    public String setarEditora() {
        editora = new Editora();
        return "/cadastrarEditoras";
    }

    public List<Editora> getEditoras() {
        editoras = editoraLN.getTodasEditoras();
        return editoras;
    }

    public String incluirEditora() throws Exception {
        editoraLN.incluirEditora(editora);
        return "listaEditoras";
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }
    
    public String editarEditora(){
        
        return "listaEditoras";
    }
    
    public String excluirEditora(){
        editoraLN.excluirEditora(editora);
        return "listaEditoras";
    }

}
