package array;

public class reverse_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,4,5,6,7};
		System.out.println("before reverse");
		
		for(int arr :a) {
			System.out.print(arr+" ");
		}
		
		for(int i=0, j=a.length-1; i<=j; i++,j--) {
			
			if(i<j) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				
			}
		}
		System.out.println("after reverse");
		
		for(int arr1 :a) {
			System.out.print(arr1+" ");
		}
		
	}

}
