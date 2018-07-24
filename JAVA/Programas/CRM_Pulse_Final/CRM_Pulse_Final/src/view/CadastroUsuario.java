/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.Funcionario;

public class CadastroUsuario extends javax.swing.JInternalFrame {

    /**
     * Creates new form NewJInternalFrame
     */
    public  CadastroUsuario() {
        initComponents();
      //
        setLocation(300, 20);
        //
    }

    public JButton getbCadFunc() {
        return bCadFunc;
    }

    public JButton getbLimparFunc() {
        return bLimparFunc;
    }

    public JButton getbVoltarFunc() {
        return bVoltarFunc;
    }

    public JFormattedTextField getFtfDataAdmissao() {
        return ftfDataAdmissao;
    }

    public JPanel getjPanel5() {
        return jPanel5;
    }

    public JPanel getjPanel6() {
        return jPanel6;
    }

    public JPasswordField getPfConfirmaSenha() {
        return pfConfirmaSenha;
    }

    public JPasswordField getPfSenhaFunc() {
        return pfSenhaFunc;
    }

    public JTextField getTfBairro() {
        return tfBairro;
    }

    public JFormattedTextField getTfBaseSalarial() {
        return tfBaseSalarial;
    }

    public JTextField getTfCEP() {
        return tfCEP;
    }

    public JTextField getTfCPF() {
        return tfCPF;
    }

    public JTextField getTfCargoAtual() {
        return tfCargoAtual;
    }

    public JTextField getTfCargoEntrada() {
        return tfCargoEntrada;
    }

    public JTextField getTfCidade() {
        return tfCidade;
    }

    public JTextField getTfNome() {
        return tfNome;
    }

    public JTextField getTfNumero() {
        return tfNumero;
    }

    public JTextField getTfRua() {
        return tfRua;
    }

    public JTextField getTfSetor() {
        return tfSetor;
    }

    public JTextField getTfUF() {
        return tfUF;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        tfCPF = new javax.swing.JTextField();
        tfSetor = new javax.swing.JTextField();
        tfCargoAtual = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        ftfDataAdmissao = new javax.swing.JFormattedTextField();
        bCadFunc = new javax.swing.JButton();
        bLimparFunc = new javax.swing.JButton();
        bVoltarFunc = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        tfCEP = new javax.swing.JTextField();
        tfRua = new javax.swing.JTextField();
        tfNumero = new javax.swing.JTextField();
        tfBairro = new javax.swing.JTextField();
        tfCidade = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tfUF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        pfConfirmaSenha = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        pfSenhaFunc = new javax.swing.JPasswordField();
        tfCargoEntrada = new javax.swing.JTextField();
        tfBaseSalarial = new javax.swing.JFormattedTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro de Funcionário");

        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel12.setText("Nome:");

        jLabel13.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel13.setText("CPF:");

        jLabel14.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel14.setText("Setor:");

        jLabel15.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel15.setText("Cargo Atual:");

        tfSetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSetorActionPerformed(evt);
            }
        });

        tfCargoAtual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCargoAtualActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel16.setText("Cargo Entrada:");

        jLabel18.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel18.setText("Base Salarial:");

        jLabel19.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel19.setText("Data Admissão:");

        try {
            ftfDataAdmissao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftfDataAdmissao.setToolTipText("");
        ftfDataAdmissao.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        bCadFunc.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        bCadFunc.setText("Cadastrar");
        bCadFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCadFuncActionPerformed(evt);
            }
        });

        bLimparFunc.setText("Limpar");
        bLimparFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLimparFuncActionPerformed(evt);
            }
        });

        bVoltarFunc.setText("Voltar");
        bVoltarFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVoltarFuncActionPerformed(evt);
            }
        });

        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel10.setText("Endereço");

        jLabel17.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel17.setText("CEP:");

        jLabel20.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel20.setText("Rua:");

        jLabel21.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel21.setText("Nº:");

        jLabel22.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel22.setText("Bairro:");

        jLabel23.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel23.setText("Cidade:");

        jLabel24.setText("Estado:");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel1.setText("UF:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(12, 12, 12)
                        .addComponent(tfBairro))
                    .addComponent(jLabel24)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel20)
                                .addGap(11, 11, 11)
                                .addComponent(tfRua)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfUF)))
                        .addGap(127, 127, 127))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(tfCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23)
                    .addComponent(tfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(tfUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jLabel24)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel3.setText("Confirmar senha:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel4.setText("Senha:");

        pfSenhaFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pfSenhaFuncActionPerformed(evt);
            }
        });

        tfBaseSalarial.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.00"))));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addComponent(jLabel15)
                                    .addGap(55, 55, 55)
                                    .addComponent(tfCargoAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(tfSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ftfDataAdmissao, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                            .addComponent(tfCargoEntrada)
                            .addComponent(tfBaseSalarial))
                        .addGap(111, 111, 111))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(bVoltarFunc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bLimparFunc)
                                .addGap(18, 18, 18)
                                .addComponent(bCadFunc))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel12))
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGap(83, 83, 83)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(pfSenhaFunc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                            .addComponent(pfConfirmaSenha, javax.swing.GroupLayout.Alignment.LEADING)))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGap(82, 82, 82)
                                        .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel11))))
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(pfSenhaFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(pfConfirmaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(tfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(tfSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfCargoAtual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bVoltarFunc)
                            .addComponent(bLimparFunc)
                            .addComponent(bCadFunc)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(tfCargoEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(tfBaseSalarial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(ftfDataAdmissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 27, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfSetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSetorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSetorActionPerformed

    private void tfCargoAtualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCargoAtualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCargoAtualActionPerformed

    private void bCadFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCadFuncActionPerformed
        Funcionario func = new Funcionario();
        func.setCodFunc(func.gerarCodFunc());
        func.setSenhaFunc(new String(pfSenhaFunc.getPassword()));
        func.setConfirmaSenha(new String (pfConfirmaSenha.getPassword()));
        func.setNome(tfNome.getText());
        func.setCpf(tfCPF.getText());
        func.setCargoEntrada(tfCargoEntrada.getText());
        func.setSetor(tfSetor.getText());
        func.setCargoAtual(tfCargoAtual.getText());
        func.setDataAdmissao(ftfDataAdmissao.getText());
        func.setCep(tfCEP.getText());
        func.setRua(tfRua.getText());
        func.setNumero(tfNumero.getText());
        func.setBairro(tfBairro.getText());
        func.setCidade(tfCidade.getText());
        func.setUf(tfUF.getText());
        if(tfBaseSalarial.getText().isEmpty()){
        JOptionPane.showMessageDialog(null, "Não pode haver campos nulos!");
        return;
        } else {}   
        if(func.getNome().isEmpty() || func.getSenhaFunc().isEmpty() || func.getCpf().isEmpty() || func.getCargoAtual().isEmpty() || func.getCargoEntrada().isEmpty() || func.getSetor().isEmpty() || func.getDataAdmissao().replace(" ", "").replace("/", "").isEmpty() || func.getBairro().isEmpty() || func.getCep().isEmpty() || func.getCidade().isEmpty() || func.getNumero().isEmpty() || func.getRua().isEmpty() || func.getUf().isEmpty() || String.valueOf(func.getBaseSalarial()).isEmpty()) {
           JOptionPane.showMessageDialog(null, "Não pode haver campos nulos!");
           return;           
        } else{          
            func.setBaseSalarial(Integer.parseInt(tfBaseSalarial.getText().replace(".", "").replace(",", "")));   
            func.setUf(tfUF.getText().substring(0,2));
        }
        
        if(func.getSenhaFunc().length() > 8 || func.getConfirmaSenha().length() > 8){
           JOptionPane.showMessageDialog(null, "A senha não pode conter mais que 8 caracteres!");
           return;
        }
        
        if(func.getConfirmaSenha().equals(func.getSenhaFunc()) == false){
            JOptionPane.showMessageDialog(null, "A senha confirmada não está correta!");
            return;
        }
        if(Integer.parseInt(ftfDataAdmissao.getText().substring(0,2)) > 31 || Integer.parseInt(ftfDataAdmissao.getText().substring(3,5)) > 12){
            JOptionPane.showMessageDialog(null, "A data de Admissão é invalida!");
            return;
        }
            
        func.inserir(func.getCodFunc(), func.getNome(), func.getSenhaFunc() , func.getCpf(), func.getCargoEntrada(), func.getSetor(), func.getBaseSalarial(), func.getCargoAtual(), func.getDataAdmissao(), func.getCep(), func.getRua(), func.getNumero(), func.getBairro(), func.getCidade(), func.getUf());
    }//GEN-LAST:event_bCadFuncActionPerformed

    private void bLimparFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLimparFuncActionPerformed
        tfUF.setText(null);
        tfBaseSalarial.setText(null);
        tfNome.setText(null);
        tfCPF.setText(null);
        tfSetor.setText(null);
        tfCEP.setText(null);
        tfCargoAtual.setText(null);
        tfRua.setText(null);
        tfNumero.setText(null);
        tfBairro.setText(null);
        tfCidade.setText(null);
        tfCargoEntrada.setText(null);
        ftfDataAdmissao.setText(null);
        pfSenhaFunc.setText(null);
        pfConfirmaSenha.setText(null);
    }//GEN-LAST:event_bLimparFuncActionPerformed

    private void bVoltarFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVoltarFuncActionPerformed
        dispose();
    }//GEN-LAST:event_bVoltarFuncActionPerformed

    private void pfSenhaFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pfSenhaFuncActionPerformed
       
    }//GEN-LAST:event_pfSenhaFuncActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCadFunc;
    private javax.swing.JButton bLimparFunc;
    private javax.swing.JButton bVoltarFunc;
    private javax.swing.JFormattedTextField ftfDataAdmissao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPasswordField pfConfirmaSenha;
    private javax.swing.JPasswordField pfSenhaFunc;
    private javax.swing.JTextField tfBairro;
    private javax.swing.JFormattedTextField tfBaseSalarial;
    private javax.swing.JTextField tfCEP;
    private javax.swing.JTextField tfCPF;
    private javax.swing.JTextField tfCargoAtual;
    private javax.swing.JTextField tfCargoEntrada;
    private javax.swing.JTextField tfCidade;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfNumero;
    private javax.swing.JTextField tfRua;
    private javax.swing.JTextField tfSetor;
    private javax.swing.JTextField tfUF;
    // End of variables declaration//GEN-END:variables

    
}
