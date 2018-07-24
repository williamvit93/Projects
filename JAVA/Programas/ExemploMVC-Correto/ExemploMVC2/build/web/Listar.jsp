<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.*, br.com.Modelo.*, br.com.Controle.*, java.net.*, java.text.*" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> :: LISTAR AUTORES :: </title>
    </head>
    <body>
        <%
            AutoresDAO adao = new AutoresDAO();
            List listaDeProdutos = adao.obtemLista();
            Iterator pli = listaDeProdutos.iterator();
            int item = listaDeProdutos.size();
        %>
  
        <h1> :: LISTA DE AUTORES :: </h1>   
        <table border="1" cellspacing="1" cellpadding="1">
            <thead>
                <tr>
                    <th> ID</th>
                    <th> Primeiro Nome </th>
                    <th> Segundo Nome </th>
                </tr>
            </thead>

            <%
                while (pli.hasNext()) {
                    Autores a = (Autores) pli.next();
            %>  

            <tr>         
                <td> <%= a.getIdAutores()%> </td>
                <td> <%= a.getPrimeiroNome()%> </td>
                <td> <%= a.getSegundoNome()%> </td>
            </tr>
            <% }%>
        </table> 
        <br>
        <hr> 
        <a href="index.jsp">Voltar para Página Inicial</a>                
        
    </body>
</html>
