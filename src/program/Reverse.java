package program;

public class Reverse {
	public static void reverse() {

		String s = "welcome";
		String r = " ";
		for (int i = s.length() - 1; i >= 0; i++) {
			r = r + s.charAt(i);
		}
		System.out.println("reverse" + r);

	}

	public static void main(String[] args) {
		reverse();
	}
}
