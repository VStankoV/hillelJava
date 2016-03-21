package L10_Patterns.homeWork10.compar;

import org.junit.Assert;
import org.junit.Test;

import java.util.Comparator;

public class IntegerComparatorTest {

	@Test
	public void testCompare() throws Exception {
		Comparator comparator = new IntegerComparator();
		Comparator comparatorReversed = comparator.reversed();

		Object o1 = new Integer(5);
		Object o2 = new Integer(8);

		Assert.assertEquals(-1, comparator.compare(o1, o2));
		Assert.assertEquals(1, comparator.compare(o2, o1));
		Assert.assertEquals(0, comparator.compare(o2, 8));

		Assert.assertEquals(1, comparatorReversed.compare(o1, o2));
		Assert.assertEquals(-1, comparatorReversed.compare(o2, o1));


	}
}