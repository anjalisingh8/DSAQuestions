package com.array;

import java.util.Scanner;

public class LinearSearch {
	public static int search(int a[],int key) {
		
		for(int i = 0; i < a.length; i++) {
			if(a[i] == key)
				return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a[] = new int[100];
		System.out.println("Size?");
		int n = scan.nextInt();
		System.out.println("Elements?");
		for(int i = 0;i< n;i++) {
			a[i] = scan.nextInt();
		}
		System.out.println("Key?");
		int key = scan.nextInt();
		
		System.out.println(search(a,key));
		scan.close();
	}
	

}
