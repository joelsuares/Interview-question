package array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class converthashmaptoarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create a empty hashmap
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		// fill the map with values
		map.put("joel", 1);
		map.put("john", 2);
		map.put("hilda", 3);
		map.put("jasmin", 4);

		Set<String> keySet = map.keySet();

		ArrayList<String> listofkeys = new ArrayList<String>(keySet);
		
		Collection<Integer> values = map.values();
		
		ArrayList<Integer> listofvalues=new ArrayList<Integer>(values);
		
		System.out.println("List of keys "+ listofkeys);
		System.out.println("List of values "+ listofvalues);

	}

}
