package com.pattern;

public class Pattern5 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int nsp = 0;
		int nst = n;
		while(row <= n) {
			for(int csp = 1; csp <= nsp ;nsp++)
				System.out.print(" ");
			for(int cst = 1; cst <= nst ;nst++)
				System.out.print("* ");
			System.out.println( );
			nsp += 1;
			nst -= 1;
			row += 1;
		}
	}

}
