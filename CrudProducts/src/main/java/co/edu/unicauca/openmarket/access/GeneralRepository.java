package co.edu.unicauca.openmarket.access;

import co.edu.unicauca.openmarket.domain.Product;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author INGESIS
 */
public class GeneralRepository {
    private Connection conn;

    public GeneralRepository() {
        initDatabase();
    }
    
    private void initDatabase() {
        // SQL statement for creating a new table
        String sql = "CREATE TABLE IF NOT EXISTS products (\n"
                + "	productId integer PRIMARY KEY AUTOINCREMENT,\n"
                + "	name text NOT NULL,\n"
                + "	description text NULL,\n"
                + "     categoryId integer,\n"
                + "     FOREIGN KEY (categoryId) REFERENCES category(categoryId)\n"
                + ");";
        
        String sqlC = "CREATE TABLE IF NOT EXISTS category (\n"
                + "	categoryId integer PRIMARY KEY AUTOINCREMENT,\n"
                + "	catName text NOT NULL\n"
                + ");";

        
        try {
            this.connect();
            Statement stmt = conn.createStatement();
            stmt.execute(sqlC);
            stmt.execute(sql);
            
            //this.disconnect();

        } catch (SQLException ex) {
            Logger.getLogger(ProductRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void connect() {
        // SQLite connection string
        //String url = "jdbc:sqlite:./myDatabase.db"; //Para Linux/Mac
        //String url = "jdbc:sqlite:C:/sqlite/db/myDatabase.db"; //Para Windows
        String url = "jdbc:sqlite::memory:";

        try {
            conn = DriverManager.getConnection(url);

        } catch (SQLException ex) {
            Logger.getLogger(ProductRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void disconnect() {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public Connection getConn() {
        return conn;
    }
    
    
}
