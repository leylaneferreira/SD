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

    public EscutaTCP(java.awt.TextArea servidorTextArea) {
        try {
            this.servidorTextArea = servidorTextArea;
            server = new ServerSocket(12345);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //thread só pra ficar escutando uma conexão tcp nova
    @Override
    public synchronized void run() {
        try {
            Socket conexao = server.accept();
            ServidorRecebe recebimento = new ServidorRecebe(conexao, servidorTextArea);
            recebimento.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
