package string_prg;

public class reverse_a_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Joel suares";

		String reverse = "";

		for (int i =s.length()-1; i >=0; i--) {

			reverse=reverse+s.charAt(i);
		}
		
		System.out.println(reverse);
	}

}
