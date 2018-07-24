/* Objeto de acesso a dados (ou simplesmente DAO, acrônimo de Data Access Object), 
 é um padrão para persistência de dados que permite separar regras de negócio das 
 regras de acesso a banco de dados. Numa aplicação que utilize a arquitetura MVC,
 todas as funcionalidades de bancos de dados, tais como obter as conexões, mapear */
package br.com.Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AutoresDAO {

    private final Connection connection;
    private ResultSet rs;

    public AutoresDAO() throws SQLException {
        this.connection = FabricaDeConexoes.getConnection();
    }

    public void adicionaAutores(Autores autores) {
        String sql = "INSERT INTO autores (primeiroNome, segundoNome) VALUES (?,?)";

        try {            
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, autores.getPrimeiroNome());
            stmt.setString(2, autores.getSegundoNome());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void alteraAutores(Autores autores) {
        String sql = "UPDATE autores SET primeiroNome=?, segundoNome=? WHERE idAutores LIKE ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, autores.getPrimeiroNome());
            stmt.setString(2, autores.getSegundoNome());
            stmt.setInt(3, autores.getIdAutores());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void removeAutores(Autores autores) {
        try {
            PreparedStatement stmt = connection.prepareStatement("DELETE FROM autores WHERE idAutores LIKE ?");
            stmt.setInt(1, autores.getIdAutores());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Autores> obtemLista() {
        try {
            List<Autores> autores = new ArrayList<Autores>();
            PreparedStatement stmt = this.connection.prepareStatement("SELECT * FROM autores");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Autores a = new Autores();
                a.setIdAutores(rs.getInt("idAutores"));
                a.setPrimeiroNome(rs.getString("primeiroNome"));
                a.setSegundoNome(rs.getString("segundoNome"));
                autores.add(a);
            }
            rs.close();
            stmt.close();
            return autores;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Autores> obtemAutor(Autores autores) {
        try {
            String nome = autores.getPrimeiroNome();
            List<Autores> listaAutor = new ArrayList<Autores>();

            PreparedStatement stmt = this.connection.prepareStatement("SELECT * FROM autores WHERE primeiroNome LIKE ?");
            stmt.setString(1, "%" + nome + "%");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Autores a1 = new Autores();
                a1.setIdAutores(rs.getInt("idAutores"));
                a1.setSegundoNome(rs.getString("segundoNome"));
                a1.setPrimeiroNome(rs.getString("primeiroNome"));
                listaAutor.add(a1);

                System.out.println(" ");
                System.out.println("ID" + a1.getIdAutores());
                System.out.println("PRIMEIRO NOME " + a1.getPrimeiroNome());
                System.out.println(" SEGUNDO NOME " + a1.getSegundoNome());
                System.out.println(" ");
            }

            rs.close();
            stmt.close();
            return listaAutor;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
        public List<Autores> obtemAutorByID(Autores autores) {
        try {            
            int id = autores.getIdAutores();
            List<Autores> listaAutor = new ArrayList<Autores>();

            PreparedStatement stmt = this.connection.prepareStatement("SELECT * FROM autores WHERE idAutores LIKE ?");
            stmt.setString(1, "%" + id + "%");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Autores a1 = new Autores();
                a1.setIdAutores(rs.getInt("idAutores"));
                a1.setSegundoNome(rs.getString("segundoNome"));
                a1.setPrimeiroNome(rs.getString("primeiroNome"));
                listaAutor.add(a1);

                System.out.println(" ");
                System.out.println("ID" + a1.getIdAutores());
                System.out.println("PRIMEIRO NOME " + a1.getPrimeiroNome());
                System.out.println(" SEGUNDO NOME " + a1.getSegundoNome());
                System.out.println(" ");
            }

            rs.close();
            stmt.close();
            return listaAutor;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
