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
public class Car extends Vehicle {
    
    private boolean taxi;

    public Car(boolean taxi, String registration, String time) {
        super(registration, time);
        this.taxi = taxi;
    }
    
    //----------------Getter--------------------

    public boolean isTaxi() {
        return taxi;
    }
    
    //---------------Setter--------------------

    public void setTaxi(boolean taxi) {
        this.taxi = taxi;
    }
    
    //----------------Other---------------------
    
    public double getFee() {
        if(taxi == true) {
            return 0;
        }
        else {
            return 2.5;
        }
    }
    
    @Override public String toString() {
        return "Car: \n" + super.toString();
    }
    
}
