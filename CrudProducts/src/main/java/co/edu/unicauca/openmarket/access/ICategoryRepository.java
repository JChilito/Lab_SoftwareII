package co.edu.unicauca.openmarket.access;

import co.edu.unicauca.openmarket.domain.Category;
import java.util.List;



public interface ICategoryRepository {
    
    boolean save(Category newCategory);

    Category findById(Long id);
    
    long findId(String name);
    
    List<Category> findAll();
}
