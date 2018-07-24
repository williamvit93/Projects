/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cadeditoras.dao;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import br.cadeditoras.modelos.Editora;

/**
 *
 * @author Atanes
 */
@Stateless
public class EditoraDAO{
    @PersistenceContext(unitName = "EditorasPU")
    private EntityManager em;

    public void create(Editora editora) throws Exception {
        
        if (editora.getId() == null) {
            em.persist(editora);
        } else {
            if (!em.contains(editora)) {
                if (em.find(Editora.class, editora.getId()) == null) {
                    throw new Exception("Erro ao atualizar os dados da Editora!!");
                }
            }
            em.merge(editora);
        }
    }

    public void edit(Editora editora) {
        em.merge(editora);
    }

    public void remove(Editora editora) {
        em.remove(em.merge(editora));
    }

    public Editora find(Object id) {
        return em.find(Editora.class, id);
    }

    public List<Editora> findAll() {
        javax.persistence.criteria.CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Editora.class));
        return em.createQuery(cq).getResultList();
    }

    public List<Editora> findRange(int[] range) {
        javax.persistence.criteria.CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Editora.class));
        javax.persistence.Query q = em.createQuery(cq);
        q.setMaxResults(range[1] - range[0]);
        q.setFirstResult(range[0]);
        return q.getResultList();
    }

    public int count() {
        javax.persistence.criteria.CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        javax.persistence.criteria.Root<Editora> rt = cq.from(Editora.class);
        cq.select(em.getCriteriaBuilder().count(rt));
        javax.persistence.Query q = em.createQuery(cq);
        return ((Long) q.getSingleResult()).intValue();
    }    
}
