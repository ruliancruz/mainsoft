package classes;

import java.util.ArrayList;

public class Equipamento {
    private long id;
    private String nome;
    private String modelo;
    private String fabricante;
    private String dataDeAquisicao;
    private Peca pecas;
    private ArrayList <ManutencaoAbstrata> manutencaosRealizadas = new ArrayList<>();

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
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    
    public String getDataDeAquisicao() {
        return dataDeAquisicao;
    }

    public void setDataDeAquisicao(String dataDeAquisicao) {
        this.dataDeAquisicao = dataDeAquisicao;
    }

    public ArrayList<ManutencaoAbstrata> getManutencaosRealizadas() {
        return manutencaosRealizadas;
    }

    public void setManutencaosRealizadas(ArrayList<ManutencaoAbstrata> manutencaosRealizadas) {
        this.manutencaosRealizadas = manutencaosRealizadas;
    }
    
    public Peca getPecas() {
        return pecas;
    }

    public void setPecas(Peca pecas) {
        this.pecas = pecas;
    }
}