package telas;
import classes.ManutencaoPreventiva;
import classes.Utils;

public class TelaManutencaoPreventiva extends javax.swing.JInternalFrame implements Utils {
    ManutencaoPreventiva ordemDeManutencaoPreventiva;
    TelaAlterarPeca telaAlterarPeca;
   
    public TelaManutencaoPreventiva() {
        initComponents();
        ordemDeManutencaoPreventiva = new ManutencaoPreventiva();
        telaAlterarPeca = new TelaAlterarPeca();
    }
    
    @Override
    public void limparCampos() {
        campoDeEquipamento.setText("");
        campoDeResponsavel.setText("");
        campoDeDataDeAgendamento.setText("");
        campoDeHorarioDeAgendamento.setText("");
        campoDeDataDeInicio.setText("");
        campoDeHorarioDeInicio.setText("");
        campoDeDataDeConclusao.setText("");
        campoDeHorarioDeConclusao.setText("");
        campoDePeriodicidade.setText("");
        campoDescricao.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campoDeEquipamento = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campoDeResponsavel = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        campoDeDataDeAgendamento = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        campoDeHorarioDeAgendamento = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        campoDeDataDeInicio = new javax.swing.JFormattedTextField();
        botaoAlterar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        campoDeHorarioDeInicio = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        campoDeDataDeConclusao = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        campoDeHorarioDeConclusao = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        campoDePeriodicidade = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        campoDescricao = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        botaoCancelar = new javax.swing.JButton();
        botaoSalvar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Manutenção Preventiva");

        jLabel1.setText("Ordem de Serviço:");

        jLabel2.setText("Equipamento:");

        jLabel3.setText("Responsável:");

        jLabel4.setText("Data de Agendamento:");

        campoDeDataDeAgendamento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        jLabel5.setText("Horário de Agendamento:");

        campoDeHorarioDeAgendamento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));

        jLabel6.setText("Data de Início:");

        campoDeDataDeInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        botaoAlterar.setText("Adicionar Alteração de Peças");
        botaoAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAlterarActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Peças Alteradas");

        jLabel7.setText("Horário de Início:");

        campoDeHorarioDeInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));

        jLabel8.setText("Data de Conclusão:");

        campoDeDataDeConclusao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        jLabel9.setText("Horário de Conclusão:");

        campoDeHorarioDeConclusao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));

        jLabel10.setText("Periodicidade:");

        jLabel12.setText("Descrição:");

        campoDescricao.setColumns(20);
        campoDescricao.setRows(5);
        jScrollPane2.setViewportView(campoDescricao);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Alteração", "Substituída Por"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        botaoCancelar.setText("Cancelar");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });

        botaoSalvar.setText("Salvar");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        painel.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painel.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painel.setLayer(campoDeEquipamento, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painel.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painel.setLayer(campoDeResponsavel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painel.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painel.setLayer(campoDeDataDeAgendamento, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painel.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painel.setLayer(campoDeHorarioDeAgendamento, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painel.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painel.setLayer(campoDeDataDeInicio, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painel.setLayer(botaoAlterar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painel.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painel.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painel.setLayer(campoDeHorarioDeInicio, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painel.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painel.setLayer(campoDeDataDeConclusao, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painel.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painel.setLayer(campoDeHorarioDeConclusao, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painel.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painel.setLayer(campoDePeriodicidade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painel.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painel.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painel.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painel.setLayer(botaoCancelar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painel.setLayer(botaoSalvar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout painelLayout = new javax.swing.GroupLayout(painel);
        painel.setLayout(painelLayout);
        painelLayout.setHorizontalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoDeHorarioDeInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoDeDataDeInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoDeDataDeConclusao, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoDeHorarioDeConclusao, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoDePeriodicidade, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 134, Short.MAX_VALUE))
            .addGroup(painelLayout.createSequentialGroup()
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoDeHorarioDeAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addGroup(painelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoDeEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(182, 182, 182)
                        .addComponent(jLabel11))
                    .addGroup(painelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoDeResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoDeDataDeAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115)
                        .addComponent(botaoAlterar))
                    .addGroup(painelLayout.createSequentialGroup()
                        .addGap(419, 419, 419)
                        .addComponent(botaoCancelar)
                        .addGap(28, 28, 28)
                        .addComponent(botaoSalvar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelLayout.setVerticalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoDeEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoDeResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(campoDeDataDeAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(botaoAlterar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(campoDeHorarioDeAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(campoDeDataDeInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(campoDeHorarioDeInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(campoDeDataDeConclusao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(campoDeHorarioDeConclusao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(campoDePeriodicidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67)
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 252, Short.MAX_VALUE)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCancelar)
                    .addComponent(botaoSalvar))
                .addGap(137, 137, 137))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        ordemDeManutencaoPreventiva.setEquipamento(campoDeEquipamento.getText());
        ordemDeManutencaoPreventiva.setResponsavel(campoDeResponsavel.getText());
        ordemDeManutencaoPreventiva.setDataAgendamento(campoDeDataDeAgendamento.getText());
        ordemDeManutencaoPreventiva.setHorarioAgendamento(campoDeHorarioDeAgendamento.getText());
        ordemDeManutencaoPreventiva.setDataInicio(campoDeDataDeInicio.getText());
        ordemDeManutencaoPreventiva.setHorarioInicio(campoDeHorarioDeInicio.getText());
        ordemDeManutencaoPreventiva.setDataConclusao(campoDeDataDeConclusao.getText());
        ordemDeManutencaoPreventiva.setHorarioConclusao(campoDeHorarioDeConclusao.getText());
        ordemDeManutencaoPreventiva.setPeriodicidade(campoDePeriodicidade.getText());
        if(ordemDeManutencaoPreventiva.getEquipamento() != null ||
           ordemDeManutencaoPreventiva.getResponsavel() != null ||
           ordemDeManutencaoPreventiva.getDataAgendamento() != null ||
           ordemDeManutencaoPreventiva.getHorarioAgendamento() != null ||
           ordemDeManutencaoPreventiva.getDataInicio() != null ||
           ordemDeManutencaoPreventiva.getHorarioInicio() != null ||
           ordemDeManutencaoPreventiva.getDataConclusao() != null ||
           ordemDeManutencaoPreventiva.getHorarioConclusao() != null ||
           ordemDeManutencaoPreventiva.getPeriodicidade() != null ||
           ordemDeManutencaoPreventiva.getDescricao() != null) {
            limparCampos();
        }
        this.dispose();
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        if(ordemDeManutencaoPreventiva.getEquipamento() != null ||
           ordemDeManutencaoPreventiva.getResponsavel() != null ||
           ordemDeManutencaoPreventiva.getDataAgendamento() != null ||
           ordemDeManutencaoPreventiva.getHorarioAgendamento() != null ||
           ordemDeManutencaoPreventiva.getDataInicio() != null ||
           ordemDeManutencaoPreventiva.getHorarioInicio() != null ||
           ordemDeManutencaoPreventiva.getDataConclusao() != null ||
           ordemDeManutencaoPreventiva.getHorarioConclusao() != null ||
           ordemDeManutencaoPreventiva.getPeriodicidade() != null ||
           ordemDeManutencaoPreventiva.getDescricao() != null) {
            limparCampos();
        }
        this.dispose();
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void botaoAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAlterarActionPerformed
        if(telaAlterarPeca.isVisible()) {
            telaAlterarPeca.setVisible(false);
            painel.remove(telaAlterarPeca);
        } else {
            painel.add(telaAlterarPeca);
            telaAlterarPeca.setVisible(true);
        }
    }//GEN-LAST:event_botaoAlterarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAlterar;
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JFormattedTextField campoDeDataDeAgendamento;
    private javax.swing.JFormattedTextField campoDeDataDeConclusao;
    private javax.swing.JFormattedTextField campoDeDataDeInicio;
    private javax.swing.JTextField campoDeEquipamento;
    private javax.swing.JFormattedTextField campoDeHorarioDeAgendamento;
    private javax.swing.JFormattedTextField campoDeHorarioDeConclusao;
    private javax.swing.JFormattedTextField campoDeHorarioDeInicio;
    private javax.swing.JTextField campoDePeriodicidade;
    private javax.swing.JTextField campoDeResponsavel;
    private javax.swing.JTextArea campoDescricao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JDesktopPane painel;
    // End of variables declaration//GEN-END:variables
}