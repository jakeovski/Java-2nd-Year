/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm2100.part3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * This class facilitates assignment of parcel and driver data
 * and associates a queue of parcels with delivery drivers
 * @author K. Hui // Modified by Vladimir Bardadom 1807132
 */
public class DeliveryManager {
    
    //--------------------------Field----------------------------
    /**
     * List of parcels
     */
    private LinkedList<Parcel> parcels;
    
    /**
     * List of drivers
     */
    private ArrayList<Driver> drivers;
    
    /**
     * Map of Parcel-Driver pairs
     */
    private HashMap<Parcel,Driver> deliveries;
    
    /**
     * Map of drivers and List of Parcels the selected drivers have been assigned to
     */
    private HashMap<Driver, ArrayList<Parcel>> loads;
    
    /**
     * Constructor for DeliveryManager object
     */
    public DeliveryManager() {
        this.parcels = new LinkedList<>();
        this.drivers = new ArrayList<>();
        this.deliveries = new HashMap<>();
        this.loads = new HashMap<>();
    }
    
    //--------------------------------Other--------------------------------
    

    /**
     * Adds driver into the list of drivers
     * Adds entry of the driver to the loads Map
     * @param d Driver to be added
     */
    public void addDriver(Driver d ) {
        this.drivers.add(d);
        this.loads.put(d, new ArrayList<>());
    }
    
 
    /**
     * Adds a new parcel to the end of the parcel queue
     * @param p Parcel to be added
     */
    public void addParcel(Parcel p ) {
        this.parcels.addLast(p);
    }
    
    /**
     * Adds a new parcel in the front of the parcel queue
     * @param p Parcel to be added
     */
    public void addUrgentParcel(Parcel p) {
        this.parcels.addFirst(p);
    }
    
    /**
     * Removes the next parcel from the queue and returns it
     * @return Removed parcel
     */
    public Parcel nextParcel() {
        return this.parcels.removeFirst();
    }
    
    /**
     * toString method
     * @return Information in the field
     */
    @Override
    public String toString() {
        return "Parcels to be delivered:\n" + 
                this.parcels.toString() +
                "\nDrivers available:\n" +
                this.drivers.toString() + 
                "\nDeliveries: \n" +
                this.deliveries.toString();
    }
    
    /**
     * This method allocates parcels to the driver with the least workload
     * and upadates deliveries and loads maps
     */
    public void allocateParcels() {
        
        for (Parcel queue : parcels) {
            Collections.sort(drivers, drivers.get(0).new CompareDriverLoad());
            Driver nextDriver = drivers.get(0);
            deliveries.put(queue, nextDriver);
            nextDriver.incrementNumberParcels();
            this.loads.get(nextDriver).add(queue);
        }
    }
    
    /**
     * Prints out all drivers in ascending order of their names with the list
     * of parcels they have been assigned to deliver
     */
    public void printByDriver() {
        drivers.stream().sorted().forEach(d -> System.out.println("------------\nDriver: \n" + d + "\nParcels: \n" + this.loads.get(d)));
    }
    
    /**
     * Prints out all parcels in ascending order of their delivery addresss 
     * with the driver who is assigned to the delivery
     */
    public void printByParcel() {
        parcels.stream().sorted((p1,p2) -> p1.getAddress().charAt(0) - p2.getAddress().charAt(0)).forEach(p -> System.out.println("-----------\nParcel: \n" + p + "\n" + this.deliveries.get(p)));
    }
    
}//end class
