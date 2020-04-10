/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s_lab4;

/**
 * Class for testing of the second part of the Lab
 *
 * @author Pierre
 */
public class StackTest {

    //Main method
    public static void main(String[] args) {
        //Array Stack
        /*
        //Creating arrayStack of 3 items;
        ArrayStack stack = new ArrayStack(3);

        stack.push("1");
        //Tests
        System.out.println(stack.toString());
        System.out.println("Number of stacks: " + stack.getStack());
        System.out.println("Last element: " + stack.peek());
        
        stack.push("2");
        System.out.println(stack.toString());
        System.out.println("Number of stacks: " + stack.getStack());
        System.out.println("Last element: " + stack.peek());
        
        stack.push("3");
        System.out.println(stack.toString());
        System.out.println("Number of stacks: " + stack.getStack());
        System.out.println("Last element: " + stack.peek());
        
        stack.push("4");
        System.out.println(stack.toString());
        System.out.println("Number of stacks: " + stack.getStack());
        System.out.println("Last element: " + stack.peek());
        
        stack.pull("3");
        System.out.println(stack.toString());
        System.out.println("Number of stacks: " + stack.getStack());
        System.out.println("Last element: " + stack.peek());

        */
        
        
        //SLL Stack
        SLLStack stack = new SLLStack();
        
        //System.out.println(stack.getSize());
        //System.out.println(stack.toString());
        
        
        stack.push("1");
        stack.push("2");
        System.out.println("Size is: " + stack.getSize());
        stack.toString(stack.getFirst());
        
        stack.pull();
        
        System.out.println("Size is: " + stack.getSize());
        stack.toString(stack.getFirst());
        
        
    }
    
    
    
}
