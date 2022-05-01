package Classes;

public class ManutencaoCorretiva extends Manutencao {
    private String CausaDaFalha;

    public String getCausaDaFalha() {
        return CausaDaFalha;
    }

    public void setCausaDaFalha(String CausaDaFalha) {
        this.CausaDaFalha = CausaDaFalha;
    }
}
