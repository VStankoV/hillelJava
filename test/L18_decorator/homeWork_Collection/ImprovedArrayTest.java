package L18_decorator.homeWork_Collection;

import L10_Patterns.homeWork10.compar.IntegerComparator;
import L10_Patterns.homeWork10.sort.CocktailSort;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ImprovedArrayTest {

	@Test
	public void testGetElementAt() throws Exception {

		CustomList list = new ImprovedArray();

		list.add(new SomeItem("aaa", 10)).add(new SomeItem("bbb", 20)).add(new SomeItem("ccc", 30)).add(5);

		SomeItem someItem = new SomeItem("bbb", 20);

		assertTrue(someItem.equals(list.getElementAt(1)));

	}

	@Test
	public void testContains() throws Exception {
		CustomList list = new ImprovedArray();
		SomeItem someItem = new SomeItem("bbb", 20);

		assertTrue(!list.contains(someItem));    // !false

		list.add(new SomeItem("aaa", 10)).add(new SomeItem("bbb", 20));

		assertTrue(list.contains(someItem));
	}

	@Test
	public void testRemove() throws Exception {
		CustomList list = new ImprovedArray();

		list.add(new SomeItem("aaa", 10)).add(new SomeItem("bbb", 20)).add(new SomeItem("bbb", 20)).add(new SomeItem("ccc", 30)).add(5);

		int removesCount = list.remove(new SomeItem("bbb", 20));

		assertTrue(!list.contains(new SomeItem("bbb", 20)));
		assertEquals(2, removesCount);
	}

	@Test
	public void testSize() throws Exception {

		CustomCollection collection = new ImprovedArray();
		collection.add("a").add("b").add("c").add("d");
		assertEquals(4, collection.size());

		collection.remove("b");

		assertEquals(3, collection.size());


	}

	@Test
	public void testAdd() throws Exception {
		SomeItem someItemem = new SomeItem("qwerty", 50);
		CustomCollection collection = new ImprovedArray();
		assertTrue(!collection.contains(someItemem));
		collection.add(new SomeItem("qwerty", 50));
		assertTrue(collection.contains(someItemem));
	}

	@Test
	public void testRemoveAt() throws Exception {
		CustomList list = new ImprovedArray(2);
		list.add("a").add("b").add("c").add("d").add("e");        //test private duplicate() here
		assertTrue(list.contains("d"));
		list.removeAt(3);
		assertTrue(!list.contains("d"));
	}

	@Test
	public void testClear() throws Exception {
		CustomCollection collection = new ImprovedArray();
		collection.add(1).add(2).add(3).add(4).add(5);
		assertEquals(5, collection.size());
		collection.clear();
		assertEquals(0, collection.size());
	}

	@Test
	public void testAddAll() throws Exception {
		CustomCollection collection = new ImprovedArray();
		collection.add(1).add(2).add(3).add(4).add(5);
		assertEquals(5, collection.size());

		ImprovedArray array = new ImprovedArray(3);
		array.add(7).add(7).add(7);

		collection.addAll(array);

		assertEquals(8, collection.size());

	}

	@Test
	public void testEquals() throws Exception {
		CustomCollection collectionA = new ImprovedArray(10);
		CustomCollection collectionB = new ImprovedArray(20);

		collectionA.add(3).add(6).add(9).add(12);
		collectionB.add(3).add(6).add(9);

		assertTrue(!collectionA.equals(collectionB));

		collectionB.add(12);
		assertTrue(collectionA.equals(collectionB));

	}

	@Test
	public void testClone() throws Exception {
		CustomCollection collectionA = new ImprovedArray(10);
		collectionA.add(3).add(6).add(9).add(12);

		CustomCollection collectionB = collectionA.clone();

		assertTrue(collectionA.equals(collectionB) && collectionA != collectionB);

	}

	@Test
	public void testSort() throws Exception {
		CustomList list = new ImprovedArray();
		list.addAll(new Object[]{8, 1, 7, 9, 5, 4, 6, 2, 0, 3});

		Arrays.toString(list.data);

		list.sort(new CocktailSort(), new IntegerComparator());


		CustomList list2 = new ImprovedArray();
		list.addAll(new Object[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9});

		assertTrue(list.equals(list2));

	}
}