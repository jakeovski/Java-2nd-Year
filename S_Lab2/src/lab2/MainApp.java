package lab2;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author DAVID
 */
public class MainApp {
    public static int nCompares; 
    public static int nAssigns;
    
    public static void main(String[] args) {
        /* un-comment a line at a time and run to observe what each method does */ 
        //linearSearchDemo();       
        //binarySearchDemo();
        //selectionSortDemo();      
        //timedSortDemo();
       
        //linearSearchExperiment();
        //binarySearchExperiment();
        selectionSortExperiment();
        
     }
    
    public static void linearSearchDemo() {
        int n = getIntFromUser("Enter array size (or 0 to exit): ");
        Comparable[] a = ArrayUtil.randomIntArray(n, n);
        int count = 0;
        System.out.println(Arrays.toString(a));
        Scanner in = new Scanner(System.in);

        boolean done = false;
        while (!done) {
            int num = getIntFromUser("Enter number to search for, -1 to quit: ");
            if (num == -1) {
                done = true;
            } else {
                count++;
                int pos = LinearSearcher.search(a, 0, a.length - 1, num);
                if(pos>=0)System.out.println(num + " Found in position " + pos + " Count:" + nCompares);
                else System.out.println(num + " Not found");
            }
        }
    }

    public static void binarySearchDemo() {
        int n = getIntFromUser("Enter array size (or 0 to exit): ");
        Comparable[] a = ArrayUtil.randomIntArray(n, n);
        System.out.println("Unsorted" + Arrays.toString(a));
        SelectionSorter.sort(a);  // Line A
        System.out.println("Sorted" + Arrays.toString(a)); // Line B
        Scanner in = new Scanner(System.in);
        int count = 0;

        boolean done = false;
        while (!done) {
            int num = getIntFromUser("Enter number to search for, -1 to quit: ");
            if (num == -1) {
                done = true;
            } else {
                count++;
                int pos = BinarySearcher.search(a, 0, a.length - 1, num);
                if(pos>=0)System.out.println(num + " Found in position " + pos + " Count:" +count);
                else System.out.println(num + " Not found");
            }
        }
    }
    
    public static void selectionSortDemo() {
        int n = getIntFromUser("Enter array size (or 0 to exit): ");
        Comparable[] a = ArrayUtil.randomIntArray(n, n);
        System.out.println(Arrays.toString(a));
        SelectionSorter.sort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void timedSortDemo() {
        int n;
        do {
            n = getIntFromUser("Enter array size (or 0 to exit): ");
            // Construct random array using a range that is enough to ensure that most values are distinct
            Comparable[] a = ArrayUtil.randomIntArray(n, n);

            // Use stopwatch class to time selection sort
            StopWatch timer = new StopWatch();
            timer.start();
            SelectionSorter.sort(a);
            timer.stop();

            System.out.println("Elapsed time: " + timer.getTimeInMilli()
                    + " milliseconds");
        }while (n != 0);
    }
    
    public static int getIntFromUser(String message){
        int arrayLength = 10;
        try{
            Scanner in = new Scanner(System.in);
            System.out.println(message);
            arrayLength = in.nextInt();
            //in.close();
        }
        catch(Exception e){System.out.println("Invalid input, returning 10 by default");}
        
        return arrayLength;
    }

 // Q2 counting computational cost of Linear Search
    public static void linearSearchExperiment() {
        MainApp.nCompares = 0;
        int numReps = 1000;
        int arraySize = 100000;
        int rangeOfNumbers = 200;
        for (int i = 0; i < numReps; i++) {
            Comparable[] a = ArrayUtil.randomIntArray(arraySize, rangeOfNumbers);
            int n = new Random().nextInt(rangeOfNumbers);
            int pos = LinearSearcher.search(a, 0, a.length - 1, n);
        }
        System.out.println("Array size = " + arraySize +
                " Range of random numbers used = " + rangeOfNumbers +
                " Average number of comparisons " + 1.0*MainApp.nCompares/numReps);
    }

    public static void binarySearchExperiment() {
        MainApp.nCompares = 0;
        int numOfReps = 1000;
        int arraySize = 1000;
        int rangeOfNumbers = 100;
        for (int i = 0; i < numOfReps; i++) {
            Comparable[] a = ArrayUtil.randomIntArray(arraySize, rangeOfNumbers);
            SelectionSorter.sort(a);
            int n = new Random().nextInt(rangeOfNumbers);
            int pos = BinarySearcher.search(a, 0, a.length - 1, n);
        }
        System.out.println("Array Size: " + arraySize +
                " Range of random numbers used: " + rangeOfNumbers + 
                " Average number of comparisons: " + 1.0*MainApp.nCompares/numOfReps);
    }
    
    public static void selectionSortExperiment() {
        MainApp.nCompares = 0;
        MainApp.nAssigns = 0;
        int numOfReps = 1000;
        int arraySize = 1000;
        int rangeOfNumbers = 100;
        for (int i = 0; i < numOfReps; i++) {
            Comparable[] a = ArrayUtil.randomIntArray(arraySize, rangeOfNumbers);
            SelectionSorter.sort(a);
        }
        System.out.println("Array Size: " + arraySize + 
                " Range of random numbers used: " + rangeOfNumbers + 
                " Average number of comparisons: " + 1.0*MainApp.nCompares/numOfReps +
                " Average number of copies: " + 1.0*MainApp.nAssigns/numOfReps);
    }
   
} // end of Main App

