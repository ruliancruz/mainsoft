package classes;

import java.util.Date;

public class Reparo {
    private String descricao;
    private Date DataDeReparo;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataDeReparo() {
        return DataDeReparo;
    }

    public void setDataDeReparo(Date DataDeReparo) {
        this.DataDeReparo = DataDeReparo;
    }
}
