package com.array;

import java.util.Scanner;

public class ArrayOps {
	 static Scanner scn = new Scanner(System.in);
	public static int[] takeInput() {
		System.out.println("Size??");
		int n = scn.nextInt();
		int a[] = new int[n];
		for(int i = 0; i <= a.length - 1; i++) {
			System.out.println("a["+i+"] ?");
			a[i] = scn.nextInt();
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int [] a = takeInput();
		  System.out.println(a);

	}

}
