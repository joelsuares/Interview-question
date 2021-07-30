package interviewquestion;

public class Missing_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {4,5,6,7,9,11,14,15,20}; 
		int count=1; 
		
		for(int i=0; i<a.length; i++) {
			
			if(count!=a[i]) {
				System.out.println(count);
				i--;
			}
			count++;
		}
	}

}
