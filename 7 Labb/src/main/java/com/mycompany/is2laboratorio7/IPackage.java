package com.mycompany.is2laboratorio7;

import java.util.List;

/**
 * Component class of the composite pattern
 * @author Jose David Chilito Cometa <jdchilito@unicauca.edu.co>
 * @author Katherin Alexandra Zuñiga Morales <kzunigam@unicauca.edu.co>
 */
public interface IPackage {
    /**
     * getPrice
     * @return Total price of the package selected by the customer.
     */
    double getPrice();
    
    /**
     * getDetails
     * @return String
     */
    String getDetails();
    
    /**
     * getPack
     * @return List of subpackages.
     */
    List<IPackage> getPacks();
    
    /**
     * getName
     * @return Name of the city or country or continent. 
     */
    String getName();
    
    /**
     * getTourDetails
     * @return String
     */
    String getTourDetails();
}
