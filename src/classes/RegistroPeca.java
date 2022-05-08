package classes;

public class RegistroPeca {
    private long id;
    private String dataInsercao;
    private String horarioInsercao;
    private String dataRemocao;
    private String horarioRemocao;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDataInsercao() {
        return dataInsercao;
    }

    public void setDataInsercao(String dataInsercao) {
        this.dataInsercao = dataInsercao;
    }

    public String getHorarioInsercao() {
        return horarioInsercao;
    }

    public void setHorarioInsercao(String horarioInsercao) {
        this.horarioInsercao = horarioInsercao;
    }

    public String getDataRemocao() {
        return dataRemocao;
    }

    public void setDataRemocao(String dataRemocao) {
        this.dataRemocao = dataRemocao;
    }

    public String getHorarioRemocao() {
        return horarioRemocao;
    }

    public void setHorarioRemocao(String horarioRemocao) {
        this.horarioRemocao = horarioRemocao;
    }
    
    
    
}
