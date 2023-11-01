package com.mycompany.is2laboratorio7;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite class
 * @author Jose David Chilito Cometa <jdchilito@unicauca.edu.co>
 * @author Katherin Alexandra Zuñiga Morales <kzunigam@unicauca.edu.co>
 */
public class ContinentPackage implements IPackage{
    private String continentName;
    private List<IPackage> countryList = new ArrayList<>();

    /**
     * Parameterized builder
     * @param continentName Name of the Continent
     */
    public ContinentPackage(String continentName) {
        this.continentName = continentName;
    }

    /**
     * setContinentName
     * @param continentName 
     */
    public void setContinentName(String continentName) {
        this.continentName = continentName;
    }

    /**
     * setCountryList
     * @param countryList 
     */
    public void setCountryList(List<IPackage> countryList) {
        this.countryList = countryList;
    }

    @Override
    public double getPrice() {
        double totalPrice = 0;
        for(IPackage list:countryList){
            totalPrice += list.getPrice();
        }
        return totalPrice;
    }

    @Override
    public String getDetails() {
        String details;
        int i = 1;
        details = "Continente: "+continentName+"\n";
        //System.out.println("Continente: "+continentName);
        details += "--Paises--\n";
        //System.out.println("--Paises--");
        //Tour through the list of countrys
        for(IPackage list:countryList){
            details += "\tPais N°" + i + " : " +list.getName() + "\n";
            //System.out.print("Pais N°"+i+":");
            details += list.getDetails();
            i++;
        }
        details += "Precio total: $"+this.getPrice();
        //System.out.println("Precio total: $"+this.getPrice());
        return details;
    }

    @Override
    public List<IPackage> getPacks() {
        return this.countryList;
    }

    @Override
    public String getName() {
        return continentName;
    }

    @Override
    public String getTourDetails() {
        String tourDetail;
        int i = 1;
        tourDetail = "Continente: "+continentName+"\n";
        //System.out.println("Continente: "+continentName);
        tourDetail += "--Paises--\n";
        //System.out.println("--Paises--");
        //Tour through the list of countrys
        for(IPackage list:countryList){
            tourDetail += "\tPais N°" + i + " : " +list.getName() + "\n";
            //System.out.print("Pais N°"+i+":");
            tourDetail += list.getTourDetails();
            i++;
        }
        //System.out.println("Precio total: $"+this.getPrice());
        return tourDetail;
    }
}
