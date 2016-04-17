package L18_decorator.homeWork_Collection;

public interface CustomCollection {

	CustomCollection add(Object e);
	boolean addAll(Iterable collection);

	boolean addAll(Object[] collection);

	int remove(Object obj);

	boolean contains(Object obj);

	int size();

	CustomCollection clone();

	boolean equals(Object obj);

	void clear();

}
