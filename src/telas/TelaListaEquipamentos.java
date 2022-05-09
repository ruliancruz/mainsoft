package telas;
import java.util.ArrayList;
import classes.Equipamento;
import javax.swing.JTable;

public class TelaListaEquipamentos extends javax.swing.JInternalFrame {
    private ArrayList<Equipamento> listaEquipamentos;
    private long ultimoIdEquipamento = 0;
    
    public TelaListaEquipamentos() {
        initComponents();
        listaEquipamentos = new ArrayList<Equipamento>();
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
        ));
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