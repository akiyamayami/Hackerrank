import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class qweqweqw {
	
	
	private static final String FILENAME = "E:\\test\\filename.txt";
	public static List<String> TT = new ArrayList<String>();
	public static String[] listxxxx = new String[]{"a", "q","w","e","r","t","y","u","i","o","p","s","d","f","g","h","j","k","l","z","x","c","v","b","n","m"};
	//public static String[] listxxxx = new String[] {"a","b","c","d"};
	//public static List<String> apha = Arrays.asList(listxxxx);
	public static List<th> listG = new ArrayList<>();
	public static void main(String[] args) {
		
		String[] list = new String[]{"gatherer", "gatherera","guideless","fortiter","john","effluvium","effluj","emydidae","eschscholtzia","repelling","receptacle","radicle","riyadh","aris","appeaser","applaud","albetur","adulterously","admeasurement","bhadon","burseraceae","bloodsucking","bootlegging","passionflower","phenol","phagocyte","queen","neopallium","numps","noncollapsible","hebdomadary","hanoi","hoox","hoot","calumniate","chapatti","chaq","channelization","closely","closelfa","coast","unbowed","unpublished","uncalled","zebra","tradespeople","trumpet","tanker","tasf","taskmistress","tasv","touchily","tsimshian","lactescent","licet","limiting","duma","opp","ocelot","metagenesis","metay","melampodium","mao","maidenly","sylvanus","seam","shiner","scombroidea","steeped","sod","ileum","imperator","wiggle"};
//		String[] list = new String[] {
//				"dd",
//				"db",
//				"da",
//				"cd",
//				"ca",
//				"cc"};
		List<String> newLits = Arrays.asList(list);
		
		
		String minStr = null;
		List<String> listTam = new ArrayList<>();

		for(int j = 0 ; j < 1 ; j++)
		{
			for (int i = 0; i < newLits.size(); i++) {
				if(i == newLits.size() - 1)
				{
					break;
				}
				if(check(newLits.get(i),newLits.get(i+1))) {
					listTam.add(newLits.get(i));
					listTam.add(newLits.get(i+1));
					listG.addAll(findMinInListTam(minStr,listTam));
					listTam.clear();
				}
				else {
					listG.add(new th(Character.toString(newLits.get(i).charAt(0)),Character.toString(newLits.get(i+1).charAt(0))));
				}
			}
			
			TT.add(findMin(listG));
			System.out.println("----------------");
			for (int i = 0; i < listG.size(); i++) {
				System.out.println(listG.get(i).getS1());
				if(listG.get(i).getS1().equals(TT.get(0))) {
					listG.remove(i);
					i--;
				}
			}
			for (int i = 0; i < listxxxx.length; i++) {
				if(listxxxx[i].equals(TT.get(TT.size()-1)))
				{
					listxxxx[i] = "#";
				}
			}
			//System.out.println(listxxxx[3]);
			TT.add(findMin(listG));
			System.out.println("----------------");
			
			while(!listG.isEmpty()) {
				System.out.println("Size = " + listG.size());
				for (int i = 0; i < listG.size(); i++) {
					System.out.println(listG.get(i).getS1());
					if(listG.get(i).getS1().equals(TT.get(TT.size()-1))) {
						listG.remove(i);
						i--;
					}
				}
				for (int i = 0; i < listxxxx.length; i++) {
					if(listxxxx[i].equals(TT.get(TT.size()-1)))
					{
						listxxxx[i] = "#";
					}
				}
				TT.add(findMin(listG));
			}
			System.out.println(TT.toString());
			
			for (th string : listG) {
				System.out.println(string.toString());
			}
			System.out.println(TT.toString());
		}
		
	}

	public static List<th> findMinInListTam(String minStr, List<String> listTam) {
		List<th> listG = new ArrayList<>();
		int index = 1;
		int maxl = -1;
		for (int i = 0; i < listTam.size(); i++) {
			if(maxl < listTam.get(i).length())
				maxl = listTam.get(i).length();
		}
		List<String> listAtIndex = new ArrayList<>();
		List<List<String>> listStringIndex = new ArrayList<>();
		for(int i = 1 ; i < maxl; i++) {
			listAtIndex = getListAt(i, listTam);
			listStringIndex.add(listAtIndex);
		}
		String s1,s2;
		for(int i = 0 ; i < listStringIndex.size(); i++) {
			s1 = listStringIndex.get(i).get(0);
			s2 = listStringIndex.get(i).get(1);
			if(s1.equals("#") || s2.equals("#"))
				break;
			if(s1.equals(s2))
				continue;
			listG.add(new th(s1,s2));
			return listG;
		}
		return listG;
	}
	
	public static List<String> getListAt(int index, List<String> list){
		List<String> listnew = new ArrayList<>();
		for (String string : list) {
			if(index < string.length())
				listnew.add(Character.toString(string.charAt(index)));
			else {
				listnew.add("#");
			}
		}
		System.out.println(listnew);
		return listnew;
	}
	
	public static String findMin(List<th> listG) {
		int flag = 0;
		for (String h : listxxxx) {
			if(h.equals("#"))
				continue;
			for(th t : listG) {
				if(h.equals(t.getS2())) {
					flag = 1;
					break;
				}
			}
			if(flag == 0) {
				return h;
			}
			flag = 0;
		}
		return "";
	}
	public static boolean check(String s1, String s2) {
		//System.out.println(Character.toString(s1.charAt(indexCheck)) + " và " + Character.toString(s2.charAt(indexCheck)));
		if(Character.toString(s1.charAt(0)).equals(Character.toString(s2.charAt(0))))
			return true;
		return false;
	}

}
