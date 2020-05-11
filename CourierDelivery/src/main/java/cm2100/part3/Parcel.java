/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm2100.part3;

/**
 * This class models a parcel
 * @author K. Hui // Completed by Vladimir Bardadom 1807132
 */
public class Parcel {

    //---------------------------Field---------------------------------
    /**
     * Name of the recipient
     */
    private String recipient;
    /**
     * The address of the delivery
     */
    private String address;
    /**
     * The weight of the parcel in kg
     */
    private double weight;
    
    //---------------------------Constructor--------------------------
    
    /**
     * Constructor for creating Parcel object
     * @param r Recipient of the parcel
     * @param a Address of the delivery
     * @param w Weight of the parcel in kg
     */
    public Parcel(String r, String a, double w) {
        this.recipient = r;
        this.address = a;
        this.weight = w;
    }

    //---------------------------Getters------------------------------
    /**
     * Gets recipient's name
     * @return recipient String
     */
    public String getRecipient() {
        return recipient;
    }

    /**
     * Gets address of the delivery
     * @return address String
     */
    public String getAddress() {
        return address;
    }
    
    /**
     * Gets weight of the parcel
     * @return Weight of the parcel double 
     */
    public double getWeight() {
        return weight;
    }

    //----------------------------Setters--------------------------------
    
    /**
     * Sets recepients name
     * @param recipient New name of the recipient
     */
    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    /**
     * Sets address of the delivery
     * @param address New address for the delivery
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Sets weight of the parcel
     * @param weight New weight for the parcel
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    //---------------------------Other-----------------------------------
    
    /**
     * toString method
     * @return String representation of the Field
     */
    public String toString() {
        return "Parsel Info:\nRecepient: " + this.recipient + 
                "\nAddress: " + this.address + 
                "\nWeight: " + this.weight;
    }
    
    
} //end class
