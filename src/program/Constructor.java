package program;

public class Constructor {
	
	public Constructor() {
		System.out.println("non");
	}

	public Constructor(int i) {
		System.out.println("parameter " + i);

	}

	public Constructor(String s) {
		System.out.println("parameter " + s);

	}

	public static void main(String[] args) {
		Constructor c = new Constructor();
		Constructor c1 = new Constructor(123);
		Constructor c2 = new Constructor(456);
	}
}
