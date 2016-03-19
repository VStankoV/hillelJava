package L11_collections;

import L09_OOP_ext.homeWork.t01_hierarchy.pets.Cat;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList list = new ArrayList(20);

		ArrayList<Cat> list2 = new ArrayList<>();

		list2.add(new Cat());

//		list2.add(5);

		list.add(5);
		list.add(8);



		System.out.println(list);
	}


}
