package Controller;

import java.net.DatagramSocket;
import java.net.ServerSocket;

public class ControleServidor {

    private java.awt.TextArea servidorTextArea;

    public ControleServidor(java.awt.TextArea servidorTextArea) {
        this.servidorTextArea = servidorTextArea;
    }
    
    public void start() {
        try {
            DatagramSocket serverUDP = null;

            EscutaUDP esperarConexoes = new EscutaUDP(serverUDP, servidorTextArea);
            esperarConexoes.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
