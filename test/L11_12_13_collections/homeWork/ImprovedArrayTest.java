package L11_12_13_collections.homeWork;

import L10_Patterns.homeWork10.Item;
import L10_Patterns.homeWork10.compar.ItemPriceThenArtComparator;
import L10_Patterns.homeWork10.compar.MyComparator;
import L10_Patterns.homeWork10.sort.QuickSort;
import L10_Patterns.homeWork10.sort.Sorter;
import org.junit.Test;

import java.util.Comparator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ImprovedArrayTest {

	@Test
	public void testEquals() throws Exception {
		ImprovedArray array1 = new ImprovedArray();
		array1.add(new Item("abc", 100));
		array1.add(new Item("def", 200));


		ImprovedArray array2 = new ImprovedArray(35);
		array2.add(new Item("abc", 100));
		array2.add(new Item("def", 200));

		assertTrue(array1.equals(array2));
	}

	@Test
	public void testToString_contains_size_getElementAt_remove() throws Exception {
		ImprovedArray array1 = new ImprovedArray();
		assertEquals(0, array1.size());

		array1.add("a");
		array1.add("b");
		array1.add("com");
		array1.add("dot");
		array1.add("e");

		assertEquals("[a] [b] [com] [dot] [e] ", array1.toString());

		assertTrue(array1.contains("b"));



		assertTrue(!array1.contains("p"));

		assertEquals(5, array1.size());

		assertEquals("com", array1.getElementAt(2));

		array1.remove(2);
		array1.remove("dot");

		assertEquals(3, array1.size());
		assertEquals("[a] [b] [e] ", array1.toString());


	}

	@Test
	public void testSort_clone() throws Exception {
		ImprovedArray array = new ImprovedArray();

		ImprovedArray arraySorted = new ImprovedArray();
		ImprovedArray arraySortedRevers = new ImprovedArray();

		Item it1 = new Item("000", 10);
		Item it2 = new Item("000", 20);
		Item it3 = new Item("000", 30);
		Item it4 = new Item("000", 40);
		Item it5 = new Item("000", 50);

		array.add(it5);
		array.add(it3);
		array.add(it1);
		array.add(it2);
		array.add(it4);

		ImprovedArray array2 = array.clone();

		arraySorted.add(it1);
		arraySorted.add(it2);
		arraySorted.add(it3);
		arraySorted.add(it4);
		arraySorted.add(it5);

		arraySortedRevers.add(it5);
		arraySortedRevers.add(it4);
		arraySortedRevers.add(it3);
		arraySortedRevers.add(it2);
		arraySortedRevers.add(it1);

		Sorter sorter = new QuickSort();
		MyComparator comparator = new ItemPriceThenArtComparator();

		array.sort(sorter, comparator);
		assertTrue(array.equals(arraySorted));

		array2.sort(sorter, comparator);
		assertTrue(array.equals(array2));

		array.sort(sorter, comparator.reversed());
		assertTrue(array.equals(arraySortedRevers));

	}

	@Test
	public void testAdd() throws Exception {

	}

}