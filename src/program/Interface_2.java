package program;

public class Interface_2 implements Interface_1 {

	@Override
	public void sum() {
		System.out.println("test");
	}

	@Override
	public void sum1() {
		System.out.println("test1");
	}

	@Override
	public void sum2() {
		System.out.println("test2");
	}

	public static void main(String[] args) {
		Interface_2 i = new Interface_2();
		i.sum();
		i.sum1();
		i.sum2();
	}

}
