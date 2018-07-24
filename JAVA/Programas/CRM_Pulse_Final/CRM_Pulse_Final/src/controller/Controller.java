/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import model.Funcionario;
import java.awt.event.ActionListener;
import static java.awt.image.ImageObserver.WIDTH;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import view.CadastroUsuario;
import view.Login;
import view.TelaPrincipal;
import javax.swing.JDesktopPane;
import javax.swing.table.DefaultTableModel;
import model.Atendimento;
import model.Cliente;
import model.PessoaFisica;
import model.PessoaJuridica;
import view.BuscarAtendimento;
import view.BuscarCadastro;
import view.BuscarCampanha;
import view.BuscarProduto;
import view.CadastroCampanha;
import view.CadastroCliente;
import view.CadastroProduto;
import view.NovoAtendimento;
import view.PedidosEfetuados;
import view.RelatorioVendas;

/**
 *
 * @author 254890
 */
public class Controller {

    ActionListener sensor;
    Login view;
    TelaPrincipal tela;
    BuscarAtendimento buscAtd;
    BuscarCadastro buscCad;
    BuscarCampanha buscCamp;
    BuscarProduto buscProd;
    CadastroCampanha cadCamp;
    CadastroCliente cadCliente;
    CadastroProduto cadProd;
    CadastroUsuario cadUser;
    NovoAtendimento nAtend;
    PedidosEfetuados pedEf;
    RelatorioVendas relVenda;

    public Controller(Login view) {
        this.view = view;

    }

    public void controleLogin() {
        sensor = new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == view.getLogar()) {
                    Logon();
                } else if (e.getSource() == view.getSair()) {
                    Exit();//
                }
            }
        };
        view.getLogar().addActionListener(sensor);
        view.getSair().addActionListener(sensor);

    }

    public void Logon() {
        Funcionario func = new Funcionario();
        TelaPrincipal tela = new TelaPrincipal();
        String userIn = view.getTfcodFunc().getText();
        String passIn = view.getTfsenhaFunc().getText();
        if (userIn.equals("admin") == false) {
            tela.getMenuFuncCad().setVisible(false);

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
                    tela.dispose();

                } else {
                    JOptionPane.showMessageDialog(null, "Usuário e/ou senha inválidos, tente novamente.");
                }

            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Usuário e/ou senha inválidos, tente novamente.");
            }

            func.fechaConexao();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(view, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void Exit() {
        System.exit(WIDTH);
    }

    public void controleTelaPrincipal() {
        sensor = new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == tela.getCadastrarUsuario()) {
                    CadUsuario();
                } else if (e.getSource() == tela.getNovaCampanha()) {
                    NCampanha();
                } else if (e.getSource() == tela.getVisualizarAtendimento()) {
                    VAtendimento();
                } else if (e.getSource() == tela.getRelatoriosVendas()) {
                    RlVendas();
                } else if (e.getSource() == tela.getPedidosEfetuados()) {
                    PEfetuados();
                } else if (e.getSource() == tela.getVisualizarCadastros()) {
                    VCadastros();
                } else if (e.getSource() == tela.getVisualizarCampanha()) {
                    VCampanha();
                } else if (e.getSource() == tela.getVisualizarProdutos()) {
                    NCampanha();
                } else if (e.getSource() == tela.getSistema()) {
                    MSistema();
                } else if (e.getSource() == tela.getMenuSair()) {
                    MSair();
                } else if (e.getSource() == tela.getMenuLogout()) {
                    MLogout();

                    tela.getCadastrarUsuario().addActionListener(sensor);
                    tela.getNovaCampanha().addActionListener(sensor);
                    tela.getRelatoriosVendas().addActionListener(sensor);
                    tela.getPedidosEfetuados().addActionListener(sensor);
                    tela.getVisualizarCadastros().addActionListener(sensor);
                    tela.getVisualizarCampanha().addActionListener(sensor);
                    tela.getVisualizarProdutos().addActionListener(sensor);
                    tela.getMenuAtendimento().addActionListener(sensor);
                    tela.getMenuCadastro().addActionListener(sensor);
                    tela.getMenuCampanha().addActionListener(sensor);
                    tela.getMenuFuncCad().addActionListener(sensor);
                    tela.getMenuLogout().addActionListener(sensor);
                    tela.getMenuSair().addActionListener(sensor);
                    tela.getMenuVendas().addActionListener(sensor);
                    tela.getSistema().addActionListener(sensor);
                }

            }

            private void NCampanha() {
                CadastroCampanha cadastroCamp = new CadastroCampanha();
                tela.add(cadastroCamp);
                cadastroCamp.setVisible(true);
            }

            private void VCampanha() {
                BuscarCampanha visualCamp = new BuscarCampanha();
                tela.add(visualCamp);
                visualCamp.setVisible(true);
            }

            private void VCadastros() {
                BuscarCadastro visualCad = new BuscarCadastro();
                tela.add(visualCad);
                visualCad.setVisible(true);
            }

            private void PEfetuados() {
                PedidosEfetuados pedidosEfetuados = new PedidosEfetuados();
                tela.add(pedidosEfetuados);
                pedidosEfetuados.setVisible(true);
            }

            private void RlVendas() {
                RelatorioVendas relVendas = new RelatorioVendas();
                tela.add(relVendas);
                relVendas.setVisible(true);
            }

            private void CadUsuario() {
                // 3 Linhas abaixo definem a tela CadastroUsuario como filha do painel jdpTelaPrincipal
                CadastroUsuario cadastroFunc = new CadastroUsuario();
                tela.add(cadastroFunc);
                cadastroFunc.setVisible(true);

            }

            private void VAtendimento() {
                BuscarAtendimento visualAtend = new BuscarAtendimento();
                tela.add(visualAtend);
                visualAtend.setVisible(true);
            }

            private void MSistema() {
                tela.dispose();
            }

            private void MSair() {
                System.exit(WIDTH);
            }

            private void MLogout() {
                tela.dispose();
                Login tela = new Login();
                tela.setVisible(true);
            }
        };

    }

    public void controleBuscarAtendimento() {
        sensor = new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == buscAtd.getbPesquisarAtend()) {
                    PesqAtd();
                } else if (e.getSource() == buscAtd.getbEncerrarAtend()) {
                    EncCamp();
                }
                buscAtd.getbEncerrarAtend().addActionListener(sensor);
                buscAtd.getbPesquisarAtend().addActionListener(sensor);

            }

            private void PesqAtd() {
                Atendimento at = new Atendimento();
                String codAtendimento = buscAtd.getTfCodAtend().getText();
                ResultSet resultadoAtend;

                String tipoAtend = null;
                if (buscAtd.getRbFuncionario().isSelected()) {
                    tipoAtend = "CODFUNC";
                } else if (buscAtd.getRbAtendimento().isSelected()) {
                    tipoAtend = "CODATEN";
                } else {
                    tipoAtend = "CODATEN";
                }
                resultadoAtend = at.retornarAtend(codAtendimento, tipoAtend);

                if (buscAtd.getRbReclamacao().isSelected() && buscAtd.getTfCodAtend().getText().isEmpty()) {
                    resultadoAtend = at.retornarTipoAt("RECLAMACAO");
                }
                if (buscAtd.getRbSugestao().isSelected() && buscAtd.getTfCodAtend().getText().isEmpty()) {
                    resultadoAtend = at.retornarTipoAt("SUGESTAO");
                }
                if (buscAtd.getRbTodosTipoAt().isSelected()) {
                    resultadoAtend = at.retornarAtend(codAtendimento, tipoAtend);
                }
                //
                if (buscAtd.getRbPendente().isSelected() && buscAtd.getTfCodAtend().getText().isEmpty()) {
                    resultadoAtend = at.retornarTipoStatus("Em Atendimento");
                }
                if (buscAtd.getRbConcluido().isSelected() && buscAtd.getTfCodAtend().getText().isEmpty()) {
                    resultadoAtend = at.retornarTipoStatus("Concluído");
                }

                DefaultTableModel modelo;
                modelo = (DefaultTableModel) buscAtd.getMostraAtend().getModel();
                buscAtd.getMostraAtend().setAutoCreateRowSorter(true);
                ((DefaultTableModel) buscAtd.getMostraAtend().getModel()).setRowCount(0);

                try {

                    while (resultadoAtend.next()) {

                        String codAtend = resultadoAtend.getString("CODATEN");
                        String codCliente = resultadoAtend.getString("CODCLIENTE");
                        String codFunc = resultadoAtend.getString("CODFUNC");
                        String assunto = resultadoAtend.getString("ASSUNTO");
                        String status = resultadoAtend.getString("STATUS");
                        String sugestao = resultadoAtend.getString("SUGESTAO");
                        String reclamacao = resultadoAtend.getString("RECLAMACAO");
                        // DATANAINICIO FORMATADA 
                        String dia1 = resultadoAtend.getString("DATAINICIO").substring(8, 10);
                        String mes1 = resultadoAtend.getString("DATAINICIO").substring(5, 7);
                        String ano1 = resultadoAtend.getString("DATAINICIO").substring(0, 4);
                        String dataInicio = (dia1 + "/" + mes1 + "/" + ano1);
                        // DATAFIM FORMATADA 
                        String dataFim;
                        if ((resultadoAtend.getString("DATAFIM") == null) == false) {
                            String dia2 = resultadoAtend.getString("DATAFIM").substring(8, 10);
                            String mes2 = resultadoAtend.getString("DATAFIM").substring(5, 7);
                            String ano2 = resultadoAtend.getString("DATAFIM").substring(0, 4);
                            dataFim = (dia2 + "/" + mes2 + "/" + ano2);
                        } else {
                            dataFim = resultadoAtend.getString("DATAFIM");
                        }
                        modelo.addRow(new String[]{codAtend, codCliente, codFunc, assunto, status, dataInicio, dataFim});
                        if (buscAtd.getTfCodAtend().getText() == null || buscAtd.getTfCodAtend().getText().isEmpty() || buscAtd.getTfCodAtend().equals("")) {
                            buscAtd.getTaSugRec().setText(null);
                            buscAtd.getTaSugRec().setText(null);
                        } else if (sugestao == null) {
                            buscAtd.getTaSugRec().setText("Reclamação: " + reclamacao);
                        } else {
                            buscAtd.getTaSugRec().setText("Sugestão: " + sugestao);
                        }
                    }

                    at.fechaConexao();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(buscAtd, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

            private void EncCamp() {
                Atendimento at = new Atendimento();
                String codAtendimento = buscAtd.getTfCodAtend().getText();
                at.encerrarAt(codAtendimento);
            }
        };
    }

    public void controleBuscarCadastro() {
        sensor = new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == buscCad.getAlterarFun()) {
                    AlterFun();
                } else if (e.getSource() == buscCad.getAlterarPf()) {
                    AlterPf();
                } else if (e.getSource() == buscCad.getAlterarPj()) {
                    AlterPj();
                } else if (e.getSource() == buscCad.getPesquisarFunc()) {
                    PesqFunc();
                } else if (e.getSource() == buscCad.getbPesquisarPF()) {
                    PesqPf();
                } else if (e.getSource() == buscCad.getbPesquisarPJ()) {
                    PesqPj();
                } else if (e.getSource() == buscCad.getExcluirFunc()) {
                    ExcFunc();
                } else if (e.getSource() == buscCad.getExcluirPf()) {
                    ExcPf();
                } else if (e.getSource() == buscCad.getExcluirPj()) {
                    ExcPj();
                }
                buscCad.getCbAlterarFun().addActionListener(sensor);
                buscCad.getCbAlterarPf().addActionListener(sensor);
                buscCad.getCbAlterarPj().addActionListener(sensor);
                buscCad.getExcluirFunc().addActionListener(sensor);
                buscCad.getExcluirPf().addActionListener(sensor);
                buscCad.getExcluirPj().addActionListener(sensor);
                buscCad.getPesquisarFunc().addActionListener(sensor);
                buscCad.getbPesquisarPF().addActionListener(sensor);
                buscCad.getbPesquisarPJ().addActionListener(sensor);

            }

            private void AlterFun() {
                Funcionario func = new Funcionario();
                String codFunc = buscCad.getTfCodFunc().getText();
                String campoSelecionado = String.valueOf(buscCad.getCbAlterarFun().getSelectedItem());
                if (buscCad.getTfcampoFun().getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "O campo de alteração está vazio!");

                    return;
                }
                if (campoSelecionado == "Nome") {
                    func.setNome(buscCad.getTfcampoFun().getText());
                    func.alterarFunc(codFunc, campoSelecionado, func.getNome());
                } else if (campoSelecionado == "CPF") {
                    func.setCpf(buscCad.getTfcampoFun().getText());
                    func.alterarFunc(codFunc, "CPFFUN", func.getCpf());
                } else if (campoSelecionado == "Cargo Entrada") {
                    func.setCargoEntrada(buscCad.getTfcampoFun().getText());
                    func.alterarFunc(codFunc, "CARGOENTRADA", func.getCargoEntrada());
                } else if (campoSelecionado == "Cargo Atual") {
                    func.setCargoAtual(buscCad.getTfcampoFun().getText());
                    func.alterarFunc(codFunc, "CARGOATUAL", func.getCargoAtual());
                } else if (campoSelecionado == "Setor") {
                    func.setSetor(buscCad.getTfcampoFun().getText());
                    func.alterarFunc(codFunc, campoSelecionado, func.getSetor());
                } else if (campoSelecionado == "Base Salarial") {
                    func.setBaseSalarial(Integer.parseInt(buscCad.getTfcampoFun().getText()));
                    func.alterarFunc(codFunc, "BASESALARIAL", String.valueOf(func.getBaseSalarial()));
                } else if (campoSelecionado == "Rua") {
                    func.setRua(buscCad.getTfcampoFun().getText());
                    func.alterarFunc(codFunc, campoSelecionado, func.getRua());
                } else if (campoSelecionado == "CEP") {
                    func.setCep(buscCad.getTfcampoFun().getText());
                    func.alterarFunc(codFunc, campoSelecionado, func.getCep());
                } else if (campoSelecionado == "Bairro") {
                    func.setBairro(buscCad.getTfcampoFun().getText());
                    func.alterarFunc(codFunc, campoSelecionado, func.getBairro());
                } else if (campoSelecionado == "Nº") {
                    func.setNumero(buscCad.getTfcampoFun().getText());
                    func.alterarFunc(codFunc, "NUMERO", func.getNumero());
                } else if (campoSelecionado == "Cidade") {
                    func.setCidade(buscCad.getTfcampoFun().getText());
                    func.alterarFunc(codFunc, campoSelecionado, func.getCidade());
                } else if (campoSelecionado == "UF") {
                    func.setUf(buscCad.getTfcampoFun().getText().substring(0, 2));
                    func.alterarFunc(codFunc, campoSelecionado, func.getUf());
                } else if (campoSelecionado == "Data Admissão") {
                    func.setDataAdmissao(buscCad.getTfcampoFun().getText());
                    func.alterarFunc(codFunc, "DATAADMISSAO", func.getDataAdmissao());
                }
            }

            private void AlterPf() {
                PessoaFisica pf = new PessoaFisica();
                String codPf = buscCad.getTfCodPF().getText();
                String campoSelecionado = String.valueOf(buscCad.getCbAlterarPf().getSelectedItem());
                if (buscCad.getTfcampoPf().getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "O campo de alteração está vazio!");

                    return;
                }
                if (campoSelecionado == "Nome") {
                    pf.setNome(buscCad.getTfcampoPf().getText());
                    pf.alterarPf("Cliente", codPf, campoSelecionado, pf.getNome());
                } else if (campoSelecionado == "CPF") {
                    pf.setCpf(buscCad.getTfcampoPf().getText());
                    pf.alterarPf("PF", codPf, campoSelecionado, pf.getCpf());
                } else if (campoSelecionado == "Estado Civil") {
                    campoSelecionado = "ESTADOCIVIL";
                    pf.setEstadoCivil(buscCad.getTfcampoPf().getText());
                    pf.alterarPf("PF", codPf, campoSelecionado, pf.getEstadoCivil());
                } else if (campoSelecionado == "Sexo") {
                    campoSelecionado = "SEXO";
                    pf.setSexo(buscCad.getTfcampoPf().getText().charAt(0));
                    pf.alterarPf("PF", codPf, campoSelecionado, String.valueOf(pf.getSexo()));
                } else if (campoSelecionado == "Data Nasc.") {
                    campoSelecionado = "DATANASCIMENTO";
                    pf.setDataNascimento(buscCad.getTfcampoPf().getText());
                    pf.alterarPf("PF", codPf, campoSelecionado, pf.getDataNascimento());
                } else if (campoSelecionado == "Telefone") {
                    campoSelecionado = "TELEFONE";
                    pf.setTelefone(buscCad.getTfcampoPf().getText());
                    pf.alterarPf("CLIENTE", codPf, campoSelecionado, pf.getTelefone());
                } else if (campoSelecionado == "Celular") {
                    campoSelecionado = "CELULAR";
                    pf.setCelular(buscCad.getTfcampoPf().getText());
                    pf.alterarPf("CLIENTE", codPf, campoSelecionado, pf.getCelular());
                } else if (campoSelecionado == "Email") {
                    campoSelecionado = "EMAIL";
                    pf.setEmail(buscCad.getTfcampoPf().getText());
                    pf.alterarPf("CLIENTE", codPf, campoSelecionado, pf.getEmail());
                } else if (campoSelecionado == "CEP") {
                    campoSelecionado = "CEP";
                    pf.setCep(buscCad.getTfcampoPf().getText());
                    pf.alterarPf("CLIENTE", codPf, campoSelecionado, pf.getCep());
                } else if (campoSelecionado == "UF") {
                    campoSelecionado = "UF";
                    pf.setUf(buscCad.getTfcampoPf().getText().substring(0, 2));
                    pf.alterarPf("CLIENTE", codPf, campoSelecionado, pf.getUf());
                } else if (campoSelecionado == "Cidade") {
                    campoSelecionado = "CIDADE";
                    pf.setCidade(buscCad.getTfcampoPf().getText());
                    pf.alterarPf("CLIENTE", codPf, campoSelecionado, pf.getCidade());
                } else if (campoSelecionado == "Bairro") {
                    campoSelecionado = "BAIRRO";
                    pf.setBairro(buscCad.getTfcampoPf().getText());
                    pf.alterarPf("CLIENTE", codPf, campoSelecionado, pf.getBairro());
                } else if (campoSelecionado == "Rua") {
                    campoSelecionado = "RUA";
                    pf.setRua(buscCad.getTfcampoPf().getText());
                    pf.alterarPf("CLIENTE", codPf, campoSelecionado, pf.getRua());
                } else if (campoSelecionado == "Nº") {
                    campoSelecionado = "NUMEROENDERECO";
                    pf.setNumero(buscCad.getTfcampoPf().getText());
                    pf.alterarPf("CLIENTE", codPf, campoSelecionado, pf.getNumero());
                }
            }

            private void AlterPj() {
                PessoaJuridica pj = new PessoaJuridica();
                String codPj = buscCad.getTfCodPJ().getText();
                String campoSelecionado = String.valueOf(buscCad.getCbAlterarPj().getSelectedItem());
                if (buscCad.getTfcampoPj().getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "O campo de alteração está vazio!");

                    return;
                }
                if (campoSelecionado == "Nome") {
                    pj.setNome(buscCad.getTfcampoPj().getText());
                    pj.alterarPj("Cliente", codPj, campoSelecionado, pj.getNome());
                } else if (campoSelecionado == "CNPJ") {
                    pj.setCnpj(buscCad.getTfcampoPj().getText());
                    pj.alterarPj("PJ", codPj, campoSelecionado, pj.getCnpj());
                } else if (campoSelecionado == "Tipo Org.") {
                    pj.setTipoOrg(buscCad.getTfcampoPj().getText());
                    pj.alterarPj("PJ", codPj, "TIPOORGANIZACAO", pj.getTipoOrg());
                } else if (campoSelecionado == "Telefone") {
                    pj.setTelefone(buscCad.getTfcampoPj().getText());
                    pj.alterarPj("CLIENTE", codPj, campoSelecionado, pj.getTelefone());
                } else if (campoSelecionado == "Celular") {
                    pj.setCelular(buscCad.getTfcampoPj().getText());
                    pj.alterarPj("CLIENTE", codPj, campoSelecionado, pj.getCelular());
                } else if (campoSelecionado == "Email") {
                    pj.setEmail(buscCad.getTfcampoPj().getText());
                    pj.alterarPj("CLIENTE", codPj, campoSelecionado, pj.getEmail());
                } else if (campoSelecionado == "CEP") {
                    pj.setCep(buscCad.getTfcampoPj().getText());
                    pj.alterarPj("CLIENTE", codPj, campoSelecionado, pj.getCep());
                } else if (campoSelecionado == "UF") {
                    pj.setUf(buscCad.getTfcampoPj().getText().substring(0, 2));
                    pj.alterarPj("CLIENTE", codPj, campoSelecionado, pj.getUf());
                } else if (campoSelecionado == "Cidade") {
                    pj.setCidade(buscCad.getTfcampoPj().getText());
                    pj.alterarPj("CLIENTE", codPj, campoSelecionado, pj.getCidade());
                } else if (campoSelecionado == "Bairro") {
                    pj.setBairro(buscCad.getTfcampoPj().getText());
                    pj.alterarPj("CLIENTE", codPj, campoSelecionado, pj.getBairro());
                } else if (campoSelecionado == "Rua") {
                    pj.setRua(buscCad.getTfcampoPj().getText());
                    pj.alterarPj("CLIENTE", codPj, campoSelecionado, pj.getRua());
                } else if (campoSelecionado == "Nº") {
                    pj.setNumero(buscCad.getTfcampoPj().getText());
                    pj.alterarPj("CLIENTE", codPj, "NUMEROENDERECO", pj.getNumero());
                }
            }

            private void PesqFunc() {
                Funcionario func = new Funcionario();
                String codFunc = buscCad.getTfCodFunc().getText();
                if (codFunc == null) {
                    codFunc = "";
                }
                ResultSet resultadoFunc = func.retornarFunc(codFunc);
                DefaultTableModel modelo3;
                modelo3 = (DefaultTableModel) buscCad.getMostraFunc().getModel();
                buscCad.getMostraFunc().setAutoCreateRowSorter(true);
                ((DefaultTableModel) buscCad.getMostraFunc().getModel()).setRowCount(0);

                try {

                    while (resultadoFunc.next()) {

                        codFunc = resultadoFunc.getString("CODFUNC");
                        String nome = resultadoFunc.getString("NOME");
                        String cpfFunc = resultadoFunc.getString("CPFFUN");
                        String cargoEntrada = resultadoFunc.getString("CARGOENTRADA");
                        String cargoAtual = resultadoFunc.getString("CARGOATUAL");
                        String setor = resultadoFunc.getString("SETOR");
                        String baseSalarialBanco = resultadoFunc.getString("BASESALARIAL");
                        String baseSalarial = "R$ " + baseSalarialBanco;
                        // DATANAADMISSAO FORMATADA 
                        String dia = resultadoFunc.getString("DATAADMISSAO").substring(8, 10);
                        String mes = resultadoFunc.getString("DATAADMISSAO").substring(5, 7);
                        String ano = resultadoFunc.getString("DATAADMISSAO").substring(0, 4);
                        String dataAdmissao = (dia + "/" + mes + "/" + ano);
                        String cep = resultadoFunc.getString("CEP");
                        String bairro = resultadoFunc.getString("BAIRRO");
                        String rua = resultadoFunc.getString("RUA");
                        String uf = resultadoFunc.getString("UF");
                        String cidade = resultadoFunc.getString("CIDADE");
                        String numeroEndereco = resultadoFunc.getString("NUMERO");

                        modelo3.addRow(new String[]{codFunc, nome, cpfFunc, cargoEntrada, cargoAtual, setor, baseSalarial, rua, cep, bairro, numeroEndereco, cidade, uf, dataAdmissao});

                    }

                    func.fechaConexao();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(buscCad, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

            private void PesqPf() {
                PessoaFisica pf = new PessoaFisica();
                String codPf = buscCad.getTfCodPF().getText();
                ResultSet resultadoPf;
                resultadoPf = pf.retornarPf(codPf);
                if (buscCad.getCbPotencialPf().isSelected()) {
                    resultadoPf = pf.retornarPotencialPf();
                }
                DefaultTableModel modelo;
                modelo = (DefaultTableModel) buscCad.getMostraPF().getModel();
                buscCad.getMostraPF().setAutoCreateRowSorter(true);
                ((DefaultTableModel) buscCad.getMostraPF().getModel()).setRowCount(0);

                try {

                    while (resultadoPf.next()) {

                        String codCliente = resultadoPf.getString("CODCLIENTE");
                        String codigoPf = resultadoPf.getString("CODPF");
                        String nome = resultadoPf.getString("NOME");
                        String cpf = resultadoPf.getString("CPF");
                        String estadoCivil = resultadoPf.getString("ESTADOCIVIL");
                        String sexo = resultadoPf.getString("SEXO");
                        // DATANASCIMENTO FORMATADA 
                        String dia = resultadoPf.getString("DATANASCIMENTO").substring(8, 10);
                        String mes = resultadoPf.getString("DATANASCIMENTO").substring(5, 7);
                        String ano = resultadoPf.getString("DATANASCIMENTO").substring(0, 4);
                        String dataNascimento = (dia + "/" + mes + "/" + ano);
                        String telefone = resultadoPf.getString("TELEFONE");
                        String celular = resultadoPf.getString("CELULAR");
                        String cep = resultadoPf.getString("CEP");
                        String bairro = resultadoPf.getString("BAIRRO");
                        String rua = resultadoPf.getString("RUA");
                        String uf = resultadoPf.getString("UF");
                        String cidade = resultadoPf.getString("CIDADE");
                        String numeroEndereco = resultadoPf.getString("NUMEROENDERECO");
                        String email = resultadoPf.getString("EMAIL");

                        modelo.addRow(new String[]{codCliente, codigoPf, nome, cpf, estadoCivil, sexo, dataNascimento, telefone, celular, email, cep, uf, cidade, bairro, rua, numeroEndereco});

                    }

                    pf.fechaConexao();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(buscCad, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

            private void PesqPj() {
                PessoaJuridica pj = new PessoaJuridica();
                String codPj = buscCad.getTfCodPJ().getText();
                ResultSet resultadoPj;
                resultadoPj = pj.retornarPj(codPj);
                if (buscCad.getCbPotencialPj().isSelected()) {
                    resultadoPj = pj.retornarPotencialPj();
                }
                DefaultTableModel modelo2;
                modelo2 = (DefaultTableModel) buscCad.getMostraPJ().getModel();
                buscCad.getMostraPJ().setAutoCreateRowSorter(true);
                ((DefaultTableModel) buscCad.getMostraPJ().getModel()).setRowCount(0);

                try {

                    while (resultadoPj.next()) {

                        String codCliente = resultadoPj.getString("CODCLIENTE");
                        String codigoPj = resultadoPj.getString("CODPJ");
                        String nome = resultadoPj.getString("NOME");
                        String cnpj = resultadoPj.getString("CNPJ");
                        String tipoOrg = resultadoPj.getString("TIPOORGANIZACAO");
                        String telefone = resultadoPj.getString("TELEFONE");
                        String celular = resultadoPj.getString("CELULAR");
                        String cep = resultadoPj.getString("CEP");
                        String bairro = resultadoPj.getString("BAIRRO");
                        String rua = resultadoPj.getString("RUA");
                        String uf = resultadoPj.getString("UF");
                        String cidade = resultadoPj.getString("CIDADE");
                        String numeroEndereco = resultadoPj.getString("NUMEROENDERECO");
                        String email = resultadoPj.getString("EMAIL");

                        modelo2.addRow(new String[]{codCliente, codigoPj, nome, cnpj, tipoOrg, telefone, celular, email, cep, uf, cidade, bairro, rua, numeroEndereco});

                    }

                    pj.fechaConexao();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(buscCad, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

            private void ExcFunc() {
                Funcionario func = new Funcionario();
                String codFunc = buscCad.getTfCodFunc().getText();
                func.excluirFunc(codFunc);
            }

            private void ExcPf() {
                PessoaFisica pf = new PessoaFisica();
                String codPf = buscCad.getTfCodPF().getText();
                pf.excluirPf(codPf);
            }

            private void ExcPj() {
                PessoaJuridica pj = new PessoaJuridica();
                String codPj = buscCad.getTfCodPJ().getText();
                pj.excluirPj(codPj);
            }
        };
    }

    public void controleBuscarCampanha() {
        sensor = new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == buscCamp.getbPesquisarCamp()) {
                    PesqCamp();
                } else if (e.getSource() == buscCamp.getbEncerrarCamp()) {
                    EncCamp();
                }
                buscCamp.getbPesquisarCamp().addActionListener(sensor);
                buscCamp.getbEncerrarCamp().addActionListener(sensor);

            }

            private void PesqCamp() {

            }

            private void EncCamp() {

            }
        };
    }

    public void controleBuscarProduto() {
        sensor = new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == buscProd.getbPesquisarProd()) {
                    PesqProd();
                } else if (e.getSource() == buscProd.getbExcluirProd()) {
                    ExcProd();
                } else if (e.getSource() == buscProd.getbAlterQtd()) {
                    AlterQtd();
                } else if (e.getSource() == buscProd.getbVDesc()) {
                    VDesc();
                }
                buscProd.getbPesquisarProd().addActionListener(sensor);
                buscProd.getbExcluirProd().addActionListener(sensor);
                buscProd.getbAlterQtd().addActionListener(sensor);
                buscProd.getbVDesc().addActionListener(sensor);

            }

            private void PesqProd() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            private void ExcProd() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            private void AlterQtd() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            private void VDesc() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
    }

    public void controleCadastroCampanha() {
        sensor = new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == cadCamp.getbCadCamp()) {
                    CadCamp();
                } else if (e.getSource() == cadCamp.getbLimparCamp()) {
                    LimparCamp();
                } else if (e.getSource() == cadCamp.getbVoltarCamp()) {
                    VoltarCamp();
                }
                cadCamp.getbCadCamp().addActionListener(sensor);
                cadCamp.getbLimparCamp().addActionListener(sensor);
                cadCamp.getbVoltarCamp().addActionListener(sensor);

            }

            private void CadCamp() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            private void LimparCamp() {
                cadCamp.getTxtDesc().setText(null);
                cadCamp.getTxtInicio().setText(null);
                cadCamp.getTxtInvestimento().setText(null);
                cadCamp.getTxtFim().setText(null);
            }

            private void VoltarCamp() {
                cadCamp.dispose();
            }
        };
    }

    public void controleCadastroCliente() {
        sensor = new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == cadCliente.getbCadCliente()) {
                    CadCliente();
                } else if (e.getSource() == cadCliente.getbLimparCliente()) {
                    LimparCliente();
                } else if (e.getSource() == cadCliente.getbVoltarCliente()) {
                    VoltarCliente();
                }
                cadCliente.getbCadCliente().addActionListener(sensor);
                cadCliente.getbLimparCliente().addActionListener(sensor);
                cadCliente.getbVoltarCliente().addActionListener(sensor);

            }

            private void CadCliente() {

                // Cliente Geral
                Cliente cliente = new Cliente();
                String codCliente = cliente.gerarCodCliente();
                cliente.setNome(cadCliente.getTfNome().getText());
                cliente.setEmail(cadCliente.getTfEmail().getText());
                cliente.setTelefone(cadCliente.getTfTelefone().getText());
                cliente.setCelular(cadCliente.getTfCelular().getText());
                cliente.setCep(cadCliente.getTfCep().getText());
                cliente.setBairro(cadCliente.getTfBairro().getText());
                cliente.setRua(cadCliente.getTfRua().getText());
                cliente.setCidade(cadCliente.getTfCidade().getText());
                cliente.setNumero(cadCliente.getTfNumero().getText());
                cliente.setUf(cadCliente.getTfUf().getText());

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
                pf.setCpf(cadCliente.getTfCPF().getText());
                pf.setSexo(' ');
                pf.setEstadoCivil(String.valueOf(cadCliente.getjComboBox1().getSelectedItem()));
                pf.setDataNascimento(cadCliente.getFtfDataNascimento().getText());
                if (cadCliente.getJrdPF().isSelected() == true) {
                    if (cadCliente.getJrbHomem().isSelected() == true) {
                        pf.setSexo('M');
                    } else if (cadCliente.getJrbMulher().isSelected() == true) {
                        pf.setSexo('F');
                    } else {
                        JOptionPane.showMessageDialog(cadCliente.getRootPane(), "Selecione o sexo!");
                    }
                }

                // Cliente PessoaJuridica
                PessoaJuridica pj = new PessoaJuridica();
                pj.gerarCodClientePJ();
                pj.setCnpj(cadCliente.getTfCnpj().getText());
                pj.setTipoOrg(cadCliente.getTfTipoOrg().getText());

                if (cliente.getNome().isEmpty() || cliente.getEmail().isEmpty() || cliente.getTelefone().isEmpty() || cliente.getCelular().isEmpty() || cliente.getRua().isEmpty() || cliente.getCep().isEmpty() || cliente.getNumero().isEmpty() || cliente.getBairro().isEmpty() || cliente.getCidade().isEmpty() || cliente.getUf().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Não pode haver campos nulos!");
                    return;
                }
                cliente.setUf(cadCliente.getTfUf().getText().substring(0, 2));

                //
                if (cadCliente.getJrdPF().isSelected() == true) {
                    PessoaFisica clientePF = new PessoaFisica();
                    if (pf.getCpf().isEmpty() || pf.getEstadoCivil().isEmpty() || pf.getDataNascimento().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Não pode haver campos nulos!");
                        return;
                    }
                    if (Integer.parseInt(cadCliente.getFtfDataNascimento().getText().substring(0, 2)) > 31 || Integer.parseInt(cadCliente.getFtfDataNascimento().getText().substring(3, 5)) > 12) {
                        JOptionPane.showMessageDialog(null, "A data de nascimento é invalida!");
                        return;
                    } else {
                        cliente.inserirCliente(codCliente, cliente.getNome(), cliente.getEmail(), cliente.getTelefone(), cliente.getCelular(), cliente.getRua(), cliente.getCep(), cliente.getNumero(), cliente.getBairro(), cliente.getCidade(), cliente.getUf(), cliente.getEfetivo(), cliente.getPotencial());
                        clientePF.inserirClientePF(codCliente, pf.gerarCodClientePF(), pf.getCpf(), pf.getSexo(), pf.getEstadoCivil(), pf.getDataNascimento());
                    }
                } else if (cadCliente.getJrbPJ().isSelected() == true) {
                    PessoaJuridica clientePJ = new PessoaJuridica();
                    if (pj.getCnpj().isEmpty() || pj.getTipoOrg().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Não pode haver campos nulos!");
                        return;
                    } else {
                        cliente.inserirCliente(codCliente, cliente.getNome(), cliente.getEmail(), cliente.getTelefone(), cliente.getCelular(), cliente.getRua(), cliente.getCep(), cliente.getNumero(), cliente.getBairro(), cliente.getCidade(), cliente.getUf(), cliente.getEfetivo(), cliente.getPotencial());
                        clientePJ.inserirClientePJ(codCliente, pj.gerarCodClientePJ(), pj.getCnpj(), pj.getTipoOrg());
                    }
                }
            }

            private void VoltarCliente() {
                cadCliente.dispose();
            }

            private void LimparCliente() {
                cadCliente.getTfCPF().setText(null);
                cadCliente.getTfCnpj().setText(null);
                cadCliente.getTfEmail().setText(null);
                cadCliente.getTfNome().setText(null);
                cadCliente.getTfTipoOrg().setText(null);
                cadCliente.getTfCep().setText(null);
                cadCliente.getTfRua().setText(null);
                cadCliente.getTfNumero().setText(null);
                cadCliente.getTfBairro().setText(null);
                cadCliente.getTfCidade().setText(null);
                cadCliente.getTfUf().setText(null);
                cadCliente.getTfTelefone().setText(null);
                cadCliente.getTfCelular().setText(null);
                cadCliente.getFtfDataNascimento().setText(null);
            }
        };
    }

    public void controleCadastroProduto() {
        sensor = new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == cadProd.getbCadProd()) {
                    CadProd();
                } else if (e.getSource() == cadProd.getbLimparProd()) {
                    LimparProd();
                } else if (e.getSource() == cadProd.getbVoltarProd()) {
                    VoltarProd();
                }
                cadCliente.getbCadCliente().addActionListener(sensor);
                cadCliente.getbLimparCliente().addActionListener(sensor);
                cadCliente.getbVoltarCliente().addActionListener(sensor);

            }

            private void CadProd() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            private void LimparProd() {
                cadProd.getTxtNome().setText(null);
                cadProd.getTxtValor().setText(null);
                cadProd.getTxtDesc().setText(null);
            }

            private void VoltarProd() {
                cadProd.dispose();
            }
        };
    }

    public void controleCadastroUsuario() {
        sensor = new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == cadUser.getbCadFunc()) {
                    CadFunc();
                } else if (e.getSource() == cadUser.getbLimparFunc()) {
                    LimparFunc();
                } else if (e.getSource() == cadUser.getbVoltarFunc()) {
                    VoltarFunc();
                }
                cadUser.getbCadFunc().addActionListener(sensor);
                cadUser.getbLimparFunc().addActionListener(sensor);
                cadUser.getbVoltarFunc().addActionListener(sensor);

            }

            private void CadFunc() {
                Funcionario func = new Funcionario();
                func.setCodFunc(func.gerarCodFunc());
                func.setSenhaFunc(new String(cadUser.getPfSenhaFunc().getPassword()));
                func.setConfirmaSenha(new String(cadUser.getPfConfirmaSenha().getPassword()));
                func.setNome(cadUser.getTfNome().getText());
                func.setCpf(cadUser.getTfCPF().getText());
                func.setCargoEntrada(cadUser.getTfCargoEntrada().getText());
                func.setSetor(cadUser.getTfSetor().getText());
                func.setCargoAtual(cadUser.getTfCargoAtual().getText());
                func.setDataAdmissao(cadUser.getFtfDataAdmissao().getText());
                func.setCep(cadUser.getTfCEP().getText());
                func.setRua(cadUser.getTfRua().getText());
                func.setNumero(cadUser.getTfNumero().getText());
                func.setBairro(cadUser.getTfBairro().getText());
                func.setCidade(cadUser.getTfCidade().getText());
                func.setUf(cadUser.getTfUF().getText());
                if (cadUser.getTfBaseSalarial().getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Não pode haver campos nulos!");
                    return;
                } else {
                }
                if (func.getNome().isEmpty() || func.getSenhaFunc().isEmpty() || func.getCpf().isEmpty() || func.getCargoAtual().isEmpty() || func.getCargoEntrada().isEmpty() || func.getSetor().isEmpty() || func.getDataAdmissao().replace(" ", "").replace("/", "").isEmpty() || func.getBairro().isEmpty() || func.getCep().isEmpty() || func.getCidade().isEmpty() || func.getNumero().isEmpty() || func.getRua().isEmpty() || func.getUf().isEmpty() || String.valueOf(func.getBaseSalarial()).isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Não pode haver campos nulos!");
                    return;
                } else {
                    func.setBaseSalarial(Integer.parseInt(cadUser.getTfBaseSalarial().getText().replace(".", "").replace(",", "")));
                    func.setUf(cadUser.getTfUF().getText().substring(0, 2));
                }

                if (func.getSenhaFunc().length() > 8 || func.getConfirmaSenha().length() > 8) {
                    JOptionPane.showMessageDialog(null, "A senha não pode conter mais que 8 caracteres!");
                    return;
                }

                if (func.getConfirmaSenha().equals(func.getSenhaFunc()) == false) {
                    JOptionPane.showMessageDialog(null, "A senha confirmada não está correta!");
                    return;
                }
                if (Integer.parseInt(cadUser.getFtfDataAdmissao().getText().substring(0, 2)) > 31 || Integer.parseInt(cadUser.getFtfDataAdmissao().getText().substring(3, 5)) > 12) {
                    JOptionPane.showMessageDialog(null, "A data de Admissão é invalida!");
                    return;
                }

                func.inserir(func.getCodFunc(), func.getNome(), func.getSenhaFunc(), func.getCpf(), func.getCargoEntrada(), func.getSetor(), func.getBaseSalarial(), func.getCargoAtual(), func.getDataAdmissao(), func.getCep(), func.getRua(), func.getNumero(), func.getBairro(), func.getCidade(), func.getUf());
            }

            private void LimparFunc() {
                cadUser.getTfUF().setText(null);
                cadUser.getTfBaseSalarial().setText(null);
                cadUser.getTfNome().setText(null);
                cadUser.getTfCPF().setText(null);
                cadUser.getTfSetor().setText(null);
                cadUser.getTfCEP().setText(null);
                cadUser.getTfCargoAtual().setText(null);
                cadUser.getTfRua().setText(null);
                cadUser.getTfNumero().setText(null);
                cadUser.getTfBairro().setText(null);
                cadUser.getTfCidade().setText(null);
                cadUser.getTfCargoEntrada().setText(null);
                cadUser.getFtfDataAdmissao().setText(null);
                cadUser.getPfSenhaFunc().setText(null);
                cadUser.getPfConfirmaSenha().setText(null);
            }

            private void VoltarFunc() {
                cadUser.dispose();
            }
        };
    }

    public void controleNovoAtendimento() {
        sensor = new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == nAtend.getbCriarAt()) {
                    NAtd();
                } else if (e.getSource() == nAtend.getbLimpar()) {
                    LimparAtd();
                } else if (e.getSource() == nAtend.getbVoltar()) {
                    VoltarAtd();
                }
                cadUser.getbCadFunc().addActionListener(sensor);
                cadUser.getbLimparFunc().addActionListener(sensor);
                cadUser.getbVoltarFunc().addActionListener(sensor);

            }

            private void NAtd() {
                Atendimento at = new Atendimento();
                Funcionario func = new Funcionario();
                PessoaFisica pf = new PessoaFisica();
                PessoaJuridica pj = new PessoaJuridica();
                at.setCodAtendimento(at.gerarCodAtendimento());
                at.setCodCliente(nAtend.getTfCodCli().getText());
                at.setDataInicio(nAtend.getFtfDataAbert().getText());
                at.setCodFunc(nAtend.getTfCodResp().getText());
                at.setAssunto(nAtend.getTfAssunto().getText());
                if (nAtend.getRbReclamacao().isSelected()) {
                    at.setReclamacao(nAtend.getTaTopico().getText());
                    at.setSugestao("");
                } else if (nAtend.getRbSugestao().isSelected()) {
                    at.setSugestao(nAtend.getTaTopico().getText());
                    at.setReclamacao("");
                } else {
                    JOptionPane.showMessageDialog(null, "Selecione o tipo de atendimento! (Reclamação ou Sugestão)");
                }
                if (at.getCodCliente().isEmpty() || at.getDataInicio().equals("  /  /    ") || at.getCodFunc().isEmpty() || at.getAssunto().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Não pode haver campos nulos!");
                    return;
                } else if (Integer.parseInt(at.getDataInicio().substring(0, 2)) > 31 || Integer.parseInt(at.getDataInicio().substring(3, 5)) > 12) {
                    JOptionPane.showMessageDialog(null, "A data de abertura é invalida!");
                    return;
                }
                func.retornarFunc((nAtend.getTfCodResp().getText()));
                if (nAtend.getRbFisica().isSelected()) {
                    try {
                        pf.retornarPf((nAtend.getTfCodCli().getText()));

                        if (pf.retornarPf(nAtend.getTfCodCli().getText()).getStatement().executeUpdate("SELECT * FROM PF WHERE CODCLIENTE like '%" + nAtend.getTfCodCli().getText() + "%'") == 0) {
                            JOptionPane.showMessageDialog(null, "Este Cliente não existe!");
                            return;
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(NovoAtendimento.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else if (nAtend.getRbJuridica().isSelected()) {

                    //
                    try {
                        pj.retornarPj((nAtend.getTfCodCli().getText()));

                        if (pj.retornarPj(nAtend.getTfCodCli().getText()).getStatement().executeUpdate("SELECT * FROM PJ WHERE CODCLIENTE like '%" + nAtend.getTfCodCli().getText() + "%'") == 0) {
                            JOptionPane.showMessageDialog(null, "Este Cliente não existe!");
                            return;
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(NovoAtendimento.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    //
                    //
                } else {
                    JOptionPane.showMessageDialog(null, "Selecione o tipo de cliente!");
                    return;

                }
                //Inserts temporarios:

                at.setStatus("Em Atendimento");

                at.inserirAtendimento(at.getCodAtendimento(), at.getCodCliente(), at.getCodFunc(), at.getAssunto(), at.getStatus(), at.getDataInicio(), at.getSugestao(), at.getReclamacao());
            }

            private void LimparAtd() {
                nAtend.getTfAssunto().setText(null);
                nAtend.getTfCodCli().setText(null);
                nAtend.getTfCodResp().setText(null);
                nAtend.getFtfDataAbert().setText(null);
                nAtend.getTaTopico().setText(null);
            }

            private void VoltarAtd() {
                nAtend.dispose();
            }
        };
    }

    public void controlePedidosEfetuados() {
        sensor = new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == pedEf.getbPesqPed()) {
                    PesqPed();
                }
                pedEf.getbPesqPed().addActionListener(sensor);

            }

            private void PesqPed() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
    }

    public void controleRelatorioVendas() {
        sensor = new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == relVenda.getbPesqVenda()) {
                    PesqVenda();
                }
                relVenda.getbPesqVenda().addActionListener(sensor);
                /*  Venda venda = new Venda();
        codVenda = codVenda.getText();
        ResultSet resultadoPj = pj.retornarPj(codPj);
        DefaultTableModel modelo2;
        modelo2 = (DefaultTableModel) mostraPJ.getModel();
        mostraPJ.setAutoCreateRowSorter(true);
        ((DefaultTableModel) mostraPJ.getModel()).setRowCount(0);

        try {

            while (resultadoPj.next()) {

                String codCliente = resultadoPj.getString("CODCLIENTE");
                String codigoPj = resultadoPj.getString("CODPJ");
                String nome = resultadoPj.getString("NOME");
                String cnpj = resultadoPj.getString("CNPJ");
                String tipoOrg = resultadoPj.getString("TIPOORGANIZACAO");
                String telefone = resultadoPj.getString("TELEFONE");
                String celular = resultadoPj.getString("CELULAR");
                String cep = resultadoPj.getString("CEP");
                String bairro = resultadoPj.getString("BAIRRO");
                String rua = resultadoPj.getString("RUA");
                String uf = resultadoPj.getString("UF");
                String cidade = resultadoPj.getString("CIDADE");
                String numeroEndereco = resultadoPj.getString("NUMEROENDERECO");
                String email = resultadoPj.getString("EMAIL");

                modelo2.addRow(new String[]{codCliente, codigoPj, nome, cnpj, tipoOrg, telefone, celular, email, cep, uf, cidade, bairro, rua, numeroEndereco});

            }

            pj.fechaConexao();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }*/
            }

            private void PesqVenda() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
    }
}
