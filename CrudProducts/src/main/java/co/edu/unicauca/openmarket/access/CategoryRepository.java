package co.edu.unicauca.openmarket.access;

import co.edu.unicauca.openmarket.domain.Category;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author INGESIS
 */
public class CategoryRepository implements ICategoryRepository {

    private Connection conn;

    public CategoryRepository(Connection conn) {
        this.conn = conn;
    }
    
    @Override
    public boolean save(Category newCategory) {
        try {
            //Validate category
            if (newCategory == null || newCategory.getName().isEmpty()) {
                return false;
            }
            //this.connect();

            String sql = "INSERT INTO category (catName) "
                    + "VALUES (?)";

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, newCategory.getName());
            pstmt.executeUpdate();
            //this.disconnect();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CategoryRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public Category findById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public long findId(String name) {
        //List<Category> product = new ArrayList<>();
        long idCategory = 0;
        try {

            String sql = "SELECT * FROM category  "
                    + "WHERE catName = ?";
            
            /*String sql = "SELECT * FROM products  "
                    + "WHERE Upper(name) = '%'||Upper(?)||'%'";*/

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, name);

            ResultSet res = pstmt.executeQuery();

            if (res.next()) {
                idCategory = res.getLong("categoryId");
            } 
            //this.disconnect();

        } catch (SQLException ex) {
            Logger.getLogger(ProductRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return idCategory;
    }

    @Override
    public List<Category> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
