/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosd;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author Iago Rodrigues
 */
public class NewClass {

    public static void main(String[] args) throws SQLException {
        try {
            ServerSocket s = new ServerSocket(12345);
            Socket conexao  = s.accept();
            Scanner is = new Scanner(conexao.getInputStream());
            System.out.println(is.nextLine());
            conexao.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
