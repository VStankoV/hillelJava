package L11_12_13_collections.homeWork;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;

public class Main {
	public static void main(String[] args) {
		Collection<Float> floats = new ArrayList<>();

		floats.add(1.2598f);
		floats.add(1.0009f);
		floats.add(1.0887f);
		floats.add(1.99869f);
		floats.add(10.56985f);


		System.out.println(sumOfCollection(floats));

	}

	public static float sumOfCollection(Collection<Float> collection) {
		BigDecimal result = new BigDecimal(0);
		for (Float a : collection) {
			BigDecimal next = new BigDecimal(String.valueOf(a));
			result = result.add(next);
		}
		return result.floatValue();
	}
}
