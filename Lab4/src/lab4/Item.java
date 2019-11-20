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
public class Item {
    
    
    private String description;
    
    private double cost;
    
    private int num;

    public Item(String description, double cost, int num) {
        this.description = description;
        this.cost = cost;
        this.num = num;
    }

    //-----------Getter----------------
    public String getDescription() {
        return description;
    }

    public double getCost() {
        return cost;
    }

    public int getNum() {
        return num;
    }
    
    //----------Setter---------------

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    
    //----------------Other----------
    
    public double calcCost() {
        return cost * num;
    }
    
    
    public String toString() {
        return "Item: " + getDescription() + "\nCost per unit: " + getCost() + "\nNumber of items on sale: " + getNum();
    }
}
