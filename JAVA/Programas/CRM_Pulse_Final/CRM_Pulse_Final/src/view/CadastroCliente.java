package view;

import model.Cliente;
import model.PessoaFisica;
import model.PessoaJuridica;
import model.Funcionario;
import com.sun.org.apache.bcel.internal.generic.Select;
import java.awt.Dimension;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class CadastroCliente extends javax.swing.JInternalFrame {

    public CadastroCliente() {
        initComponents();
        jPanel7.setVisible(false);
        jPanel6.setVisible(false);
        //
        setLocation(300, 20);
        //
    }

    public JButton getbLimparCliente() {
        return bLimparCliente;
    }

    public JButton getbVoltarCliente() {
        return bVoltarCliente;
    }

    public JButton getbCadCliente() {
        return bCadCliente;
    }

    public JFormattedTextField getFtfDataNascimento() {
        return ftfDataNascimento;
    }

    public JComboBox getjComboBox1() {
        return jComboBox1;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public JPanel getjPanel5() {
        return jPanel5;
    }

    public JPanel getjPanel6() {
        return jPanel6;
    }

    public JPanel getjPanel7() {
        return jPanel7;
    }

    public JPanel getjPanel8() {
        return jPanel8;
    }

    public JRadioButton getJrbHomem() {
        return jrbHomem;
    }

    public JRadioButton getJrbMulher() {
        return jrbMulher;
    }

    public JRadioButton getJrbPJ() {
        return jrbPJ;
    }

    public JRadioButton getJrdPF() {
        return jrdPF;
    }

    public JTextField getTfBairro() {
        return tfBairro;
    }

    public JTextField getTfCPF() {
        return tfCPF;
    }

    public JTextField getTfCelular() {
        return tfCelular;
    }

    public JTextField getTfCep() {
        return tfCep;
    }

    public JTextField getTfCidade() {
        return tfCidade;
    }

    public JTextField getTfCnpj() {
        return tfCnpj;
    }

    public JTextField getTfEmail() {
        return tfEmail;
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

    public JTextField getTfTelefone() {
        return tfTelefone;
    }

    public JTextField getTfTipoOrg() {
        return tfTipoOrg;
    }

    public JTextField getTfUf() {
        return tfUf;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgPF_PJ = new javax.swing.ButtonGroup();
        bgH_M = new javax.swing.ButtonGroup();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfCPF = new javax.swing.JTextField();
        jrbHomem = new javax.swing.JRadioButton();
        jrbMulher = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        ftfDataNascimento = new javax.swing.JFormattedTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfCnpj = new javax.swing.JTextField();
        tfTipoOrg = new javax.swing.JTextField();
        jrdPF = new javax.swing.JRadioButton();
        jrbPJ = new javax.swing.JRadioButton();
        bCadCliente = new javax.swing.JButton();
        bLimparCliente = new javax.swing.JButton();
        bVoltarCliente = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tfCep = new javax.swing.JTextField();
        tfRua = new javax.swing.JTextField();
        tfNumero = new javax.swing.JTextField();
        tfBairro = new javax.swing.JTextField();
        tfCidade = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        tfUf = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        tfEmail = new javax.swing.JTextField();
        tfNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        tfTelefone = new javax.swing.JTextField();
        tfCelular = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro de Cliente");

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("Tipo:");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setText("CPF:");

        jLabel7.setText("Sexo:");

        tfCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCPFActionPerformed(evt);
            }
        });

        bgH_M.add(jrbHomem);
        jrbHomem.setText("Homem");

        bgH_M.add(jrbMulher);
        jrbMulher.setText("Mulher");

        jLabel3.setText("Estado Civil:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Solteiro", "Casado", "Divorciado", "Viúvo", "Outro" }));

        jLabel1.setText("Data Nascimento:");

        try {
            ftfDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftfDataNascimento.setToolTipText("");
        ftfDataNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftfDataNascimentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCPF))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jrbHomem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jrbMulher)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ftfDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jrbHomem)
                    .addComponent(jrbMulher))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ftfDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, 150));

        jPanel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setText("CNPJ:");

        jLabel9.setText("Tipo Org.:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTipoOrg))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTipoOrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(20, 20, 20))
        );

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 313, 130));

        bgPF_PJ.add(jrdPF);
        jrdPF.setText("Pessoa Fisica");
        jrdPF.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jrdPFComponentHidden(evt);
            }
        });
        jrdPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdPFActionPerformed(evt);
            }
        });
        jPanel5.add(jrdPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        bgPF_PJ.add(jrbPJ);
        jrbPJ.setText("Pessoa Jurídica");
        jrbPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbPJActionPerformed(evt);
            }
        });
        jPanel5.add(jrbPJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, -1, -1));

        bCadCliente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bCadCliente.setText("Confirmar Cadastro");
        bCadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCadClienteActionPerformed(evt);
            }
        });
        jPanel5.add(bCadCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 530, -1, -1));

        bLimparCliente.setText("Limpar tudo");
        bLimparCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLimparClienteActionPerformed(evt);
            }
        });
        jPanel5.add(bLimparCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 530, -1, -1));

        bVoltarCliente.setText("Voltar");
        bVoltarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVoltarClienteActionPerformed(evt);
            }
        });
        jPanel5.add(bVoltarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, -1, -1));

        jPanel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Endereço");

        jLabel11.setText("CEP:");

        jLabel12.setText("Rua:");

        jLabel13.setText("Nº:");

        jLabel14.setText("Bairro:");

        jLabel15.setText("Cidade:");

        jLabel16.setText("UF:");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(12, 12, 12)
                        .addComponent(tfBairro))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfCep, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel12))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfRua, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(tfCidade))
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel16)
                                .addGap(18, 18, 18)
                                .addComponent(tfUf, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(1, 1, 1))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(tfCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(tfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(tfUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, -1, 140));

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tfEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEmailActionPerformed(evt);
            }
        });

        tfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeActionPerformed(evt);
            }
        });

        jLabel4.setText("Nome:");

        jLabel2.setText("E-mail:");

        jLabel17.setText("Telefone:");

        jLabel18.setText("Celular:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel18)
                        .addGap(4, 4, 4)
                        .addComponent(tfCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel2)))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tfEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                            .addComponent(tfNome))))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4))
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18))))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 520, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cliente.png"))); // NOI18N
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCPFActionPerformed

    private void tfEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEmailActionPerformed

    private void tfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomeActionPerformed

    private void jrdPFComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jrdPFComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jrdPFComponentHidden

    private void jrdPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdPFActionPerformed
        if (jrdPF.isSelected() == true) {
            jPanel6.setVisible(true);
            jPanel7.setVisible(false);
        }
    }//GEN-LAST:event_jrdPFActionPerformed

    private void jrbPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbPJActionPerformed
        if (jrbPJ.isSelected() == true) {
            jPanel7.setVisible(true);
            jPanel6.setVisible(false);
        }
    }//GEN-LAST:event_jrbPJActionPerformed

    private void ftfDataNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftfDataNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftfDataNascimentoActionPerformed

    private void bVoltarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVoltarClienteActionPerformed
        dispose();
    }//GEN-LAST:event_bVoltarClienteActionPerformed

    private void bLimparClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLimparClienteActionPerformed
        tfCPF.setText(null);
        tfCnpj.setText(null);
        tfEmail.setText(null);
        tfNome.setText(null);
        tfTipoOrg.setText(null);
        tfCep.setText(null);
        tfRua.setText(null);
        tfNumero.setText(null);
        tfBairro.setText(null);
        tfCidade.setText(null);
        tfUf.setText(null);
        tfTelefone.setText(null);
        tfCelular.setText(null);
        ftfDataNascimento.setText(null);
    }//GEN-LAST:event_bLimparClienteActionPerformed

    private void bCadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCadClienteActionPerformed

        // Cliente Geral
        Cliente cliente = new Cliente();
        String codCliente = cliente.gerarCodCliente();
        cliente.setNome(tfNome.getText());
        cliente.setEmail(tfEmail.getText());
        cliente.setTelefone(tfTelefone.getText());
        cliente.setCelular(tfCelular.getText());
        cliente.setCep(tfCep.getText());
        cliente.setBairro(tfBairro.getText());
        cliente.setRua(tfRua.getText());
        cliente.setCidade(tfCidade.getText());
        cliente.setNumero(tfNumero.getText());
        cliente.setUf(tfUf.getText());

        if (Integer.parseInt(cliente.gerarCodCliente().substring(2)) > 4000) {
            cliente.setEfetivo('S');
            cliente.setPotencial('S');
        } else {
            cliente.setEfetivo('N');
            cliente.setPotencial('N');
        }
        System.out.println(Integer.parseInt(cliente.gerarCodCliente().substring(2)));
        // Cliente PessoaFisica
        PessoaFisica pf = new PessoaFisica();
        pf.gerarCodClientePF();
        pf.setCpf(tfCPF.getText());
        pf.setSexo(' ');
        pf.setEstadoCivil(String.valueOf(jComboBox1.getSelectedItem()));
        pf.setDataNascimento(ftfDataNascimento.getText());
        if (jrdPF.isSelected() == true) {
            if (jrbHomem.isSelected() == true) {
                pf.setSexo('M');
            } else if (jrbMulher.isSelected() == true) {
                pf.setSexo('F');
            } else {
                JOptionPane.showMessageDialog(rootPane, "Selecione o sexo!");
            }
        }

        // Cliente PessoaJuridica
        PessoaJuridica pj = new PessoaJuridica();
        pj.gerarCodClientePJ();
        pj.setCnpj(tfCnpj.getText());
        pj.setTipoOrg(tfTipoOrg.getText());

        if (cliente.getNome().isEmpty() || cliente.getEmail().isEmpty() || cliente.getTelefone().isEmpty() || cliente.getCelular().isEmpty() || cliente.getRua().isEmpty() || cliente.getCep().isEmpty() || cliente.getNumero().isEmpty() || cliente.getBairro().isEmpty() || cliente.getCidade().isEmpty() || cliente.getUf().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não pode haver campos nulos!");
            return;
        }
        cliente.setUf(tfUf.getText().substring(0, 2));

        //
        if (jrdPF.isSelected() == true) {
            PessoaFisica clientePF = new PessoaFisica();
            if (pf.getCpf().isEmpty() || pf.getEstadoCivil().isEmpty() || pf.getDataNascimento().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Não pode haver campos nulos!");
                return;
            }
            if (Integer.parseInt(ftfDataNascimento.getText().substring(0, 2)) > 31 || Integer.parseInt(ftfDataNascimento.getText().substring(3, 5)) > 12) {
                JOptionPane.showMessageDialog(null, "A data de nascimento é invalida!");
                return;
            } else {
                cliente.inserirCliente(codCliente, cliente.getNome(), cliente.getEmail(), cliente.getTelefone(), cliente.getCelular(), cliente.getRua(), cliente.getCep(), cliente.getNumero(), cliente.getBairro(), cliente.getCidade(), cliente.getUf(), cliente.getEfetivo(), cliente.getPotencial());
                clientePF.inserirClientePF(codCliente, pf.gerarCodClientePF(), pf.getCpf(), pf.getSexo(), pf.getEstadoCivil(), pf.getDataNascimento());
            }
        } else if (jrbPJ.isSelected() == true) {
            PessoaJuridica clientePJ = new PessoaJuridica();
            if (pj.getCnpj().isEmpty() || pj.getTipoOrg().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Não pode haver campos nulos!");
                return;
            } else {
                cliente.inserirCliente(codCliente, cliente.getNome(), cliente.getEmail(), cliente.getTelefone(), cliente.getCelular(), cliente.getRua(), cliente.getCep(), cliente.getNumero(), cliente.getBairro(), cliente.getCidade(), cliente.getUf(), cliente.getEfetivo(), cliente.getPotencial());
                clientePJ.inserirClientePJ(codCliente, pj.gerarCodClientePJ(), pj.getCnpj(), pj.getTipoOrg());
            }
        }


    }//GEN-LAST:event_bCadClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCadCliente;
    private javax.swing.JButton bLimparCliente;
    private javax.swing.JButton bVoltarCliente;
    private javax.swing.ButtonGroup bgH_M;
    private javax.swing.ButtonGroup bgPF_PJ;
    private javax.swing.JFormattedTextField ftfDataNascimento;
    private javax.swing.JComboBox jComboBox1;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JRadioButton jrbHomem;
    private javax.swing.JRadioButton jrbMulher;
    private javax.swing.JRadioButton jrbPJ;
    private javax.swing.JRadioButton jrdPF;
    private javax.swing.JTextField tfBairro;
    private javax.swing.JTextField tfCPF;
    private javax.swing.JTextField tfCelular;
    private javax.swing.JTextField tfCep;
    private javax.swing.JTextField tfCidade;
    private javax.swing.JTextField tfCnpj;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfNumero;
    private javax.swing.JTextField tfRua;
    private javax.swing.JTextField tfTelefone;
    private javax.swing.JTextField tfTipoOrg;
    private javax.swing.JTextField tfUf;
    // End of variables declaration//GEN-END:variables
}
