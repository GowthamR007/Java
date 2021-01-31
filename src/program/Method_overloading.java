package program;

public class Method_overloading {
	public void Method_overloading() {
		System.out.println("eassy program");

	}

	public void Method_overloading(int id) {
		System.out.println("defecult programe " + id);
	}

	public void Method_overloading(String st) {
		System.out.println("program "+st);

	}public static void main(String[] args) {
		Method_overloading s=new Method_overloading();
	s.Method_overloading();
	s.Method_overloading(123);
	s.Method_overloading("no");
	}

}
