package co.edu.unicauca.openmarket.domain.service;

import co.edu.unicauca.openmarket.access.ICategoryRepository;
import co.edu.unicauca.openmarket.domain.Category;
/**
 *
 * @author 
 */
public class CategoryService {
    private ICategoryRepository repository;

    public CategoryService(ICategoryRepository repository) {
        this.repository = repository;
    }
    
    public boolean saveCategory (String name) {
        Category newCategory = new Category();
        newCategory.setName(name);
        
        //Validate product
        if (newCategory.getName().isEmpty()) {
            return false;
            
        }

        return repository.save(newCategory);
    }
    
    public long findId(String name){
        return repository.findId(name);
    }
    
}
