package classes;

public class RegistroReparo {
    private long id;
    private String dataReparo;
    private String horarioReparo;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDataReparo() {
        return dataReparo;
    }

    public void setDataReparo(String dataReparo) {
        this.dataReparo = dataReparo;
    }

    public String getHorarioReparo() {
        return horarioReparo;
    }

    public void setHorarioReparo(String horarioReparo) {
        this.horarioReparo = horarioReparo;
    }
}
