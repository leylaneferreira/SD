package Controller;

import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Iago Rodrigues
 */
public class EscutaTCP extends Thread {

    ServerSocket server;

    public EscutaTCP(ServerSocket server) {
        this.server = server;
    }

    //thread só pra ficar escutando uma conexão tcp nova
    @Override
    public synchronized void run() {
        try {
            int portaTCP = 12345;
            Socket conexao = server.accept();
            RecebeMensagem recebimento = new RecebeMensagem(conexao);
            recebimento.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
