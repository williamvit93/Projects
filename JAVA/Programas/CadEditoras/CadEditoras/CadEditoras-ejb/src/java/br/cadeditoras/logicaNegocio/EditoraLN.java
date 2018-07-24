/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cadeditoras.logicaNegocio;

import br.cadeditoras.dao.EditoraDAO;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import br.cadeditoras.modelos.Editora;

/**
 *
 * @author Atanes
 */
@Stateless
@LocalBean
public class EditoraLN {
    
    @EJB
    private EditoraDAO editoraDAO;

    public List<Editora> getTodasEditoras() {
        return editoraDAO.findAll();
    }
    
    public void incluirEditora(Editora e) throws Exception{
        editoraDAO.create(e);
    }
    
    public void excluirEditora(Editora e){
        editoraDAO.remove(e);
    }

}
