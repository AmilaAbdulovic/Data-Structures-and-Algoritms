package ba.edu.ibu.sort.comparable;;
import ba.edu.ibu.trees.BinaryHeap;

    public class HeapSort {
        public static void sort(int [] elements) {
            BinaryHeap<Integer> heap = new BinaryHeap<Integer>();   // 1

            for (int i = 0; i < elements.length; i++) {             // 2
                heap.insert(elements[i]);                           // 2
            }

            for (int i = elements.length - 1; i >= 0; i--) {        // 3
                elements[i] = heap.delMax();                        // 3
            }
        }

    }
