/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Pierre
 */
public class Cylinder extends Circle {
    
    private double height;

    
    
    public Cylinder(double height, double radius) {
        super(radius);
        this.height = height;
    }

    
    
    public Cylinder(double height, double radius, int xCoordinate, int yCoordinate) {
        super(radius, xCoordinate, yCoordinate);
        this.height = height;
    }
    
    
    //------------------Getter----------------------

    public double getHeight() {
        return height;
    }
    
    //------------------Setter---------------------

    public void setHeight(double height) {
        this.height = height;
    }
    
   //-----------------Others------------------------
    
    @Override public String toString() {
        return super.toString() + " height " + height + " cm";
    }
    
    @Override public String calculate() {
        double volume = Math.PI * super.getRadius() * super.getRadius() * height;
        double surface = 2 * Math.PI * super.getRadius() * (super.getRadius() + height);
        
        return super.calculate() + "\nVolume: " + volume + "\nSurface area: " + surface;
    }
}
