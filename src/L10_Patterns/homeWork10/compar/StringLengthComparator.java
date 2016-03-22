package L10_Patterns.homeWork10.compar;

import java.util.Comparator;

public class StringLengthComparator extends MyComparator {

	public StringLengthComparator() {
	}

	public StringLengthComparator(int direction) {
		super(direction);
	}

	@Override
	public int compare(Object obj1, Object obj2) {
		int int1 = ((String) obj1).length();
		int int2 = ((String) obj2).length();

		int result = int1 < int2 ? -1 : int1 == int2 ? 0 : 1;
		return result * getDirection();

	}

	@Override
	public Comparator reversed() {
		return new StringLengthComparator(-1);
	}
}
