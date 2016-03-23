package L11_12_collections;

public class ListElement {
	Object value;
	ListElement next;

	public ListElement(Object obj){
		value = obj;
	}

	public int size() {
		if (next == null){
			return 1;
		} else {
			return next.size() + 1;
		}
	}

	public Object get (int position) {
		if (position == 0) {
			return value;
		} else {
			if (next == null){
				return null;
			}
			return get(position - 1);
		}
	}

	public void add(Object obj) {
		if (next == null){
			next = new ListElement(obj);
		} else {
			next.add(obj);
		}
	}

	public boolean hasNext() {
		return next != null;
	}
}
