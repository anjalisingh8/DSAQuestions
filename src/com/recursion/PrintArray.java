package com.recursion;

public class PrintArray {
	public static void display(int a[], int videx) {
		
		if(videx == a.length)
			return;
		System.out.println(a[videx]);
		
		display(a,videx+1);
	}

	public static void main(String[] args) {
		
		int a[] = {10,20,30,40,50};
		display(a,0);

	}

}
