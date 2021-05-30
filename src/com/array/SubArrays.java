package com.array;

public class SubArrays {
	public static void subarray(int a[]) {
		
		for(int si = 0; si <= a.length - 1; si++) {
			for(int ei = si; ei <= a.length - 1; ei++) {
				for(int k = si; k <= ei ; k++) {
					System.out.println(a[k]+" ");
				}
				System.out.println();
			}
		}
	}
	
	public static int sumSubarrays(int a[]) {
		
		int sum = 0;
		//int max = a[0];
		for(int si = 0; si <= a.length - 1; si++) {
			for(int ei = si; ei <= a.length - 1; ei++) {
				sum += a[ei];
			}
		}
		
		return sum;
	}
	public static void main(String[] args) {
		int a[] = {10,20,30,40};
		subarray(a);
		System.out.println(sumSubarrays(a));
		
	}

}
