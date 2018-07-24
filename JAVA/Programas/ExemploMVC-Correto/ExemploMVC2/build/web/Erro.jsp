<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page language="java" isErrorPage="true" import="java.io.*"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> :: ERRO :: </title>
    </head>
    <body>
        <h1> OCORREU O SEGUINTE ERRO NO SERVLET: </h1> 
        <br>
        <form action = "index.jsp" > 
            <table border="0" cellspacing="5" cellpadding="5">
                <thead>
                    <tr>
                        <th></th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td> </td>
                        <td> <input type="submit" value="Clique aqui para tentar novamente"/> </td>
                    </tr> 
                    <tr>
                        <td> Exceção: </td>
                        <td> <%= exception%>  </td>
                    </tr>               
                    <tr>
                        <td> Mensagem: </td>
                        <td> <%= exception.getMessage()%> </td>
                    </tr>
                    <tr>
                        <td> StackTrace: </td>
                        <td>
                            <%
                                StringWriter stringWriter = new StringWriter();
                                PrintWriter printWriter = new PrintWriter(stringWriter);
                                exception.printStackTrace(printWriter);
                                out.println(stringWriter);
                                printWriter.close();
                                stringWriter.close();
                            %>
                        </td>
                    </tr>
                </tbody>
            </table>
        </form> 
        <br>
        <hr> 
        <a href="index.jsp">Voltar para Página Inicial</a>         

    </body>

</html>

