/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Pierre
 */
public class Contestant {
    
    /**
     * Name of the contestant
     */
    private String name;
    
    /**
     * Category they are in
     */
    private String category;
    
    /**
     * Number of votes they got
     */
    private int votes;

    /**
     * Constructor for the contestant
     * @param name Name of the contestant
     * @param category Category they are in
     * @param votes Number of votes they got
     */
    public Contestant(String name, String category, int votes) {
        this.name = name;
        this.category = category;
        this.votes = votes;
    }
    
    //---------------------------Getters--------------

    //Gets the name of the contestant
    public String getName() {
        return name;
    }

    //Gets the category contestant is in
    public String getCategory() {
        return category;
    }

    //Gets votes the contestant got
    public int getVotes() {
        return votes;
    }
    
    //------------------------Setters-----------------

    /**
     * Sets the name of the contestant
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the category contestant is in
     * @param category 
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * Sets the number of votes the contestant got
     * @param votes 
     */
    public void setVotes(int votes) {
        this.votes = votes;
    }
    
    //--------------------------Others----------------

    /**
     * toString method
     * @return Information in the fields
     */
    @Override
    public String toString() {
        return "Contestant{" + "name=" + name + ", category=" + category + ", votes=" + votes + '}';
    }
    
    
    
    
    
}
