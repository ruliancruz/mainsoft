package telas;
import classes.ManutencaoPreventiva;
import classes.Utils;

public class TelaManutencaoPreventiva extends javax.swing.JInternalFrame implements Utils {
    ManutencaoPreventiva ordemDeManutencaoPreventiva;
   
    public TelaManutencaoPreventiva() {
        initComponents();
        ordemDeManutencaoPreventiva = new ManutencaoPreventiva();
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
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        campoDeDataDeAgendamento = new javax.swing.JFormattedTextField();
        campoDeHorarioDeAgendamento = new javax.swing.JFormattedTextField();
        campoDeDataDeInicio = new javax.swing.JFormattedTextField();
        campoDeHorarioDeInicio = new javax.swing.JFormattedTextField();
        campoDeDataDeConclusao = new javax.swing.JFormattedTextField();
        campoDeHorarioDeConclusao = new javax.swing.JFormattedTextField();
        campoDePeriodicidade = new javax.swing.JTextField();
        botaoCancelar = new javax.swing.JButton();
        botaoSalvar = new javax.swing.JButton();
        campoDeResponsavel = new javax.swing.JTextField();
        campoDeEquipamento = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Manutenção Preventiva");

        jLabel1.setText("Ordem de Serviço:");

        jLabel2.setText("Equipamento:");

        jLabel3.setText("Responsável:");

        jLabel4.setText("Data de Agendamento:");

        jLabel5.setText("Horário de Agendamento:");

        jLabel6.setText("Data de Início:");

        jLabel7.setText("Horário de Início:");

        jLabel8.setText("Data de Conclusão:");

        jLabel9.setText("Horário de Conclusão:");

        jLabel10.setText("Periodicidade:");

        campoDeDataDeAgendamento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        campoDeHorarioDeAgendamento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));

        campoDeDataDeInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        campoDeHorarioDeInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));

        campoDeDataDeConclusao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        campoDeHorarioDeConclusao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoDeDataDeAgendamento)
                            .addComponent(campoDeResponsavel)
                            .addComponent(campoDeEquipamento)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(botaoCancelar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(botaoSalvar))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel10))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(campoDeHorarioDeConclusao, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(campoDeDataDeConclusao, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(campoDeHorarioDeInicio, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(campoDeDataDeInicio, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(campoDeHorarioDeAgendamento)
                                        .addComponent(campoDePeriodicidade, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(campoDeResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(campoDeDataDeAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(campoDeHorarioDeAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(campoDeDataDeInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(campoDeHorarioDeInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(campoDeDataDeConclusao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(campoDeHorarioDeConclusao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(campoDePeriodicidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoCancelar)
                            .addComponent(botaoSalvar))
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(campoDeEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
           ordemDeManutencaoPreventiva.getPeriodicidade() != null) {
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
           ordemDeManutencaoPreventiva.getPeriodicidade() != null) {
            limparCampos();
        }
        this.dispose();
    }//GEN-LAST:event_botaoCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}