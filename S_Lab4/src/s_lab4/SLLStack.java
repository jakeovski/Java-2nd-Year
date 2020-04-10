/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s_lab4;

/**
 *
 * @author Pierre
 */
public class SLLStack {
    
    //Stachk variable
    protected SLL stack;
    
    //Constructor for the SLL Stack
    public SLLStack() {
        this.stack = new SLL();
    }
    
    public SLLNode getFirst() {
        return stack.first;
    }
    //Prints the elements from last to first
    public void toString(SLLNode header) { 
        if (header == null) {
            return;
        
        }
        System.out.println(header.data);
        toString(header.next);
  
    }
    
    //Gets the size of the stack
    public int getSize() {
        int count = 0;
        for (SLLNode n = this.stack.first; n != null; n = n.next) {
            count++;
        }
        return count;
    }
    
    //Push the node into the list
    public void push(Object obj) {
        if (this.stack.first == null) {
            this.stack.first = new SLLNode(obj, null);
        }
        else {
            SLLNode insert = new SLLNode(obj,null);
            insert.next = this.stack.first;
            this.stack.first = insert;
        }
    }
    
    public void pull() {
        
        SLLNode second = this.stack.first.next;
        SLLNode succ = second.next;
        
        this.stack.first = second;
    }
}
