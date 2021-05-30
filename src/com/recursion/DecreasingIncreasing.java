package com.recursion;

public class DecreasingIncreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		PDI(n);

	}

	public static void PDI(int n) {
		
		if(n ==0)
			return;
		System.out.println(n);
		PDI(n-1);
		System.out.println(n);
	}
}
