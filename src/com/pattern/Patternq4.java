package com.pattern;

public class Patternq4 {
	public static void main(String[] args) {
		int n  = 5;
		int nsp = n - 1;
		int nst = 1;
		int row = 1;
		while(row <= n) {
			for(int csp = 1; csp <= nsp; csp++)
				System.out.print("  ");
			for(int cst = 1; cst <= nst; cst++)
				System.out.print("* ");
			System.out.println("  ");
			nst = nst + 1;
			nsp = nsp - 1;
			row += 1;
		}
	}
}
