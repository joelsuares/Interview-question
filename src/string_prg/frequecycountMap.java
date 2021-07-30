package string_prg;

import java.util.LinkedHashMap;
import java.util.Map;

public class frequecycountMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map frequceny = new LinkedHashMap<Character, Integer>();
 
		String str = "hilda pereira";
		str = str.replace(" ", "");

		for(char ch: str.toCharArray()) {
			
			if(frequceny.containsKey(ch)) {
				frequceny.put(ch, (Integer)frequceny.get(ch)+1);
			}else {
				frequceny.put(ch, 1);
			}
		}
		System.out.println(frequceny);
	}

}
