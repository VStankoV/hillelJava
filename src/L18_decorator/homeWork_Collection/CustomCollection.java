package L18_decorator.homeWork_Collection;

import java.util.Iterator;

public interface CustomCollection {

	CustomCollection add(Object e);

	boolean addAll(Iterable collection);

	boolean addAll(CustomCollection collection, Iterator iterator);

	int remove(Object obj);

	boolean contains(Object obj);

	int size();

	CustomCollection clone();

	boolean equals();

	void clear();

}
