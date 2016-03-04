package L07_OOP.homeWork;

public class ImprovedStringArray {
	private String[] data;
	private int counter = 0;

	public ImprovedStringArray(int length) {
		data = new String[length];
	}

	public ImprovedStringArray() {
		data = new String[10];
	}

	public void add(String s) {
		ImprovedStringArray result = this;
		if (counter < data.length) {
			data[counter] = s;
			counter++;
		} else {
			System.out.println("Full!");
			data = this.cloneAndDuplicateData();
			this.add(s);
		}
	}

	private String[] cloneAndDuplicateData() {
		String[] result = new String[this.data.length * 2];
		for (int i = 0; i < this.counter; i++) {

			result[i] = this.data[i];
		}
		return result;
	}

	public String getElementAt(int position) {
		String result = null;
		if (position > 0 && position < counter) {
			result = data[position];
		}
		return result;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < counter; i++) {
			sb.append("[").append(this.data[i]).append("] ");
		}
		return sb.toString();
	}

	public int size() {
		return counter;
	}

	@Override
	public ImprovedStringArray clone() {
		ImprovedStringArray result = new ImprovedStringArray(this.data.length);
		result.counter = this.counter;
		for (int i = 0; i < this.counter; i++) {
			result.data[i] = this.data[i];
		}
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if (obj instanceof ImprovedStringArray) {
			ImprovedStringArray other = (ImprovedStringArray) obj;
			if (this.data.length == other.data.length) {
				for (int i = 0; i < this.counter; i++) {
					if (!this.data[i].equals(other.data[i])){
						result = false;
						break;
					}
				}
				result = true;
			}
		}
		return result;
	}
}
