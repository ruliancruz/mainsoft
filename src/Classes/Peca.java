package Classes;

import java.util.ArrayList;

public class Peca {
    private String modelo;
    private String fabricante;
    private String descricao;
    private ArrayList <Composicao> composicoes = new ArrayList<>();
    private ArrayList <Reparo> reparos = new ArrayList<>();
    
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
    
    public String getDescricao() {
        return descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
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
