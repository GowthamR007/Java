package program1;

import java.util.Scanner;

public class Scanner1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter your name");
		
		String first = s.next();
		System.out.println("first name "+first);
		
		String last = s.nextLine();
		System.out.println("last name "+last);
		
		System.out.println("enter your age gf");
		int age = s.nextInt();
		System.out.println("your age "+age);
	}
}
