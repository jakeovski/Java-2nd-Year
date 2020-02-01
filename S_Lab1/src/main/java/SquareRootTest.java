/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pierre
 */
public class SquareRootTest {
    
    public static void main(String[] args) {
        
        //System.out.println(sqrt(9));
        //System.out.println(Math.sqrt(9));
        System.out.println(sqrtVisual(9));
    }
    
    public static double sqrt (double a) {
        double r = (1.0 + a)/2;
        while (Math.abs(r * r/a - 1.0) >= 0.00005){
            r = (r + a/r)/2;
        }
        return r;
    }
    
    public static double sqrtVisual(double a) {
        double r = (1.0 + a)/2;
        while (Math.abs(r * r/a - 1.0) >= 0.00005) {
            System.out.println("a = " + a + " r = " + r);
            r = (r + a/r)/2;
        }
        return r;
    }
    
}

