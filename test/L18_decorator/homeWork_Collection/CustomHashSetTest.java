package L18_decorator.homeWork_Collection;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


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

	}

	@Test
	public void testAddAll() throws Exception {

	}

	@Test
	public void testAddAll1() throws Exception {

	}

	@Test
	public void testRemove() throws Exception {

	}

	@Test
	public void testClone() throws Exception {

	}

	@Test
	public void testClear() throws Exception {

	}
}