package com.array;

public class Lec1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = null;
		System.out.println(a);
		a = new int[5];
		System.out.println(a);
		System.out.println(a[0] = 1);
		System.out.println(a[1] = 2);
		System.out.println(a[3] = 4);
		System.out.println(a[2] = 3);
		//System.out.println(a[-1]);
		//index out of bound
		
		for(int val: a) { //enhanced for loop read-only
			val = 10;
			System.out.println(val);
			val = 100;
			System.out.println(val);
		}
// a.length tk chal rha loop
		
		
		int arr[] = a; //refernce variable pointing to the memory location pointed by a as well
		System.out.println(arr);
		a[2] = 100; // changes in a
		System.out.println(arr[2]); //reflect in arr as well
		arr[3] = 400;
		System.out.println(a[3]);
		
		
		
		System.out.println("----------------");
		int one[] = {10,20,30,40};
		int two[] = {100,200,300,400};
		System.out.println(one[0]+ " "+ two[0]);
		swap(one[0],two[0]);           //no changes in heap memory
		System.out.println(one[0]+ " "+ two[0]);
		System.out.println("----------------");
		System.out.println(one[0]+ " "+ two[0]);
		swapA(one,two);                //changes in heap memory
		System.out.println(one[0]+ " "+ two[0]);
		System.out.println("----------------");
		System.out.println(one[0]+ " "+ two[0]);
		swapB(one,two);                  // no changes in heap memory
		System.out.println(one[0]+ " "+ two[0]);
	}
	public static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}
	public static void swapA(int a[], int b[]) {
		int temp = a[0];
		a[0] = b[0];
		b[0] = temp;
	}
	public static void swapB(int a[], int b[]) {
		int [] temp = a;
		a = b;
		b = temp;
		
	}
	
}

