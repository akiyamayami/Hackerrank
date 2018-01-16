package Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author akiya
 *
 */
public class SuperReducedString_Strings {
	public static void main(String[] args) {
		String input = "baab";
		String[] y = input.split("");
		
		List<String> x =  new LinkedList<>(Arrays.asList(y));
		System.out.println(x);
		for (int i = 0; i < x.size() - 1; i++) {
			if(x.get(i).equals(x.get(i+1))) {
				x.remove(i);
				x.remove(i);
				i = -1;
			}
		}
		String result = String.join("", x);
		System.out.println(result);
		
	}

}
