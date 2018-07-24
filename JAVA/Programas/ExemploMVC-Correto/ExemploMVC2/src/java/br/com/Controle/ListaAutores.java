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

public class ListaAutores extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        System.out.println(" ::: SERVLET LISTA AUTORES ::: ");

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

            AutoresDAO adao = (AutoresDAO) session.getAttribute("AutoresDAO");
            adao.obtemLista();

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
