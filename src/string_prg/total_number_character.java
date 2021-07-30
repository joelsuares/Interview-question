package string_prg;

public class total_number_character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="JOEL SUVARES"; 
		int count =0; 
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)!=' ') {
				count++;
			}
			
		}
		System.out.println("total char in a string "+count);
		
	}

}
