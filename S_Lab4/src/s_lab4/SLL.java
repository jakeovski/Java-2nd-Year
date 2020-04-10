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
public class SLL {
    
    protected SLLNode first;
    
    
    public void insert(Object value, SLLNode after) {
        
        SLLNode inserted = new SLLNode(value,null);
        
        if(after == null ) {
            inserted.next = this.first;
            this.first = inserted;
        }
        else {
            inserted.next = after.next;
            after.next = inserted;
        }
    }
    
    //-----------Task c------------//
    public void delete(SLLNode del) {
        SLLNode succ = del.next;
        
        if (del == this.first) {
            this.first = succ;
        }
        else {
            SLLNode prev = this.first;
            while (prev.next != del) {
                prev = prev.next;
            }
            prev.next = succ;
        }
    }
    
    
    //------------Task d---------------------//
    
    public SLLNode search(Object target) {
        
        for (SLLNode n = this.first; n!= null; n = n.next) {
            
            if (target.equals(n.data)) {
                return n;
            }
        }
        
        return null;
    }
    
    //---------------Task e-----------------//
    
    public int indexOf(Object target) {
        
        int count = 0;
        for(SLLNode n = this.first; n != null; n = n.next) {
            
            if (target.equals(n.data)) {
                return count;
            }
            count++;
        }
        return -1;
    }
    
    //---------------Task f-----------------//
    
    public SLLNode getNode(int n) {
        
        int count = 0;
        for(SLLNode m = this.first; m != null; m = m.next) {
            
            if (n == count) {
                return m;
            }
            
            count++;
            
        }
        return null;
    }
    
    
    //--------------------Task g-----------------
    
    
    public void insert2(Object one, Object two) {
        SLLNode header = this.first;
        SLLNode inserted = this.search(two);
        
        if (inserted != null) {
            
            this.insert(one, inserted);
        }
        else {
            while (header != null) {
                header = header.next;
            }
            header.next = new SLLNode(one,null);
        }
    }  
}
