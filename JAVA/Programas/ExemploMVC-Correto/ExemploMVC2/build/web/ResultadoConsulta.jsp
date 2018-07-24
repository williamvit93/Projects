<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.*, br.com.Modelo.*, br.com.Controle.*, java.net.*, java.text.*" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> :: RESULTADO CONSULTA :: </title>
    </head>
    <body>
        <h1> :: RESULTADO CONSULTA :: </h1>

        :: A CONSULTA RETORNOU OS SEGUINTES AUTORES ::
        
        <br><br><br>
        
        <table border="1" cellspacing="5" cellpadding="5">
            <thead>
                <tr>
                    <th> ID</th>
                    <th> Primeiro Nome </th>
                    <th> Segundo Nome </th>
                </tr>
            </thead>

            <%
                List<Autores> listaItens = (List<Autores>) request.getAttribute("listaAutores");
                for (Autores au : listaItens) {
            %>
            <tbody>
                <tr>    
                    <td><%= au.getIdAutores()%> </td>  
                    <td><%= au.getPrimeiroNome()%> </td>  
                    <td><%= au.getSegundoNome()%> </td>  
                </tr>  
                <%}%>  
            </tbody>
        </table>
        <br>
        <hr> 
        <a href="index.jsp">Voltar para Página Inicial</a>          

    </body>
</html>
