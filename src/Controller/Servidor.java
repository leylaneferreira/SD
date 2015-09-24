package Controller;

import java.io.IOException;
import java.net.DatagramSocket;
import java.net.ServerSocket;

public class Servidor {

    public static void main(String[] args) throws IOException {

        ServerSocket serverTCP = new ServerSocket(12345);
        DatagramSocket serverUDP = null;
                
        EsperaNovaConexao esperarConexoes = new EsperaNovaConexao(serverTCP, serverUDP);
        esperarConexoes.start();
        
    }

}
