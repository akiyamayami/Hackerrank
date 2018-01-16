package Algorithms;

import java.util.UUID;

public class CaesarCipher_String {
	public static void main(String[] args) {
		String s = "159357lcfd";
		char[] text = s.toCharArray();
		String x = "";
		int k = 98;
		System.out.println(caesarCipher(text,0,k,x));
		//System.out.println((char)108);
	}
	public static String caesarCipher(char[] text, int i, int k, String s) {
        if(i == text.length)
        	return s;
        int numeric = getNumeric(text[i]);
        System.out.println(numeric + " " + text[i]);
        switch (check(text[i])) {
		case 0:
			if(numeric + k > 90){
				int t = (64 + ((numeric - 64 + k) % 26));
				if(t == 64)
					return caesarCipher(text,i+1,k,s+=(char)90); 
				return caesarCipher(text,i+1,k,s+=(char)t); 
			}
			else {
				char q = (char) (numeric + k);
				return caesarCipher(text,i+1,k,s+=q); 
			}
		case 1:
			if(numeric + k > 122){
				int t = (96 + ((numeric - 96 + k) % 26));
				if(t == 96)
					return caesarCipher(text,i+1,k,s+=(char)122); 
				return caesarCipher(text,i+1,k,s+=(char)t); 
			}
			else {
				char q = (char) (numeric + k);
				return caesarCipher(text,i+1,k,s+=q); 
			}
		default:
			return caesarCipher(text,i+1,k,s+=text[i]);
        }
    }
	public static int getNumeric(char c) {
		return c;
	}
	
	public static int check(char c) {
		int numeric = getNumeric(c);
		if(numeric >= 65 && numeric <= 90)
			return 0;
		if(numeric >= 97 && numeric <= 122)
			return 1;
		return 2;
	}
}
