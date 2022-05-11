package classes;

public class Peca {
    private long id;
    private String nome;
    private String modelo;
    private String fabricante; //private Fabricante fabricante;
    
    public Peca(String nome, String modelo, String fabricante) {
        this.nome = nome;
        this.modelo = modelo;
        this.fabricante = fabricante;
    }
    
//    public Peca(String nome, String modelo, Fabricante fabricante) {
//        this.nome = nome;
//        this.modelo = modelo;
//        this.fabricante = fabricante;
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
}