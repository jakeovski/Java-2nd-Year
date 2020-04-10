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
public class SLLNode <T> {
    
    protected T data;
    protected SLLNode next;
    
    protected SLLNode(T d, SLLNode n) {
        
        this.data = d;
        this.next = n;
    }
}
