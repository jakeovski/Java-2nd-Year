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
public class VatItem extends Item {
    
    private double vat;

    public VatItem(double vat, String description, double cost, int num) {
        super(description, cost, num);
        this.vat = vat;
    }
    
    //------------Getter---------------

    public double getVat() {
        return vat;
    }
    
    //----------Setter------------------

    public void setVat(double vat) {
        this.vat = vat;
    }
    
    
    //------------Other--------------------
    
    @Override public double calcCost() {
        return super.calcCost() * this.getVat();
    }
    
    @Override public String toString() {
        int intVat = (int)(this.getVat() * 100);
        return super.toString() + "\nVAT applied is " + intVat + "%";
    }
}
