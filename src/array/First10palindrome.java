package array;

public class First10palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 0;

		while (count <= 10) {
			int rev = 0;
			for (int num = 11; count <= 10; num++) {

				while (num > 0) {
					rev = rev * 10 + num % 10;
					num=num/10;
				}
				
				if(rev==num) {
					System.out.println(" palindrome :"+rev);
					count++;
				}

			}

		}
	}

}
