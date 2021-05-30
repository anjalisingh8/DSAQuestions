package com.recursion;

import java.util.Scanner;

public class Decreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println("Hello");
		PD(n);
		System.out.println("Bye");
		scan.close();

	}
	
	public static void PD(int n) {
		
		//base case
		if(n == 0)
			return;
		//work printing n
		System.out.println(n);
		
		//n-1 -> 1 counting
		PD(n-1);
	}

}
