package L11_12_collections;

import L10_Patterns.homeWork10.Item;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList(20);

		ArrayList<Item> list2 = new ArrayList<>();

//		list2.add(new Item());

//		list2.add(5);

		list.add(5);
		list.add(8);

		System.out.println(list);


		LinkedList<Item> linkedList = new LinkedList<>();


		Collection<Item> items = linkedList;

		TreeSet<Comparable> sortedItems = new TreeSet<>();      //Set have not duplicates

		TreeSet<Comparable> sortedItems2 = new TreeSet<>(new Comparator() {
			@Override
			public int compare(Object o, Object t1) {
				return 0;
			}
		});

		
		
		
	}

	public static void printList(List list) {
		for (Object object : list) {
			System.out.println(object);
		}		
	}


}
