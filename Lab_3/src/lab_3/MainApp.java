/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_3;

import java.util.Arrays;

/**
 *
 * @author Pierre
 */
public class MainApp {

    /**
     * @param args the command line arguments
     */
    public static int nCompares;
    public static int nAssigns;
    public static int nRecursive;
    public static int numOfReps = 100;

    public static void main(String[] args) {
        // TODO code application logic here

        MainApp.nCompares = 0;
        MainApp.nAssigns = 0;
        MainApp.nRecursive = 0;
        /*
        for (int i = 0; i < numOfReps; i++) {
            QuickSort quickSort = new QuickSort();
        }
        System.out.println("Number of Comparisons: " + 1.0 * MainApp.nCompares / MainApp.numOfReps
                + " Number of Copies: " + 1.0 * MainApp.nAssigns / MainApp.numOfReps
                + " Number of Recursive calls: " + 1.0 * MainApp.nRecursive / MainApp.numOfReps);
        **/
        //System.out.println(nonRecFactorial(5));
        //System.out.println("Number of recursive calls: " + nRecursive);

        /**
         * System.out.println(maximumValue(arr,0,arr.length-1));
         * System.out.println("Number of Reccursive calls: " +
         * MainApp.nRecursive);
        *
         */
        //System.out.println(GCD(36,48));
        //System.out.println(mystery(4));

        int arr[] = { 2, 3, 4, 10, 40 }; 
        int n = arr.length; 
        int x = 40; 
        int result = binarySearch(arr, 0, n - 1, x); 
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at index " + result);  
    }

    //Task 1 Factorial Algorithm
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            MainApp.nRecursive++;
            int f = factorial(n - 1);
            return n * f;
        }
    }
    //Task 1.1 Non recursive Factorial Algorithm

    public static int nonRecFactorial(int n) {
        int f = 1;
        if (n == 0) {
            return 1;
        } else {
            for (int i = 1; i <= n; i++) {
                f *= i;
            }
            return f;
        }
    }

    //Task 2 : Maximum Value
    public static int maximumValue(Integer[] arr, int a, int b) {
        if (a == b) {
            return arr[a];
        } else {
            MainApp.nRecursive++;
            int max = maximumValue(arr, a + 1, b);
            if (arr[a] >= max) {
                return arr[a];
            } else {
                return max;
            }
        }
    }

    //Task 3:  Naibolshij Obshij Delitel
    public static int GCD(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return GCD(y, x % y);
        }
    }

    // Task 4: Mystery Method
    public static int mystery(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return mystery(n - 1) + n * n;
        }
    }

    //Task 5: Recursive Binary Search
    public static int binarySearch(int arr[], int l, int r, int x) 
    { 
        if (r >= l) { 
            int mid = l + (r - l) / 2; 
  
            // If the element is present at the 
            // middle itself 
            if (arr[mid] == x) 
                return mid; 
  
            // If element is smaller than mid, then 
            // it can only be present in left subarray 
            if (arr[mid] > x) 
                return binarySearch(arr, l, mid - 1, x); 
  
            // Else the element can only be present 
            // in right subarray 
            return binarySearch(arr, mid + 1, r, x); 
        } 
  
        // We reach here when element is not present 
        // in array 
        return -1; 
    } 
    
    
}
