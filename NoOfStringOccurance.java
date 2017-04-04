package String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class NoOfStringOccurance {

	static int i,j,k,c=0,w;
	static char m;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		frequecyCount("thetigerfire");

	}

	private static void frequecyCount(String str){
		char[] z = new char[str.length()];

		for(int i=0;i<str.length();i++){
			z[i] = str.charAt(i);
		}
		Map< Character, Integer> contMap = new HashMap<>();
		for(int j=0;j<z.length;j++){
			if(contMap.containsKey(z[j])){
				contMap.put(z[j],contMap.get(z[j])+1);
			}else{
				contMap.put(z[j],1);
			}

		}
		Set<Map.Entry<Character, Integer>> entrySet = contMap.entrySet();
		
		for(Entry entry : entrySet){
			System.out.println(entry.getKey()+"::occurence is::"+entry.getValue());
		}
	}
}

