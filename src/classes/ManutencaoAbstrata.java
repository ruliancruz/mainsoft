package classes;

import java.util.ArrayList;

public abstract class ManutencaoAbstrata {
    private long id;
    private String descricao;
    private String dataInicio;
    private String dataConclusao;
    private String horarioInicio;
    private String horarioConclusao;
    private String responsavel;
    private String equipamento;
    private ArrayList <RegistroPeca> registroPeca = new ArrayList<RegistroPeca>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(String dataConclusao) {
        this.dataConclusao = dataConclusao;
    }

    public String getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(String horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public String getHorarioConclusao() {
        return horarioConclusao;
    }

    public void setHorarioConclusao(String horarioConclusao) {
        this.horarioConclusao = horarioConclusao;
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

    public ArrayList<RegistroPeca> getRegistroPeca() {
        return registroPeca;
    }

    public void setRegistroPeca(ArrayList<RegistroPeca> registroPeca) {
        this.registroPeca = registroPeca;
    }
}
