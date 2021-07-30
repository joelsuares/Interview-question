package string_prg;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "joel";
		String s2 = "JoEL";

		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();

		if (s1.length() != s2.length()) {
			System.out.println("both string not anagram");
		} else {

			char[] str1 = s1.toCharArray();
			char[] str2 = s2.toCharArray();

			Arrays.sort(str1);
			Arrays.sort(str2);
			
			
			if(Arrays.equals(str1, str2)==true) {
				System.out.println("both strings r anagram");
			}else {
				System.out.println("strings r not anagram");
			}
		}

	}

}
