package br.com.Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaDeConexoes {

    private static final String BANCODADOS = "livros";
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String USUARIO = "system";
    private static final String SENHA = "1234";
    private static final String DRIVER = "oracle.jdbc.OracleDriver";

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName(DRIVER);
            System.out.println(" ");
            System.out.println(" --- Conexão criada com o banco de dados MySQL --- ");
            System.out.println(" ");
            return DriverManager.getConnection(URL, USUARIO, SENHA);
            
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());            
            throw new SQLException(e.getMessage());            
        }
    }

}
