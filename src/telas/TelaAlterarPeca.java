package telas;
import classes.Utils;

public class TelaAlterarPeca extends javax.swing.JInternalFrame implements Utils {

    public TelaAlterarPeca() {
        initComponents();
    }

    @Override
    public void limparCampos() {
        ;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoCancelar = new javax.swing.JButton();
        botaoReparo = new javax.swing.JButton();
        botaoSubstituicao = new javax.swing.JButton();
        botaoAdicao = new javax.swing.JButton();
        botaoRemocao = new javax.swing.JButton();

        setTitle("Tipo de Alteração de Peça");

        botaoCancelar.setText("Cancelar");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });

        botaoReparo.setText("Reparo");
        botaoReparo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoReparoActionPerformed(evt);
            }
        });

        botaoSubstituicao.setText("Substituição");
        botaoSubstituicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSubstituicaoActionPerformed(evt);
            }
        });

        botaoAdicao.setText("Adição");
        botaoAdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicaoActionPerformed(evt);
            }
        });

        botaoRemocao.setText("Remoção");
        botaoRemocao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRemocaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(botaoCancelar)
                .addGap(18, 18, 18)
                .addComponent(botaoReparo)
                .addGap(18, 18, 18)
                .addComponent(botaoSubstituicao)
                .addGap(18, 18, 18)
                .addComponent(botaoAdicao)
                .addGap(18, 18, 18)
                .addComponent(botaoRemocao)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCancelar)
                    .addComponent(botaoReparo)
                    .addComponent(botaoSubstituicao)
                    .addComponent(botaoAdicao)
                    .addComponent(botaoRemocao))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        limparCampos();
        this.dispose();
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void botaoReparoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoReparoActionPerformed
        // TODO add your handling code here:
        limparCampos();
        this.dispose();
    }//GEN-LAST:event_botaoReparoActionPerformed

    private void botaoSubstituicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSubstituicaoActionPerformed
        // TODO add your handling code here:
        limparCampos();
        this.dispose();
    }//GEN-LAST:event_botaoSubstituicaoActionPerformed

    private void botaoAdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicaoActionPerformed
        // TODO add your handling code here:
        limparCampos();
        this.dispose();
    }//GEN-LAST:event_botaoAdicaoActionPerformed

    private void botaoRemocaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRemocaoActionPerformed
        // TODO add your handling code here:
        limparCampos();
        this.dispose();
    }//GEN-LAST:event_botaoRemocaoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAdicao;
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoRemocao;
    private javax.swing.JButton botaoReparo;
    private javax.swing.JButton botaoSubstituicao;
    // End of variables declaration//GEN-END:variables
}