package interviewquestion;

import java.util.Arrays;

public class Largest_smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 3, 4, 6, 7, 89, 345, 8794, 11, 12, 13, 14 };

		int smallest = a[0];
		int largest = a[0];

		for (int i = 1; i < a.length; i++) {

			if(a[i]>largest) {
				largest=a[i];
			}else if(a[i]<smallest) {
				smallest=a[i];
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println("smallest number "+smallest);
		System.out.println("largert number "+largest);

	}

}
