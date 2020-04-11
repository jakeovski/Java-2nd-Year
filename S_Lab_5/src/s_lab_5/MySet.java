/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s_lab_5;

import java.util.HashSet;

/**
 *
 * @author Pierre
 */
public class MySet<T> extends HashSet<T> {

    protected HashSet<T> set;

    //Constructor for the MySet class
    public MySet() {
        this.set = new HashSet();
    }

    /**
     * Return the number of items in the set
     * @return 
     */
    public int getCardinality() {
        return set.size();
    }
    
    /**
     * Checks if the set is Empty or not
     * @return true/false
     */
    public boolean isEmpty() {
        return this.set.isEmpty();
    }
    
    /**
     * Performs a uinion of 2 hashsets
     * @param B Second HashSet
     * @return new HashSet
     */
    public HashSet<T> union(HashSet<T> B) {
        this.set.addAll(B);
        return set;
    }
    
    /**
     * Performs an intersection of two hashsets
     * @param B Second HashSet 
     * @return new HashSet
     */
    public HashSet<T> intersect(HashSet<T> B) {
        this.set.retainAll(B);
        return this.set;
    }
    
    /**
     * Performs a difference operation on two HashSets 
     * @param B Second HashSet
     * @return new HashSet
     */
    public HashSet<T> difference(HashSet<T> B) {
        this.set.removeAll(B);
        return this.set;
    }
}
