package com.wp.www;

import java.util.ArrayList;
import java.util.Locale;
//import java.util.Collection;
//import java.util.HashSet;
import java.util.HashSet;

public class StringJumbler {

	public static HashSet<String> perWord(String actualletters) {
		HashSet<String> hsstr = new HashSet<String>(
				PermutationFinder(actualletters));
		HashSet<String> minor = new HashSet<String>();

		for (String lol : hsstr) {
			for (int i = 0; i < lol.length(); i++) {
				minor.add(breakWord(lol, i));
			}
		}
		hsstr.addAll(minor);
		return hsstr;
	}

	private static ArrayList<String> PermutationFinder(String nani) {
		String s = nani.toUpperCase(Locale.ENGLISH);
		ArrayList<String> perm = new ArrayList<String>();
		if (s == null) { // error case
			return null;
		} else if (s.length() > 15) {
			perm.add("try 15 or less alphabets");
			return perm;
		} else if (s.length() == 0) {
			perm.add(""); // initial
			return perm;
		}

		char initial = s.charAt(0); // first character
		String rem = s.substring(1); // Full string without first character
		ArrayList<String> words = PermutationFinder(rem);
		for (String str : words) {
			for (int i = 0; i <= str.length(); i++) {
				perm.add(charinsert(str, initial, i));
			}
		}
		return perm;
	}

	private static String charinsert(String str, char c, int i) {
		String begin = str.substring(0, i);
		String end = str.substring(i);
		return begin + c + end;
	}

	private static String breakWord(String s, int beginIndex) {
		if (s.substring(beginIndex).length() > 1)
		return s.substring(beginIndex);
		else return null;
	}	

}
