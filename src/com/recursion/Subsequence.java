package com.recursion;

public class Subsequence {
	public static void subsequence(String ques, String ans) {
		
		if(ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		
		char ch = ques.charAt(0); //took first character
		String roq = ques.substring(1); //rest of the string
		
		subsequence(roq,ans); //excluded the character
		subsequence(roq,ans+ch); //included the character
		
	}
	public static void subsequencewithAscii(String ques, String ans) {
		
		if(ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch = ques.charAt(0); //took first character
		String roq = ques.substring(1); //rest of the string
		
		subsequencewithAscii(roq,ans); //excluded the character
		subsequencewithAscii(roq,ans+ch); //included the character
		subsequencewithAscii(roq,ans+(int) ch); //ascii of character
		
	}

	public static void main(String[] args) {
		String str = "abc";
		subsequence(str," ");
		
	}

}
