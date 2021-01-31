package program;

import java.util.ArrayList;
import java.util.List;

public class List_1 {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		System.out.println(l);

		Integer integer = l.get(2);
        System.out.println(integer);

		l.add(2, 33);
		System.out.println(l);

		int size = l.size();
		System.out.println(size);

		boolean contains = l.contains(30);
		System.out.println(contains);

		l.clear();
		System.out.println(l);

		boolean containsAll = l.containsAll(l);
		System.out.println(containsAll);

		boolean equals = l.equals(l);
		System.out.println(equals);

	}
}
