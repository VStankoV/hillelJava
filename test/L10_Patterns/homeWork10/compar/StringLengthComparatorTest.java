package L10_Patterns.homeWork10.compar;

import org.junit.Assert;
import org.junit.Test;

import java.util.Comparator;

public class StringLengthComparatorTest {

	@Test
	public void testCompare() throws Exception {
		Comparator comparator = new StringLengthComparator();
		Comparator comparatorReversed = comparator.reversed();

		Object o1 = "hi";
		Object o2 = "hello";

		Assert.assertEquals(-1, comparator.compare(o1, o2));
		Assert.assertEquals(1, comparator.compare(o2, o1));
		Assert.assertEquals(0, comparator.compare(o2, "12345"));

		Assert.assertEquals(1, comparatorReversed.compare(o1, o2));
		Assert.assertEquals(-1, comparatorReversed.compare(o2, o1));


	}

}