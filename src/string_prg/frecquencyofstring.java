package string_prg;

public class frecquencyofstring {
	
	public static int countchar(String str,char ch) {
		
		int count =0; 
		while(str.indexOf(ch)!=-1) {
			count++;
			str=str.substring((str.indexOf(ch)+1));
		}
		return count;
	}
	
	public static void freqcount(String str) {
		str=str.replace(" ", ""); 
		 while(str.length()>0) {
			 char ch = str.charAt(0);
			 System.out.println(ch+" "+ countchar(str,ch));
			 str=str.replace(""+ch, "");
		 }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="joel suares";
		freqcount(str);
	}

}
