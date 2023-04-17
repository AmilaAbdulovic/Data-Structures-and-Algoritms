package ba.edu.ibu.sort;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

@TestMethodOrder(OrderAnnotation.class)
class QuickSortTest extends AbstractSortTest {

	@Test
	@Order(1)
	void testSortsARandomArray() {
		int[] elements = {49, 16, 19, 17, 15, 53, 30, 90, 42, 11};
		
		QuickSort.sort(elements);
		
		assertEquals(11, elements[0]);
		assertEquals(19, elements[4]);
		assertEquals(90, elements[9]);

	}

	@Test
	@Order(2)
	void testSortsASortedArray() {
		int[] elements = {11, 15, 16, 17, 19, 30, 42, 49, 53, 90};
		
		QuickSort.sort(elements);
		
		assertEquals(11, elements[0]);
		assertEquals(19, elements[4]);
		assertEquals(90, elements[9]);
	}
	
	@Test
	@Order(3)
	void testSortsAReverslySortedArray() {
		int[] elements = {90, 53, 49, 42, 30, 19, 17, 16, 15, 11};
		
		QuickSort.sort(elements);
		
		assertEquals(11, elements[0]);
		assertEquals(19, elements[4]);
		assertEquals(90, elements[9]);
	}
	
	@Test
	@Order(4)
	void testMeasurePerformance() {
		runAndMeasureAlgorithm("quick", 100);
		runAndMeasureAlgorithm("quick", 1000);
		runAndMeasureAlgorithm("quick", 10000);
		runAndMeasureAlgorithm("quick", 100000);
		runAndMeasureAlgorithm("quick", 1000000);
	}

}
