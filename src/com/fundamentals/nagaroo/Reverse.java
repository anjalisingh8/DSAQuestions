package com.fundamentals.nagaroo;

import java.util.Scanner;

public class Reverse {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int answer = 0;
		while(n != 0) {
			int rem = n % 10;
			answer = answer * 10 + rem;
			n = n/10;
		}
		System.out.println(answer);
		scan.close();
		
	}
}
