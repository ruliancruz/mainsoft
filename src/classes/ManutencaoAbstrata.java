package classes;

import java.util.Date;
import java.util.ArrayList;

public abstract class ManutencaoAbstrata {
    private String descricao;
    private String dataDeInício;
    private String dataDeConclusao;
    private ArrayList <Funcionario> funcionarios = new ArrayList<>();
    private Equipamento equipamento;
    private ArrayList <Peca> pecasSubstituidas = new ArrayList<>();
    private ArrayList <Peca> pecasReparadas = new ArrayList<>();

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataDeInício() {
        return dataDeInício;
    }

    public void setDataDeInício(String dataDeInício) {
        this.dataDeInício = dataDeInício;
    }

    public String getDataDeConclusao() {
        return dataDeConclusao;
    }

    public void setDataDeConclusao(String dataDeConclusao) {
        this.dataDeConclusao = dataDeConclusao;
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }

    public ArrayList<Peca> getPecasSubstituidas() {
        return pecasSubstituidas;
    }
    
    public void setPecasSubstituidas(ArrayList<Peca> pecasSubstituidas) {
        this.pecasSubstituidas = pecasSubstituidas;
    }

    public ArrayList<Peca> getPecasReparadas() {
        return pecasReparadas;
    }

    public void setPecasReparadas(ArrayList<Peca> pecasReparadas) {
        this.pecasReparadas = pecasReparadas;
    }
}