package L09_OOP_ext.homeWork;

public class ImprovedArray {
	private Object[] data;
	private Object empty = new Object();
	private int counter = 0;

	public ImprovedArray(int length) {
		data = new Object[length];
	}

	public ImprovedArray() {
		data = new Object[10];
	}

	public void add(Object o) {
		if (counter >= data.length) {
			data = this.cloneAndDuplicateData();
		}
		data[counter] = o;
		counter++;
	}

	private Object[] cloneAndDuplicateData() {
		Object[] result = new Object[this.data.length * 2];
		for (int i = 0; i < this.counter; i++) {

			result[i] = this.data[i];
		}
		return result;
	}

	public Object getElementAt(int position) {
		if (position >= 0 && position < data.length) {
			return data[position];
		}
		throw new ArrayIndexOutOfBoundsException("error at "+position);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < counter; i++) {
			sb.append("[").append(data[i]).append("] ");
		}
		return sb.toString();
	}

	public String toStringFull() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < data.length; i++) {
			sb.append("[").append(data[i] == null ? "null" : data[i].toString()).append("] ");
		}
		return sb.toString();
	}

	public int size() {
		return counter;
	}

	@Override
	public ImprovedArray clone() {
		ImprovedArray result = new ImprovedArray(this.data.length);
		result.counter = this.counter;
		for (int i = 0; i < this.counter; i++) {
			result.data[i] = this.data[i];
		}
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ImprovedArray) {
			ImprovedArray other = (ImprovedArray) obj;
			if (this.size() == other.size()) {
				for (int i = 0; i < this.counter; i++) {
					if (!this.data[i].equals(other.data[i])) {
						return false;
					}
				}
				return true;
			}
		}
		return false;
	}

	public boolean contains(Object obj) {
		for (Object o : data) {
			if (o.equals(obj)) {
				return true;
			}
		}
		return false;
	}

	public void remove(int index) {
		if (index < size() && index >= 0) {
			data[index] = empty;
			vacuum();
		}
	}

	public void remove(Object obj) {
		for (int i = 0; i <= counter; i++) {
			if (obj.equals(data[i])) {
				data[i] = empty;
			}
		}
		vacuum();
	}

	private void vacuum() {
		Object[] result = new Object[data.length];
		int newCounter = 0;
		for (int i = 0; i < counter; i++) {
			if (data[i] != empty){
				result[newCounter++] = data[i];
			}
		}
		this.data = result;
		counter = newCounter;
	}
/*
	private void vacuum() {
		ImprovedArray temp = new ImprovedArray(size());
		int newCounter = counter;
		for (int i = 0; i < counter; i++) {
			if (data[i] != empty){
				temp.add(data[i]);
			} else {
				--newCounter;
			}
		}
		this.data = temp.data;
		counter = newCounter;
	}
*/





}
