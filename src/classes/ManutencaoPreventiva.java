package classes;

public class ManutencaoPreventiva extends ManutencaoAbstrata {
    private String dataAgendamento;
    private String horarioAgendamento;
    private String periodicidade;
    
    public ManutencaoPreventiva()
    {
        
    }
    
    public ManutencaoPreventiva(String descricao, String dataInicio, String dataConclusao, String horarioInicio, String horarioConclusao, String responsavel, String equipamento, String dataAgendamento, String horarioAgendamento, String periodicidade)
    {
        this.setDescricao(descricao);
        this.setDataInicio(dataInicio);
        this.setDataConclusao(dataConclusao);
        this.setHorarioInicio(horarioInicio);
        this.setHorarioConclusao(horarioConclusao);
        this.setResponsavel(responsavel);
        this.setEquipamento(equipamento);
        this.setDataAgendamento(dataAgendamento);
        this.setHorarioAgendamento(horarioAgendamento);
        this.setPeriodicidade(periodicidade);
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
}
