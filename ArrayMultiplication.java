package com.array;

import java.util.Scanner;

public class ArrayMultiplication {
	public static int[][] multiply(int[][] one, int[][] two){
		int res[][] = new int[one.length][two[0].length];
		if(one[0].length != two.length)
			System.out.print("Invalid");
		
			for(int i = 0; i < res.length;i++) {
				for(int j = 0; j < res[0].length; j++) {
					int sum = 0;
					for(int k = 0; k < one[0].length; k++) {
						sum += one[i][k] * two[k][j];
						}
					res[i][j] = sum;
						
				}
				
			}
		
		return res ;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Row 1?");
		int r1 = scan.nextInt();
		System.out.println("COl 1?");
		int c1 = scan.nextInt();
		int a[][] = new int [r1][c1];
		for(int i = 0; i <  a.length;i++) {
			for(int j = 0; j < a[0].length;j++) {
				a[i][j] = scan.nextInt();
				}
		}
		
		System.out.println("Row 2?");
		int r2 = scan.nextInt();
		System.out.println("COl 2?");
		int c2 = scan.nextInt();
		int b[][] = new int [r2][c2];
		for(int i = 0; i <  b.length;i++) {
			for(int j = 0; j < b[0].length;j++) {
				b[i][j] = scan.nextInt();
				}
		}
		 int[][] res = multiply(a,b);
		 for(int i = 0; i <  res.length;i++) {
				for(int j = 0; j < res[0].length;j++) {
					System.out.print(res[i][j]+" ");
					}
				System.out.println();
			}
		 scan.close();
	}

}
