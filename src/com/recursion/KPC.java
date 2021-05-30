package com.recursion;

import java.util.ArrayList;

public class KPC {
	public static void  KPC1(String ques, String ans) {
		
		return;
	}
	
	public static String getCode(char ch) {
		if (ch == '1')
			return "abc";
		else if (ch == '2')
			return "def";
		else if (ch == '3')
			return "ghi";
		else if (ch == '4')
			return "jk";
		else if (ch == '5')
			return "lmno";
		else if (ch == '6')
			return "pqr";
		else if (ch == '7')
			return "stu";
		else if (ch == '8')
			return "vwx";
		else if (ch == '9')
			return "yz";
		else if (ch == '0')
			return "@#";
		else
			return "";
	}
	public static void KPC2(String str) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("");
		
		for(int i = 0; i < str.length(); i++) {
			ArrayList<String> nl = new ArrayList<String>();
			String code = getCode(str.charAt(i));
			for(String val : list) {
				
				for(int j = 0; j < code.length() ; j++) {
					nl.add(val + code.charAt(j));
				}
				list = nl;
				
			}
			System.out.println(list);
			
		}
		
	}

	public static void main(String[] args) {
		

	}

}
