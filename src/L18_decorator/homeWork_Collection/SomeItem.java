package L18_decorator.homeWork_Collection;

public class SomeItem {

	private String name;
	private int price;

	public SomeItem(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		SomeItem someItem = (SomeItem) o;

		if (price != someItem.price) return false;
		return name != null ? name.equals(someItem.name) : someItem.name == null;

	}

	@Override
	public int hashCode() {
		int result = name != null ? name.hashCode() : 0;
		result = 31 * result + price;
		return result;
	}

	@Override
	public String toString() {
		return "SomeItem{" +
				"name='" + name + '\'' +
				", price=" + price +
				'}';
	}
}
