package lab2;

/**
 * A class for executing binary searches in an array for Q3
 */
public class BinarySearcher {

    /**
     * Finds a value in a range of a sorted array, using the binary search
     * algorithm.
     *
     * @param a the array in which to search
     * @param low the lower index of the sub-array to search from
     * @param high the upper index of the sub-array to search to
     * @param value the value to find
     * @return the index at which the value occurs, or -1 if it does not occur
     * in the array
     */
    public static int search(Comparable[] a, int low, int high, int value) {
        int L = low, H = high;
        while (L <= H) { 
            int mid = (L + H) / 2;
            
            MainApp.nCompares++;
            if (a[mid].equals(value)) {
                return mid;
            } else if (a[mid].compareTo(value) < 0) {
                L = mid + 1;
                MainApp.nCompares++;
            } else {
                H = mid - 1;
                MainApp.nCompares++;
            }
        } 
        return -1;
    }
}
