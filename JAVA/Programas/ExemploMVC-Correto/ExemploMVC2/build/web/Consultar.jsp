<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.*, br.com.Modelo.*, br.com.Controle.*, java.net.*, java.text.*" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>:: CONSULTAR AUTOR :: </title>
    </head>
    <body>                
        <h1> :: CONSULTAR AUTOR :: </h1>       


        <form name="formConsultar" action="CA" method="POST">
            <table cellspacing="10" cellpadding="10">                
                <tbody>
                    <tr>
                        <td>Digite o primeiro nome do autor:</td>
                        <td><input type="text" name="txtPNC" value="" /></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><input type="submit" value="Consultar" name="Consultar" /></td>
                    </tr>
                </tbody>
            </table>

        </form> 

        <br>
        <hr> 
        <a href="/index.jsp">Voltar para Página Inicial</a>                

    </body>
</html>
