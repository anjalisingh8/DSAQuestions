package com.array;
import java.util.*;

public class Array2d {
	static Scanner scan = new Scanner(System.in);
	public static int[][] takeinput( ){
		System.out.println("Row size");
		int r = scan.nextInt();
		int a[][] = new int[r][];
		for(int i = 0 ; i < a.length ; i++) {
			System.out.println("col?");
			int col = scan.nextInt();
			//int a[][] = new int[r][col];
			for(int j = 0; j < a[r].length;j++) {
				a[r][col] = scan.nextInt();
			}
			
		}
		return a;
	}
	public static void main(String[] args) {
		int ar[][] = takeinput();
		display(ar);
	}

	public static void display(int a[][]) {
		for(int i = 0 ; i  < a.length; i ++) {
			for(int j = 0; j < a[i].length ; i++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		// enhanced for loop
		for(int[] val : a) { // 3k 4k 5k
			for(int val1 : val) // 3k - 10 20 30 40
				System.out.print(val1);
			System.out.println();
		}
	}
}
