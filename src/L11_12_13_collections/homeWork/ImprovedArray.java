package L11_12_13_collections.homeWork;

import L10_Patterns.homeWork10.sort.QuickSort;
import L10_Patterns.homeWork10.sort.Sorter;

import java.util.Comparator;

public class ImprovedArray {
	final int FULL_VACUUM = 0;

	private Object[] data;
	private Object empty = new Object();
	private int countOfElements = 0;

	public ImprovedArray(int length) {
		data = new Object[length];
	}

	public ImprovedArray() {
		data = new Object[10];
	}

	public void add(Object o) {
		if (countOfElements >= data.length) {
			data = this.cloneAndDuplicateData();
		}
		data[countOfElements] = o;
		countOfElements++;
	}

	private Object[] cloneAndDuplicateData() {
		Object[] result = new Object[this.data.length * 2];
		for (int i = 0; i < this.countOfElements; i++) {

			result[i] = this.data[i];
		}
		return result;
	}

	public Object getElementAt(int position) {
		if (position >= 0 && position < data.length) {
			return data[position];
		}
		throw new ArrayIndexOutOfBoundsException("error at " + position);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < countOfElements; i++) {
			sb.append("[").append(data[i]).append("] ");
		}
		return sb.toString();
	}

	public int size() {
		return countOfElements;
	}

	@Override
	public ImprovedArray clone() {
		ImprovedArray result = new ImprovedArray(this.data.length);
		result.countOfElements = this.countOfElements;
		for (int i = 0; i < this.countOfElements; i++) {
			result.data[i] = this.data[i];
		}
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ImprovedArray) {
			ImprovedArray other = (ImprovedArray) obj;
			if (this.size() == other.size()) {
				for (int i = 0; i < this.countOfElements; i++) {
					if (!this.data[i].equals(other.data[i])) {
						return false;
					}
				}
				return true;
			}
		}
		return false;
	}

	public boolean contains(Object obj) {
		for (Object o : data) {
			if (o != null && o.equals(obj)) {
				return true;
			}
		}
		return false;
	}

	public boolean containsBinarySearch(Object obj, Comparator comparator) {

		if (data.length == 0) return false;

		sort(new QuickSort(), comparator);

		int startBound = 0;
		int endBound = data.length - 1;

		do {
			int midpoint = (endBound - startBound) / 2 + startBound;

			int result = comparator.compare(obj, data[midpoint]);

			if (result == 0) {
				return true;
			} else if (result < 0) {
				endBound = midpoint - 1;
			} else {
				startBound = midpoint + 1;
			}

		} while (endBound >= startBound);

		return false;
	}

	public void remove(int index) {
		int removesCounter = 1;
		if (index < size() && index >= 0) {
			data[index] = empty;
			vacuum(removesCounter);
		}
	}

	public void remove(Object obj) {
		int removesCounter = 0;
		for (int i = 0; i < countOfElements; i++) {
			if (obj.equals(data[i])) {
				data[i] = empty;
				removesCounter++;
			}
		}
		vacuum(removesCounter);
	}

	private void vacuum(int removesCounter) {
		Object[] result = new Object[size() - removesCounter];
		int newCounter = 0;
		for (int i = 0; i < countOfElements; i++) {
			if (data[i] != empty && data[i] != null) {
				result[newCounter++] = data[i];
			}
		}
		this.data = result;
		countOfElements = newCounter;
	}

	public void sort(Sorter sorter, Comparator comparator) {
		vacuum(FULL_VACUUM);
		sorter.sort(data, comparator);
	}

}
