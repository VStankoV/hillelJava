package L11_12_13_collections.patternIterator;

import java.util.Iterator;

public class ArrayIterator implements Iterator {
	private Integer[] array;
	private int currentIndex = 0;

	public ArrayIterator(Integer[] array) {
		this.array = array;
	}

	@Override

	public boolean hasNext() {
		return currentIndex < array.length;
	}

	@Override
	public Object next() {
		return array[currentIndex++];
	}
}
