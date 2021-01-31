package program;

public class Abstract_1 extends Abstract {

	@Override
	public void sum2() {
		System.out.println("exam cancel");
	}

	@Override
	public void sum() {
		super.sum();
	}

	@Override
	public void sum1() {
		super.sum1();
	}public static void main(String[] args) {
		Abstract_1 a=new Abstract_1();
		a.sum();
		a.sum1();
		a.sum2();
	}

}
