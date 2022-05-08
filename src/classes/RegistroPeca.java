package classes;

public class RegistroPeca {
    private long id;
    private String nome;
    private String tipoAlteracao;
    private long idPeca;
    private long idPecaSubstituida;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoAlteracao() {
        return tipoAlteracao;
    }

    public void setTipoAlteracao(String tipoAlteracao) {
        this.tipoAlteracao = tipoAlteracao;
    }

    public long getIdPeca() {
        return idPeca;
    }

    public void setIdPeca(long idPeca) {
        this.idPeca = idPeca;
    }

    public long getIdPecaSubstituida() {
        return idPecaSubstituida;
    }

    public void setIdPecaSubstituida(long idPecaSubstituida) {
        this.idPecaSubstituida = idPecaSubstituida;
    }
}
