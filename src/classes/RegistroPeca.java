package classes;

import java.io.Serializable;

public class RegistroPeca implements Serializable{
    private long id;
    private String nome;
    private String tipoAlteracao;
    private long idPeca; //private Peca peca;
    private long idPecaSubstituida; //private Peca peca;

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getTipoAlteracao()
    {
        return tipoAlteracao;
    }

    public void setTipoAlteracao(String tipoAlteracao)
    {
        this.tipoAlteracao = tipoAlteracao;
    }

    public long getIdPeca()
    {
        return idPeca;
    }
    
//    public long getIdPeca() {
//        return peca.getId();
//    }

    public void setIdPeca(long idPeca)
    {
        this.idPeca = idPeca;
    }
    
//    public void setIdPeca(long idPeca) {
//        peca.setId(idPeca);
//    }

    public long getIdPecaSubstituida()
    {
        return idPecaSubstituida;
    }
    
//    public long getIdPecaSubstituida() {
//        return peca.getId();
//    }

    public void setIdPecaSubstituida(long idPecaSubstituida)
    {
        this.idPecaSubstituida = idPecaSubstituida;
    }
    
//    public void setIdPecaSubstituida(long idPecaSubstituida) {
//        peca.setId(idPecaSubstituida);
//    }
}