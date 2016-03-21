package L10_Patterns.homeWork10.sort;

import java.util.Comparator;

public class CocktailSort implements Sorter {
	@Override
	public void sort(Object[] arr, Comparator comparator) {
		int startPos = 0, endPos = arr.length - 1;
		do {
			for (int i = startPos; i < endPos; i++) {
				if (comparator.compare(arr[i], arr[i + 1]) > 0) {
					Object tmp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = tmp;
				}
			}
			endPos--;

			for (int i = endPos; i > startPos; i--) {
				if (comparator.compare(arr[i], arr[i - 1]) < 0) {
					Object tmp = arr[i];
					arr[i] = arr[i - 1];
					arr[i - 1] = tmp;
				}
			}
			startPos++;
		} while (startPos <= endPos);


	}

	//	@Override
	public void sort(Comparable[] arr) {
		int startPos = 0, endPos = arr.length - 1;
		do {
			for (int i = startPos; i < endPos; i++) {
				if (arr[i].compareTo(arr[i + 1]) > 0) {
					Comparable tmp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = tmp;
				}
			}
			endPos--;

			for (int i = endPos; i > startPos; i--) {
				if (arr[i].compareTo(arr[i - 1]) < 0) {
					Comparable tmp = arr[i];
					arr[i] = arr[i - 1];
					arr[i - 1] = tmp;
				}
			}
			startPos++;
		} while (startPos <= endPos);

	}
}
