package telas;
import java.util.ArrayList;
import classes.Peca;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TelaListaPecas extends javax.swing.JInternalFrame
{
    private final ArrayList<Peca> listaPecas;
    private long ultimoIdPeca;

    public TelaListaPecas()
    {
        initComponents();
        this.ultimoIdPeca = 0;
        listaPecas = new ArrayList<>();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaPeca = new javax.swing.JTable();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Lista de Peças");

        tabelaPeca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Modelo", "Fabricante", "Equipamento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaPeca);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void adicionarPeca(Peca peca)
    {
        peca.setId(ultimoIdPeca);
        ultimoIdPeca++;
        listaPecas.add(peca);
        atualizarListaPecas();
    }
    
    public void atualizarListaPecas()
    {
        ((DefaultTableModel) tabelaPeca.getModel()).setNumRows(0);
        
        for(Peca item : listaPecas)
            ((DefaultTableModel) tabelaPeca.getModel()).addRow(new Object[]{ item.getId(), item.getNome(), item.getModelo(), item.getFabricante(), item.getEquipamento().getNome() });
    }
    
    public ArrayList<Peca> getListaPecas() {
        return listaPecas;
    }

    public JTable getTabelaPeca() {
        return tabelaPeca;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaPeca;
    // End of variables declaration//GEN-END:variables
}