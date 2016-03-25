package L11_12_13_collections.patternIterator;

import java.util.Iterator;

public class IteratorMain {
	public static void main(String[] args) {

		Iterator iterator = new ArrayIterator(new Integer[]{5,6,9,7,8,5,1,6,6,8,6,5,5,});

		iterate(iterator);

	}

	public static void iterate (Iterator iterator){
		while (iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
}
