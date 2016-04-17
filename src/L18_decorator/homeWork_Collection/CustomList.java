package L18_decorator.homeWork_Collection;


import L10_Patterns.homeWork10.sort.Sorter;

import java.util.Comparator;

public interface CustomList extends CustomCollection {

	Object getElementAt(int index);

	boolean removeAt(int index);

	boolean sort(Sorter sorter, Comparator comparator);

}
