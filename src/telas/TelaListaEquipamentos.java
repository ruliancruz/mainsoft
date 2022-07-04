package telas;
import java.util.ArrayList;
import classes.Equipamento;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TelaListaEquipamentos extends javax.swing.JInternalFrame
{
    private final ArrayList<Equipamento> listaEquipamentos;
    private long ultimoIdEquipamento;
    
    public TelaListaEquipamentos()
    {
        initComponents();
        this.ultimoIdEquipamento = 0;
        listaEquipamentos = new ArrayList<>();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaEquipamento = new javax.swing.JTable();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Lista de Equipamentos");

        tabelaEquipamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Modelo", "Fabricante", "Data de Aquisição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaEquipamento);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void adicionarEquipamento(Equipamento equipamento)
    {
        equipamento.setId(ultimoIdEquipamento);
        ultimoIdEquipamento++;
        listaEquipamentos.add(equipamento);
        atualizarListaEquipamentos();
    }
    
    public void atualizarListaEquipamentos()
    {
        ((DefaultTableModel) tabelaEquipamento.getModel()).setNumRows(0);
        
        for(Equipamento item : listaEquipamentos)
            ((DefaultTableModel) tabelaEquipamento.getModel()).addRow(new Object[]{ item.getId(), item.getNome(), item.getModelo(), item.getFabricante(), item.getDataAquisicao() });
    }
    
    public ArrayList<Equipamento> getListaEquipamentos() {
        return listaEquipamentos;
    }

    public JTable getTabelaEquipamento() {
        return tabelaEquipamento;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaEquipamento;
    // End of variables declaration//GEN-END:variables
}