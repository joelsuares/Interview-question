package interviewquestion;

public class Swap_2number_without3rdvariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=5; 
		int y=4; 
		//without using 3rd variable 
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println(x);
		System.out.println(y);
		
		
	}

}
