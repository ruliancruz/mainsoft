package classes;

import java.util.ArrayList;
//import java.util.Calendar;

public class Equipamento {
    private long id;
    private String nome;
    private String modelo;
    private String fabricante; //private Fabricante fabricante;
    private String dataAquisicao; //private Calendar dataAquisicao;
    private Peca pecas;
    private ArrayList <Manutencao> manutencaosRealizadas = new ArrayList<>();
    
    public Equipamento(String nome, String modelo, String fabricante, String dataAquisicao) {
        this.nome = nome;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.dataAquisicao = dataAquisicao;
    }
    
//    public Equipamento(String nome, String modelo, Fabricante fabricante, Calendar dataAquisicao) {
//        this.nome = nome;
//        this.modelo = modelo;
//        this.fabricante = fabricante;
//        this.dataAquisicao = dataAquisicao;
//    }
    
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
    
//    public Fabricante getFabricante() {
//        return fabricante;
//    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    
//    public void setFabricante(Fabricante fabricante) {
//        this.fabricante = fabricante;
//    }

    public String getDataAquisicao() {
        return dataAquisicao;
    }
    
//    public Calendar getDataAquisicao() {
//        return dataAquisicao;
//    }

    public void setDataAquisicao(String dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
    }
    
//    public void setDataAquisicao(Calendar dataAquisicao) {
//        this.dataAquisicao = dataAquisicao;
//    }

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