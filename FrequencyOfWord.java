package practice;
import java.util.*;
public class FrequencyOfWord {
	public static void main(String args[]) {
		HashMap<Character,Integer> mp = new HashMap<>();
		String str="aaabbbabcccac";
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(mp.containsKey(ch)) {
				mp.put(ch, mp.get(ch)+1);
			}else {
				mp.put(ch,1);
			}
		}
		System.out.println(mp);
	}
}
