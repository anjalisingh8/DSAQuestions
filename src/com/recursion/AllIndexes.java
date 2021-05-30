package com.recursion;

public class AllIndexes {

	public static int[] allIndex(int a[], int item, int vindex, int count){ 
		
		if(vindex == a.length) {
			int br[] = new int[count];
			return br;
		}
		
		if(vindex == item) {
			int[] rr = allIndex(a,item,vindex+1,count+1);
			rr[count] = vindex;
			//vindex is stored in rr as it matches with item
			return rr;
		}
		else {
			int rr[] = allIndex(a,item,vindex+1,count);
			//don't need to add as item does not match with vindex
			return rr;
		}
		
	}
	public static void main(String[] args) {
		
		int a[] = {10,30,50,30,60,1,30};
		int rr[] = allIndex(a,30,0,0);
		for(int val : rr)
			System.out.println(val);
		
	}

}
