package L11_12_collections;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomLinkedListTest {
	@Test
	public void newInstanceShouldBeCreatedEmpty() {
		CustomLinkedList list = new CustomLinkedList();
		assertEquals(0, list.size());
	}

	@Test
	public void sizeShouldChangeOnAdd() {
		CustomLinkedList list = new CustomLinkedList();

		list.add(new Object());
		list.add(new Object());
		list.add(new Object());

		assertEquals(3, list.size());
	}

	@Test
	public void returnCorrectElement() {
		CustomLinkedList list = new CustomLinkedList();

		Object element = new Object();

		list.add(element);

		assertEquals(element,list.get(0));


	}




	}