package com.array;

public class RotateArray {
	public static void rotate(int a[], int rot) {
		for(int r = 1; r<= rot; r++) {
			int temp = a[a.length - 1];
			for(int j = a.length -1 ; j >=1;j--) {
				a[j] = a[j-1];
			}
			a[0] = temp;
		}
		
	}

	public static void main(String[] args) {
		int a[] = {10,20,30,40,50,60};
		int rot = 4;
		rotate(a,rot);
		for(int val :a) {
			System.out.print(val+" ");
		}
		

	}

}
