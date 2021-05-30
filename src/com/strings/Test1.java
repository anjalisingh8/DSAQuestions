package com.strings;

public class Test1 {

	public static void main(String[] args) {
		
		String s1 = "hello";
		String s2 = s1;
		String s3 = "hello";
		
		String s4 = new String("hello");
		
		// == equals compare stack memory compares start while .equals compare word by word.
		System.out.println((s1 == s2) +" "+ s1.equals(s2));
		System.out.println((s1 == s3) +" "+ s1.equals(s3));
		System.out.println((s1 == s4) +" "+ s1.equals(s4));
		
		s1.replace('l', 'w');	
		System.out.println(s1);
		
		//replace creates new string doesnot change the original as Strings are immutable
		 String s5 = s1.replace('l', 'w');
		System.out.println(s5);

	}

}
