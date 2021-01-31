package program;

public class Mutable {
	public static void main(String[] args) {
		// String Buffer s = new String Buffer("");
		StringBuffer s = new StringBuffer("green");
		System.out.println(System.identityHashCode(s));
		StringBuffer s1 = new StringBuffer("green");
		System.out.println(System.identityHashCode(s1));
		StringBuffer s2 = new StringBuffer("Green");
		System.out.println(System.identityHashCode(s2));
		s = s.append(s1);
		System.out.println(s1);
		System.out.println(System.identityHashCode(s));
	}

}
