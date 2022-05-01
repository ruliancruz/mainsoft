package Classes;

import java.util.ArrayList;
import java.util.Date;

class Equipamento {
    private String nome;
    private String modelo;
    private Date   dataDeAquisicao;
    private Pecas  peca;
    private ArrayList < ManutencaoAbstrata > manutencaosRealizadas = new ArrayList <ManutencaoAbstrata> ();

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public Pecas getPeca() {
        return peca;
    }

    public void setPeca(Pecas peca) {
        this.peca = peca;
    }
    
    
    
            
    
}