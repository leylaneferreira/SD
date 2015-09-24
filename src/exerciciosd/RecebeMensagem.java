package exerciciosd;

import java.io.PrintStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JTextArea;

/**
 *
 * @author Iago Rodrigues
 */
public class RecebeMensagem extends Thread {

    Socket socket;

    public RecebeMensagem(Socket socket) {
        this.socket = socket;
    }

    @Override
    public synchronized void run() {
        try {
            Scanner s = new Scanner(socket.getInputStream());
            while (s.hasNextLine()) {
                //o servidor vai receber uma mensagem e decidir o que irá fazer com ela
            }

        } catch (Exception e) {
            e.printStackTrace();
        } 
        
    }
}
