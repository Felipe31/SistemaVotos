/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente.visao;

import javax.swing.JOptionPane;
import cliente.vo.Cliente;
import java.awt.Toolkit;
import java.security.MessageDigest;
import orgjson.JSONObject;

/**
 *
 * @author Samsung
 */
public class Login extends javax.swing.JFrame {

    private cliente.controller.Login loginCtrl;

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        setLocation(Toolkit.getDefaultToolkit().getScreenSize().width / 2 - this.getSize().width / 2, Toolkit.getDefaultToolkit().getScreenSize().height / 2 - this.getSize().height / 2);
        loginCtrl = new cliente.controller.Login();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonLogar = new javax.swing.JButton();
        jTextFieldLogin = new javax.swing.JTextField();
        jLabelLogin = new javax.swing.JLabel();
        jLabelSenha = new javax.swing.JLabel();
        jLabelHost = new javax.swing.JLabel();
        jTextFieldIp = new javax.swing.JTextField();
        jTextFieldPorta = new javax.swing.JTextField();
        jLabelPorta = new javax.swing.JLabel();
        jPasswordFieldSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonLogar.setText("Logar");
        jButtonLogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogarActionPerformed(evt);
            }
        });

        jTextFieldLogin.setText("123");
        jTextFieldLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLoginActionPerformed(evt);
            }
        });

        jLabelLogin.setText("Login");

        jLabelSenha.setText("Senha");

        jLabelHost.setText("Host");

        jTextFieldIp.setText("127.0.0.1");
        jTextFieldIp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIpActionPerformed(evt);
            }
        });

        jTextFieldPorta.setText("20000");
        jTextFieldPorta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPortaActionPerformed(evt);
            }
        });

        jLabelPorta.setText("Porta");

        jPasswordFieldSenha.setText("123");
        jPasswordFieldSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldSenhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelLogin)
                    .addComponent(jLabelSenha)
                    .addComponent(jButtonLogar)
                    .addComponent(jTextFieldLogin)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldIp, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelHost))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPorta)
                            .addComponent(jTextFieldPorta, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPasswordFieldSenha))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelHost)
                    .addComponent(jLabelPorta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldIp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPorta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonLogar)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogarActionPerformed
        // TODO add your handling code here:
        if (jTextFieldLogin.getText().toString().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite seu login", "Digite seu login", JOptionPane.ERROR_MESSAGE);
        }
        if (jPasswordFieldSenha.getText().toString().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite sua senha", "Digite sua senha", JOptionPane.ERROR_MESSAGE);
        }
        if (!jTextFieldLogin.getText().toString().isEmpty() && !String.valueOf(jPasswordFieldSenha.getPassword()).isEmpty()) {
            Cliente cliente = new Cliente(null, jTextFieldLogin.getText(), jTextFieldIp.getText(), jTextFieldPorta.getText());
            System.out.println(cliente.getPorta());
            // Hash na senha
            String hash = sha256(String.valueOf(jPasswordFieldSenha.getPassword()));

            // Solicita Login e retorna o datagrama 2
            JSONObject jsonObj = loginCtrl.Logar(cliente, hash);

            // Confere login
            if (jsonObj != null) {
                if (jsonObj.has("nome") && jsonObj.has("tamanho")) {
                    cliente.setNome(jsonObj.getString("nome"));

                    new Home(cliente, loginCtrl, jsonObj.getInt("tamanho")).setVisible(true);
                    this.dispose();
                    JOptionPane.showMessageDialog(this, "Sucesso no Login",
                            "Login realizado com sucesso!", JOptionPane.INFORMATION_MESSAGE);
                }

            } else {
                JOptionPane.showMessageDialog(this, "Erro ao realizar o login!\nTente novamente.",
                        "Erro!", JOptionPane.ERROR_MESSAGE);
            }

//                JOptionPane.showMessageDialog(this, "Erro ao criptografar a senha!\nTente novamente.","Erro!", JOptionPane.ERROR_MESSAGE);
        }
        if (jTextFieldLogin.getText().equals("adm") && String.valueOf(jPasswordFieldSenha.getPassword()).equals("adm")) {
//            Login home = new Login();
//            home.setVisible(true);
//            System.out.println(jTextFieldLogin.getText().toString());
//            this.dispose();
            System.out.println("Adm login");
            JOptionPane.showMessageDialog(this, "Adm Login", "Adm Login", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButtonLogarActionPerformed

    private void jTextFieldIpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIpActionPerformed
        jButtonLogarActionPerformed(evt);
    }//GEN-LAST:event_jTextFieldIpActionPerformed

    private void jPasswordFieldSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldSenhaActionPerformed
        jButtonLogarActionPerformed(evt);
    }//GEN-LAST:event_jPasswordFieldSenhaActionPerformed

    private void jTextFieldLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLoginActionPerformed
        jButtonLogarActionPerformed(evt);
    }//GEN-LAST:event_jTextFieldLoginActionPerformed

    private void jTextFieldPortaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPortaActionPerformed
        jButtonLogarActionPerformed(evt);
    }//GEN-LAST:event_jTextFieldPortaActionPerformed

    public static String sha256(String base) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(base.getBytes("UTF-8"));
            StringBuffer hexString = new StringBuffer();

            for (int i = 0; i < hash.length; i++) {
                String hex = Integer.toHexString(0xff & hash[i]);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }

            return hexString.toString();
        } catch (Exception ex) {
            System.out.println("Não foi possível criptografar a senha;");
//            JOptionPane.showMessageDialog(this, "Erro ao criptografar a senha!\nTente novamente.","Erro!", JOptionPane.ERROR_MESSAGE);
            return base;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLogar;
    private javax.swing.JLabel jLabelHost;
    private javax.swing.JLabel jLabelLogin;
    private javax.swing.JLabel jLabelPorta;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldIp;
    private javax.swing.JTextField jTextFieldLogin;
    private javax.swing.JTextField jTextFieldPorta;
    // End of variables declaration//GEN-END:variables
}
