package L10_Patterns.homeWork10.sort;

import java.util.Comparator;
import java.util.Random;

public class Quicksort implements Sorter {
	public static final Random RND = new Random();

	public void sort(Object[] array, Comparator cmp) {
		qsort(array, 0, array.length - 1, cmp);
	}

	@Override
	public void sort(Comparable[] array) {
		qsort(array, 0, array.length - 1);

	}

	private void qsort(Object[] array, int begin, int end, Comparator cmp) {
		if (end > begin) {
			int index = partition(array, begin, end, cmp);
			qsort(array, begin, index - 1, cmp);
			qsort(array, index + 1, end, cmp);
		}
	}

	private void qsort(Comparable[] array, int begin, int end) {
		if (end > begin) {
			int index = partition(array, begin, end);
			qsort(array, begin, index - 1);
			qsort(array, index + 1, end);
		}

	}

	private int partition(Object[] array, int begin, int end, Comparator cmp) {
		int index = begin + RND.nextInt(end - begin + 1);
		Object pivot = array[index];
		swap(array, index, end);
		for (int i = index = begin; i < end; ++i) {
			if (cmp.compare(array[i], pivot) <= 0) {
				swap(array, index++, i);
			}
		}
		swap(array, index, end);
		return (index);
	}

	private int partition(Comparable[] array, int begin, int end) {
		int index = begin + RND.nextInt(end - begin + 1);
		Object pivot = array[index];
		swap(array, index, end);
		for (int i = index = begin; i < end; ++i) {
			if (array[i].compareTo(pivot) <= 0) {
				swap(array, index++, i);
			}
		}
		swap(array, index, end);
		return (index);

	}

	private void swap(Object[] array, int i, int j) {
		Object tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
	}
}
