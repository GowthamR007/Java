package program;

public class Immutable {
	public static void main(String[] args) {
// immutable syndax == String referencename = "referencename"
		String s = "green";
		System.out.println(System.identityHashCode(s));

		String s1 = "green";
		System.out.println(System.identityHashCode(s1));

		String s3 = "Green";
		System.out.println(System.identityHashCode(s3));

		s = s + s1;    //concordinate
		System.out.println(System.identityHashCode(s));
	}
}
