/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import model.Atendimento;
import model.Cliente;
import model.Funcionario;
import model.PessoaFisica;
import model.PessoaJuridica;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Will
 */
public class NovoAtendimento extends javax.swing.JInternalFrame {

    
    public NovoAtendimento() {
        initComponents();
        //
        setLocation(300, 20);
        //
    }

    public JButton getbCriarAt() {
        return bCriarAt;
    }

    public JButton getbLimpar() {
        return bLimpar;
    }

    public JButton getbVoltar() {
        return bVoltar;
    }

    public JFormattedTextField getFtfDataAbert() {
        return ftfDataAbert;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public JPanel getjPanel2() {
        return jPanel2;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public JRadioButton getRbFisica() {
        return rbFisica;
    }

    public JRadioButton getRbJuridica() {
        return rbJuridica;
    }

    public JRadioButton getRbReclamacao() {
        return rbReclamacao;
    }

    public JRadioButton getRbSugestao() {
        return rbSugestao;
    }

    public JTextArea getTaTopico() {
        return taTopico;
    }

    public JTextArea getTfAssunto() {
        return tfAssunto;
    }

    public JTextField getTfCodCli() {
        return tfCodCli;
    }

    public JTextField getTfCodResp() {
        return tfCodResp;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgRec_Sug = new javax.swing.ButtonGroup();
        bgPessoa = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        bCriarAt = new javax.swing.JButton();
        bLimpar = new javax.swing.JButton();
        bVoltar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taTopico = new javax.swing.JTextArea();
        rbReclamacao = new javax.swing.JRadioButton();
        rbSugestao = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        tfCodResp = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ftfDataAbert = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        tfCodCli = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tfAssunto = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        rbFisica = new javax.swing.JRadioButton();
        rbJuridica = new javax.swing.JRadioButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Novo Atendimento");

        bCriarAt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bCriarAt.setText("Criar");
        bCriarAt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCriarAtActionPerformed(evt);
            }
        });

        bLimpar.setText("Limpar tudo");
        bLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLimparActionPerformed(evt);
            }
        });

        bVoltar.setText("Voltar");
        bVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVoltarActionPerformed(evt);
            }
        });

        taTopico.setColumns(20);
        taTopico.setRows(5);
        jScrollPane1.setViewportView(taTopico);

        bgRec_Sug.add(rbReclamacao);
        rbReclamacao.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        rbReclamacao.setText("Reclamação");

        bgRec_Sug.add(rbSugestao);
        rbSugestao.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        rbSugestao.setText("Sugestão");

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel7.setText("Cód. Responsável:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel4.setText("Data de Abertura:");

        try {
            ftfDataAbert.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel6.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel6.setText("Cód. Cliente:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel5.setText("Assunto:");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/atendimento.png"))); // NOI18N

        tfAssunto.setColumns(20);
        tfAssunto.setRows(5);
        jScrollPane2.setViewportView(tfAssunto);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel2.setText("Pessoa:");

        bgPessoa.add(rbFisica);
        rbFisica.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        rbFisica.setText("Física");

        bgPessoa.add(rbJuridica);
        rbJuridica.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        rbJuridica.setText("Jurídica");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(rbFisica)
                                .addGap(18, 18, 18)
                                .addComponent(rbJuridica))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(ftfDataAbert, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfCodCli, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfCodResp, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2))
                .addGap(0, 10, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(36, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(rbFisica)
                    .addComponent(rbJuridica))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfCodCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfCodResp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ftfDataAbert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(bVoltar)
                        .addGap(18, 18, 18)
                        .addComponent(bLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(bCriarAt))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(rbReclamacao)
                        .addGap(108, 108, 108)
                        .addComponent(rbSugestao))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbReclamacao)
                    .addComponent(rbSugestao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCriarAt)
                    .addComponent(bLimpar)
                    .addComponent(bVoltar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLimparActionPerformed
        tfAssunto.setText(null);
        tfCodCli.setText(null);
        tfCodResp.setText(null);
        ftfDataAbert.setText(null);
        taTopico.setText(null);
    }//GEN-LAST:event_bLimparActionPerformed

    private void bVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_bVoltarActionPerformed

    private void bCriarAtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCriarAtActionPerformed
        Atendimento at = new Atendimento(); 
        Funcionario func = new Funcionario();
        PessoaFisica pf = new PessoaFisica();
        PessoaJuridica pj = new PessoaJuridica();
        at.setCodAtendimento(at.gerarCodAtendimento());
        at.setCodCliente(tfCodCli.getText());
        at.setDataInicio(ftfDataAbert.getText());
        at.setCodFunc(tfCodResp.getText());
        at.setAssunto(tfAssunto.getText());
        if (rbReclamacao.isSelected()){
            at.setReclamacao(taTopico.getText());
            at.setSugestao("");
        }
        else if(rbSugestao.isSelected()){
            at.setSugestao(taTopico.getText());
            at.setReclamacao("");
        }
        else {
            JOptionPane.showMessageDialog(null, "Selecione o tipo de atendimento! (Reclamação ou Sugestão)");
        }
         if(at.getCodCliente().isEmpty() || at.getDataInicio().equals("  /  /    ") || at.getCodFunc().isEmpty() || at.getAssunto().isEmpty()){
           JOptionPane.showMessageDialog(null, "Não pode haver campos nulos!");
           return;
       } else if(Integer.parseInt(at.getDataInicio().substring(0,2)) > 31 || Integer.parseInt(at.getDataInicio().substring(3,5)) > 12){
            JOptionPane.showMessageDialog(null, "A data de abertura é invalida!");
            return;
          } 
         func.retornarFunc((tfCodResp.getText()));
         if(rbFisica.isSelected()){
            try {
                pf.retornarPf((tfCodCli.getText()));
                
                if(pf.retornarPf(tfCodCli.getText()).getStatement().executeUpdate("SELECT * FROM PF WHERE CODCLIENTE like '%" + tfCodCli.getText() + "%'") == 0){
                    JOptionPane.showMessageDialog(null, "Este Cliente não existe!");
                    return;
                }
            } catch (SQLException ex) {
                Logger.getLogger(NovoAtendimento.class.getName()).log(Level.SEVERE, null, ex);
            }
         }
         else if (rbJuridica.isSelected()){  
         
         //
         try {
                pj.retornarPj((tfCodCli.getText()));
                
                if(pj.retornarPj(tfCodCli.getText()).getStatement().executeUpdate("SELECT * FROM PJ WHERE CODCLIENTE like '%" + tfCodCli.getText() + "%'") == 0){
                    JOptionPane.showMessageDialog(null, "Este Cliente não existe!");
                    return;
                }
            } catch (SQLException ex) {
                Logger.getLogger(NovoAtendimento.class.getName()).log(Level.SEVERE, null, ex);
            }
         //
         //
         }
         else  {
             JOptionPane.showMessageDialog(null, "Selecione o tipo de cliente!");
             return;
             
         }
        //Inserts temporarios:
        
        at.setStatus("Em Atendimento");
        
        at.inserirAtendimento(at.getCodAtendimento(), at.getCodCliente(), at.getCodFunc(), at.getAssunto(), at.getStatus(), at.getDataInicio(), at.getSugestao(), at.getReclamacao());
        
    }//GEN-LAST:event_bCriarAtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCriarAt;
    private javax.swing.JButton bLimpar;
    private javax.swing.JButton bVoltar;
    private javax.swing.ButtonGroup bgPessoa;
    private javax.swing.ButtonGroup bgRec_Sug;
    private javax.swing.JFormattedTextField ftfDataAbert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rbFisica;
    private javax.swing.JRadioButton rbJuridica;
    private javax.swing.JRadioButton rbReclamacao;
    private javax.swing.JRadioButton rbSugestao;
    private javax.swing.JTextArea taTopico;
    private javax.swing.JTextArea tfAssunto;
    private javax.swing.JTextField tfCodCli;
    private javax.swing.JTextField tfCodResp;
    // End of variables declaration//GEN-END:variables
}