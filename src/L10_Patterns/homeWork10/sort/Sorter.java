package L10_Patterns.homeWork10.sort;

import java.util.Comparator;

public interface Sorter {
	void sort(Object[] objects, Comparator comparator);
	void sort(Comparable[] objects);
}
