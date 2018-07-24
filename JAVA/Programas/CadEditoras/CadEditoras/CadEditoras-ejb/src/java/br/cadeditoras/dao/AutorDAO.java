/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cadeditoras.dao;

import br.cadeditoras.modelos.Autor;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Atanes
 */
@Stateless
public class AutorDAO{
    @PersistenceContext(unitName = "EditorasPU")
    private EntityManager em;

    public void create(Autor autor) throws Exception {
        
        if (autor.getId() == null) {
            em.persist(autor);
        } else {
            if (!em.contains(autor)) {
                if (em.find(Autor.class, autor.getId()) == null) {
                    throw new Exception("Erro ao atualizar os dados do Autor!!");
                }
            }
            em.merge(autor);
        }
    }

    public void edit(Autor autor) {
        em.merge(autor);
    }

    public void remove(Autor autor) {
        em.remove(em.merge(autor));
    }

    public Autor find(Object id) {
        return em.find(Autor.class, id);
    }

    public List<Autor> findAll() {
        javax.persistence.criteria.CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Autor.class));
        return em.createQuery(cq).getResultList();
    }

    public List<Autor> findRange(int[] range) {
        javax.persistence.criteria.CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Autor.class));
        javax.persistence.Query q = em.createQuery(cq);
        q.setMaxResults(range[1] - range[0]);
        q.setFirstResult(range[0]);
        return q.getResultList();
    }

    public int count() {
        javax.persistence.criteria.CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        javax.persistence.criteria.Root<Autor> rt = cq.from(Autor.class);
        cq.select(em.getCriteriaBuilder().count(rt));
        javax.persistence.Query q = em.createQuery(cq);
        return ((Long) q.getSingleResult()).intValue();
    }    
}

    

