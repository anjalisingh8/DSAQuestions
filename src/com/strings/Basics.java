package com.strings;

public class Basics {
	public static void main(String[] args) {
		
		String str = "hello";
		String str1 = "hello";
		
		// 2 hellos area not created compiler check if hello is present inside String pool
		// Strings created as literals.
		
		str = "bye";
		str1 = "bye";
		 // bye is created inside string pool and address is pointed by str and str1
		
		System.out.println(str);
		System.out.println(str1);
		
		
		// string is created inside heap outside string pool
		String str2 = new String("bye");
		System.out.println(str2);
		
		String str3 = "Hello World";
		
		// string length
		System.out.println(str3.length());
		
		//string charAt()
		System.out.println(str3.charAt(0));
		System.out.println(str3.charAt(3));
		
		// if we want to fetch the last character of the String
		System.out.println(str3.charAt(str3.length()-1));
		
		//substring
		//substring function makes new String in heap by using new string
		System.out.println(str3.substring(0, 5));
		
		System.out.println(str3.subSequence(0, 4));
		System.out.println(str3.substring(3));
		
		//concatenation of string
		//concat function makes new string in heap by new String
		System.out.println(str3.concat(str2));
		System.out.println(str3+str2);
		
		//starts with
		System.out.println(str3.startsWith("he"));
		System.out.println(str3.startsWith("He"));
		
		//ends With
		System.out.println(str3.endsWith("ld"));
		System.out.println(str3.endsWith("Ld"));
		
		//index of 
		System.out.println(str3.indexOf("ld"));
		System.out.println(str3.indexOf("l")); //if multiple occurrence returns first occurrence
		
		
		
		//String test = "The Sky is Blue";
		
		
		
	}
}
