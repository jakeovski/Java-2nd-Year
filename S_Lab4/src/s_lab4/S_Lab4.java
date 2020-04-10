/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s_lab4;

import org.w3c.dom.Node;

/**
 * Main class for testing the first part of the Lab
 * @author Pierre
 */
public class S_Lab4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //------Task a------------//
        SLL example = new SLL();
        
        SLLNode c = new SLLNode("3", null);
        SLLNode b = new SLLNode("2", c);
        
        example.first = b;
        
        example.first  = new SLLNode("1",b);
        
        example.insert("0.5", null);
        example.insert("4", b);
        
        printFirstToLast(example);
        
        example.delete(c);
        
        printFirstToLast(example);
                
        
        System.out.println("Index of item: " +  example.search("0.5") + " is " + example.indexOf("0.5"));
        
        System.out.println("SLLNode at given index is " + example.getNode(0));
        
        example.insert2("10", "1");
        
        printFirstToLast(example);
    }
    
    
    public static void printFirstToLast(SLL n){
        for(SLLNode node = n.first; node != null; node= node.next) {
            System.out.println(node.data);
        }
    }
    
    
}
