package L18_decorator.homeWork_Collection;

import org.junit.Test;

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

	}

	@Test
	public void testAdd() throws Exception {

	}

	@Test
	public void testRemoveAt() throws Exception {
	}

	@Test
	public void testAddSorted() throws Exception {

	}

	@Test
	public void testAddAll() throws Exception {

	}

	@Test
	public void testAddAll1() throws Exception {

	}

	@Test
	public void testClone() throws Exception {

	}

	@Test
	public void testEquals() throws Exception {

	}

	@Test
	public void testClear() throws Exception {

	}
}