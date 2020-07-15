package sdetassignment;

import java.util.Arrays;

public class Problem1 {

	public static void zipzagPattern(String str, int rows) {

		if (rows == 1) {
			System.out.println(str);
			return;
		}

		char[] ch = str.toCharArray();
		int chLeg = ch.length;

		String[] stArray = new String[rows];
		Arrays.fill(stArray, "");
		int j = 0;
		boolean stop = true;
		for (int i = 0; i < chLeg; i++) {
			stArray[j] = stArray[j] + ch[i];
			if (j == rows - 1) {
				stop = false;
			} else if (j == 0) {
				stop = true;
			}
			if (stop) {
				j++;
			} else {
				j--;
			}
		}
		for (int i = 0; i < rows; i++) {
			System.out.println(stArray[i]);
		}

	}

	public static void main(String args[]) {

		Problem1.zipzagPattern("rajendrav", 2);
	}

}
