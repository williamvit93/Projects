package br.cadeditoras.logicaNegocio;

import br.cadeditoras.dao.LivroDAO;
import br.cadeditoras.modelos.Livro;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author Atanes
 */
@Stateless
@LocalBean
public class LivroLN {
    
    @EJB
    private LivroDAO livroDAO;
    
    public List<Livro> getTodosLivros() {
        return livroDAO.findAll();
    }
    
    public void incluirLivro(Livro l) throws Exception{
        livroDAO.create(l);
    }
    
    public void excluirLivro(Livro l){
        livroDAO.remove(l);
    }
}
