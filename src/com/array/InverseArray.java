package com.array;

public class InverseArray {
	public static  int[] inverse(int a[]) {
		int res[] = new int[a.length];
		for(int i = 0; i< res.length; i++) {
			res[a[i]] = i;
		}
		// a = res;                             
		return res;
		
	}
	public static void main(String[] args) {
		int a[] = {3,0,4,1,2};
		for(int val:a)
			System.out.print(val+" ");
		int res[] = inverse(a);
		System.out.println();
		for(int val:res)
			System.out.print(val+" ");

	}

}
