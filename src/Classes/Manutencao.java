package Classes;
import java.util.Date;

class Manutencao {
    private String descricao;
    private Date dataDeInício;
    private Date dataDeConclusao;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataDeInício() {
        return dataDeInício;
    }

    public void setDataDeInício(Date dataDeInício) {
        this.dataDeInício = dataDeInício;
    }

    public Date getDataDeConclusao() {
        return dataDeConclusao;
    }

    public void setDataDeConclusao(Date dataDeConclusao) {
        this.dataDeConclusao = dataDeConclusao;
    }
}
