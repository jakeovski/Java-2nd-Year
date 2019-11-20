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
public class SalesOrder {
    
    private ArrayList<Item> items;
    
    private int totalItemsSold;

    
    public SalesOrder(int totalItemsSold) {
        this.totalItemsSold = totalItemsSold;
        this.items = new ArrayList<>();
    }
    
    
    //---------------Getter----------------------

    public ArrayList<Item> getItems() {
        return items;
    }

    public int getTotalItemsSold() {
        return totalItemsSold;
    }
    
    //--------------Setter-----------------------

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public void setTotalItemsSold(int totalItemsSold) {
        this.totalItemsSold = totalItemsSold;
    }
    
    
    //-------------------Other---------------------
    

}
