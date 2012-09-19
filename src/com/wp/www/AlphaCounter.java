package com.wp.www;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

public class AlphaCounter {
	
	public static HashSet<String> wordChecker(String IPString){
		IPString = IPString.toUpperCase();
		HashSet<String> dictionaryhashset = DictionaryImpl.dictionaryLoader("src/pocket-dic.txt");//le Dictionary
		HashSet<String> resultantHS = new HashSet<String>();
		int index = 0;
		for(String s : dictionaryhashset){
			for(int i : AlphaCounter.getLetterSignatureLst(IPString)){
				if(AlphaCounter.getLetterSignatureLst(IPString).get(index)>=AlphaCounter.getLetterSignatureLst(s).get(index)){

					if(index==25){
						if(s.length()<2){
							index = 0;
							break;
						}
						resultantHS.add(s);
						index=0;
						break;
					}
					index++;
					
				}
				else{
					index = 0;
					break;
					}
			}
			
		}
		return resultantHS;
		}

	public static ArrayList<Integer> getLetterSignatureLst(String input) {

		ArrayList<Integer> intobj = new ArrayList<Integer>();

		input = input.replaceAll("\\s", "");
		char[] IPCharArr = input.toUpperCase(Locale.ENGLISH).toCharArray();
		// convert string to upper case and then char array

		int letterSignature[] = arrayFiller(IPCharArr);

		// passes and fills character arrays

		for (int i : letterSignature) {
			intobj.add(i);
		}
		return intobj;
	}

	private static int[] arrayFiller(char[] IPCharArr) {

		int integerarray[] = new int[26];
		for (char c : IPCharArr) {
			integerarray[(int) c - 65]++;
		}
		// stores incremented numbers in created array of 26
		return integerarray;
	}
	
	

}
