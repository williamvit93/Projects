/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.Funcionario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Will
 */
public class Login extends javax.swing.JFrame {

    String userIn;

    public void setUserIn(String x) {
        userIn = x;
    }

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);

    }

    public String getUserIn() {
        return userIn;
    }

    public JButton getLogar() {
        return logar;
    }

    public JPanel getLogin() {
        return login;
    }

    public JButton getSair() {
        return sair;
    }

    public JTextField getTfcodFunc() {
        return tfcodFunc;
    }

    public JPasswordField getTfsenhaFunc() {
        return tfsenhaFunc;
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login = new javax.swing.JPanel();
        logoEmpresa = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JLabel();
        logar = new javax.swing.JButton();
        txtSenha = new javax.swing.JLabel();
        tfsenhaFunc = new javax.swing.JPasswordField();
        tfcodFunc = new javax.swing.JTextField();
        sair = new javax.swing.JButton();
        txtTechsolutions = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        login.setBackground(new java.awt.Color(255, 255, 255));

        logoEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pulse logoicon.gif"))); // NOI18N
        logoEmpresa.setText("INDÚSTRIA QUÍMICA PULSE LTDA.");

        titulo.setBackground(new java.awt.Color(153, 51, 255));
        titulo.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        titulo.setForeground(new java.awt.Color(153, 51, 255));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("CRM - INDÚSTRIA QUÍMICA PULSE");
        titulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 255), 10));
        titulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        titulo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        txtUsuario.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        txtUsuario.setText("Usuário:");

        logar.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        logar.setText("OK");
        logar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logarActionPerformed(evt);
            }
        });

        txtSenha.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        txtSenha.setText("Senha:");

        tfsenhaFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfsenhaFuncActionPerformed(evt);
            }
        });

        tfcodFunc.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tfcodFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfcodFuncActionPerformed(evt);
            }
        });

        sair.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });

        txtTechsolutions.setForeground(new java.awt.Color(153, 153, 153));
        txtTechsolutions.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTechsolutions.setText("Desenvolvido por: TECH SOLUTIONS LTDA.");

        javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(login);
        login.setLayout(loginLayout);
        loginLayout.setHorizontalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginLayout.createSequentialGroup()
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(logoEmpresa))
                            .addComponent(titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginLayout.createSequentialGroup()
                        .addGap(0, 16, Short.MAX_VALUE)
                        .addComponent(txtTechsolutions, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(loginLayout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtUsuario)
                            .addComponent(txtSenha))
                        .addGap(18, 18, 18)
                        .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(loginLayout.createSequentialGroup()
                                .addComponent(sair)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(logar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tfsenhaFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(loginLayout.createSequentialGroup()
                    .addGap(266, 266, 266)
                    .addComponent(tfcodFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(276, Short.MAX_VALUE)))
        );
        loginLayout.setVerticalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoEmpresa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(txtUsuario)
                .addGap(26, 26, 26)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfsenhaFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSenha))
                .addGap(36, 36, 36)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sair))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                .addComponent(txtTechsolutions)
                .addContainerGap())
            .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(loginLayout.createSequentialGroup()
                    .addGap(242, 242, 242)
                    .addComponent(tfcodFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(258, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfsenhaFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfsenhaFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfsenhaFuncActionPerformed

    private void tfcodFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfcodFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfcodFuncActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed

    }//GEN-LAST:event_sairActionPerformed


    private void logarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logarActionPerformed
        Funcionario func = new Funcionario();
        TelaPrincipal tela = new TelaPrincipal();
        userIn = tfcodFunc.getText();
        String passIn = tfsenhaFunc.getText();
        if (userIn.equals("admin") == false) {
            tela.menuFuncCad.setVisible(false);

        }
        //
        ResultSet resultadoFunc2 = func.retornaNome(userIn);
        String nome = null;
        try {

            while (resultadoFunc2.next()) {
                nome = resultadoFunc2.getString("NOME");
                tela.setUser(nome);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

        func.fechaConexao();

        //
        ResultSet resultadoFunc = func.logar(userIn);

        String usuario = null;
        String senha = null;

        try {

            while (resultadoFunc.next()) {
                usuario = resultadoFunc.getString("CODFUNC");
                senha = resultadoFunc.getString("SENHA");
            }

            try {
                if (usuario.equals(userIn) && (senha.equals((passIn)))) {

                    tela.setVisible(true);
                    this.dispose();

                } else {
                    JOptionPane.showMessageDialog(null, "Usuário e/ou senha inválidos, tente novamente.");
                }

            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Usuário e/ou senha inválidos, tente novamente.");
            }

            func.fechaConexao();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_logarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton logar;
    private javax.swing.JPanel login;
    private javax.swing.JLabel logoEmpresa;
    private javax.swing.JButton sair;
    private javax.swing.JTextField tfcodFunc;
    private javax.swing.JPasswordField tfsenhaFunc;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel txtSenha;
    private javax.swing.JLabel txtTechsolutions;
    private javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables
}
