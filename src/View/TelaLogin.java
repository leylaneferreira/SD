/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ControleCliente;
import Controller.ControleBD;
import Controller.ControleCliente;
import java.net.Socket;

/**
 *
 * @author Iago Rodrigues
 */
public class TelaLogin extends javax.swing.JFrame {

    private String serverIP;

    public TelaLogin(String serverIP) {
        this.serverIP = serverIP;
        initComponents();
    }

    /**
     * Código da interface gráfica gerado pelo Netbeans.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginjTextField = new javax.swing.JTextField();
        senhajTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cadastrojButton = new javax.swing.JButton();
        loginjButton = new javax.swing.JButton();
        label1 = new java.awt.Label();
        paraCadastrarjLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loginjTextField.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        loginjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginjTextFieldActionPerformed(evt);
            }
        });

        senhajTextField.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel1.setText("Login:");

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel2.setText("Senha:");

        cadastrojButton.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        cadastrojButton.setText("Cadastro");
        cadastrojButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrojButtonActionPerformed(evt);
            }
        });

        loginjButton.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        loginjButton.setText("Login");
        loginjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginjButtonActionPerformed(evt);
            }
        });

        label1.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        label1.setText("Acesso ao Chat");

        paraCadastrarjLabel.setFont(new java.awt.Font("Cambria", 1, 11)); // NOI18N
        paraCadastrarjLabel.setText("ainda não é cadastrado?");
        paraCadastrarjLabel.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(19, 19, 19)
                                    .addComponent(jLabel1)
                                    .addGap(41, 41, 41)
                                    .addComponent(loginjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(41, 41, 41)
                                .addComponent(senhajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(loginjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(paraCadastrarjLabel)
                            .addComponent(cadastrojButton, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(senhajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(loginjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(paraCadastrarjLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cadastrojButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrojButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrojButtonActionPerformed
        TelaCadastro tela = new TelaCadastro(serverIP);
        tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cadastrojButtonActionPerformed

    private void loginjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginjButtonActionPerformed
        ControleBD controle = new ControleBD(serverIP);
        if (controle.login(loginjTextField.getText(), senhajTextField.getText())) {
            try {
                ControleCliente novoCliente = new ControleCliente();
                novoCliente.setNomeCliente(loginjTextField.getText());
                TelaChat chat = new TelaChat(novoCliente, serverIP);
                chat.setVisible(true);
                this.dispose();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            loginjTextField.setText("");
            senhajTextField.setText("");
        }

    }//GEN-LAST:event_loginjButtonActionPerformed

    private void loginjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginjTextFieldActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrojButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private java.awt.Label label1;
    private javax.swing.JButton loginjButton;
    private javax.swing.JTextField loginjTextField;
    private javax.swing.JLabel paraCadastrarjLabel;
    private javax.swing.JTextField senhajTextField;
    // End of variables declaration//GEN-END:variables
}
