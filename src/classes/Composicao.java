package classes;

public class Composicao {
    private Peca peca;
    private Equipamento equipamento;
    private String dataDeAdicao;
    private String dataDeRemocao;

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

    public String getDataDeAdicao() {
        return dataDeAdicao;
    }

    public void setDataDeAdicao(String dataDeAdicao) {
        this.dataDeAdicao = dataDeAdicao;
    }

    public String getDataDeRemocao() {
        return dataDeRemocao;
    }

    public void setDataDeRemocao(String dataDeRemocao) {
        this.dataDeRemocao = dataDeRemocao;
    }
}
