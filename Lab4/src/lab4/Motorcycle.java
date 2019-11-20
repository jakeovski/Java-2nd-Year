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
public class Motorcycle extends Vehicle {

   
    public Motorcycle(String registration, String time) {
        super(registration, time);
    }
    
    //-----------------Others---------------------
    
    public double getFee() {
        return 1.00;
    }
    
    @Override public String toString() {
        return "Motorcycle: \n" + super.toString();
    }   
}
