package sdetassignment;

import java.util.HashMap;

public class Problem2 {

	public static void patternString(String pt, String str) {
		boolean success = true;
		String[] ptArray = pt.split("");
		String[] stArray = str.split(" ");

		if (stArray.length != ptArray.length) {
			success = false;
		}

		else {
			HashMap<String, String> hmap = new HashMap<String, String>();
			for (int i = 0; i < stArray.length; i++) {
				if (hmap.containsKey(stArray[i])) {
					if (!hmap.get(stArray[i]).equals(ptArray[i])) {
						success = false;
					}
				} else {
					hmap.put(stArray[i], ptArray[i]);
				}
			}
			
		}
		if(success) {
			System.out.println(pt+"given pattern is matched: " + str + " : "+ true);
		}
		else {
			System.out.println(pt+"given pattern is not matched: "+ str + " : "+ false);

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Problem2.patternString("abba", "hungry Food Food hungry");
		Problem2.patternString("aaba", "hungry hungry Food hungry");
		Problem2.patternString("abba", "hungry Food hungry Food");
		Problem2.patternString("abba", "hungry Food hungry hungry");
		Problem2.patternString("aaaa", "hungry Food hungry Food");
	}

}
