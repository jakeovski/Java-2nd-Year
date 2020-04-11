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
public class MainTest {

    public static void main(String[] args) {

//        JobQueue test = new JobQueue();
//
//        test.addJob("manager", false);
//        test.addJob("second manager", false);
//
//        test.addJob("dovakin", true);
//        test.addJob("taskmaster", true);
//
//        System.out.println(test.toString());
//
//        test.nextJob();
//
//        System.out.println(test.toString());
//
//        test.nextJob();
//
//        System.out.println(test.toString());
//
//        test.nextJob();
//
//        System.out.println(test.toString());
        

         ReverseText test = new ReverseText();
         
         System.out.println(test.reverse1("Fear is the path to the dark side.\n" +
"Fear leads to anger.\n" +
"Anger leads to hate.\n" +
"Hate leads to suffering"));
         
         
         System.out.println(test.reverse2("No! Try not! Do or do not, there is no try."));
    }
    
}
