package com.wp.www;

import java.io.FileNotFoundException;



public class TesterMain {

	/**
	 * @param <K>
	 * @param <V>
	 * @param args
	 * @throws FileNotFoundException 
	 */

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		System.gc();		

		CreatnOrg co = new CreatnOrg(AlphaCounter.wordChecker("ifyoureadthisyourgay"));
		
		System.out.println(co.getsortedResult());
				
	}
	
	
	
}
