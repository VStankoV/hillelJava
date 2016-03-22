package L11_12_collections;

public class CustomLinkedList {

	private ListElement next;

	public int size() {     //TODO цикл вместо рекурсии
		if (next == null){
			return 0;
		} else return next.size();
	}

	public void add(Object obj) {
		if (next == null){
			next = new ListElement(obj);

		} else {
			next.add(obj);
		}
	}

	public Object get(int position) {
		if (position == 0) {
			return next.value;
		} else {
			if (next == null){
				return null;
			}
			return get(position - 1);
		}


	}

}
