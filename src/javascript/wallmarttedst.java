package javascript;

import java.util.HashMap;

public class wallmarttedst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="walmart is my company";
		
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		
		char[] charArray = s.toCharArray();
		int count =0;
		
	for(int i=0; i<charArray.length; i++) {
		
		
		if(map.containsKey(charArray[i])) {
			
			map.put(charArray[i], map.get(charArray[i])+1);
			
		}else {
			map.put(charArray[i], 1);
		}
		
		
		
		
		}
	
	
	
	}

}
