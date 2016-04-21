package L18_decorator.homeWork_Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class CustomHashSet implements CustomCollection, Iterable {

	private int countOfElements;
	private LinkedList[] data;
	private float loadFactor;

	public CustomHashSet() {
		this(16);
	}

	public CustomHashSet(int size) {
		this(size, 0.75f);
	}

	public CustomHashSet(int size, float loadFactor) {
		data = new LinkedList[size];
		this.loadFactor = loadFactor;
		countOfElements = 0;
	}

	@Override
	public CustomCollection add(Object e) {
		int index = e.hashCode() % data.length;
		if (data[index] == null) {
			data[index] = new LinkedList();
		}
		LinkedList bucket = data[index];
		if (!bucket.contains(e)) {
			bucket.add(e);
			countOfElements++;
		}
		if (loadFactor * data.length < countOfElements) {
			rehash();
		}
		return this;
	}

	private void rehash() {
		CustomHashSet newHashSet = new CustomHashSet(data.length * 2);
		for (LinkedList list : data) {
			if (list != null) {
				for (Object o : list) {
					newHashSet.add(o);
				}
			}
		}
		data = newHashSet.getData();
	}

	@Override
	public boolean contains(Object obj) {
		if (obj == null) return false;
		int index = obj.hashCode() % data.length;
		if (data[index] == null) return false;
		return data[index].contains(obj);
	}

	@Override
	public int size() {
		return countOfElements;
	}

	@Override
	public void remove(Object obj) {
		for (int i = 0; i < data.length; i++) {
			if (data[i] != null) {
				if (data[i].remove(obj)) {
					return;
				}
			}
		}
	}

	@Override
	public CustomCollection clone() {
		CustomCollection cloned = new CustomHashSet(data.length);
		for (Object o : this) {
			cloned.add(o);
		}
		return cloned;
	}

	@Override
	public void clear() {
		data = new LinkedList[data.length];
		countOfElements = 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) return true;
		if (!(obj instanceof CustomHashSet)) return false;

		CustomHashSet other = (CustomHashSet) obj;
		if (size() != other.size()) {
			return false;
		}

		for (Object o : this) {
//			if (o == null) continue;
			if (!(other.contains(o))) {
				return false;
			}
		}
		return true;
	}

	@Override
	public Iterator iterator() {
		return new Iterator() {

			Iterator linkedListIterator = null;
			int position = 0;

			@Override
			public boolean hasNext() {
				if (linkedListIterator != null) {
					if (linkedListIterator.hasNext()) {
						return true;
					} else {
						position++;
					}
				}

				if (position >= data.length) {
					return false;
				}

				if (data[position] == null) {
					position++;
				} else {
					linkedListIterator = data[position].iterator();
				}

				return hasNext();
			}

			@Override
			public Object next() {
				return linkedListIterator.next();
			}
		};
	}

	private LinkedList[] getData() {
		return data;
	}
}
