package com.array;

public class ReverseArray {
	public static void reverse(int a[]) {
		int start = 0;
		int end = a.length-1;
		while(start<=end) {
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
		
	}

	public static void main(String[] args) {
		int a[] ={10,20,30,14,15};
		for(int val : a) {
			System.out.print(val+" ");
		}
		reverse(a);
		System.out.println();
		for(int val : a) {
			System.out.print(val+" ");
		}
//		System.out.println(reverse(a));
//			
	}

}
