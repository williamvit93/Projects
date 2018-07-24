/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.Cliente;

/**
 *
 * @author willi
 */
@ManagedBean
@SessionScoped
public class ClienteBean {

    private Cliente cliente = new Cliente();
    private List<Cliente> clientes;

    public ClienteBean() {
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Cliente> getClientes() {
        if (this.clientes == null) {
            EntityManager em = JPAUtil.getEntityManager();
            Query a = em.createQuery("select a from Cliente a",
                    Cliente.class);
            this.clientes = a.getResultList();
            em.close();
        }
        
        return clientes;
    }

    public String salva() {

        EntityManager em = JPAUtil.getEntityManager();
        try {
            // Inicia uma transação com o banco de dados.
            em.getTransaction().begin();
            //Aluno a = em.find(Aluno.class, aluno.getMatricula());
            // Verifica se a pessoa ainda não está salva no banco de dados.
            if (cliente.getId() != null) {
                //Atualiza os dados da pessoa.
                cliente = em.merge(cliente);
            } else {
                //Salva os dados da pessoa.
                em.persist(cliente);
            }
            // Finaliza a transação.
            em.getTransaction().commit();
        } finally {
            em.close();
        }

        this.clientes = null;
        return "ListarClientes";
    }

    public void excluir(Cliente cliente) {

        EntityManager em = JPAUtil.getEntityManager();
        em.getTransaction().begin();
        cliente = em.merge(cliente);
        em.remove(cliente);
        em.getTransaction().commit();
        em.close();

        this.clientes = null;

    }

    public String alterar(Cliente a) {
        this.cliente = a;
        return "cadastro";
    }

    public String cadastrarNovo(String complemento) {
        cliente = new Cliente();
        return complemento + "cadastro";
    }
}
