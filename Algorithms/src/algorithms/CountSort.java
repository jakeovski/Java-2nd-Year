/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

/**
 * countSort algorithm class
 * @author Vladimir Bardadom 1807132
 */
public class CountSort {

    public static void countSort(Integer[] a) {

        int copies = a.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        //For loop for finding max and min values
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
            if (a[i] > max) {
                max = a[i];
            }
        }
        //create an array to store frequencies for array elements
        //and store count for each character
        int[] frequencies = new int[max - min + 1];
        for (int i = 0; i < a.length; i++) {
            frequencies[a[i] - min]++;
        }
        int outPos = 0;
        //generate output array using frequencies (sorted from min to high)
        //of course the range of values fall in [min; max]
        for (int i = 0; i < frequencies.length; i++) {
            for (int j = 0; j < frequencies[i]; j++) {
                a[outPos++] = i + min;
            }
        }
    }

}
