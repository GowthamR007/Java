package program;

public class Overriding_1 extends Overriding {
	@Override
	public void loading() {
		super.loading();

		System.out.println("hai");
	}

	public static void main(String[] args) {
		Overriding_1 o = new Overriding_1();
		o.loading();
	}
}
