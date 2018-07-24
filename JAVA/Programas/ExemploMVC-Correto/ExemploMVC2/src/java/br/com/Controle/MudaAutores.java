package br.com.Controle;

import br.com.Modelo.*;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MudaAutores extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        System.out.println(" ::: SERVLET MUDA AUTORES ::: ");

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        try {

            HttpSession session = request.getSession(true);
            System.out.println("\n Session... " + session);
            // se for uma sessão nova, reescreva o URL do cliente
            if (session.isNew()) {
                // obtém o URL
                String incomingURL = request.getRequestURL().toString();
                System.out.println("\n incomingURL... " + incomingURL);
                // codifica e adiciona o ID de sessão no URL
                String URLwithID = response.encodeURL(incomingURL);
                System.out.println("\n URLwithID... " + URLwithID);
                // devolve um cabeçalho para o cliente, com o novo URL
                response.setHeader("Custom-newURL", URLwithID);
                System.out.println("\n URLwithID... " + URLwithID);
            }// fecha o if

            int idAutores = Integer.parseInt(request.getParameter("idAutores"));
            String primeiroNome = request.getParameter("primeiroNome");
            String segundoNome = request.getParameter("segundoNome");

            System.out.println("");
            System.out.println(" ----------------> ID: -- " + idAutores);
            System.out.println(" ----------------> PRIMEIRO NOME: -- " + primeiroNome);
            System.out.println(" ----------------> SEGUNDO NOME: -- " + segundoNome);
            System.out.println("");

            Autores autores = new Autores(idAutores, primeiroNome, segundoNome);
            autores.setIdAutores(idAutores);
            autores.setPrimeiroNome(primeiroNome);
            autores.setSegundoNome(segundoNome);
            AutoresDAO autoresDAO = new AutoresDAO();
            autoresDAO.alteraAutores(autores);

            request.setAttribute("listaAutores", autoresDAO);
            RequestDispatcher rq = request.getRequestDispatcher("/OK.jsp");
            rq.forward(request, response);

        } catch (Exception e) {

            System.out.println("");
            System.out.println(" EXCEÇÃO GERADA!!! ");
            System.out.println("");

            e.printStackTrace();
            e.getMessage();

            String url = "/Erro.jsp";
            ServletContext sc = getServletContext();
            RequestDispatcher rd = sc.getRequestDispatcher(url);
            rd.forward(request, response);

        } finally {
            out.close();
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
