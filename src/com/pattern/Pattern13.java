package com.pattern;

import java.util.Scanner;

public class Pattern13 {
	public static void main(String[] args) {
		
		int nst = 1;
		int row = 1;
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		while(row <= 2*n-1) {
			for(int cst = 1; cst <=nst ; cst++) {
				System.out.print("* ");
			}
			System.out.println();
			if(row <= n-1)
				nst = nst + 1;
			else
				nst = nst - 1;
			row = row + 1;
		}
		scan.close();
	}

}
