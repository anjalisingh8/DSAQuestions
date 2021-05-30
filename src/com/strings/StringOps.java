package com.strings;

import java.util.Scanner;

public class StringOps {
	
	public static void printCharacter(String str) {
		
		for(int i = 0; i < str.length(); i ++) {
			System.out.println(str.charAt(i));
		}
	}
	
	public static void substrings(String str) {
		for(int si = 0 ; si < str.length(); si++) {
			for(int ei = si +1 ; ei <= str.length() ; ei++)
				System.out.print(str.substring(si,ei) +" ");
		}
		System.out.println();
	}

	public static boolean palindrome(String str) {
		
		int i = 0;
		int j = str.length() - 1;
		
		while(i < j) {
			
			if(str.charAt(i) != str.charAt(j))
				return false;
			
			i++;
			j--;
		}
		
		return true;
	}
	
	public static int countPalindrome(String str) {
		int count = 0;
		
		// subsrtings nikalo aur phir unka palindrome check krlo
		for(int si = 0 ; si < str.length(); si++) {
			for(int ei = si +1 ; ei <= str.length() ; ei++) {
				String sub = str.substring(si,ei);
				 // check plaindrome
				if(palindrome(sub))
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		printCharacter(str);
		substrings(str);
		System.out.print(palindrome(str));
		scan.close();
	}

}
