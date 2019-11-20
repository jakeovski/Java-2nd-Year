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
public class Circle extends Point {
    
    private double radius;

    
    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, int xCoordinate, int yCoordinate) {
        super(xCoordinate, yCoordinate);
        this.radius = radius;
    }

    //------------------------Getter------------------------

    public double getRadius() {
        return radius;
    }
    
    //----------------------Setter-------------------------

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    //----------------------Others------------------------
    
    @Override public String toString() {
        return "Radius " + super.toString() + " with radius " + radius + " cm";
    }
    
    public String calculate() {
        double area = 0;
        double circ = 0;
        area = Math.PI * radius * radius;
        circ = 2 * Math.PI * radius;
        return "Area of the circle : " + area + "\nCircumference of the circle: " + circ;
    }
    
    
    
    
}
