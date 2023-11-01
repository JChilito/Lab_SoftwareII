package com.mycompany.is2laboratorio7;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite class
 * @author Jose David Chilito Cometa <jdchilito@unicauca.edu.co>
 * @author Katherin Alexandra Zuñiga Morales <kzunigam@unicauca.edu.co>
 */
public class CountryPackage implements IPackage{
    private String countryName;
    private List<IPackage> listCities = new ArrayList<>();

    /**
     * Parameterized builder
     * @param countryName 
     */
    public CountryPackage(String countryName) {
        this.countryName = countryName;
    }

    /**
     * setCountryName
     * @param countryName 
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    /**
     * setListCities
     * @param listCities 
     */
    public void setListCities(List<IPackage> listCities) {
        this.listCities = listCities;
    }
    
    @Override
    public double getPrice() {
        double totalPrice = 0;
        for(IPackage list:listCities){
            totalPrice += list.getPrice();
        }
        return totalPrice;
    }
    
    @Override
    public List<IPackage> getPacks() {
        return listCities;
    }

    @Override
    public String getDetails() {
        String details;
        int i = 1;
        details = "\t";
        details += "--Ciudades--\n";
        //Tour through the list of cities
        for(IPackage list:listCities){
            details += "\tCiudad N°" + i + " : " +list.getName()+"\n";
            i++;
        }
        details += "\n";
        return details;
    }

    @Override
    public String getName() {
        return countryName;
    }

    @Override
    public String getTourDetails() {
        String tourDetail;
        int i = 1;
        tourDetail = "\t";
        //Tour through the list of cities
        for(IPackage list:listCities){
            tourDetail += "Ciudad N°" + i + " : " +list.getTourDetails()+"\n";
            i++;
        }
        tourDetail += "\n";
        return tourDetail;
    }
}
