package L18_decorator.homeWork_Collection;

public class CustomHashSet implements CustomCollection {

	private int countOfElements;
	private Object[] data;
	private float loadFactor;

	public CustomHashSet() {
		this(16);
	}

	public CustomHashSet(int size) {
		this(size, 0.75f);
	}

	public CustomHashSet(int size, float loadFactor) {
		data = new Object[size];
		this.loadFactor = loadFactor;
		countOfElements = 0;
	}

	@Override
	public CustomCollection add(Object e) {
		data[e.hashCode() % data.length] = e;
		return this;
	}

	@Override
	public boolean addAll(Iterable collection) {
		return false;
	}

	@Override
	public boolean addAll(Object[] collection) {
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
		return countOfElements;
	}

	@Override
	public CustomCollection clone() {
		return null;
	}

	@Override
	public void clear() {

	}
}
