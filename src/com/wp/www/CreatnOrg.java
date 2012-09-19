package com.wp.www;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import java.util.HashSet;
import java.util.List;


public class CreatnOrg {

	private HashSet<String> result;
	private List<String> sortedresult, result02, result03, result04, result05,
	result06, result07, result08, result09, result10, result11,
	result12, result13, result14, result15;
	

	public CreatnOrg(HashSet<String> input) {
		super();

		result = new HashSet<String>(input);
//		result.retainAll(DictionaryImpl.dictionaryLoader("src/pocket-dic.txt"));
		// now the result is ready to be sorted

		String[] strarr = result.toArray(new String[0]);
		sortedresult = Arrays.asList(strarr);
		Collections.sort(sortedresult);
		// the result is now sorted, it needs to be classified according to the
		// number of letters it has
		
		result02 = new ArrayList<String>();
		result03 = new ArrayList<String>();
		result04 = new ArrayList<String>();
		result05 = new ArrayList<String>();
		result06 = new ArrayList<String>();
		result07 = new ArrayList<String>();
		result08 = new ArrayList<String>();
		result09 = new ArrayList<String>();
		result10 = new ArrayList<String>();
		result11 = new ArrayList<String>();
		result12 = new ArrayList<String>();
		result13 = new ArrayList<String>();
		result14 = new ArrayList<String>();
		result15 = new ArrayList<String>();
		
		for (String s : sortedresult) {

			int length = s.length();
			switch (length) {
			case 2:
				setResult02(s);
				break;
			case 3:
				setResult03(s);
				break;
			case 4:
				setResult04(s);
				break;
			case 5:
				setResult05(s);
				break;
			case 6:
				setResult06(s);
				break;
			case 7:
				setResult07(s);
				break;
			case 8:
				setResult08(s);
				break;
			case 9:
				setResult09(s);
				break;
			case 10:
				setResult10(s);
				break;
			case 11:
				setResult11(s);
				break;
			case 12:
				setResult12(s);
				break;
			case 13:
				setResult13(s);
				break;
			case 14:
				setResult14(s);
				break;
			case 15:
				setResult15(s);
				break;
			default:
				break;

			}
		}

	}

	private void setResult02(String s) {
		result02.add(s);
	}

	private void setResult03(String s) {
		this.result03.add(s);
	}

	private void setResult04(String s) {
		this.result04.add(s);
	}

	private void setResult05(String s) {
		this.result05.add(s);
	}

	private void setResult06(String s) {
		this.result06.add(s);
	}

	private void setResult07(String s) {
		this.result07.add(s);
	}

	private void setResult08(String s) {
		this.result08.add(s);
	}

	private void setResult09(String s) {
		this.result09.add(s);
	}

	private void setResult10(String s) {
		this.result10.add(s);
	}

	private void setResult11(String s) {
		this.result11.add(s);
	}

	private void setResult12(String s) {
		this.result12.add(s);
	}

	private void setResult13(String s) {
		this.result13.add(s);
	}

	private void setResult14(String s) {
		this.result14.add(s);
	}

	private void setResult15(String s) {
		this.result15.add(s);
	}

	public HashSet<String> getResult() {
		return result;
	}

	public List<String> getsortedResult() {
		return sortedresult;
	}

	public List<String> getResult02() {
		return result02;
	}

	public List<String> getResult03() {
		return result03;
	}

	public List<String> getResult04() {
		return result04;
	}

	public List<String> getResult05() {
		return result05;
	}

	public List<String> getResult06() {
		return result06;
	}

	public List<String> getResult07() {
		return result07;
	}

	public List<String> getResult08() {
		return result08;
	}

	public List<String> getResult09() {
		return result09;
	}

	public List<String> getResult10() {
		return result10;
	}

	public List<String> getResult11() {
		return result11;
	}

	public List<String> getResult12() {
		return result12;
	}

	public List<String> getResult13() {
		return result13;
	}

	public List<String> getResult14() {
		return result14;
	}

	public List<String> getResult15() {
		return result15;
	}

	
}
