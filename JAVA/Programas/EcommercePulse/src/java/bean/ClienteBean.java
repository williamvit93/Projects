/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.awt.event.ActionEvent;
import java.io.Serializable;
import java.util.List;

import javax.faces.application.FacesMessage;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.Cliente;
import org.primefaces.context.RequestContext;

/**
 *
 * @author willi
 */
@ManagedBean
@SessionScoped
public class ClienteBean implements Serializable {

    private Cliente cliente = new Cliente();
    private List<Cliente> clientes;
    private boolean ask = true;
    private boolean carrinho = true;

    public boolean isCarrinho() {
        return carrinho;
    }

    public void setCarrinho(boolean carrinho) {
        this.carrinho = carrinho;
    }

    public boolean isAsk() {
        return ask;
    }

    public void setAsk(boolean ask) {
        this.ask = ask;
    }

    public ClienteBean() {

    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void showMessageErro() {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_WARN, "ERRO", "As senhas digitadas são diferentes!");

        RequestContext.getCurrentInstance().showMessageInDialog(message);
    }

    public void showMessageSenhaEnviada() {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "PRONTO", "Senha enviada com sucesso!");

        RequestContext.getCurrentInstance().showMessageInDialog(message);
    }

    public void showMessageContatoEnviado() {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "OBRIGADO PELA MENSAGEM", "Em breve entraremos em contato!");

        RequestContext.getCurrentInstance().showMessageInDialog(message);
    }

    public void showMessageSuccess() {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "PRONTO", "Cadastro Realizado com sucesso!");

        RequestContext.getCurrentInstance().showMessageInDialog(message);
    }

    public void showMessageNews() {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "PRONTO", "Você receberá nossas novidades em primeira mão!");

        RequestContext.getCurrentInstance().showMessageInDialog(message);
    }

    public void showMessageLoginSucesso() {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "BEM VINDO", cliente.getUsuario());

        RequestContext.getCurrentInstance().showMessageInDialog(message);
    }

    public void showMessageLoginErro() {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_WARN, "ERRO", "USUÁRIO OU SENHA INCORRETOS");

        RequestContext.getCurrentInstance().showMessageInDialog(message);
    }

    public void showMessageLogout() {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "VOLTE SEMPRE", cliente.getUsuario());

        RequestContext.getCurrentInstance().showMessageInDialog(message);
    }
    
    public void showMessageCarrinho() {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "COMPLETE SUA COMPRA", "Produto adicionado ao carrinho!");

        RequestContext.getCurrentInstance().showMessageInDialog(message);
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

    public String enviaSenha() {
        showMessageSenhaEnviada();
        return "esquecisenha";

    }

    public String CadastrarNewsletter() {
        showMessageNews();
        return "index";

    }

    public String enviaContato() {
        showMessageContatoEnviado();
        return "contato";

    }

    public String salva() {

        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            // Verifica se o cliente ainda não está salva no banco de dados.
            if (cliente.getId() == null) {
                if (cliente.getSenha().equals(cliente.getConfirmasenha())) {
                    //Salva os dados do cliente.
                    em.persist(cliente);
                } else {
                    showMessageErro();
                    return null;
                }

            } else {
                //Atualiza os dados da pessoa.
                cliente = em.merge(cliente);
            }
            // Finaliza a transação.
            em.getTransaction().commit();

        } finally {
            em.close();
        }

        this.clientes = null;

        showMessageSuccess();

        return "index";
    }

    public Cliente FindUsuario() {
        EntityManager em = JPAUtil.getEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("FROM Cliente WHERE usuario = :usuario ");
        query.setParameter("usuario", cliente.getUsuario());
        return (Cliente) query.getSingleResult();
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

    public String cadastrarNovo() {
        cliente = new Cliente();
        return "cadastro";
    }

    public String login(ActionEvent event) {

        if (cliente.getUsuario().equals("admin") && cliente.getSenha().equals("admin")) {
            
            showMessageLoginSucesso();
            setAsk(false);
            return "indexADM";

        }
        if (cliente.getUsuario().equals("tech") && cliente.getSenha().equals("tech")) {
            
            showMessageLoginSucesso();
            setAsk(false);
            return "index";
            
        } else {
            showMessageLoginErro();

        }
        return null;

    }

    public String logout(ActionEvent event) {

        setAsk(true);
        showMessageLogout();

        return "index";
    }
    
    public void Comprar(ActionEvent event) {

        setCarrinho(false);
        showMessageCarrinho();

    }
    
    
}
