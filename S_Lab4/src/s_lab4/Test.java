/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s_lab4;
import java.util.*;

/**
 *
 * @author Pierre
 */
public class Test {
    
    public static void main(String[] args) {
        
        
        LinkedList<String> movies = new LinkedList();
        
        
        movies.add("1");
        movies.add("2");
        movies.add("3");
        System.out.println(movies.toString());
        System.out.println(movies.getFirst());
        System.out.println(movies.getLast());
        System.out.println(movies.removeFirst());
        System.out.println(movies.removeLast());
        System.out.println(movies.toString());
        System.out.println(movies.size());
    }
}
