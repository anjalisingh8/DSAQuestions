package com.pattern;

import java.util.Scanner;


public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for( int i = 0 ; i <n ; i++) {
			for(int j = 0; j < n ; j++) {
				System.out.print("* ");
			}
			System.out.println("*");
		}
		scan.close();
	}
}
