package string_prg;

import java.util.LinkedHashMap;
import java.util.Map;

public class Occurnceofcharinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="joel suares";
		s=s.replaceAll(" ", "");
		
		Map freqycount = new LinkedHashMap<Character,Integer>();
		
		for(char ch: s.toCharArray()) {
			
			if(freqycount.containsKey(ch)) {
				freqycount.put(ch, (Integer)freqycount.get(ch)+1);
			}else {
				freqycount.put(ch, 1);
			}
		}
		System.out.println(freqycount);
	}

}
