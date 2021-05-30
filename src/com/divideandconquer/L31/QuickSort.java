package com.divideandconquer.L31;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {50,40,80,90,70,10,30,60,120};
		
		quickSort(a,0,8);
		for(int val : a)
			System.out.println(val);

	}
	
	public static void quickSort(int a[], int low, int high) {
		
		if(low<high){
	        for(int i = 0 ;i < 9; i++){
	        System.out.print(a[i]+" ");
	    }
	        System.out.println();
		}
		
		int mid = partition(a,low,high);
		quickSort(a,low,mid-1);
		quickSort(a,mid+1,high);
		
	}
	
	public static int partition(int a[],int low,int high) {
		
		int mid = (low+high)/2;
		int pivot = a[mid];
		
		int left = low;
		int right = high;
		
		while(left < right) {
			
			//left pointing towards problem
			while(a[left] <= pivot) {
				left++;
			}
			
			//right pointing towards problem
			while(a[right] > pivot) {
				right--;
			}
			
			//problem resolved using swapping
			if(left < right) {
				int temp = a[left];
				a[left] = a[right];
				a[right] = temp;
			}
			
		}
		if(a[mid] == pivot) {
			int temp = a[right];
			a[right] = a[pivot];
			a[mid] = temp;
		}
		return right;
				
	}

}
