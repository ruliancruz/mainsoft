package classes;

import java.util.ArrayList;

public class Funcionario {
    private long id;
    private String nome;
    private ArrayList <Manutencao> manutencoes = new ArrayList<>();
       
    public Funcionario(String Nome) {
        this.nome = nome;
    }
    
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

    public ArrayList<Manutencao> getManutencoes() {
        return manutencoes;
    }

    public void setManutencoes(ArrayList<Manutencao> manutencoes) {
        this.manutencoes = manutencoes;
    }
}