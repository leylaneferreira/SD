/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Iago Rodrigues
 */
public class NewClass {

    public static void main(String[] args) throws SQLException {
        try {
            BancoDeDados bd = new BancoDeDados();
            bd.abrirConexao();
            boolean retorno = bd.gravarUsuario("ley", "iag");
            System.out.println(retorno);
            bd.fecharConexao();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
