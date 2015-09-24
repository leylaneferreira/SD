package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

/**
 *
 * @author Iago Rodrigues
 */
public class BancoDeDados {

    Connection conn;

    public boolean abrirConexao() {
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://192.168.25.4:5432/SD", "postgres", "lidiane");
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

}
