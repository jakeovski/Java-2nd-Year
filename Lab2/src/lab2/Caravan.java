/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 * A model that represents a Caravan
 * @author Pierre
 */
public class Caravan {
    /**
     * Location of the caravan
     */
    private String location;
    
    /**
     * Capacity of the caravan
     */
    private int capacity;
    
    /**
     * Either the caravan is occupied or not
     */
    private boolean occupied;
    
    /**
     * Cost per night of the caravan
     */
    private double costPerNight;

    /**
     * Constructor for the caravan class
     * @param location Location of the caravan
     * @param capacity Capactiy of the caravan
     * @param occupied If the caravan is occupied
     * @param costPerNight Cost per night of the caravan
     */
    public Caravan(String location, int capacity, boolean occupied, double costPerNight) {
        this.location = location;
        this.capacity = capacity;
        this.occupied = occupied;
        this.costPerNight = costPerNight;
    }
    
    //-------------------------Getters---------------------

    /**
     * Gets location of the caravan
     * @return Location
     */
    public String getLocation() {
        return location;
    }

    /**
     * Gets capacity of the caravan
     * @return Capacity of the caravan
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Shows whether caravan is occupied or not
     * @return true or false 
     */
    public boolean isOccupied() {
        return occupied;
    }

    /**
     * Gets cost per night
     * @return Cost per night 
     */
    public double getCostPerNight() {
        return costPerNight;
    }


    //---------------------Setters-----------------
    
    /**
     * Sets cost per night for the caravan
     * @param costPerNight Cost per night
     */
    public void setCostPerNight(double costPerNight) {
        this.costPerNight = costPerNight;
    }
    
    //-----------------------Other---------------------

    /**
     * toString method
     * @return Information in the field
     */
    @Override
    public String toString() {
        return "Caravan{" + "location=" + location + ", capacity=" + capacity + ", occupied=" + occupied + ", costPerNight=" + costPerNight + '}';
    }
    
    /**
     * Sets caravan to being empty
     */
    public void makeEmpty() {
        occupied = false;
}
    /**
     * Sets caravan to being full
     */
    public void makeFull() {
        occupied = true;
    }
}

