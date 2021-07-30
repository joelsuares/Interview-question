package string_prg;

import java.util.Scanner;

public class fuzzbizz {
	
	
	public static void fizz(int n) {
		
		for(int i=1; i<=n; i++) {
			
			if(i%3==0 && i%5==0) {
				System.out.println("fizzbuzz");
			}else if(i%3==0) {
				System.out.println("fizz");
			}else if(i%5 ==0) {
				System.out.println("buzz");
			}else {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in); 
		int num  = sc.nextInt();
		fizz(num);
	}

}
