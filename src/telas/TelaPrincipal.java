package telas;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import classes.Manutencao;
import classes.Equipamento;
import classes.Funcionario;

public class TelaPrincipal extends javax.swing.JFrame {
    private TelaManutencaoCorretiva telaManutencaoCorretiva;
    private TelaManutencaoPreventiva telaManutencaoPreventiva;
    private TelaEquipamento telaEquipamento;
    private TelaFuncionario telaFuncionario;
    private TelaPeca telaPeca;
    private TelaListaPecas telaListaPecas;
    private TelaListaFuncionarios telaListaFuncionarios;
    private TelaListaEquipamentos telaListaEquipamentos;
    private ArrayList<Manutencao> manutencoes;
    private long ultimoIdManutencao = 0;
    
    public TelaPrincipal() {
        initComponents();

        this.telaListaPecas = new TelaListaPecas();
        this.telaListaFuncionarios = new TelaListaFuncionarios();
        this.telaFuncionario = new TelaFuncionario((DefaultTableModel)telaListaFuncionarios.getTabelaFuncionario().getModel(), telaListaFuncionarios);
        this.telaListaEquipamentos = new TelaListaEquipamentos();
        this.telaEquipamento = new TelaEquipamento((DefaultTableModel)telaListaEquipamentos.getTabelaEquipamento().getModel(), telaListaEquipamentos);
        this.telaManutencaoCorretiva = new TelaManutencaoCorretiva((DefaultTableModel)jTable1.getModel(), this.painel, this);
        this.telaManutencaoPreventiva = new TelaManutencaoPreventiva((DefaultTableModel)jTable1.getModel(), this.painel, this);
        this.telaPeca = new TelaPeca((DefaultTableModel)telaListaPecas.getTabelaPeca().getModel(), telaListaPecas);
        this.manutencoes = new ArrayList<Manutencao>();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel = new javax.swing.JDesktopPane();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCadastro = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        cadastrarManutencaoCorretiva = new javax.swing.JMenuItem();
        cadastrarManutencaoPreventiva = new javax.swing.JMenuItem();
        cadastrarFuncionario = new javax.swing.JMenuItem();
        cadastrarEquipamento = new javax.swing.JMenuItem();
        cadastrarPeca = new javax.swing.JMenuItem();
        menuConsulta = new javax.swing.JMenu();
        consultarOrdensServico = new javax.swing.JMenuItem();
        consultarFuncionarios = new javax.swing.JMenuItem();
        consultarEquipamentos = new javax.swing.JMenuItem();
        consultarPecas = new javax.swing.JMenuItem();
        menuAtualizacao = new javax.swing.JMenu();
        menuRemocao = new javax.swing.JMenu();
        menuSobre = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mainsoft - Sistema de Controle de Manutenção em Fabricas");

        jInternalFrame1.setMaximizable(true);
        jInternalFrame1.setResizable(true);
        jInternalFrame1.setTitle("Lista de Ordens de Serviço");
        jInternalFrame1.setToolTipText("");
        jInternalFrame1.setAutoscrolls(true);
        jInternalFrame1.setVisible(true);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Equipamento", "Responsável", "Data de Início", "Data de Conclusão", "Data de Agendamento", "Periodicidade", "Causa da Falha", "Tipo"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1249, Short.MAX_VALUE)
            .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1249, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
            .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE))
        );

        painel.setLayer(jInternalFrame1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout painelLayout = new javax.swing.GroupLayout(painel);
        painel.setLayout(painelLayout);
        painelLayout.setHorizontalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        painelLayout.setVerticalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );

        menuCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/application_edit.png"))); // NOI18N
        menuCadastro.setText("Cadastro");

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add.png"))); // NOI18N
        jMenu1.setText("Cadastrar Manutenção");

        cadastrarManutencaoCorretiva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/wrench.png"))); // NOI18N
        cadastrarManutencaoCorretiva.setText("Manutenção Corretiva");
        cadastrarManutencaoCorretiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarManutencaoCorretivaActionPerformed(evt);
            }
        });
        jMenu1.add(cadastrarManutencaoCorretiva);

        cadastrarManutencaoPreventiva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/wrench.png"))); // NOI18N
        cadastrarManutencaoPreventiva.setText("Manutenção Preventiva");
        cadastrarManutencaoPreventiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarManutencaoPreventivaActionPerformed(evt);
            }
        });
        jMenu1.add(cadastrarManutencaoPreventiva);

        menuCadastro.add(jMenu1);

        cadastrarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add.png"))); // NOI18N
        cadastrarFuncionario.setText("Cadastrar Funcionário");
        cadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarFuncionarioActionPerformed(evt);
            }
        });
        menuCadastro.add(cadastrarFuncionario);

        cadastrarEquipamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add.png"))); // NOI18N
        cadastrarEquipamento.setText("Cadastrar Equipamento");
        cadastrarEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarEquipamentoActionPerformed(evt);
            }
        });
        menuCadastro.add(cadastrarEquipamento);

        cadastrarPeca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add.png"))); // NOI18N
        cadastrarPeca.setText("Cadastrar Peça");
        cadastrarPeca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarPecaActionPerformed(evt);
            }
        });
        menuCadastro.add(cadastrarPeca);

        jMenuBar1.add(menuCadastro);

        menuConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/magnifier.png"))); // NOI18N
        menuConsulta.setText("Consulta");

        consultarOrdensServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/page.png"))); // NOI18N
        consultarOrdensServico.setText("Ordens de Serviço");
        consultarOrdensServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarOrdensServicoActionPerformed(evt);
            }
        });
        menuConsulta.add(consultarOrdensServico);

        consultarFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/page.png"))); // NOI18N
        consultarFuncionarios.setText("Funcionários");
        consultarFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarFuncionariosActionPerformed(evt);
            }
        });
        menuConsulta.add(consultarFuncionarios);

        consultarEquipamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/page.png"))); // NOI18N
        consultarEquipamentos.setText("Equipamentos");
        consultarEquipamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarEquipamentosActionPerformed(evt);
            }
        });
        menuConsulta.add(consultarEquipamentos);

        consultarPecas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/page.png"))); // NOI18N
        consultarPecas.setText("Peças");
        consultarPecas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarPecasActionPerformed(evt);
            }
        });
        menuConsulta.add(consultarPecas);

        jMenuBar1.add(menuConsulta);

        menuAtualizacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pencil.png"))); // NOI18N
        menuAtualizacao.setText("Atualização");
        jMenuBar1.add(menuAtualizacao);

        menuRemocao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancel.png"))); // NOI18N
        menuRemocao.setText("Remoção");
        jMenuBar1.add(menuRemocao);

        menuSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/information.png"))); // NOI18N
        menuSobre.setText("Sobre");
        jMenuBar1.add(menuSobre);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    public void adicionarManutencao(Manutencao manutencao)
    {
        manutencao.setId(ultimoIdManutencao);
        ultimoIdManutencao++;
        manutencoes.add(manutencao);
    }
    
    public ArrayList<Manutencao> getManutencoes() {
        return manutencoes;
    }

    public TelaListaEquipamentos getTelaListaEquipamentos() {
        return telaListaEquipamentos;
    }

    public TelaListaFuncionarios getTelaListaFuncionarios() {
        return telaListaFuncionarios;
    }
    
    private void cadastrarManutencaoCorretivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarManutencaoCorretivaActionPerformed
        if(telaManutencaoCorretiva.isVisible()) {
            telaManutencaoCorretiva.setVisible(false);
            painel.remove(telaManutencaoCorretiva);
        } else {
            painel.add(telaManutencaoCorretiva);
            telaManutencaoCorretiva.setVisible(true);
            
            telaManutencaoCorretiva.getCampoEquipamento().removeAllItems();
            
            for(Equipamento item : telaListaEquipamentos.getListaEquipamentos())
            {
                telaManutencaoCorretiva.getCampoEquipamento().addItem(item.getNome());
            }
            
            telaManutencaoCorretiva.getCampoResponsavel().removeAllItems();
            
            for(Funcionario item : telaListaFuncionarios.getListaFuncionarios())
            {
                telaManutencaoCorretiva.getCampoResponsavel().addItem(item.getNome());
            }
        }
    }//GEN-LAST:event_cadastrarManutencaoCorretivaActionPerformed

    private void cadastrarManutencaoPreventivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarManutencaoPreventivaActionPerformed
        if(telaManutencaoPreventiva.isVisible()) {
            telaManutencaoPreventiva.setVisible(false);
            painel.remove(telaManutencaoPreventiva);
        } else {
            painel.add(telaManutencaoPreventiva);
            telaManutencaoPreventiva.setVisible(true);
            
            telaManutencaoPreventiva.getCampoEquipamento().removeAllItems();
            
            for(Equipamento item : telaListaEquipamentos.getListaEquipamentos())
            {
                telaManutencaoPreventiva.getCampoEquipamento().addItem(item.getNome());
            }
            
            telaManutencaoPreventiva.getCampoResponsavel().removeAllItems();
            
            for(Funcionario item : telaListaFuncionarios.getListaFuncionarios())
            {
                telaManutencaoPreventiva.getCampoResponsavel().addItem(item.getNome());
            }
        }
    }//GEN-LAST:event_cadastrarManutencaoPreventivaActionPerformed

    private void consultarEquipamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarEquipamentosActionPerformed
        if(telaListaEquipamentos.isVisible()) {
            telaListaEquipamentos.setVisible(false);
            painel.remove(telaListaEquipamentos);
        } else {
            painel.add(telaListaEquipamentos);
            telaListaEquipamentos.setVisible(true);
        }
    }//GEN-LAST:event_consultarEquipamentosActionPerformed

    private void cadastrarPecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarPecaActionPerformed
        if(telaPeca.isVisible()) {
            telaPeca.setVisible(false);
            painel.remove(telaPeca);
        } else {
            painel.add(telaPeca);
            telaPeca.setVisible(true);
            telaPeca.getCampoEquipamento().removeAllItems();
            
            for(Equipamento item : telaListaEquipamentos.getListaEquipamentos())
            {
                telaPeca.getCampoEquipamento().addItem(item.getNome());
            }
        }
    }//GEN-LAST:event_cadastrarPecaActionPerformed

    private void consultarOrdensServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarOrdensServicoActionPerformed
        // ordem de serviço
    }//GEN-LAST:event_consultarOrdensServicoActionPerformed

    private void cadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarFuncionarioActionPerformed
        if(telaFuncionario.isVisible()) {
            telaFuncionario.setVisible(false);
            painel.remove(telaFuncionario);
        } else {
            painel.add(telaFuncionario);
            telaFuncionario.setVisible(true);
        }
    }//GEN-LAST:event_cadastrarFuncionarioActionPerformed

    private void cadastrarEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarEquipamentoActionPerformed
        if(telaEquipamento.isVisible()) {
            telaEquipamento.setVisible(false);
            painel.remove(telaEquipamento);
        } else {
            painel.add(telaEquipamento);
            telaEquipamento.setVisible(true);
        }
    }//GEN-LAST:event_cadastrarEquipamentoActionPerformed

    private void consultarPecasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarPecasActionPerformed
        if(telaListaPecas.isVisible()) {
            telaListaPecas.setVisible(false);
            painel.remove(telaListaPecas);
        } else {
            painel.add(telaListaPecas);
            telaListaPecas.setVisible(true);
        }
    }//GEN-LAST:event_consultarPecasActionPerformed

    private void consultarFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarFuncionariosActionPerformed
        if(telaListaFuncionarios.isVisible()) {
            telaListaFuncionarios.setVisible(false);
            painel.remove(telaListaFuncionarios);
        } else {
            painel.add(telaListaFuncionarios);
            telaListaFuncionarios.setVisible(true);
        }
    }//GEN-LAST:event_consultarFuncionariosActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem cadastrarEquipamento;
    private javax.swing.JMenuItem cadastrarFuncionario;
    private javax.swing.JMenuItem cadastrarManutencaoCorretiva;
    private javax.swing.JMenuItem cadastrarManutencaoPreventiva;
    private javax.swing.JMenuItem cadastrarPeca;
    private javax.swing.JMenuItem consultarEquipamentos;
    private javax.swing.JMenuItem consultarFuncionarios;
    private javax.swing.JMenuItem consultarOrdensServico;
    private javax.swing.JMenuItem consultarPecas;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenu menuAtualizacao;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenu menuConsulta;
    private javax.swing.JMenu menuRemocao;
    private javax.swing.JMenu menuSobre;
    private javax.swing.JDesktopPane painel;
    // End of variables declaration//GEN-END:variables
}