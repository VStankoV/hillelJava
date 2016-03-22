package L10_Patterns.homeWork10.compar;

import java.util.Comparator;

public abstract class MyComparator implements Comparator {
	/**
	 * if direction = 1 -> order Asc
	 * if direction = -1 -> order Desc
	 */
	private int direction = 1;

	public MyComparator() {
	}

	/**
	 * @param direction [0,+inf) Asc order
	 *                  (-inf,0) Desc order
	 */
	public MyComparator(int direction) {
		if (direction < 0) {
			this.direction = -1;
		} else if (direction >= 0) {
			this.direction = 1;
		}
	}

	public int getDirection() {
		return direction;
	}

	@Override
	public abstract int compare(Object obj1, Object obj2);

	@Override
	public abstract Comparator reversed();
}
