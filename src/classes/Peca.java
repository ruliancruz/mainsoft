package classes;

import java.util.ArrayList;

public class Peca {
    private long id;
    private String nome;
    private String modelo;
    private String fabricante;
    private String notas;
    private ArrayList <Composicao> composicoes = new ArrayList<>();
    private ArrayList <Reparo> reparos = new ArrayList<>();

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

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public ArrayList<Composicao> getComposicoes() {
        return composicoes;
    }

    public void setComposicoes(ArrayList<Composicao> composicoes) {
        this.composicoes = composicoes;
    }

    public ArrayList<Reparo> getReparos() {
        return reparos;
    }

    public void setReparos(ArrayList<Reparo> reparos) {
        this.reparos = reparos;
    }
}
