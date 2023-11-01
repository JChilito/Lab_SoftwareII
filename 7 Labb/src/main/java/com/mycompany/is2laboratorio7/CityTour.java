package com.mycompany.is2laboratorio7;
/**
 * CityTour class
 * @author Jose David Chilito Cometa <jdchilito@unicauca.edu.co>
 * @author Katherin Alexandra Zuñiga Morales <kzunigam@unicauca.edu.co>
 */
public class CityTour {
    private int id;
    private String name;
    private String description;
    private String recommendation;
    private double duration;
    
    /**
     * Parameterized builder
     * @param id Tour identifier. 
     * @param name Tour name.
     * @param description Description of touristic importance.
     * @param recommendation Recommendations to the tourist.
     * @param duration Duration in hour of the tour.
     */
    public CityTour(int id, String name, String description, String recommendation, double duration) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.recommendation = recommendation;
        this.duration = duration;
    }

    /**
     * Get id
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Set id
     * @param id 
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Get name
     * @return name
     */
    public String getName() {
        return name;
    }
    
    /**
     * Set name
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Get description
     * @return description
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * Set description
     * @param description 
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * Get recommendation
     * @return recommendation
     */
    public String getRecommendation() {
        return recommendation;
    }
    
    /**
     * Set ecommendation
     * @param recommendation 
     */
    public void setRecommendation(String recommendation) {
        this.recommendation = recommendation;
    }

    /**
     * Get duration
     * @return duration
     */
    public double getDuration() {
        return duration;
    }

    /**
     * set Duration
     * @param duration 
     */
    public void setDuration(double duration) {
        this.duration = duration;
    } 
}
