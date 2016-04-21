package L18_decorator.homeWork_Collection;

public interface CustomCollection extends Iterable {

	CustomCollection add(Object e);

	default boolean addAll(Iterable collection) {
		for (Object o : collection) {
			add(o);
		}
		return true;
	}

	default boolean addAll(Object[] collection) {
		for (Object o : collection) {
			add(o);
		}
		return true;
	}

	void remove(Object obj);

	boolean contains(Object obj);

	int size();

	CustomCollection clone();

	boolean equals(Object obj);

	void clear();

}
