package classes;

public class ManutencaoPreventiva extends ManutencaoAbstrata {
    private String dataDeAgendamento;
    private String horarioDeAgendamento;
    private String periodicidade;

    public String getDataDeAgendamento() {
        return dataDeAgendamento;
    }

    public void setDataDeAgendamento(String dataDeAgendamento) {
        this.dataDeAgendamento = dataDeAgendamento;
    }

    public String getHorarioDeAgendamento() {
        return horarioDeAgendamento;
    }

    public void setHorarioDeAgendamento(String horarioDeAgendamento) {
        this.horarioDeAgendamento = horarioDeAgendamento;
    }

    public String getPeriodicidade() {
        return periodicidade;
    }

    public void setPeriodicidade(String periodicidade) {
        this.periodicidade = periodicidade;
    }
}
