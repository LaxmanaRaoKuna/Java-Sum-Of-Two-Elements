package com.chrisbaileydeveloper.sumoftwoelements;

import static org.junit.Assert.assertArrayEquals;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

/**
 * JUnit testing of com.chrisbaileydeveloper.sumoftwoelements.Main class
 * 
 * @author Chris Bailey
 */

public class MainTest {

	static int[] mainArray = { 5, 2, 7, 1, 3, 9, 2, 7, 3, 2 };
	static int[] nullArray = null;
	static int target = 8;

	static List<int[]> expectedList = new ArrayList<>();
	static List<int[]> resultList = new ArrayList<>();

	static Object[] expectedArray;
	static Object[] resultArray;

	@Test
	public void testFindPairs() {
		// Test for null array
		expectedList = Arrays.asList(new int[] { -1, -1 });
		resultList = Main.findPairs(nullArray, target);

		expectedArray = expectedList.toArray();
		resultArray = resultList.toArray();

		assertArrayEquals(expectedArray, resultArray);

		
		// Test normal operation
		expectedList = Arrays.asList(new int[] { 0, 4 }, new int[] { 0, 8 },
									 new int[] { 2, 3 }, new int[] { 3, 7 });
		resultList = Main.findPairs(mainArray, target);

		expectedArray = expectedList.toArray();
		resultArray = resultList.toArray();

		assertArrayEquals(expectedArray, resultArray);
	}

	@Test
	public void testFindPairsSimply() {
		// Test for null array
		expectedList = Arrays.asList(new int[] { -1, -1 });
		resultList = Main.findPairsSimply(nullArray, target);

		expectedArray = expectedList.toArray();
		resultArray = resultList.toArray();

		assertArrayEquals(expectedArray, resultArray);

		
		// Test normal operation
		expectedList = Arrays.asList(new int[] { 0, 4 }, new int[] { 0, 8 },
									 new int[] { 2, 3 }, new int[] { 3, 7 });
		resultList = Main.findPairsSimply(mainArray, target);

		expectedArray = expectedList.toArray();
		resultArray = resultList.toArray();

		assertArrayEquals(expectedArray, resultArray);
	}
}
