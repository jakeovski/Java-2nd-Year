/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s_lab_5;

/**
 *
 * @author Pierre
 */
public class Job {
    //-------------------Field
    /**'
     * Description
     */
    private final String description;
    
    //---------------------------Constructor
    /**
     * Default constructor
     * @param d Job description
     */
    public Job(String d) {
        this.description = d;
    }
    
    //---------------------------------Getter
    /**
     * Gets the Job decription
     * @return String
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * toString method
     * @return String
     */
    @Override
    public String toString(){
        return this.description;
    }
}
