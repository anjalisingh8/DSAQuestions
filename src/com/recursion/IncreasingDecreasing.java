package com.recursion;

public class IncreasingDecreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		PID(1,n);

	}
	
	public static  void PID(int start, int n) {
		
		if(start > n)
			return;
		
		System.out.println(start);
		PID(start+1,n);
		System.out.println(start);
		
	}

}
