package Control;

import java.io.PrintStream;

/**
 *
 * @author Iago Rodrigues
 */
public class Person {

    public synchronized void enviar(PrintStream streamSaida, String mensagem) {

        try {
            mensagem = "Alguém disse: " + mensagem + "\n";
            streamSaida.write(mensagem.getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
