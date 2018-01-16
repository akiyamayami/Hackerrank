package Algorithms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class TwoCharacters_String {

	public static void main(String[] args) {
		String s = new String("beabeefeab");
		twoCharaters(s);
	}
	static int twoCharaters(String s) {
		//char[] arr = s.to;
		List<String> list = Arrays.asList(s.split(""));
		HashSet<String> uniqueValues = new HashSet<>(list);
		System.out.println(uniqueValues);
		String result;
		while(check(list,1,list.get(0))) {
			result = replace(list,1,list.get(0));
			if(result != null) {
				System.out.println(result);
				s = s.replaceAll(result,"");
				list = Arrays.asList(s.split(""));
			}
		}
		System.out.println(s);
		return 5;
    }
	static boolean check(List<String> list,int i, String preChar) {
		if(i == list.size())
			return false;
		if(list.get(i).equals(preChar)) 
			return true;
		else 
			return check(list,i + 1,list.get(i));
	}
	static String replace(List<String> list,int i, String preChar) {
		if(i == list.size())
			return null;
		if(list.get(i).equals(preChar))
			return list.get(i);
		else 
			return replace(list,i + 1,list.get(i));
	}
}
