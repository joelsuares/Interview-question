package power_school;

import java.util.Scanner;

public class palindrome_string {

	public static boolean PalindromeTwo(String str) {

		int length = str.length();
		String reverse = "";

		for (int i = length - 1; i >= 0; i--) {

			reverse = reverse + str.charAt(i);

		}

		if(str==reverse) {
			return true;
		}else {
			return false;
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print(PalindromeTwo(s.nextLine()));
	}

}
