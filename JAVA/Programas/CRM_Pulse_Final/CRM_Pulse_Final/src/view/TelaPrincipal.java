package view;

import model.Funcionario;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import controller.Controller;

public class TelaPrincipal extends javax.swing.JFrame {

    String user;
    JMenuItem menuFuncCad;

    public void setUser(String x) {
        user = x;

    }

    public TelaPrincipal() {
        initComponents();
        BuscarCadastro tela = new BuscarCadastro();

        this.setExtendedState(MAXIMIZED_BOTH);
        menuFuncCad = cadastrarUsuario;
    }

    public JMenuItem getMenuFuncCad() {
        return menuFuncCad;
    }

    public JMenuItem getVisualizarAtendimento() {
        return VisualizarAtendimento;
    }

    public JMenu getSistema() {
        return Sistema;
    }

    public JMenuItem getCadastrarUsuario() {
        return cadastrarUsuario;
    }

    public JMenuBar getjMenuBar1() {
        return jMenuBar1;
    }

    public JMenuItem getjMenuItem5() {
        return VisualizarAtendimento;
    }

    public JDesktopPane getJdpTelaPrincipal() {
        return jdpTelaPrincipal;
    }

    public void setJdpTelaPrincipal(JDesktopPane jdpTelaPrincipal) {
        this.jdpTelaPrincipal = jdpTelaPrincipal;
    }

    public JMenu getMenuAtendimento() {
        return menuAtendimento;
    }

    public JMenu getMenuCadastro() {
        return menuCadastro;
    }

    public JMenu getMenuCampanha() {
        return menuCampanha;
    }

    public JMenuItem getMenuLogout() {
        return menuLogout;
    }

    public JMenu getMenuProdutos() {
        return menuProdutos;
    }

    public JMenuItem getMenuSair() {
        return menuSair;
    }

    public JMenu getMenuVendas() {
        return menuVendas;
    }

    public JMenuItem getNovaCampanha() {
        return novaCampanha;
    }

    public JMenuItem getPedidosEfetuados() {
        return pedidosEfetuados;
    }

    public JMenuItem getRelatoriosVendas() {
        return relatoriosVendas;
    }

    public JMenuItem getVisualizarCadastros() {
        return visualizarCadastros;
    }

    public JMenuItem getVisualizarCampanha() {
        return visualizarCampanha;
    }

    public JMenuItem getVisualizarProdutos() {
        return visualizarProdutos;
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpTelaPrincipal = new javax.swing.JDesktopPane();
        logoEmpresa = new javax.swing.JLabel();
        usuarioLogado = new javax.swing.JLabel();
        txtTechsolutions = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Sistema = new javax.swing.JMenu();
        menuLogout = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenuItem();
        menuCadastro = new javax.swing.JMenu();
        cadastrarUsuario = new javax.swing.JMenuItem();
        visualizarCadastros = new javax.swing.JMenuItem();
        cadastrarCliente = new javax.swing.JMenuItem();
        menuCampanha = new javax.swing.JMenu();
        novaCampanha = new javax.swing.JMenuItem();
        visualizarCampanha = new javax.swing.JMenuItem();
        menuVendas = new javax.swing.JMenu();
        relatoriosVendas = new javax.swing.JMenuItem();
        menuProdutos = new javax.swing.JMenu();
        visualizarProdutos = new javax.swing.JMenuItem();
        pedidosEfetuados = new javax.swing.JMenuItem();
        novoProduto = new javax.swing.JMenuItem();
        menuAtendimento = new javax.swing.JMenu();
        VisualizarAtendimento = new javax.swing.JMenuItem();
        novoAtendimento = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jdpTelaPrincipal.setBackground(new java.awt.Color(232, 230, 230));

        logoEmpresa.setBackground(new java.awt.Color(255, 255, 255));
        logoEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        logoEmpresa.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        logoEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pulse logoicon.gif"))); // NOI18N
        logoEmpresa.setText("INDÚSTRIA QUÍMICA PULSE LTDA.");
        logoEmpresa.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        usuarioLogado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        usuarioLogado.setForeground(new java.awt.Color(255, 255, 255));
        usuarioLogado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        usuarioLogado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cliente.png"))); // NOI18N

        txtTechsolutions.setForeground(new java.awt.Color(153, 153, 153));
        txtTechsolutions.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTechsolutions.setText("Desenvolvido por: TECH SOLUTIONS LTDA.");

        jdpTelaPrincipal.setLayer(logoEmpresa, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpTelaPrincipal.setLayer(usuarioLogado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpTelaPrincipal.setLayer(txtTechsolutions, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jdpTelaPrincipalLayout = new javax.swing.GroupLayout(jdpTelaPrincipal);
        jdpTelaPrincipal.setLayout(jdpTelaPrincipalLayout);
        jdpTelaPrincipalLayout.setHorizontalGroup(
            jdpTelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpTelaPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jdpTelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTechsolutions, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE)
                    .addGroup(jdpTelaPrincipalLayout.createSequentialGroup()
                        .addComponent(usuarioLogado, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logoEmpresa))))
        );
        jdpTelaPrincipalLayout.setVerticalGroup(
            jdpTelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpTelaPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jdpTelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoEmpresa)
                    .addComponent(usuarioLogado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 463, Short.MAX_VALUE)
                .addComponent(txtTechsolutions)
                .addContainerGap())
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 51, 204));

        Sistema.setText("Sistema");
        Sistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SistemaActionPerformed(evt);
            }
        });

        menuLogout.setText("Sair");
        menuLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLogoutActionPerformed(evt);
            }
        });
        Sistema.add(menuLogout);

        menuSair.setText("Fechar");
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });
        Sistema.add(menuSair);

        jMenuBar1.add(Sistema);

        menuCadastro.setText("Cadastro");

        cadastrarUsuario.setText("Cadastrar Usuário");
        cadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarUsuarioActionPerformed(evt);
            }
        });
        menuCadastro.add(cadastrarUsuario);

        visualizarCadastros.setText("Visualizar Cadastros");
        visualizarCadastros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizarCadastrosActionPerformed(evt);
            }
        });
        menuCadastro.add(visualizarCadastros);

        cadastrarCliente.setText("Cadastrar Cliente");
        cadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarClienteActionPerformed(evt);
            }
        });
        menuCadastro.add(cadastrarCliente);

        jMenuBar1.add(menuCadastro);

        menuCampanha.setText("Campanhas");

        novaCampanha.setText("Nova Campanha");
        novaCampanha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novaCampanhaActionPerformed(evt);
            }
        });
        menuCampanha.add(novaCampanha);

        visualizarCampanha.setText("Visualizar Campanha");
        visualizarCampanha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizarCampanhaActionPerformed(evt);
            }
        });
        menuCampanha.add(visualizarCampanha);

        jMenuBar1.add(menuCampanha);

        menuVendas.setText("Vendas");

        relatoriosVendas.setText("Relatório de Vendas");
        relatoriosVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relatoriosVendasActionPerformed(evt);
            }
        });
        menuVendas.add(relatoriosVendas);

        jMenuBar1.add(menuVendas);

        menuProdutos.setText("Produtos");

        visualizarProdutos.setText("Visualizar Produtos");
        visualizarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizarProdutosActionPerformed(evt);
            }
        });
        menuProdutos.add(visualizarProdutos);

        pedidosEfetuados.setText("Pedidos Efetuados");
        pedidosEfetuados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pedidosEfetuadosActionPerformed(evt);
            }
        });
        menuProdutos.add(pedidosEfetuados);

        novoProduto.setText("Novo Produto");
        novoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoProdutoActionPerformed(evt);
            }
        });
        menuProdutos.add(novoProduto);

        jMenuBar1.add(menuProdutos);

        menuAtendimento.setText("Atendimento");

        VisualizarAtendimento.setText("Visualizar Atendimentos");
        VisualizarAtendimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisualizarAtendimentoActionPerformed(evt);
            }
        });
        menuAtendimento.add(VisualizarAtendimento);

        novoAtendimento.setText("Novo Atendimento");
        novoAtendimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoAtendimentoActionPerformed(evt);
            }
        });
        menuAtendimento.add(novoAtendimento);

        jMenuBar1.add(menuAtendimento);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jdpTelaPrincipal)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpTelaPrincipal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void visualizarCadastrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualizarCadastrosActionPerformed

        BuscarCadastro visualCad = new BuscarCadastro();
        jdpTelaPrincipal.add(visualCad);
        visualCad.setVisible(true);
    }//GEN-LAST:event_visualizarCadastrosActionPerformed

    private void cadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarUsuarioActionPerformed
        // 3 Linhas abaixo definem a tela CadastroUsuario como filha do painel jdpTelaPrincipal
        CadastroUsuario cadastroFunc = new CadastroUsuario();
        jdpTelaPrincipal.add(cadastroFunc);
        cadastroFunc.setVisible(true);
    }//GEN-LAST:event_cadastrarUsuarioActionPerformed

    private void novaCampanhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novaCampanhaActionPerformed
        CadastroCampanha cadastroCamp = new CadastroCampanha();
        jdpTelaPrincipal.add(cadastroCamp);
        cadastroCamp.setVisible(true);
    }//GEN-LAST:event_novaCampanhaActionPerformed

    private void relatoriosVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relatoriosVendasActionPerformed

        RelatorioVendas relVendas = new RelatorioVendas();
        jdpTelaPrincipal.add(relVendas);
        relVendas.setVisible(true);
    }//GEN-LAST:event_relatoriosVendasActionPerformed

    private void VisualizarAtendimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisualizarAtendimentoActionPerformed

        BuscarAtendimento visualAtend = new BuscarAtendimento();
        jdpTelaPrincipal.add(visualAtend);
        visualAtend.setVisible(true);
    }//GEN-LAST:event_VisualizarAtendimentoActionPerformed

    private void visualizarCampanhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualizarCampanhaActionPerformed

        BuscarCampanha visualCamp = new BuscarCampanha();
        jdpTelaPrincipal.add(visualCamp);
        visualCamp.setVisible(true);
    }//GEN-LAST:event_visualizarCampanhaActionPerformed

    private void visualizarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualizarProdutosActionPerformed

        BuscarProduto visualPro = new BuscarProduto();
        jdpTelaPrincipal.add(visualPro);
        visualPro.setVisible(true);
    }//GEN-LAST:event_visualizarProdutosActionPerformed

    private void pedidosEfetuadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pedidosEfetuadosActionPerformed

        PedidosEfetuados pedidosEfetuados = new PedidosEfetuados();
        jdpTelaPrincipal.add(pedidosEfetuados);
        pedidosEfetuados.setVisible(true);
    }//GEN-LAST:event_pedidosEfetuadosActionPerformed

    private void SistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SistemaActionPerformed
        dispose();
    }//GEN-LAST:event_SistemaActionPerformed

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        System.exit(WIDTH);
    }//GEN-LAST:event_menuSairActionPerformed

    private void menuLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLogoutActionPerformed
        this.dispose();
        Login tela = new Login();
        tela.setVisible(true);
    }//GEN-LAST:event_menuLogoutActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        usuarioLogado.setText(user);

    }//GEN-LAST:event_formWindowOpened

    private void cadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarClienteActionPerformed
        CadastroCliente cadastroCli = new CadastroCliente();
        jdpTelaPrincipal.add(cadastroCli);
        cadastroCli.setVisible(true);
    }//GEN-LAST:event_cadastrarClienteActionPerformed

    private void novoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoProdutoActionPerformed
        CadastroProduto cadastroProd = new CadastroProduto();
        jdpTelaPrincipal.add(cadastroProd);
        cadastroProd.setVisible(true);
    }//GEN-LAST:event_novoProdutoActionPerformed

    private void novoAtendimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoAtendimentoActionPerformed
        NovoAtendimento novoAtend = new NovoAtendimento();
        jdpTelaPrincipal.add(novoAtend);
        novoAtend.setVisible(true);
    }//GEN-LAST:event_novoAtendimentoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Sistema;
    private javax.swing.JMenuItem VisualizarAtendimento;
    private javax.swing.JMenuItem cadastrarCliente;
    private javax.swing.JMenuItem cadastrarUsuario;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JDesktopPane jdpTelaPrincipal;
    private javax.swing.JLabel logoEmpresa;
    private javax.swing.JMenu menuAtendimento;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenu menuCampanha;
    private javax.swing.JMenuItem menuLogout;
    private javax.swing.JMenu menuProdutos;
    private javax.swing.JMenuItem menuSair;
    private javax.swing.JMenu menuVendas;
    private javax.swing.JMenuItem novaCampanha;
    private javax.swing.JMenuItem novoAtendimento;
    private javax.swing.JMenuItem novoProduto;
    private javax.swing.JMenuItem pedidosEfetuados;
    private javax.swing.JMenuItem relatoriosVendas;
    private javax.swing.JLabel txtTechsolutions;
    private javax.swing.JLabel usuarioLogado;
    private javax.swing.JMenuItem visualizarCadastros;
    private javax.swing.JMenuItem visualizarCampanha;
    private javax.swing.JMenuItem visualizarProdutos;
    // End of variables declaration//GEN-END:variables

}
