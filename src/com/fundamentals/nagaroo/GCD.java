package com.fundamentals.nagaroo;

import java.util.Scanner;

public class GCD {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int divisor = scan.nextInt();
		int dividend = scan.nextInt();
		
		while(dividend % divisor != 0) {
			int rem = dividend % divisor;
			dividend = divisor;
			divisor = rem;
		}
		System.out.println(divisor);
		scan.close();
	}

}
