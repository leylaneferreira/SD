package Controller;

import java.net.DatagramSocket;
import java.net.ServerSocket;

public class ControleServidor {

    public void start() {
        try {
            ServerSocket serverTCP = new ServerSocket(12345);
            DatagramSocket serverUDP = null;

            EscutaUDP esperarConexoes = new EscutaUDP(serverTCP, serverUDP);
            esperarConexoes.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
