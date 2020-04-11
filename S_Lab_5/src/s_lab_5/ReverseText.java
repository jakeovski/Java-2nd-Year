package s_lab_5;


import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pierre
 */
public class ReverseText {
    //-----------Field----------------------
    /**
     * Stack
     */
    private Deque<String> stack;
    
    /**
     * Constructor
     */
    public ReverseText() {
        this.stack = new ArrayDeque<String>();
    }
    
    //-----------------------Methods=----------------------
    /**
     * Reverses the text given version  1
     * @param s
     * @return 
     */
    public String reverse1(String s) {
        String[] a = s.split("\\n");
        String output = "";
        for (int i = a.length -1; i >= 0; i--) {
            output += a[i] + "\n";
        }
        return output;
    }
    
    /**
     * Reverse the text given in the parameter
     * @param s
     * @return 
     */
    public String reverse2(String s) {
        String[] a = s.split("\\s");
        String output = "";
        for (int i = a.length - 1; i >= 0; i--){
            output += a[i] + " ";
        }
        return output;
    }
    
}
