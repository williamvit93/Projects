<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.*, br.com.Modelo.*, br.com.Controle.*, java.net.*, java.text.*" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> :: RESULTADO ATUALIZA :: </title>
    </head>
    <body>
        <h1> :: RESULTADO ATUALIZA :: </h1>

        <form action="MA" name="formX" method="POST"/>
        <table border="1" cellspacing="5" cellpadding="5">
            <thead>
                <tr>
                    <th> ID </th>
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
                    <td> <input type="hidden" name="idAutores" value="<%= au.getIdAutores()%>" /> <%= au.getIdAutores()%> </td>  
                    <td> <input type="text" name="primeiroNome" value="" /> <%= au.getPrimeiroNome()%> </td>  
                    <td> <input type="text" name="segundoNome" value="" /> <%= au.getSegundoNome()%> </td>  
                </tr>  
                
                <%}%>  

                <tr> 
                    <td> <input type="submit" value="Atualizar"> </td> 
                </tr>
            </tbody>
        </table>
    </form>
                
    <br>
    <hr> 
    <a href="index.jsp">Voltar para Página Inicial</a>          

</body>
</html>
