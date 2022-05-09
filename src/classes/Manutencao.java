package classes;

import java.util.ArrayList;

public class Manutencao {
    private long id;
    private String equipamento;
    private String responsavel;
    private String dataInicio;
    private String horarioInicio;
    private String dataConclusao;
    private String horarioConclusao;
    private String dataAgendamento;
    private String horarioAgendamento;
    private String periodicidade;
    private String causaFalha;
    private String descricao;
    private String tipoManutencao;
    private ArrayList <RegistroPeca> registroPeca = new ArrayList<RegistroPeca>();
    
    public Manutencao(String equipamento, String responsavel, String dataInicio, String horarioInicio, String dataConclusao, String horarioConclusao, String dataAgendamento, String horarioAgendamento, String periodicidade, String causaFalha, String descricao, String tipoManutencao)
    {
        this.setEquipamento(equipamento);
        this.setResponsavel(responsavel);
        this.setDataInicio(dataInicio);
        this.setHorarioInicio(horarioInicio);
        this.setDataConclusao(dataConclusao);
        this.setHorarioConclusao(horarioConclusao);
        this.setDataAgendamento(dataAgendamento);
        this.setHorarioAgendamento(horarioAgendamento);
        this.setPeriodicidade(periodicidade);
        this.setCausaFalha(causaFalha);
        this.setDescricao(descricao);
        this.setTipoManutencao(tipoManutencao);
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getDataAgendamento() {
        return dataAgendamento;
    }

    public void setDataAgendamento(String dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }

    public String getHorarioAgendamento() {
        return horarioAgendamento;
    }

    public void setHorarioAgendamento(String horarioAgendamento) {
        this.horarioAgendamento = horarioAgendamento;
    }

    public String getPeriodicidade() {
        return periodicidade;
    }

    public void setPeriodicidade(String periodicidade) {
        this.periodicidade = periodicidade;
    }

    public String getCausaFalha() {
        return causaFalha;
    }

    public void setCausaFalha(String causaFalha) {
        this.causaFalha = causaFalha;
    }

    public String getTipoManutencao() {
        return tipoManutencao;
    }

    public void setTipoManutencao(String tipoManutencao) {
        this.tipoManutencao = tipoManutencao;
    }
    
    public ArrayList<RegistroPeca> getRegistroPeca() {
        return registroPeca;
    }

    public void setRegistroPeca(ArrayList<RegistroPeca> registroPeca) {
        this.registroPeca = registroPeca;
    }
}
