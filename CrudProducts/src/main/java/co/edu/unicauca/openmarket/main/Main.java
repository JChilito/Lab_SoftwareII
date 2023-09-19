
package co.edu.unicauca.openmarket.main;

import co.edu.unicauca.openmarket.access.CategoryRepository;
import co.edu.unicauca.openmarket.access.Factory;
import co.edu.unicauca.openmarket.access.GeneralRepository;
import co.edu.unicauca.openmarket.access.IProductRepository;
import co.edu.unicauca.openmarket.access.ICategoryRepository;
import co.edu.unicauca.openmarket.access.ProductRepository;
import co.edu.unicauca.openmarket.domain.service.ProductService;
import co.edu.unicauca.openmarket.domain.service.CategoryService;
import co.edu.unicauca.openmarket.presentation.GUIProducts;

/**
 *
 * @author Libardo Pantoja
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GeneralRepository RG = new GeneralRepository();
        GeneralRepository repository = Factory.getInstance().getRepository("default");
        IProductRepository IproRep = new ProductRepository(RG.getConn());
        ProductService productService = new ProductService(IproRep);
        
        ICategoryRepository IcatRep = new CategoryRepository(RG.getConn());
        CategoryService catergoryService = new CategoryService(IcatRep);
        
        GUIProducts instance = new GUIProducts(productService,catergoryService);
        instance.setVisible(true);
    }
    
}
