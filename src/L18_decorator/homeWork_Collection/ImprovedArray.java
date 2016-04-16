package L18_decorator.homeWork_Collection;

import java.util.Iterator;

/**
 * CustomArrayList
 */
public class ImprovedArray<E> implements CustomList {

	private Object[] data;
	private int nextItemPosition = 0;

	public ImprovedArray() {
		data = new Object[10];
	}

	public ImprovedArray(int size) {
		data = new Object[size];
	}

	@Override
	public CustomCollection add(Object e) {
		data[nextItemPosition++] = e;
		return this;
	}

	@Override
	public Object getElementAt(int index) {
		return data[index];
	}

	@Override
	public boolean removeAt(int index) {
		return false;
	}

	@Override
	public int addSorted() {
		return 0;
	}

	@Override
	public boolean addAll(Iterable collection) {
		return false;
	}

	@Override
	public boolean addAll(CustomCollection collection, Iterator iterator) {
		return false;
	}

	@Override
	public int remove(Object obj) {

		int removesCounter = markMatchesAsNull(obj);

		rebuild(removesCounter);

		return removesCounter;
	}

	private int markMatchesAsNull(Object obj) {
		int removesCounter = 0;
		for (int i = 0; i < nextItemPosition; i++) {
			if (obj.equals(data[i])) {
				data[i] = null;
				removesCounter++;
			}
		}
		return removesCounter;
	}

	private void rebuild(int removesCounter) {
		Object[] newData = new Object[data.length];

		int newNextItemPosition = 0;

		for (Object o : data) {
			if (o != null) {
				newData[newNextItemPosition++] = o;
			}
		}
		if (nextItemPosition != newNextItemPosition + removesCounter) {
			throw new RuntimeException("something goes wrong!");
		}
		data = newData;
		nextItemPosition = newNextItemPosition;
	}

	@Override
	public boolean contains(Object obj) {
		for (Object o : data) {
			if (o == null) break;
			if (o.equals(obj)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int size() {
		return 0;
	}

	@Override
	public CustomCollection clone() {
		return null;
	}

	@Override
	public boolean equals() {
		return false;
	}

	@Override
	public void clear() {

	}
}
