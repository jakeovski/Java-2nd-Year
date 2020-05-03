/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import java.awt.EventQueue;
import java.util.Arrays;
import java.util.Random;

/**
 * Main class that does everything from testing algorithms to plotting graphs
 *
 * @author Vladimir Bardadom
 * @ID 1807132
 */
public class TestClass {

    //Number of comparisons made in CountSourt
    public static int nCompares;
    //Number of array variable changes made in CountSort
    public static int nAssigns;
    //Number of comparisons made in Bubble Sort
    public static int nCompares2;
    //Number of array variable changes made in BubbleSort
    public static int nAssigns2;
    //Additional Memory required
    public static int nSpace;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //----------------------------------------------------------------------
        //Testing
        //Count Sort
        /*
        Comparable[] a = ArrayUtil.randomIntArray(10, 10);
        System.out.println("Array Before sorting: " + Arrays.toString(a));
        CountSort.countSort((Integer[]) a);
        System.out.println("Array after sorting: " + Arrays.toString(a));
        */

        //Bubble Sort
        /*
        Comparable[] b = ArrayUtil.randomIntArray(10, 10);
        System.out.println("Array Before sorting: " + Arrays.toString(b));
        BubbleSort.bubbleSort((Integer[]) b);
        System.out.println("Array After sorting: " + Arrays.toString(b));
        */

        //----------------------------------------------------------------------
        //Plots a graph on the algorithm specified
        EventQueue.invokeLater(() -> {
            //Initialise Graph
            //For plotting countSort graph index is 0, for bubbleSort index in 1
            var ex = new Graph(complexityTest(), 0);
            //Set true
            ex.setVisible(true);
        });
    }

    /**
     * Determines complexity of given algorithms and stores they into arrays one
     * for CountSort, other for BubbleSort
     *
     * @return 2D Array of arrays: countSort, BubbleSort
     */
    public static double[][] complexityTest() {
        //Array of array sizes
        int[] arraySizes = new int[]{1, 10, 50, 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000, 1500};
        //Complexity array that will store algorithms complexity
        double[] countComplexity = new double[14];
        double[] bubbleComplexity = new double[14];

        //Number of repetitions
        int numOfReps = 1000;
        //For loop through arraysizes
        for (int s = 0; s < arraySizes.length; s++) {
            //Loop through number of repetitions
            nCompares = 0;
            nAssigns = 0;
            nCompares2 = 0;
            nAssigns2 = 0;
            nSpace = 0;
            for (int i = 0; i < numOfReps; i++) {
                //Count Sort
                Comparable[] a = ArrayUtil.randomIntArray(arraySizes[s], arraySizes[s]);
                CountSort.countSort((Integer[]) a);

                //Bubble Sort
                Comparable[] b = ArrayUtil.randomIntArray(arraySizes[s], arraySizes[s]);
                BubbleSort.bubbleSort((Integer[]) b);
            }
            //Getting average values and adding them to Count Sort complexity array
            double comp = 1.0 * TestClass.nCompares / numOfReps;
            double assign = 1.0 * TestClass.nAssigns / numOfReps;
            countComplexity[s] = comp + assign;

            //Getting the average values and adding them to Bubble Sort complexity array
            double comp2 = 1.0 * TestClass.nCompares2 / numOfReps;
            double assign2 = 1.0 * TestClass.nAssigns2 / numOfReps;
            double space = 1.0 * TestClass.nSpace / numOfReps;
            bubbleComplexity[s] = comp2 + assign2 + space;
        }
        //Outputting the result
        //System.out.println("Count Complexity array: " + Arrays.toString(countComplexity));
        //System.out.println("Bubble Complexity array: " + Arrays.toString(bubbleComplexity));
        double[][] result = new double[][]{countComplexity, bubbleComplexity};
        //System.out.println("Result: " + Arrays.toString(result[0]));
        //Results 2D
        return result;
    }

}
