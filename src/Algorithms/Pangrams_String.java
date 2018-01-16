package Algorithms;

import java.util.Scanner;

public class Pangrams_String {

	public static void main(String[] args) {
		String[] apha = {"q","w","e","r","t","y","u","i","o","p","a","s","d","f","g","h","j","k","l","z","x","c","v","b","n","m"};
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String s = "";
		while(scanner.hasNext()) {
			s += scanner.next();
		}
		//String s = "qmExzBIJmdELxyOFWv LOCmefk TwPhargKSPEqSxzveiun";
		s = s.replaceAll(" ","").toLowerCase();
		System.out.println(checkPangrams(apha,0,s,apha.length));
	}

	public static String checkPangrams(String[] apha, int i, String s,int n) {
		if(i == n)
			return "pangram";
		if(s.indexOf(apha[i]) == -1)
			return "not pangram";
		return checkPangrams(apha,i+1,s,n);
	}
}
