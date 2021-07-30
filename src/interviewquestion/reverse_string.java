package interviewquestion;

public class reverse_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Joel Suares"; 
		String reverse="";
		
		for(int i=s.length(); i>0; i--) {
			
			 reverse=reverse+s.charAt(i-1);
		}
		System.out.println(reverse);
	}

}
