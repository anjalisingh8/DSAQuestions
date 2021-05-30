package com.array;

import java.util.Scanner;

public class Maximum {
	public static int max(int a[],int size) {
		int max = a[0];
		//max = Integer.MIN_VALUE;
		for(int i = 0; i < size; i++) {
			if(a[i]>max)
				max = a[i];
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Size?");
		int size = scan.nextInt();
		int a[] = new int[size];
		for(int i = 0; i < size; i++) {
			a[i] = scan.nextInt();
		}
		System.out.println(max(a,size));

		scan.close();
	}

}
