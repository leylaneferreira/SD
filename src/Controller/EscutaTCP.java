package Controller;

import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Iago Rodrigues
 */
public class EscutaTCP extends Thread {

    ServerSocket server;
    private java.awt.TextArea servidorTextArea;
    
    public EscutaTCP(ServerSocket server, java.awt.TextArea servidorTextArea) {
        this.server = server;
        this.servidorTextArea = servidorTextArea;
    }

    //thread só pra ficar escutando uma conexão tcp nova
    @Override
    public synchronized void run() {
        try {
            int portaTCP = 12345;
            Socket conexao = server.accept();
            ServidorRecebe recebimento = new ServidorRecebe(conexao, servidorTextArea);
            recebimento.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
