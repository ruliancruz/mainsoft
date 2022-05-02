package classes;

public class ManutencaoCorretiva extends ManutencaoAbstrata {
    private String CausaDaFalha;

    public String getCausaDaFalha() {
        return CausaDaFalha;
    }

    public void setCausaDaFalha(String CausaDaFalha) {
        this.CausaDaFalha = CausaDaFalha;
    }
}
