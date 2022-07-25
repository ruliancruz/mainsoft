package telas;
import java.util.ArrayList;
import classes.Funcionario;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TelaListaFuncionarios extends javax.swing.JInternalFrame
{
    private final TelaPrincipal telaPrincipal;
    private final ArrayList<Funcionario> listaFuncionarios;
    private long ultimoIdFuncionario;    
    
    public TelaListaFuncionarios(TelaPrincipal tela)
    {
        initComponents();
        this.ultimoIdFuncionario = 0;
        telaPrincipal = tela;
        listaFuncionarios = new ArrayList<>();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaFuncionario = new javax.swing.JTable();
        botaoEditar = new javax.swing.JButton();
        botaoRemover = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Lista de Funcionários");
        setToolTipText("");

        tabelaFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaFuncionario);

        botaoEditar.setText("Editar");
        botaoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEditarActionPerformed(evt);
            }
        });

        botaoRemover.setText("Remover");
        botaoRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRemoverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoRemover)
                .addGap(18, 18, 18)
                .addComponent(botaoEditar)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoRemover)
                    .addComponent(botaoEditar))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarActionPerformed
        // TODO add your handling code here:
        Funcionario funcionarioSelecionado;
        
        if(tabelaFuncionario.getSelectedRow() != -1)
        {
            if(telaPrincipal.abrirJanela(telaPrincipal.getTelaEditarFuncionario()))
            {
                funcionarioSelecionado = listaFuncionarios.get(tabelaFuncionario.getSelectedRow());
                telaPrincipal.getTelaEditarFuncionario().setPosicaoListaFuncionario(tabelaFuncionario.getSelectedRow());
                telaPrincipal.getTelaEditarFuncionario().getLabelId().setText(String.valueOf(funcionarioSelecionado.getId()));
                telaPrincipal.getTelaEditarFuncionario().getCampoNome().setText(funcionarioSelecionado.getNome());
            }
        }
    }//GEN-LAST:event_botaoEditarActionPerformed

    private void botaoRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRemoverActionPerformed
        // TODO add your handling code here:
        if(tabelaFuncionario.getSelectedRow() != -1)
        {
            removerFuncionario((listaFuncionarios.get(tabelaFuncionario.getSelectedRow())));
            atualizarListaFuncionarios();
        }
    }//GEN-LAST:event_botaoRemoverActionPerformed
    
    public void adicionarFuncionario(Funcionario funcionario)
    {
        funcionario.setId(ultimoIdFuncionario);
        ultimoIdFuncionario++;
        listaFuncionarios.add(funcionario);
        atualizarListaFuncionarios();
    }
    
    public void editarFuncionario(Funcionario funcionario, int posicao)
    {
        listaFuncionarios.remove(posicao);
        listaFuncionarios.add(posicao, funcionario);
        atualizarListaFuncionarios();
    }
    
    public void removerFuncionario(Funcionario funcionario)
    {
        listaFuncionarios.remove(funcionario);
        atualizarListaFuncionarios();
    }
    
    public void atualizarListaFuncionarios()
    {
        ((DefaultTableModel) tabelaFuncionario.getModel()).setNumRows(0);
        
         for(Funcionario item : listaFuncionarios)
            ((DefaultTableModel) tabelaFuncionario.getModel()).addRow(new Object[]{ item.getId(), item.getNome() });
    }
    
    public ArrayList<Funcionario> getListaFuncionarios() {
        return listaFuncionarios;
    }

    public JTable getTabelaFuncionario() {
        return tabelaFuncionario;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoEditar;
    private javax.swing.JButton botaoRemover;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaFuncionario;
    // End of variables declaration//GEN-END:variables
}