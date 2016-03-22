package L10_Patterns.homeWork10;

public class Item implements Comparable {

	private String art;
	private int price;

	public Item(String art, int price) {
		this.art = art;
		this.price = price;
	}

	public String getArt() {
		return art;
	}

	public void setArt(String art) {
		this.art = art;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public boolean equals(Object obj) {
		Item other = (Item) obj;
		boolean result = false;
		if (obj instanceof Item) {
			result = art.equals(other.art) && price == other.price;
		}
		return result;
	}

	@Override
	public int compareTo(Object obj) {
		Item other = (Item) obj;

		return ((Integer) price).compareTo(other.getPrice()) < 0 ? -1 : 1;
	}
}
