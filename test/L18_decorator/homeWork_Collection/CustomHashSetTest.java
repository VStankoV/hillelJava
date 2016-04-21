package L18_decorator.homeWork_Collection;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class CustomHashSetTest {

	@Test
	public void testSize() throws Exception {
		CustomCollection collection = new CustomHashSet();
		assertEquals(0, collection.size());
	}

	@Test
	public void testAdd() throws Exception {

		CustomCollection collection = new CustomHashSet();
		collection.add(new SomeItem("AAA", 25));
		collection.add(new SomeItem("FFF", 45));
		collection.add(new SomeItem("FFF", 45));
		assertEquals(2, collection.size());

	}

	@Test
	public void testContains() throws Exception {
		CustomCollection collection = new CustomHashSet();
		collection.add(new SomeItem("AAA", 25));
		collection.add(new SomeItem("FFF", 45));
		collection.add(new SomeItem("WWW", 0));
		collection.add(new SomeItem("MMM", 100500));

		assertTrue(collection.contains(new SomeItem("WWW", 0)));
		assertTrue(!collection.contains(new SomeItem("STR", 888)));
	}

	@Test
	public void testRehash() throws Exception {
		CustomCollection collection = new CustomHashSet(2);
		collection.add(new SomeItem("AAA", 25));
		collection.add(new SomeItem("B", 45));    //2
		collection.add(new SomeItem("C", 45));
		collection.add(new SomeItem("D", 45));    //4
		collection.add(new SomeItem("E", 45));
		collection.add(new SomeItem("FFF", 45));
		collection.add(new SomeItem("G", 45));
		collection.add(new SomeItem("H", 45));    //8
		collection.add(new SomeItem("I", 45));

		assertEquals(9, collection.size());
	}

	@Test
	public void testIterator() throws Exception {
		CustomCollection collection = new CustomHashSet();
		collection.add(new SomeItem("a", 10));
		collection.add(new SomeItem("b", 10));
		collection.add(new SomeItem("c", 10));
		collection.add(new SomeItem("d", 10));
		collection.add(new SomeItem("e", 10));
		collection.add(new SomeItem("f", 10));
		collection.add(new SomeItem("g", 10));
		collection.add(new SomeItem("h", 10));
		collection.add(new SomeItem("i", 10));
		collection.add(new SomeItem("j", 10));

		assertEquals(10, collection.size());

		int sum = 0;
		for (Object o : collection) {
			sum += ((SomeItem)o).getPrice();
		}
		assertEquals(100, sum);

		for (Object o : collection) {
			((SomeItem)o).setPrice(5);
		}

		sum = 0;
		for (Object o : collection) {
			sum += ((SomeItem)o).getPrice();
		}
		assertEquals(50, sum);
}

	@Test
	public void testAddAll() throws Exception {
		CustomCollection collection = new CustomHashSet();

		ArrayList list = new ArrayList();
		list.add(new SomeItem("A", 10));
		list.add(new SomeItem("A", 10));
		list.add(new SomeItem("B", 20));

		Object[] array = new Object[]{new SomeItem("F", 30), new SomeItem("F", 30), new SomeItem("G", 40)};

		collection.addAll(list);
		collection.addAll(array);

		assertEquals(4, collection.size());
	}

	@Test
	public void testRemove() throws Exception {
		CustomCollection collection = new CustomHashSet();
		collection.add(new SomeItem("AAA", 25));
		collection.add(new SomeItem("BBB", 25));
		collection.add(new SomeItem("CCC", 25));
		collection.add(new SomeItem("DDD", 25));

		SomeItem b = new SomeItem("BBB", 25);
		collection.remove(b);

		assertTrue(!collection.contains(b));
	}

	@Test
	public void testEquals() throws Exception {
		CustomCollection collection1 = new CustomHashSet();
		CustomCollection collection2 = new CustomHashSet();

		collection1.add(new SomeItem("a",1));
		collection1.add(new SomeItem("b",2));
		collection1.add(new SomeItem("c",3));

		collection2.add(new SomeItem("a",1));
		collection2.add(new SomeItem("b",2));
		collection2.add(new SomeItem("c",3));

		assertTrue(collection1.equals(collection2));

		collection1.add(new SomeItem("UUU",80));

		assertTrue(!collection1.equals(collection2));

		collection2.add(new SomeItem("UUU",80));

		assertTrue(collection1.equals(collection2));

	}

	@Test
	public void testClone() throws Exception {
		CustomCollection collection = new CustomHashSet();
		collection.add(new SomeItem("QQQ", 10));
		collection.add(new SomeItem("WWW", 20));
		collection.add(new SomeItem("EEE", 30));
		collection.add(new SomeItem("RRR", 40));

		assertEquals(4, collection.size());

		CustomCollection collectionOther = collection.clone();

		assertEquals(4, collectionOther.size());

		SomeItem item = new SomeItem("AAA", 25);
		collection.add(item);
		collectionOther.add(item);
		assertEquals(5, collectionOther.size());

		assertTrue(collectionOther.equals(collection));
	}

	@Test
	public void testClear() throws Exception {
		CustomCollection collection = new CustomHashSet();
		collection.add(new SomeItem("QQQ", 10));
		collection.add(new SomeItem("WWW", 20));

		assertEquals(2, collection.size());

		collection.clear();

		assertEquals(0, collection.size());

		assertTrue(!collection.contains(new SomeItem("WWW", 20)));


	}
}