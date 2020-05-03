/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

/**
 * bubbleSort algorithm class
 * @author Vladimir Bardadom 1807132
 */
public class BubbleSort {

    public static void bubbleSort(Integer[] a) {
        Integer temp;
        TestClass.nSpace++;
        //ex: a = new Integer[]{6,4,3,9,7,10,2};
        //we go through array and swap elements. need to iterate through array
        // if 6 > 4, then 6 becomes 4 and 4 becomes 6
        //since we are comparing an element of the array with the one below it 
        //we need to ensure iteration< a.length-1 i.e. minus 1 of the length of the array
        for (int iteration = 0; iteration < a.length - 1; iteration++) {
            //we go through the array once, then swap, then go through the array again and
            //swap again etc.  We have “-iteration” because we compare one less each time
            //so at first got to 10, then next iteration to 7, then 9 then 3 etc.
            //for array like: a = new Integer[]{6,4,3,9,7,10,2};
            for (int j = 0; j < a.length - 1 - iteration; j++) {
                if (a[j] > a[j + 1]) {
                    TestClass.nCompares2++;
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    TestClass.nAssigns2 += 3;
                }
            }
        }
    }

}
