package com.fundamentals.nagaroo;

import java.util.Scanner;

public class Fibonnacci {

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int a = 0;
		int b = 1;
		
		int counter = 1;
		while(counter <= n) {
			System.out.println(a);
			int sum = a+b;
			a = b;
			b = sum;
			counter++;
		}
		scan.close();
	}
}
