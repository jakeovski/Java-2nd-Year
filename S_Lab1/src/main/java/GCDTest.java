/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author 1807132
 */
public class GCDTest {
    
    
    public static void main(String[] args) {
        
        //System.out.println(gcd(77,21));
        //System.out. println(gcdVerbose(77,21));
        System.out.println(gcdLong(1234567890987654321L,987654321012345678L));
    }
    
    public static int gcd(int m, int n) {
        int p = m;
        int q = n;
        while (p % q != 0) {
            int r = p % q;
            p = q;
            q = r;
        }
        return q;
    }
    
    public static int gcdVerbose(int m, int n) {
        int p = m;
        int q = n;
        while (p % q != 0) {
            int r = p % q;
            System.out.println("p = " + p + " q = " + q + " r = p%q = " + r);
            p = q;
            q = r;
        }
        System.out.println("p = " + p + " q = " + q + " r = p%q = " + p % q);
        return q;
    }
    public static long gcdLong (long m, long n) {
        long p = m;
        long q = n;
        while (p % q != 0) {
            long r = p % q;
            System.out.println("p = " + p + " q = " + q + " r = p%q = " + r);
            p = q;
            q = r;
        }
        System.out.println("p = " + p + " q = " + q + " r = p%q = " + p % q);
        return q;
    }
}
