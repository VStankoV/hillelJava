package L18_decorator.homeWork_Collection;

import java.util.Iterator;

/**
 * CustomArrayList
 */
public class ImprovedArray implements CustomList {

	@Override
	public Object getElementAt(int index) {
		return null;
	}

	@Override
	public boolean removeAt(int index) {
		return false;
	}

	@Override
	public boolean addSorted() {
		return false;
	}

	@Override
	public boolean add(Object element) {
		return false;
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
		return 0;
	}

	@Override
	public boolean contains(Object obj) {
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
}
