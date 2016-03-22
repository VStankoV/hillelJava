package L10_Patterns.homeWork10.compar;

import L10_Patterns.homeWork10.Item;

import java.util.Comparator;

public class ItemPriceThenArtComparator extends MyComparator {

	public ItemPriceThenArtComparator() {
	}

	public ItemPriceThenArtComparator(int direction) {
		super(direction);
	}

	@Override
	public int compare(Object obj1, Object obj2) {
		int price1 = ((Item) obj1).getPrice();
		int price2 = ((Item) obj2).getPrice();

		String art1 = ((Item) obj1).getArt();
		String art2 = ((Item) obj2).getArt();

		int result = 0;

		if (price1 == price2) {
			result = art1.compareTo(art2) < 0 ? -1 : art1.compareTo(art2) == 0 ? 0 : 1;
		} else {
			result = price1 < price2 ? -1 : 1;
		}

		return result * getDirection();
	}

	@Override
	public Comparator reversed() {
		return new ItemPriceThenArtComparator(-1);
	}
}
