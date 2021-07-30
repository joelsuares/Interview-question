package string_prg;

public class primenumber {

	public static void primenumber(int n) {

		boolean flag=true;  
		
		for(int i=2; i<=n/2; i++) {
			if(n%i==0) {
				flag=false;
				System.out.println(n+" divisible by number r "+i);
			}
		}
		if(flag==true) {
			System.out.println("number is prime");
		}else {
			System.out.println("number is not prime");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		primenumber(15);
	}

}
