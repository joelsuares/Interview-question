package interviewquestion;

public class StringSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="hello"; 
		String b="world"; 
		System.out.println("before swapping");
		System.out.println(a);
		System.out.println(b);
		
		//1.strign append 
		a=a+b; //a=helloworld
		
		//2.store inital string in string b 
		b=a.substring(0, a.length()-b.length());  //b=hello
		
		//3.store intial string b in string a
		
		a=a.substring(b.length());  //a=
		
		System.out.println("after swapping");
		System.out.println(a);
		System.out.println(b);
		
		
	}

}
