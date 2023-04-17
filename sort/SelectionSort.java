package ba.edu.ibu.sort;

/**
 * Selection sort class.
 * 
 * @author Aldin Kovačević
 * @author Amar Mujagić
 */
public class SelectionSort extends AbstractSort {
	
	public static void sort(int[] elements) {
		for(int i = 0; i< elements.length; i++){
			int min= i;
			for(int j=i+1;j< elements.length;j++){
				if( less(elements[j],elements[min])){
					min=j;
				}
			}
			swap(elements,i,min);
		}
	}
}
