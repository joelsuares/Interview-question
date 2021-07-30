package string_prg;

public class stringcompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = new String("abc");
		String s2 = new String("abc");
		System.out.println(s1 == s2); 
		StringBuffer sb1 = new StringBuffer(s1);
		StringBuffer sb2 = new StringBuffer(s2);
		System.out.println(sb2.equals(sb1)); 
		String s3 = "abc";
		s3.intern(); 
		System.out.println(s1 ==s3); 
	}

}
