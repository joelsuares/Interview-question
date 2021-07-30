package interviewquestion;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Duplicate_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name[] = { "java", "javascript", "c", "nodejs", "java", "c" };

		// time complexity o(n)2
		for (int i = 0; i < name.length; i++) {
			for (int j = i + 1; j < name.length; j++) {

				if (name[i].equals(name[j])) {
					System.out.println(name[i]);
				}

			}
		}
		System.out.println("***************");
		// 2.hashset

		// time complexty o(n)
		Set<String> store = new HashSet<String>();

		for (String names : name) {
			if (store.add(names) == false) {
				System.out.println(names);
			}
		}

		System.out.println("************************");
		// 3rd soltuion using hashmap

		Map<String, Integer> store1 = new HashMap<String, Integer>();

		for (String names : name) {
			Integer count = store1.get(names);
			if (count == null) {
				store1.put(names, 1);
			} else {
				store1.put(names, ++count);
			}
		}
		
		//get the values from the hashmap 
		
		Set<Entry<String, Integer>> entrySet = store1.entrySet();
		for(Entry<String, Integer> entry:entrySet) {
			if(entry.getValue()>1) {
				System.out.println("duplicate element is :"+entry.getKey());
			}
		}

		System.out.println("********************");
		//3rd solution repeat
		
		Map<String,Integer> storemap=new HashMap<String,Integer>();
		
		for(String names1:name) {
			Integer count = storemap.get(names1);
			if(count == null) {
				storemap.put(names1, 1);
			}else {
				storemap.put(names1, ++count);
			}
		}
		
		Set<Entry<String, Integer>> entrySet2 = storemap.entrySet();
		for(Entry<String, Integer> entrySet1:entrySet2) {
			if(entrySet1.getValue()>1) {
				System.out.println("duplicate element "+entrySet1.getKey());
			}
		}
	}

}
