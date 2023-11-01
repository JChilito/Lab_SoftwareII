package com.mycompany.is2laboratorio7;

import java.util.Date;
import java.util.List;

/**
 * Leaf class of the composite pattern
 * @author Jose David Chilito Cometa <jdchilito@unicauca.edu.co>
 * @author Katherin Alexandra Zuñiga Morales <kzunigam@unicauca.edu.co>
 */
public class CityPackage implements IPackage{
    private String cityName;
    private String arrivalFlight;
    private String hotel;
    private CityTour tour;
    private String foodPlan;
    private double price;
    private Date checkIn;
    private Date checkOut;

    /**
     * Parameterized builder
     * @param nameCity City name
     * @param arrivalFlight Arrival flight to the city
     * @param hotel Place to stay
     * @param tour Tour to a special place
     * @param foodPlan Package meal plan
     * @param price Value to be paid
     * @param checkIn Date of arrival 
     * @param checkOut Departure date
     */
    public CityPackage(String nameCity, String arrivalFlight, String hotel, CityTour tour, String foodPlan, double price, Date checkIn, Date checkOut) {
        this.cityName = nameCity;
        this.arrivalFlight = arrivalFlight;
        this.hotel = hotel;
        this.tour = tour;
        this.foodPlan = foodPlan;
        this.price = price;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    /**
     * setCityName
     * @param cityName 
     */
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    /**
     * getCheckIn
     * @return checkIn
     */
    public Date getCheckIn() {
        return checkIn;
    }

    /**
     * setCheckIn
     * @param checkIn 
     */
    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    /**
     * getCheckOut
     * @return checkOut
     */
    public Date getCheckOut() {
        return checkOut;
    }

    /**
     * setCheckOut
     * @param checkOut 
     */
    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

    /**
     * getArrivalFlight
     * @return arrivalFlight
     */
    public String getArrivalFlight() {
        return arrivalFlight;
    }

    /**
     * setArrivalFlight
     * @param arrivalFlight 
     */
    public void setArrivalFlight(String arrivalFlight) {
        this.arrivalFlight = arrivalFlight;
    }

    /**
     * getHotel
     * @return hotel
     */
    public String getHotel() {
        return hotel;
    }

    /**
     * setHotel
     * @param hotel 
     */
    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    /**
     * getTour
     * @return tour
     */
    public CityTour getTour() {
        return tour;
    }

    /**
     * setTour
     * @param tour 
     */
    public void setTour(CityTour tour) {
        this.tour = tour;
    }

    /**
     * getFoodPlan
     * @return foodPlan
     */
    public String getFoodPlan() {
        return foodPlan;
    }

    /**
     * setFoodPlan
     * @param foodPlan 
     */
    public void setFoodPlan(String foodPlan) {
        this.foodPlan = foodPlan;
    }
    
    /**
     * setPrice
     * @param price 
     */
    public void setPrice(double price){
        this.price = price;
    }
    
    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDetails() {
        String details = "Ciudad: " + cityName;
        return details;
    }
    
    @Override
    public List<IPackage> getPacks() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getName() {
        return cityName;
    }

    @Override
    public String getTourDetails() {
        String tourDetails = tour.getName()+"\n\t Descripcion: "+tour.getDescription()+"\n\t Recomendacion: "+tour.getRecommendation()+"\n\t Duracion: "+tour.getDuration()+"h\n";
        return tourDetails;
    }
}
