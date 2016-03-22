package L10_Patterns.homeWork10.sort;

import L10_Patterns.homeWork10.compar.IntegerComparator;
import org.junit.Assert;
import org.junit.Test;

import java.util.Comparator;

public class QuicksortTest {

	@Test
	public void testSortComparator() throws Exception {
		Sorter sorter = new QuickSort();

		Comparator comparator = new IntegerComparator();
		Comparator comparatorReversed = new IntegerComparator(-1);

		Comparable[] unsorted = {8, 5, 2, 9, 7, 1, 6, 4, 0, 3};
		Comparable[] result = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		Comparable[] resultReversed = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};


		sorter.sort(unsorted, comparator);
		Assert.assertArrayEquals(result, unsorted);

		sorter.sort(unsorted, comparatorReversed);
		Assert.assertArrayEquals(resultReversed, unsorted);

	}

	@Test
	public void testSortComparable() throws Exception {
		Sorter sorter = new QuickSort();

		Comparable[] unsorted = {8, 5, 2, 9, 7, 1, 6, 4, 0, 3};
		Comparable[] result = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

		sorter.sort(unsorted);

		Assert.assertArrayEquals(result, unsorted);

	}
}