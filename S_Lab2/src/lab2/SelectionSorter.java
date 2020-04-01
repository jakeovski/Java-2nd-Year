package lab2;

/**
 * The sort method of this class sorts an array, using the selection sort
 * algorithm.
 */
public class SelectionSorter {

    /**
     * Sorts an array, using selection sort.
     *
     * @param a the array to sort
     */
    public static void sort(Comparable[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int minPos = minimumPosition(a, i);
            swap(a, minPos, i);
        }
    }

    /**
     * Finds the smallest element in a tail range of the array.
     *
     * @param a the array to sort
     * @param from the first position in a to compare
     * @return the position of the smallest element in the range a[from] . . .
     * a[a.length - 1]
     */
    private static int minimumPosition(Comparable[] a, int from) {
        int minPos = from;
        for (int i = from + 1; i < a.length; i++) {
            if (a[i].compareTo(a[minPos]) < 0) {
                MainApp.nCompares++;
                minPos = i;
            }
        }
        return minPos;
    }
    
        /**
     * Swaps two entries of an array.
     * @param a the array
     * @param i the first position to swap
     * @param j the second position to swap
     */
    public static void swap(Comparable[] a, int i, int j) {
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        MainApp.nAssigns += 2;
    }
}
