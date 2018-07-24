

package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Conexao {
    
    
    private Statement stmt = null;
    private Connection conn = null;
    private String driverName = "oracle.jdbc.OracleDriver";
    private String conString = "jdbc:oracle:thin:@localhost:1521:xe";
    private String usuario = "system";
    private String senha = "1234";
 
    public Statement getStatement(){
        return stmt;
    }
    
       public void abreConexao() {
        try {
            Class.forName(driverName);
            conn = DriverManager.getConnection(conString, usuario, senha);
            stmt = conn.createStatement();
        } catch (SQLException e) {
            System.out.println("Erro SQL: " + e.getMessage());
        } catch (ClassNotFoundException ce) {
            System.out.println("Classe não foi encontrada: " + ce.getMessage());
        }
    }

    public void fechaConexao() {
        try {
            stmt.close();
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
