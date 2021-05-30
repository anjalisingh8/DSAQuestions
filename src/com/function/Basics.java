package com.function;

public class Basics {
	 static int a  = 10;
	 static int b = 20;
	 static int val = 10;
	 static void addition(int a , int b) {
		 a = a + 10;
		 System.out.println(a+b);
	}
	public static void main(String[] args) {
//		int a = 10;
//		int b= 20;
		addition(a,b);
		System.out.println(a);
		System.out.println(val);// global variable
		int val = 100;
		System.out.println(val); //local variable with same name
	}
}
// if global and local variable of same name(val)
// main has two val, if will print val we will get local value
// conflicts between global and local higher precedence is of local