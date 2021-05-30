package com.divideandconquer.L31;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int one[] = {10,30,50,80,100};
//		int two[] = {15,20,25,60,70};
//		
//		int array[] = mergeArrays(one,two);
		
		int a[] = {80,10,50,30,60,20,70,25};
		
		int array[] = mergeSort(a,0,a.length-1);
		for(int val : array) {
			System.out.println(val);
		}

	}
	
	public static int[] mergeSort(int a[], int low, int high) {
		
		if(low == high) {
			int br[] = new int[1];
			br[0] = a[low];
			return br;
		}
		
		int mid = (low+high)/2;
		int one[] = mergeSort(a,low,mid);
		int two[] = mergeSort(a,mid+1,high);
		
		int merge[] = mergeArrays(one,two);
		return merge;
	}

	public static int[] mergeArrays(int[] one, int[] two) {
		
		int i = 0;
		int j = 0;
		
		int k = 0;
		
		int[] merge = new int[one.length+two.length];
		
		while(i < one.length && j < two.length) {
			
			if( one[i] < two[j]) {
				merge[k] = one[i];
				i++;
				k++;
			}
			
			else {
				merge[k] = two[j];
				j++;
				k++;
			}
		}
		
		if(i > one.length) {
			while( j < two.length) {
				merge[k] = two[j];
				j++;
				k++;
			}
		}
		else {
			while( i < one.length) {
				merge[k] = one[i];
				i++;
				k++;
			}
		}
		
		return merge;
	}
}
