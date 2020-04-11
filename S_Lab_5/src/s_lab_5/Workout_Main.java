/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s_lab_5;

/**
 *
 * @author Pierre
 */
public class Workout_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //My Queue class testing
        
//        MyQueue queue = new MyQueue();
//
//        queue.add("1");
//        queue.add("2");
//        queue.add("3");
//        queue.add("4");
//        //System.out.println(queue.getLength());
//        System.out.println(queue.toString());
//
//        queue.remove();
//        queue.remove();
//        System.out.println(queue.toString());
//        
//        queue.remove();
//        queue.remove();
//                System.out.println(queue.toString());
//        queue.remove();
//                System.out.println(queue.toString());

        //HashSet test
        
        MySet set = new MySet();
        
        MySet set2 = new MySet();
        
        set.set.add("1");
        set.set.add("2");
        set.set.add("3");
        set.set.add("4");
        
        set2.set.add("2");
        set2.set.add("3");
        set2.set.add("4");
        set2.set.add("5");
        
        //System.out.println(set.set.toString());
        //System.out.println(set2.set.toString());
        
        set.set.remove("4");
        set2.set.remove("5");
        
//        System.out.println(set.set.toString());
//        System.out.println(set2.set.toString());
        
        set.set.addAll(set2.set);
        System.out.println(set.set.toString());

    }

}
