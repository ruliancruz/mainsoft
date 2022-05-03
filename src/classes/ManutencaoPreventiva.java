package classes;
import java.util.Date;

public class ManutencaoPreventiva extends ManutencaoAbstrata{
    private String dataDeAgendamento;
    private String periodicidade;

    public String getDataDeAgendamento() {
        return dataDeAgendamento;
    }

    public void setDataDeAgendamento(String dataDeAgendamento) {
        this.dataDeAgendamento = dataDeAgendamento;
    }

    public String getPeriodicidade() {
        return periodicidade;
    }

    public void setPeriodicidade(String periodicidade) {
        this.periodicidade = periodicidade;
    }
}
