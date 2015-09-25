package Controller;

import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Iago Rodrigues
 */
public class ServidorRecebe extends Thread {

    Socket conexao;
    private java.awt.TextArea servidorTextArea;

    public ServidorRecebe(Socket conexao, java.awt.TextArea servidorTextArea) {
        this.conexao = conexao;
        this.servidorTextArea = servidorTextArea;
    }

    @Override
    public synchronized void run() {
        try {
            Scanner s = new Scanner(conexao.getInputStream());
            while (s.hasNextLine()) {
                String nomeCliente = s.nextLine();
                servidorTextArea.setText(servidorTextArea.getText()+nomeCliente);
                break;
            }
            
            while (s.hasNextLine()) {
                //o servidor vai receber uma mensagem e decidir o que irá fazer com ela
                String nomeCliente = s.nextLine();
                servidorTextArea.setText(servidorTextArea.getText());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
