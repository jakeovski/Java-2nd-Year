/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.ArrayList;

/**
 *
 * @author Pierre
 */
public class TollRecords {
    
    private ArrayList<Vehicle> list;

    public TollRecords() {
        list = new ArrayList<>();
    }
    
    //-----------------Getters------------------

    public ArrayList<Vehicle> getVehicle() {
        return list;
    }
    
    //---------------Setters---------------------

    public void setVehicle(ArrayList<Vehicle> vehicle) {
        this.list = vehicle;
    }
    
    
    //--------------Others=-----------------------
    
    public void addVehicle(Vehicle vehicle) {
        list.add(vehicle);
    }
    
    public void printAll() {
        for(Vehicle v : list) {
            System.out.println(v.toString());
        }
    }
    
    public double totalCost() {
        double total = 0;
        for (Vehicle v : list) {
            total += v.getFee();
        }
        return total;
    }
    
    public void HgvDet() {
        for(Vehicle v : list) {
            if (v instanceof HGV) {
                System.out.println(v.toString());
            }
        }
    }
    
    public void cars(){
        for (Vehicle v : list) {
            if (v instanceof Car) {
                System.out.println(v.toString());
            }
        }
    }
    
    
}
