package com.array;

public class Rotate2 {
	public static void reverse(int a[],int i,int j) {
		int start = i;
		int end = j;
		while(start<=end) {
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
		
	}
	public static void rotate2(int a[], int rot) {
		rot = rot % a.length;
		reverse(a,0,a.length-rot-1);
		reverse(a,a.length-rot,a.length);
		
	}
	public static void main(String[] args) {
		
	}

}
