package ba.edu.ibu.sort;

import java.util.Random;

/**
 * Quick sort implementation with 2-way partitioning.
 * 
 * @author Aldin Kovačević
 * @author Amar Mujagić
 */
public class QuickSort extends AbstractSort {

    public static void sort(int[] elements) {
        shuffle(elements);                              // 1
        sort(elements, 0, elements.length - 1);         // 2
    }

    private static void sort(int[] elements, int low, int high) {
        if (high <= low) {                              // 1
            return;                                     // 1
        }
        int j = partition(elements, low, high);         // 2
        sort(elements, low, j - 1);                     // 3
        sort(elements, j + 1, high);                    // 3
    }

    private static void shuffle(int[] elements) {
        Random rand = new Random();                             // 1
        for (int i = 0; i < elements.length; i++) {             // 2
            int r = i + rand.nextInt(elements.length - i);      // 2
            swap(elements, i, r);                               // 3
        }
    }
	
	 private static int partition(int[] elements, int low, int high) {
        int i = low;
        int j = high + 1;
        while (true) {
            while (less(elements[++i], elements[low])) {
                if (i == high) {
                    break;
                }
            }
            while (less(elements[low], elements[--j])) {
                if (j == low) {
                    break;
                }
            }
            if (i >= j) {
                break;
            }
            swap(elements, i, j);
        }
        swap(elements, low, j);
        return j;
    }
}
