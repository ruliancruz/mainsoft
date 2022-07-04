package classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author gabriel
 */

public class Banco {
    
    public Connection conn;
    
    public Banco() throws SQLException{
        // Não sei se a password está correta, mas o resto está
        String url = "jdbc:postgresql://localhost:5432/postgres?user=postgres&password=0807";
        this.conn = DriverManager.getConnection(url);
    }
    
}