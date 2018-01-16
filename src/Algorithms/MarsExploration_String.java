package Algorithms;

import com.sun.xml.internal.ws.util.StringUtils;

public class MarsExploration_String {
	public static void main(String[] args) {
		String s = "SOSSOT";
		System.out.println(marsExploration(s,0,0,s.length() - s.length()%3));
	}
	
	static int marsExploration(String s, int i, int number, int n) {
        if(i == n)
        	return number;
        return marsExploration(s,i+3,number + check(s,i),n);
        
    }
	public static int check(String s, int i) {
		int num = 0;
		if(s.charAt(i) != 'S')
			num++;
		if(s.charAt(i+1) != 'O')
			num++;
		if(s.charAt(i+2) != 'S')
			num++;
		return num;
	}
}
