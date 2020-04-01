package lab2;
/**
 * A class for executing linear searches in an array for Q2
 */
public class LinearSearcher {

    /**
     * Finds a value in an array, using the linear search algorithm.
     *
     * @param a the array to search
     * @param value the value to find
     * @param low the lower index of the sub-array to search from
     * @param high the upper index of the sub-array to search to
     * @return the index at which the value occurs, or -1 if it does not occur
     * in the array
     */
    public static int search(Comparable[] a, int low, int high, int value) {
        for (int i = low; i <= high; i++) {
            
            if (a[i].equals(value)) {
                return i;
            }
            
            MainApp.nCompares++;
        }
        return -1;
    }
}

