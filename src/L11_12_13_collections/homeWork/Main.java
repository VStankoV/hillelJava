package L11_12_13_collections.homeWork;

import java.util.Collection;

public class Main {
	public static void main(String[] args) {

	}

	public static double sumOfCollection(Collection<Float> collection) {
		double result = 0;
		for (Float a : collection) {
			result += a;
		}
		return result;
	}
}
