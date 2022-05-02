package classes;

import java.util.ArrayList;
import java.util.Date;

class Equipamento {
    private String nome;
    private String modelo;
    private String fabricante;
    private Date dataDeAquisicao;
    private Peca pecas;
    private ArrayList <ManutencaoAbstrata> manutencaosRealizadas = new ArrayList<>();

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
    
    public Date getDataDeAquisicao() {
        return dataDeAquisicao;
    }

    public void setDataDeAquisicao(Date dataDeAquisicao) {
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