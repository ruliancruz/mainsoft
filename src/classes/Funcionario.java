package classes;

import java.util.ArrayList;

public class Funcionario {
    private long id;
    private String nome;
    private ArrayList <ManutencaoAbstrata> manutencoes = new ArrayList<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
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
