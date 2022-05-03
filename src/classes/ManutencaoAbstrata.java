package classes;

import java.util.ArrayList;

public abstract class ManutencaoAbstrata {
    private String descricao;
    private String dataDeInicio;
    private String dataDeConclusao;
    private String horarioDeInicio;
    private String horarioDeConclusao;
    private String responsavel;
    private String equipamento;
    private ArrayList <Peca> pecasSubstituidas = new ArrayList<>();
    private ArrayList <Peca> pecasReparadas = new ArrayList<>();

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataDeInicio() {
        return dataDeInicio;
    }

    public void setDataDeInicio(String dataDeInicio) {
        this.dataDeInicio = dataDeInicio;
    }

    public String getDataDeConclusao() {
        return dataDeConclusao;
    }

    public void setDataDeConclusao(String dataDeConclusao) {
        this.dataDeConclusao = dataDeConclusao;
    }

    public String getHorarioDeInicio() {
        return horarioDeInicio;
    }

    public void setHorarioDeInicio(String horarioDeInicio) {
        this.horarioDeInicio = horarioDeInicio;
    }

    public String getHorarioDeConclusao() {
        return horarioDeConclusao;
    }

    public void setHorarioDeConclusao(String horarioDeConclusao) {
        this.horarioDeConclusao = horarioDeConclusao;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(String equipamento) {
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
