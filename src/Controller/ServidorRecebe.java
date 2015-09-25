package Controller;

import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Iago Rodrigues
 */
public class ServidorRecebe extends Thread {

    Socket conexao;

    public ServidorRecebe(Socket conexao) {
        this.conexao = conexao;
    }

    @Override
    public synchronized void run() {
        try {
            Scanner s = new Scanner(conexao.getInputStream());
            if (s.hasNextLine()) {
                String nomeCliente = s.nextLine();
                System.out.println(nomeCliente+ "sff");
            }

            while (s.hasNextLine()) {
                //o servidor vai receber uma mensagem e decidir o que irá fazer com ela
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
