package L11_12_collections;

public class CustomLinkedList {

	private ListElement start;

	public int size() {
		if (start == null) return 0;

		ListElement current = start;
		int counter = 1;

		while (current.hasNext()) {
			current = current.next;
			counter++;
		}

		return counter;
	}

	public void add(Object obj) {
		if (start == null) {
			start = new ListElement(obj);
		} else {
			start.add(obj);
		}
	}

	public Object get(int position) {
		if (position == 0) {
			return start.value;
		} else {
			if (start == null) {
				return null;
			}
			return get(position - 1);
		}


	}

}
