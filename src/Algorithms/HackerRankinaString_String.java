package Algorithms;

public class HackerRankinaString_String {

	public static void main(String[] args) {
		String[] q = "hackerrank".split("");
		String[] s = "hackerworld".split("");
		System.out.println(hackerrankInString(s,0,q,0));
	}
	
	public static String hackerrankInString(String[] s, int i, String[] q, int k) {
        if(i == s.length) {
        	if(check(q))
        		return "YES";
        	return "NO";
        }
        //System.out.println(s[i] + " " + q[k] + " res :" + q[k].equals(s[i]));
        if(q[k].equals(s[i])) {
        	q[k] = "#";
        	k++;
        	if(k == q.length)
        		return "YES";
        }
        return hackerrankInString(s,i+1,q,k);
    }
	
	public static boolean check(String[] q) {
		for (String string : q) {
			if(!string.equals("#"))
				return false;
		}
		return true;
	}

}
