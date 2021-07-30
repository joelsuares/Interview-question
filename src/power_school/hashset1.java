package power_school;

import java.util.HashSet;

public class hashset1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet shortSet = new HashSet(); 

		for (short i = 0; i < 100; i++) { 

		shortSet.add(i); 

		shortSet.remove(i - 1); 

		} 

		System.out.println(shortSet.size()); 
	}

}
