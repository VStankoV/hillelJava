package L14_Collection_Map;

import L08_Inheritance.Person;

import java.util.HashMap;
import java.util.Map;

public class MapMain {
	public static void main(String[] args) {

		Map<Person, Integer> personToDiscount = new HashMap<>();

		personToDiscount.put(new Person("Vasya"), 10);
		personToDiscount.put(new Person("Petya"), 10);
		personToDiscount.put(new Person("Vova"), 10);

		personToDiscount.put(new Person("Vasya"), 20);  //perezpishet prediduschiy entry

		Integer vasyaDiscount = personToDiscount.get(new Person("Vasya"));

		System.out.println(vasyaDiscount);

		doStuff(personToDiscount);



		for (Map.Entry<Person, Integer> personIntegerEntry : personToDiscount.entrySet()) {
			System.out.println(personIntegerEntry.getKey() +" "+personIntegerEntry.getValue());

//			personIntegerEntry.setValue(15);
		}

		for (Person person : personToDiscount.keySet()){
			System.out.println(personToDiscount.get(person));
		}



	}

	private static void doStuff(Map<Person, Integer> personToDiscount) {
		personToDiscount.put(new Person("John"), 25);
	}
}
