package com.wp.www;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
//import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

public class DictionaryImpl {

	private String currentstring;
	
	public static HashSet<String> dictionaryLoader(String path) {
		
		try {
			// Open the file that is the first
			// command line parameter
			HashSet<String> hststr = new HashSet<String>();
			FileInputStream fstream = new FileInputStream(path);
			// Get the object of DataInputStream
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;
			// Read File Line By Line
			while ((strLine = br.readLine()) != null) {
				// Print the content on the console
				hststr.add(strLine.toUpperCase(Locale.ENGLISH));
			}
			// Close the input stream
			in.close();
			return hststr;
		} catch (Exception e) {// Catch exception if any
			System.err.println("Error: " + e.getMessage());
		}
		
		HashSet<String> errorstring = new HashSet<String>();
		errorstring.add("Please ensure the file is in place");
		return errorstring;
	}

	public static HashSet<DictionaryImpl> dictionarySignatures() {
		
		return null;
	}

	public String getCurrentstring() {
		return currentstring;
	}

	public void setCurrentstring(String currentstring) {
		this.currentstring = currentstring;
	}
	
}
