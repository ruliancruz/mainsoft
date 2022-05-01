package Classes;

public class Pecas {
    private String modelo;
    private String fabricante;
    private String descricao;
    private Composicao composicao;
    private Reparo reparo;
    
    public String getmodelo() {
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
    
    public Composicao getComposicao() {
        return composicao;
    }
    
    public void setComposicao(Composicao composicao) {
        this.composicao = composicao;
    }
    
    public Reparo getReparo() {
        return reparo;
    }
    
    public void setReparo(Reparo reparo) {
        this.reparo = reparo;
    }
}
