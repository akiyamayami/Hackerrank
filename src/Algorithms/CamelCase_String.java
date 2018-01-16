package Algorithms;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.apache.tomcat.util.codec.binary.StringUtils;

public class CamelCase_String {
	
	
	
	public static void main(String[] args) {
		String s = "asdasdasdasd";
		System.out.println(camelcase(s));
		
	}
	static int camelcase(String s) {
		int count = 0;
		char[] arr = s.toCharArray();
		boolean flag = false;
		if(isUpperCase(arr[0]))
			return 0;
		count++;
		for (int i = 0; i < arr.length - 1; i++) {
			if(isUpperCase(arr[i]) && isLowerCase(arr[i+1])) {
				count ++;
			}
		}
        return count;
    }
	

	static boolean isLowerCase(char ch) {
	    return ch >= 'a' && ch <= 'z';
	}

	static boolean isUpperCase(char ch) {
	    return ch >= 'A' && ch <= 'Z';
	}
}
