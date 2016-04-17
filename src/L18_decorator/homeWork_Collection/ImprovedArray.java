package L18_decorator.homeWork_Collection;

import L10_Patterns.homeWork10.sort.Sorter;

import java.util.Comparator;
import java.util.Iterator;

/**
 * CustomArrayList
 */
public class ImprovedArray implements CustomList, Iterable {

	public Object[] data;
	private int nextItemPosition = 0;
	private boolean isSorted;

	public ImprovedArray() {
		data = new Object[10];
	}

	public ImprovedArray(int size) {
		data = new Object[size];
	}

	@Override
	public CustomCollection add(Object o) {
		if (nextItemPosition == data.length) duplicateData();

		data[nextItemPosition++] = o;
		return this;
	}

	private void duplicateData() {
//		System.out.println("start duplicating");
		Object[] newData = new Object[data.length * 2];
		int next = 0;
		for (Object obj : data) {
			newData[next++] = obj;
		}
		data = newData;
		nextItemPosition = next;
//		System.out.println("end duplicating");
	}

	@Override
	public Object getElementAt(int index) {
		return data[index];
	}

	@Override
	public boolean removeAt(int index) {
		boolean result = false;
		try {
			data[index] = null;
			rebuild(1);
			result = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			return result;
		}
	}

	@Override
	public boolean sort(Sorter sorter, Comparator comparator) {
		rebuild(0);
		sorter.sort(data, comparator);
		isSorted = true;

		return true;
	}

	@Override
	public boolean addAll(Iterable collection) {
		for (Object o : collection) {
			add(o);
		}
		return true;
	}

	@Override
	public boolean addAll(Object[] array) {
		for (Object o : array) {
			add(o);
		}
		return true;
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
		Object[] newData = new Object[size() - removesCounter];

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
		return nextItemPosition;
	}

	@Override
	public CustomCollection clone() {
		CustomCollection newCollection = new ImprovedArray(size());
		newCollection.addAll(this);
		return newCollection;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ImprovedArray) {
			ImprovedArray other = (ImprovedArray) obj;
			if (this.size() == other.size()) {
				for (int i = 0; i < this.nextItemPosition; i++) {
					if (!this.data[i].equals(other.data[i])) {
						return false;
					}
				}
				return true;
			}
		}
		return false;
	}

	@Override
	public void clear() {
		data = new Object[10];
		nextItemPosition = 0;
	}

	@Override
	public Iterator iterator() {
		return new Iterator() {
			int next = 0;
			int last = nextItemPosition - 1;
			Object[] dataCopy = data.clone();

			@Override
			public boolean hasNext() {
				return next <= last;
			}

			@Override
			public Object next() {
				return dataCopy[next++];
			}
		};
	}
}
