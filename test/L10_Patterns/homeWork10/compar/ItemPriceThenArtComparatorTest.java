package L10_Patterns.homeWork10.compar;

import L10_Patterns.homeWork10.Item;
import org.junit.Assert;
import org.junit.Test;

import java.util.Comparator;

public class ItemPriceThenArtComparatorTest {

	@Test
	public void testCompare() throws Exception {
		Comparator comparator = new ItemPriceThenArtComparator();
		Comparator comparatorReversed = comparator.reversed();

		Object it1 = new Item("A300", 50);
		Object it2 = new Item("A301", 50);
		Object it3 = new Item("A302", 50);
		Object it4 = new Item("A303", 50);
		Object it5 = new Item("A304", 50);

		Object it6 = new Item("2055", 45);
		Object it7 = new Item("2056", 45);
		Object it8 = new Item("2057", 45);
		Object it9 = new Item("2058", 45);
		Object it10 = new Item("2059", 45);
		Object it11 = new Item("2060", 45);


		Assert.assertEquals(-1, comparator.compare(it3, it5));
		Assert.assertEquals(0, comparator.compare(it10, new Item("2059", 45)));
		Assert.assertEquals(1, comparator.compare(it2, it9));


/*
		Object[] sorted = {it6,it7,it8,it9,it10,it11,it1,it2,it3,it4,it5};
		Object[] reversSorted = {it5,it4,it3,it2,it1,it11,it10,it9,it8,it7,it6};

		Object[] unsorted = {it11,it3,it2,it5,it4,it6,it8,it7,it10,it9,it1};

		Sorter sorter = new CocktailSort();

		sorter.sort(unsorted,comparator);
		Assert.assertArrayEquals(sorted, unsorted);

		sorter.sort(unsorted,comparatorReversed);
		Assert.assertArrayEquals(reversSorted, unsorted);
*/


	}
}