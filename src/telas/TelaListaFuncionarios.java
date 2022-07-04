package telas;
import java.util.ArrayList;
import classes.Funcionario;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TelaListaFuncionarios extends javax.swing.JInternalFrame
{
    private final ArrayList<Funcionario> listaFuncionarios;
    private long ultimoIdFuncionario;    
    
    public TelaListaFuncionarios()
    {
        initComponents();
        this.ultimoIdFuncionario = 0;
        listaFuncionarios = new ArrayList<>();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaFuncionario = new javax.swing.JTable();

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void adicionarFuncionario(Funcionario funcionario)
    {
        funcionario.setId(ultimoIdFuncionario);
        ultimoIdFuncionario++;
        listaFuncionarios.add(funcionario);
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaFuncionario;
    // End of variables declaration//GEN-END:variables
}