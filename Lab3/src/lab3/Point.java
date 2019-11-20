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
public class Point {
    
    private int xCoordinate;
    
    private int yCoordinate;
    
    public Point() {
        xCoordinate = 0;
        yCoordinate = 0;
    }

    public Point(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }
    
    //------------------Getter--------------------------

    public int getxCoordinate() {
        return xCoordinate;
    }

    public int getyCoordinate() {
        return yCoordinate;
    }
    
    
    //------------------Setter-----------------------

    public void setxCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public void setyCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }
    
    
    //-------------Others---------------------------

    public String toString() {
        return "Coordinates: {" + xCoordinate + ";" + yCoordinate + "}";
    }
    
    public boolean isEqualTo(Point point2) {
        if (xCoordinate == point2.getxCoordinate()) {
            if (yCoordinate == point2.getyCoordinate()) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }
    
    
}
