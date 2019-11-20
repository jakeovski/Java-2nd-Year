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
public class Bus extends Vehicle{
    
    private int capacity;

    public Bus(int capacity, String registration, String time) {
        super(registration, time);
        this.capacity = capacity;
    }

    
    
    //-----------------------Getter---------------

    public int getCapacity() {
        return capacity;
    }
    
    //-------------------Setter-----------------

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
    //---------------Others--------------------
    
    public double getFee() {
       if (capacity <= 20) {
           return 5;
       } 
       else {
           return 10;
       }
    }
    
    @Override public String toString() {
        return "Bus: \n" + super.toString();
    }
    
}
