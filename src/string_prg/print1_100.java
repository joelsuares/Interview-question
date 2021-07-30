package string_prg;

public class print1_100 {
	
	public static void printnum(int num) {
		
		if(num>0 && num<=100) {
			System.out.println(num);
			num++; 
			printnum(num);
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printnum(1);
	}

}
