package classes;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
    
    private String url;
    private String usuario;
    private String senha;
    private Connection con;
    
    public Conexao() {
        // "127.0.01" se refere ao ip da minha máquina, que está sendo utilizada como servidor
        // sintaxe: jdbc:nome-do-sgbd://ip-do-host:porta/nome-do-banco
        url = "jdbc:postgresql://127.0.0.1:5432/mainsoft";
        usuario = "postgres";
        senha = "postgres";
        
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexão realizada com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}