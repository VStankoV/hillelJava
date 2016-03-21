package L10_Patterns.homeWork10.compar;

import java.util.Comparator;

public class IntegerComparator implements Comparator {
	/**
	 * if direction = 1 -> order Asc
	 * if direction = -1 -> order Desc
	 */
	int direction = 1;

	public IntegerComparator() {

	}

	/**
	 * @param direction [0,+inf) Asc order
	 *                  (-inf,0) Desc order
	 */
	public IntegerComparator(int direction) {
		if (direction < 0) {
			this.direction = -1;
		} else if (direction >= 0) {
			this.direction = 1;
		}
	}

	@Override
	public int compare(Object obj1, Object obj2) {
		int int1 = (int) obj1;
		int int2 = (int) obj2;
		int result = int1 < int2 ? -1 : int1 == int2 ? 0 : 1;
		return result * direction;
	}

	@Override
	public Comparator reversed() {
		return new IntegerComparator(-1);
	}
}
