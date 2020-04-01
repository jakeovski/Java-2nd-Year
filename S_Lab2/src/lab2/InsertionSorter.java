package lab2;

/**
 * sorts an array using the insertion sort algorithm Q5
 */
public class InsertionSorter {

    /**
     * Sorts an array, using insertion sort.
     * Algorithm taken from from Big Java
     * @param a the array to sort
     */
    public static void sort(Comparable[] a) {
        
        for (int i = 0; i < a.length; i++) {
            Comparable next = a[i];
            int j = i;
            while(j > 0 &&  next.compareTo(a[j-1]) < 0){
                a[j] = a[j-1];
                j--;
            }
            a[j] = next;
        }
    }
}



