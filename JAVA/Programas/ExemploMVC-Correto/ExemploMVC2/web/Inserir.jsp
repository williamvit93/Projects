<%@ page contentType="text/html" pageEncoding="UTF-8"%> 
<jsp:useBean id="bean" scope="session" class="br.com.Modelo.Autores"/>
<jsp:setProperty name="bean" property="primeiroNome"/>
<jsp:setProperty name="bean" property="segundoNome"/>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> INSERIR AUTOR </title>       
    </head>
    <body>
        <h1> INSERIR AUTOR </h1>
        <table border="1" cellspacing="1" cellpadding="1">
            <form name="formInserir" action="IA" method="POST">            
                <tbody>
                    <tr>
                        <td> Primeiro Nome: </td>
                        <td> <input type="text" name="primeiroNome" size="50" /> </td>

                    </tr>
                    <tr>
                        <td> Segundo Nome: </td>
                        <td> <input type="text" name="segundoNome" size="50" /> </td>
                    </tr>
                    <tr>
                        <td> Inserir: </td>
                        <td> <input type="submit" name="inserir" /> </td>
                    </tr>
                </tbody>
        </table>
    </form> 
</body>
<br>
<hr> 
<a href="index.jsp">Voltar para Página Inicial</a>         
</html>