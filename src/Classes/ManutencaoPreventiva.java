package Classes;
import java.util.Date;

public class ManutencaoPreventiva extends ManutencaoAbstrata{
    private Date dataDeAgendamento;
    private String periodicidade;

    public Date getDataDeAgendamento() {
        return dataDeAgendamento;
    }

    public void setDataDeAgendamento(Date dataDeAgendamento) {
        this.dataDeAgendamento = dataDeAgendamento;
    }

    public String getPeriodicidade() {
        return periodicidade;
    }

    public void setPeriodicidade(String periodicidade) {
        this.periodicidade = periodicidade;
    }
}
