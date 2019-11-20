/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author Pierre
 */
public abstract class Vehicle {
    
    private String registration;
    
    private String time;

    public Vehicle(String registration, String time) {
        this.registration = registration;
        this.time = time;
    }
    
    //-----------------Getter----------------------------

    public String getRegistration() {
        return registration;
    }

    public String getTime() {
        return time;
    }
    
    //-------------------Setter-----------------------

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public void setTime(String time) {
        this.time = time;
    }
    
    //-------------------Other methods-----------------
    
    public abstract double getFee();
    
    @Override public String toString() {
        return "Registration: " + registration + "\nTime : " + time + "\nFee: " + getFee();
    }
}
