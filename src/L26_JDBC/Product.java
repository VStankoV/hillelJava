package L26_JDBC;

import java.util.UUID;

public class Product {
	private int id;
	private String name;
	private String category;
	private int price;

	public Product(int id, String name, String category, int price) {
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product{" +
				"id=" + id +
				", name='" + name + '\'' +
				", category='" + category + '\'' +
				", price=" + price + "}\n";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Product product = (Product) o;

		if (getId() != product.getId()) return false;
		if (getPrice() != product.getPrice()) return false;
		if (getName() != null ? !getName().equals(product.getName()) : product.getName() != null) return false;
		return getCategory() != null ? getCategory().equals(product.getCategory()) : product.getCategory() == null;

	}

	@Override
	public int hashCode() {
		int result = getId();
		result = 31 * result + (getName() != null ? getName().hashCode() : 0);
		result = 31 * result + (getCategory() != null ? getCategory().hashCode() : 0);
		result = 31 * result + getPrice();
		return result;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
