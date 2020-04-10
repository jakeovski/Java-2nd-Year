/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_3;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Pierre
 */
public class QuickSort {
       
    int arraySize = 1000;
    
    int rangeOfNumbers = 100;
        
    private final Integer[] input1 = (Integer[]) ArrayUtil.randomIntArray(arraySize, rangeOfNumbers);
    
    Integer[] testInput = input1.clone();
    
    private final Integer low = 0;
    
    private final Integer high = input1.length-1;
    
    private Integer[] result = new Integer[input1.length];
    
    
    public QuickSort() {

        run();
    }
    
    public final void run() {
        result = quickSort(testInput, low, high);
      }
    
    
    private void printResult() {
        
        System.out.print("First Array = ");
        for (Integer input1_ : input1) {
            System.out.print("\t" + input1_);
        }
        System.out.print("\n");

        System.out.print("Result = ");
        for (Integer result_ : result) {
            System.out.print("\t" + result_);
        }
        System.out.print("\n");
    }
    
    public static <T extends Comparable> int partition(T[] a, int L, int H) {
        
        T pivot = a[L];
        int p = L;
        for (int i = L+1; i <= H; i++) {
            MainApp.nCompares++;
            int comp = a[i].compareTo(pivot);
            MainApp.nCompares++;
            if(comp < 0) {
                a[p] = a[i];
                a[i] = a[p+1];
                a[p+1] = pivot;
                p++;
                MainApp.nAssigns += 3;
            }
        }
        return p;
    }
    public static <T extends Comparable> T[] quickSort(T[] a, int low, int high) {
        MainApp.nCompares++;
        if (low < high) {
            int p = partition(a,low,high);
            quickSort(a,low,p);
            quickSort(a,p+1,high);
            MainApp.nRecursive += 2;
        }
        return a.clone();
    }
}
