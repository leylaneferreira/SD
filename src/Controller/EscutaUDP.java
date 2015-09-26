package Controller;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.ServerSocket;

/**
 * @author Iago Rodrigues
 */
public class EscutaUDP extends Thread {

    DatagramSocket serverUDP;
    private java.awt.TextArea servidorTextArea;
    
    public EscutaUDP(DatagramSocket serverUDP, java.awt.TextArea servidorTextArea) {
        this.serverUDP = serverUDP;
        this.servidorTextArea = servidorTextArea;
    }

    @Override
    public synchronized void run() {
        try {
            while (true) {
                int portaUDP = 12344;

                //código do UDP para descoberta do servidor
                serverUDP = new DatagramSocket(portaUDP);
                byte recebendo[] = new byte[1024];

                DatagramPacket buffer = new DatagramPacket(recebendo, recebendo.length);
                serverUDP.receive(buffer);

                DatagramPacket bufferEnvio = new DatagramPacket(recebendo, recebendo.length, buffer.getAddress(), buffer.getPort());
                serverUDP.send(bufferEnvio);
                serverUDP.close();

                //esperar conexão TCP com cliente
                EscutaTCP esperaConexaoTCP = new EscutaTCP(servidorTextArea);
                esperaConexaoTCP.start();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
