/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s_lab4;

import java.util.Arrays;

/**
 * Part II of the Lab_4
 *
 * @author Pierre
 */
public class ArrayStack {

    //An array of Objects that will be the stack in the future
    protected Object[] array;

    //Number of items currently in the stack
    protected int stackNum;

    /**
     * Constructor for ArrayStack
     *
     * @param i Size of the stack
     */
    public ArrayStack(int i) {

        this.array = new Object[i];
        this.stackNum = 0;
    }

    /**
     * toString method
     *
     * @return String rep of the array
     */
    public String toString() {
        return Arrays.toString(array);
    }

    /**
     * Gets number of items in the stack
     *
     * @return
     */
    public int getStack() {
        return this.stackNum;
    }

    /**
     * Pushes the new item in the end of the stack
     *
     * @param obj Object to be pushed
     */
    public void push(Object obj) {

        if (stackNum <= this.array.length - 1) {
            this.array[stackNum] = obj;
            stackNum++;
        } else {
            int length = this.array.length;
            Object[] newArray = new Object[length + 1];
            System.arraycopy(this.array, 0, newArray, 0, length);
            newArray[length] = obj;
            this.array = newArray;
            stackNum++;
        }
    }

    /**
     * Removes an element from the stack
     *
     * @param obj The object to be removed
     */
    public void pull(Object obj) {
        int length = this.array.length;
        Object[] newArray = new Object[length - 1];
        int count = 0;
        for (Object scroll : this.array) {
            if (scroll != obj) {
                newArray[count] = scroll;
                count++;
            }
        }
        this.array = newArray;
        this.stackNum--;
    }

    /**
     * Returns the last element of the stack
     *
     * @return Last element of the stack
     */
    public Object peek() {
        Object output = null;
        for (int i = 0; i <= this.array.length - 1; i++) {
            if (this.array[i] == null) {
                output = this.array[i - 1];
                break;
            }
            else {
                output = this.array[i];
            }
        }
        return output;
    }
}
