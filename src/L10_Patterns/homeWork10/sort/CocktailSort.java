package L10_Patterns.homeWork10.sort;

import java.util.Comparator;

public class CocktailSort implements Sorter {
	@Override
	public void sort(Object[] arr, Comparator comparator) {
		int startPos = 0, endPos = arr.length - 1;
		boolean ready;

		do {
			ready = true;
			for (int i = startPos; i < endPos; i++) {
				if (comparator.compare(arr[i], arr[i + 1]) > 0) {
					Object tmp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = tmp;
					ready = false;
				}
			}
			endPos--;

			for (int i = endPos; i > startPos; i--) {
				if (comparator.compare(arr[i], arr[i + 1]) > 0) {
					Object tmp = arr[i];
					arr[i] = arr[i - 1];
					arr[i - 1] = tmp;
					ready = false;
				}
			}
			startPos++;
		} while (startPos <= endPos);


	}

	//	@Override
	public void sort(Comparable[] objects) {

	}

	public static void main(String[] args) {

	}
}
