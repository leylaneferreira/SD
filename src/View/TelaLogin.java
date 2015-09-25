/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Cliente;
import Controller.ControleBD;

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

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setText("Login:");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel2.setText("Senha:");

        cadastrojButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cadastrojButton.setText("Cadastro");
        cadastrojButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrojButtonActionPerformed(evt);
            }
        });

        loginjButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        loginjButton.setText("Login");
        loginjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginjButtonActionPerformed(evt);
            }
        });

        label1.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        label1.setText("Acesso ao Chat");

        paraCadastrarjLabel.setText("ainda não é cadastrado?");
        paraCadastrarjLabel.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cadastrojButton, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(paraCadastrarjLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(loginjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(60, 60, 60)
                                    .addComponent(loginjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(54, 54, 54)
                                    .addComponent(senhajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(loginjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(senhajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(loginjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(paraCadastrarjLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cadastrojButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
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
            TelaChat chat = new TelaChat();
            chat.setVisible(true);
            this.dispose();
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
