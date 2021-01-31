package program;

public class String_programe {
	public static void main(String[] args) {
		String s = "    welcome java    ";
		char charAt = s.charAt(3);
		System.out.println(charAt);

		boolean contains = s.contains("co");
		System.out.println(contains);

		boolean equals = s.equals("welcome");
		System.out.println(equals);

		boolean equalsIgnoreCase = s.equalsIgnoreCase("welcome jaVa");
		System.out.println(equalsIgnoreCase);

		boolean endsWith = s.endsWith("va");
		System.out.println(endsWith);

		int indexOf = s.indexOf('w');
		System.out.println(indexOf);

		boolean empty = s.isEmpty();
		System.out.println(empty);

		int length = s.length();
		System.out.println(length);

		String replace = s.replace("we", "oo");
		System.out.println(replace);

		String[] split = s.split(" ");
		for (String string : split) {
		}
		System.out.println(split);

		boolean startsWith = s.startsWith("we");
		System.out.println(startsWith);

		String trim = s.trim();
		System.out.println(trim);

		String substring = s.substring(3);
		System.out.println(substring);
		String substring2 = s.substring(2, 4);
		System.out.println(substring2);
		
		
	}

}
