/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s_lab_5;

import java.util.LinkedList;

/**
 *
 * @author Pierre
 */
public class MyQueue<T> {

    //---------------Field------------------
    /**
     * Linked list of objects
     */
    protected LinkedList<T> list;

    //--------------------------------------
    //--------------Constructor-------------
    /**
     * Constructor for the myQueue class
     */
    public MyQueue() {

        this.list = new LinkedList();
    }
    //--------------------------------------

    //------------Methods-------------------
    /**
     * Gets the length of the queue
     *
     * @return length of the queue
     */
    public int getLength() {
        return list.size();
    }

    /**
     * Checks if the lsit is empty or not
     *
     * @return true or flase
     */
    public boolean isEmpty() {
        return list.isEmpty();
    }

    /**
     * Adds element to the end of the queue
     *
     * @param item
     */
    public void add(T item) {
        list.addLast(item);
    }

    /**
     * Removes and returns the first item in the queue
     *
     * @return
     */
    public T remove() {
        if (!list.isEmpty()) {

            return list.remove();
        } else {
            return (T) "List is empty";
        }
    }

    /**
     * Peeks at the first element of the queue
     *
     * @return
     */
    public T peek() {
        return list.peek();
    }

    /**
     * toString method
     *
     * @return Return String reps of the field
     */
    @Override
    public String toString() {
        return list.toString();
    }

    /**
     * Number of items ahead of the specified item in the queue
     *
     * @param item
     * @return
     */
    public int isWaiting(T item) {
        int out;
        if (list.contains(item)) {
            out = list.indexOf(item);
            return out;
        } else {
            return -1;
        }
    }
}
