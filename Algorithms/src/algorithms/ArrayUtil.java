package algorithms;

import java.util.Random;
/**
 * This class contains utility methods for array manipulation.
 */
public class ArrayUtil {
    /* will use the nextInt(n) method from the Java API Random class to
     * generate random numbers from withing a specified range from 0 to (n-1)*/
    private static Random generator = new Random(); 

    /**
     * Creates an array filled with objects storing random values.
     * @param length the length of the array
     * @param range the number of possible random values
     * @return an array filled with length numbers between 0 and n - 1
     */
    public static Comparable[] randomIntArray(int length, int range) {
        Comparable[] a = new Integer[length];
        for (int i = 0; i < a.length; i++) {
            a[i] = new Integer(generator.nextInt(range));
        }
        return a;
    }
}
