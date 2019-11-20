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
public class Account {
    
    private String name;
    
    private double balance;
    
    //---------------Constructor------------

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
    
    //----------------Getter-----------------

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }
    
    //----------------Setter------------------

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    //------------------Other-----------------
    
    public String toString() {
        return this.getName() + " has " + this.getBalance();
    }
}
