/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cadeditoras.dao;

import br.cadeditoras.modelos.Livro;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Atanes
 */
@Stateless
public class LivroDAO{
    @PersistenceContext(unitName = "EditorasPU")
    private EntityManager em;

    public void create(Livro livro) throws Exception {
        
        if (livro.getId() == null) {
            em.persist(livro);
        } else {
            if (!em.contains(livro)) {
                if (em.find(Livro.class, livro.getId()) == null) {
                    throw new Exception("Erro ao atualizar os dados da Editora!!");
                }
            }
            em.merge(livro);
        }
    }

    public void edit(Livro livro) {
        em.merge(livro);
    }

    public void remove(Livro livro) {
        em.remove(em.merge(livro));
    }

    public Livro find(Object id) {
        return em.find(Livro.class, id);
    }

    public List<Livro> findAll() {
        javax.persistence.criteria.CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Livro.class));
        return em.createQuery(cq).getResultList();
    }

    public List<Livro> findRange(int[] range) {
        javax.persistence.criteria.CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Livro.class));
        javax.persistence.Query q = em.createQuery(cq);
        q.setMaxResults(range[1] - range[0]);
        q.setFirstResult(range[0]);
        return q.getResultList();
    }

    public int count() {
        javax.persistence.criteria.CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        javax.persistence.criteria.Root<Livro> rt = cq.from(Livro.class);
        cq.select(em.getCriteriaBuilder().count(rt));
        javax.persistence.Query q = em.createQuery(cq);
        return ((Long) q.getSingleResult()).intValue();
    }
    
}
