package exerciciosd;

import java.io.InputStream;
import java.io.PrintStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import javax.swing.JTextArea;

/**
 * @author Iago Rodrigues
 */
public class EsperaNovaConexao extends Thread {

    ServerSocket serverTCP;
    DatagramSocket serverUDP;

    public EsperaNovaConexao(ServerSocket serverTCP, DatagramSocket serverUDP) {
        this.serverTCP = serverTCP;
        this.serverUDP = serverUDP;
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
                int portaTCP = 12345;
                Socket conexao = serverTCP.accept();
            
                RecebeMensagem recebimento = new RecebeMensagem(conexao);
                recebimento.start();
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
