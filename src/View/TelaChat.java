/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ControleCliente;
import java.io.OutputStream;
import java.net.Socket;

/**
 *
 * @author Iago Rodrigues
 */
public class TelaChat extends javax.swing.JFrame {

    ControleCliente cliente;
    Socket conexao;
    OutputStream os;
    String ipConexao;

    public TelaChat(ControleCliente novoCliente, String ipConexao) {
        this.cliente = novoCliente;
        initComponents();
        this.ipConexao = ipConexao;
        inicio();
    }

    /**
     * Código gerado pelo Netbeans.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        disponiveisList = new java.awt.List();
        textoEnviadotextArea = new java.awt.TextArea();
        mensagemTextField = new java.awt.TextField();
        enviarButton = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        mensagemTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mensagemTextFieldActionPerformed(evt);
            }
        });

        enviarButton.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        enviarButton.setLabel("Enviar");
        enviarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mensagemTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enviarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(disponiveisList, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(textoEnviadotextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(disponiveisList, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(textoEnviadotextArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mensagemTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(enviarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enviarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarButtonActionPerformed
        try {
            os.write(mensagemTextField.getText().getBytes());
            System.out.println("mensagem enviada");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_enviarButtonActionPerformed

    private void mensagemTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mensagemTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mensagemTextFieldActionPerformed

    private void inicio() {
        try {
            disponiveisList.add(cliente.getNomeCliente(), 0);
            conexao = new Socket(ipConexao, 12345);
            System.out.println("conexão iniada");
            os = conexao.getOutputStream();
            System.out.println("stream aberta");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.List disponiveisList;
    private java.awt.Button enviarButton;
    private java.awt.TextField mensagemTextField;
    private java.awt.TextArea textoEnviadotextArea;
    // End of variables declaration//GEN-END:variables
}
