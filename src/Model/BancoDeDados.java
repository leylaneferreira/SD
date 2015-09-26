package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Iago Rodrigues
 */
public class BancoDeDados {

    private Connection conn;
    private String serverIPDB;

    public BancoDeDados(String serverIPDB) {
        this.serverIPDB = serverIPDB;
    }

    public boolean abrirConexao() {
        try {
            //conn = DriverManager.getConnection("jdbc:postgresql://192.168.25.4:5432/SD", "postgres", "lidiane");
            conn = DriverManager.getConnection("jdbc:postgresql://" + serverIPDB + ":5432/SD", "postgres", "123");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean fecharConexao() {
        try {
            conn.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean gravarUsuario(String nome, String senha) {
        try {
            PreparedStatement stmt = conn.prepareStatement(""
                    + "INSERT INTO USUARIO (NOME_USUARIO,SENHA) values (?,?)");
            stmt.setString(1, nome);
            stmt.setString(2, senha);
            stmt.executeUpdate();
            stmt.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean logarUsuario(String nome, String senha) {

        PreparedStatement ps;

        try {
            ps = conn.prepareStatement("SELECT SENHA FROM USUARIO WHERE NOME_USUARIO = ? AND SENHA = ?");
            ps.setString(1, nome);
            ps.setString(2, senha);
            ResultSet rs = ps.executeQuery();

            while (rs.next() == true) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return false;
    }
}
