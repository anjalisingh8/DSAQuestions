package com.recursion;

public class TickLengthPattern {
	public static void pattern(int n) {
		
		if(n == 0)
			return;
		pattern(n-1);
		
		for(int i = 0; i < n; i++)
			System.out.print("- ");
		System.out.println();
		
		pattern(n-1);
		
	}
	public static void ruler(int inch, int mtl) {
		
		for(int j = 1; j <= mtl ; j++)
			System.out.print("- ");
		System.out.println(0);
		
		for(int i = 1; i <= inch; i++) {
			pattern(mtl - 1);
		
		for(int j = 1; j<= mtl; j++) {
			System.out.print("- ");
		}
		System.out.println(i);
		}
		
	}
	public static void main(String[] args) {
		int inch = 3;
		int mlt = 4;
		ruler(inch,mlt);
		
	}

}
