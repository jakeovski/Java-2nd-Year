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
public class HGV extends Vehicle{
    
    private double weight;

    public HGV(double weight, String registration, String time) {
        super(registration, time);
        this.weight = weight;
    }
    
    //---------------------Getter----------------------

    public double getWeight() {
        return weight;
    }
    
    //-------------------Setter----------------------

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    //-------------------Other-----------------------
    
    public double getFee() {
        if (weight <= 3) {
            return 5;
        }
        else if (weight > 3 && weight < 10) {
            return 10;
        }
        else {
            return 25;
        }
    }
    
    @Override public String toString() {
        return "HGV: \n" + super.toString();
    }
}
