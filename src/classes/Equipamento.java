package classes;

import java.util.ArrayList;

public class Equipamento {
    private long id;
    private String nome;
    private String modelo;
    private String fabricante;
    private String dataAquisicao;
    private Peca pecas;
    private ArrayList <Manutencao> manutencaosRealizadas = new ArrayList<>();
    
    public Equipamento(String nome, String modelo, String fabricante, String dataAquisicao)
    {
        this.setNome(nome);
        this.setModelo(modelo);
        this.setFabricante(fabricante);
        this.setDataAquisicao(dataAquisicao);
    }
    
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

    public String getDataAquisicao() {
        return dataAquisicao;
    }

    public void setDataAquisicao(String dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
    }

    public ArrayList<Manutencao> getManutencaosRealizadas() {
        return manutencaosRealizadas;
    }

    public void setManutencaosRealizadas(ArrayList<Manutencao> manutencaosRealizadas) {
        this.manutencaosRealizadas = manutencaosRealizadas;
    }
    
    public Peca getPecas() {
        return pecas;
    }

    public void setPecas(Peca pecas) {
        this.pecas = pecas;
    }
}