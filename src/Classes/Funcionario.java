package Classes;

import java.util.ArrayList;

class Funcionario {
    private String nome;
    private ArrayList <ManutencaoAbstrata> manutencoes = new ArrayList<>();
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<ManutencaoAbstrata> getManutencoes() {
        return manutencoes;
    }

    public void setManutencoes(ArrayList<ManutencaoAbstrata> manutencoes) {
        this.manutencoes = manutencoes;
    }
}
