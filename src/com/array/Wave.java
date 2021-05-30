package com.array;

import java.util.Scanner;

public class Wave {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a[][] = new int [4][4];
		
		for(int i = 0; i < a.length ; i++) {
			for(int j = 0 ; j < a[0].length;j++) {
				a[i][j] = scan.nextInt();
			}
		}
		for(int c = 0 ; c < a[0].length; c++) {
			if(c % 2 == 0) {
				for(int r = 0 ; r < a.length ; r++)
					System.out.print(a[r][c]+" ");
			}
			else {
				for(int r = a.length - 1; r >= 0 ; r--)
					System.out.print(a[r][c]+" ");
			}
			System.out.println();
			
		}
		
		scan.close();
	}

}
