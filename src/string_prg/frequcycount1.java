package string_prg;

public class frequcycount1 {
	
	public static int charcount(String str,char ch) {
		
		int count =0; 
		while(str.indexOf(ch)!=-1) {
			count++;
			str=str.substring(str.indexOf(ch)+1);
		}
		return count;
		
	}

	public static void freqncy(String str) {
		str=str.replace(" ", "");
		while(str.length()>0) {
			char ch = str.charAt(0);
			System.out.println(ch +" "+charcount(str,ch));
			str=str.replace(""+ch, "");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Joel suares"; 
		freqncy(s);
		

	}

}
