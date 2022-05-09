package classes;

public class Peca {
    private long id;
    private String nome;
    private String modelo;
    private String fabricante;
    
    public Peca(String nome, String modelo, String fabricante)
    {
        this.setNome(nome);
        this.setModelo(modelo);
        this.setFabricante(fabricante);
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
}
