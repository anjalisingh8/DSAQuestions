package com.array;

public class BinarySearch {
	public static int binary(int a[] , int key) {
		int low = 0;
		int high = a.length-1;
		while(low <= high) {
			int mid = (low+high)/2;
			if(a[mid] < key) 
				low = mid+1;
			else if (a[mid] > key) 
				high = mid - 1;
			else
				return mid;
		}
		
		return -1; 
	}

	public static void main(String[] args) {
		int a[] = {5,7,10,12,20,45,67,89,90};
		int key = 20;
		System.out.println(binary(a,key));
		

	}

}
