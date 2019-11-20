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
public class DiscountedItem extends Item{
    
    
    private int minNum;
    
    private double discount;

    public DiscountedItem(int minNum, double discount, String description, double cost, int num) {
        super(description, cost, num);
        this.minNum = minNum;
        this.discount = discount;
    }
    
    
    //-------------------Getter---------------

    public int getMinNum() {
        return minNum;
    }

    public double getDiscount() {
        return discount;
    }
    
    
    //-----------------Setter------------------

    public void setMinNum(int minNum) {
        this.minNum = minNum;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
    
    //----------------Other-------------------
    
    @Override public double calcCost() {
        double cost = super.calcCost();
        double finalDisc = 0;
        int numberGettingDiscount = super.getNum() - this.getMinNum() + 1;
        if (numberGettingDiscount > 0) {
            finalDisc = numberGettingDiscount * this.getCost() * this.getDiscount();
        }
        return finalDisc;
    }
    
    @Override public String toString() {
        String message = super.toString();
        if(this.getNum()>= this.getMinNum()) 
            message += " after discount " ;
        return message;
    }
}

