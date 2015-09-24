/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.*;

/**
 * @author Leylane
 */
public class Cliente {

    public static void main(String[] args) throws SocketException, UnknownHostException, IOException {
        try {
            //código para recebimento de ip
            DatagramSocket conexaoUDP = new DatagramSocket();

            String ip = "255.255.255.255";
            String mensagem = "queroentrar";
            byte msg[] = mensagem.getBytes();
            int porta = 12344;
            InetAddress ina = InetAddress.getByName(ip);

            DatagramPacket dp = new DatagramPacket(msg, msg.length, ina, porta);
            conexaoUDP.send(dp);

            byte[] receive = new byte[1024];
            DatagramPacket recebendo = new DatagramPacket(receive, receive.length, ina, porta);
            conexaoUDP.receive(recebendo);
            
            System.out.println(recebendo.getAddress());
            conexaoUDP.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
