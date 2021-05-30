package com.recursion;

public class FirstOccurrnece {
	
	public static int firstOccurrence(int a[], int vidx,int item) {
		
		if(vidx == a.length)
			return -1;
		
		if(a[vidx] == item)
			return vidx;
		int sp = firstOccurrence(a,vidx+1,item);
		return sp;
		 
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10,50,30,20,30};
		int sp = firstOccurrence(a,0,30);
		System.out.println(sp);

	}

}
