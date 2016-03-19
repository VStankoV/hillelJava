package L10_Patterns.homeWork10;

import java.util.Comparator;

public class TheItem implements Comparable {
	@Override
	public int compareTo(Object o) {
		return 0;
	}

	public static void main(String[] args) {
		Integer a1 = new Integer(10);
		Integer a2 = new Integer(20);

		System.out.println(a1.compareTo(a2));
		System.out.println(a1.compareTo(10));
		System.out.println(a2.compareTo(a1));

		Comparator comparator = new Comparator() {
			@Override
			public int compare(Object o, Object t1) {
				return 0;
			}
		};


	}
}
