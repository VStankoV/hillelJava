package L18_decorator.homeWork_Collection;

import java.util.Collection;
import java.util.Iterator;

public interface CustomCollection {

	boolean add(Object element);

	boolean addAll(Iterable collection);

	boolean addAll(CustomCollection collection, Iterator iterator);

	int remove(Object obj);

	boolean contains(Object obj);

	int size();

	CustomCollection clone();

	boolean equals();

}
