<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.*, br.com.Modelo.*, br.com.Controle.*, java.net.*, java.text.*" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> :: ATUALIZAR AUTOR :: </title>
    </head>
    <body>
        <%
            AutoresDAO adao = new AutoresDAO();
            List listaDeProdutos = adao.obtemLista();
            Iterator pli = listaDeProdutos.iterator();
            //int item = listaDeProdutos.size();
        %>

        <h1> :: ATUALIZAR AUTOR :: </h1> 
        <form action="AA" name="formAtualizar" method="POST"/>
        <table border="1" cellspacing="3" cellpadding="5"/>
    <thead>
        <tr>
            <th> Escolha: </th>
            <th> ID </th>
            <th> Primeiro Nome </th>
            <th> Segundo Nome </th>
        </tr>
    </thead>
    <tbody>

        <%
            while (pli.hasNext()) {
                Autores a = (Autores) pli.next();
        %>  

        <tr>         
            <td> <input type="radio" name="item" value="<%= a.getIdAutores()%>" /> </td>
            <td> <%= a.getIdAutores()%> </td>
            <td> <%= a.getPrimeiroNome()%> </td>
            <td> <%= a.getSegundoNome()%> </td>
        </tr>
        <% } %>
        
        <tr> 
            <td> <input type="submit" value="Escolher"> </td> 
        </tr>
    </tbody>
</table> 
</form>

<br>
<hr> 
<a href="/index.jsp">Voltar para Página Inicial</a>                 

</body>
</html>
