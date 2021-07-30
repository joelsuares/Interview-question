package interviewquestion;

public class remove_special_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="!@##@$$Jo$@#$@#%(*&(&^%el sua%#$%#Dasda";
		
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
	}

}
