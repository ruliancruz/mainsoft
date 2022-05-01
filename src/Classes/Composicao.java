package Classes;

import java.util.Date;

public class Composicao {
    private Peca peca;
    private Equipamento equipamento;
    private Date dataDeAdicao;
    private Date dataDeRemocao;

    public Peca getPeca() {
        return peca;
    }

    public void setPeca(Peca peca) {
        this.peca = peca;
    }

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }

    public Date getDataDeAdicao() {
        return dataDeAdicao;
    }

    public void setDataDeAdicao(Date dataDeAdicao) {
        this.dataDeAdicao = dataDeAdicao;
    }

    public Date getDataDeRemocao() {
        return dataDeRemocao;
    }

    public void setDataDeRemocao(Date dataDeRemocao) {
        this.dataDeRemocao = dataDeRemocao;
    }
}
