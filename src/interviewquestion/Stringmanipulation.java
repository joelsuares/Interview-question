package interviewquestion;

public class Stringmanipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "the rains have started here selenium";
		String str1 = "the rains have started here selenIum";
		System.out.println(str.length());

		System.out.println(str.charAt(5));

		System.out.println(str.indexOf("s"));

		System.out.println(str.indexOf("s", str.indexOf("s") + 1));

		System.out.println(str.indexOf("s", str.indexOf("s", str.indexOf("s") + 1) + 1));

		System.out.println(str.indexOf("have"));

		System.out.println(str.indexOf("hello"));

		// string comparison

		System.out.println(str.equals(str1));

		System.out.println(str.equalsIgnoreCase(str1));

		// substring
		System.out.println(str.substring(0, 8));

		// trim
		String s = "  hello world  ";
		System.out.println(s.trim());

		System.out.println(s.replace(" ", ""));

		String date = "25-01-1994";
		System.out.println(date.replace("-", "/"));

		String test = "hello_world_test_selenium";
		String[] split = test.split("_");

		for (int i = 0; i < split.length; i++) {

			System.out.println(split[i]);
		}

	}

}
