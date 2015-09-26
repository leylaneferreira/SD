package Controller;

public class ControleServidor {

    private java.awt.TextArea servidorTextArea;

    public ControleServidor(java.awt.TextArea servidorTextArea) {
        this.servidorTextArea = servidorTextArea;
    }
    
    public void start() {
        try {
            EscutaTCP esperaConexao = new EscutaTCP(servidorTextArea);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
