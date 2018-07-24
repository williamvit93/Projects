/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cadeditoras.logicaNegocio;

import br.cadeditoras.dao.AutorDAO;
import br.cadeditoras.modelos.Autor;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author Atanes
 */
@Stateless
@LocalBean
public class AutorLN {
    
    @EJB
    private AutorDAO livroDAO;
    
    public List<Autor> getTodosAutores() {
        return livroDAO.findAll();
    }
    
    public void incluirAutor(Autor a) throws Exception{
        livroDAO.create(a);
    }
    
    public void excluirAutor(Autor a){
        livroDAO.remove(a);
    }
}
