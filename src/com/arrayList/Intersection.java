package com.arrayList;

import java.util.ArrayList;

public class Intersection {
	
	public static ArrayList<Integer> intersection(int one[], int two[]){ 
		
		ArrayList <Integer> ans = new ArrayList<>();
		
		int i = 0;
		int j = 0;
		 while(i < one.length && j < two.length) {
			 
			 if(one[i] < two[j])
				 i++;
			 else if(one[i] > two[j])
				 j++;
			 else {
				 ans.add(one[i]);
				 i++;
				 j++;
			 }
		 }
		
		
		return ans;
	}

	public static ArrayList <Integer> union(int one[], int two[]){
        ArrayList <Integer> res = new ArrayList<>();

        int i = 0;
        int j = 0;

        while( i < one.length && j < two.length){
            if(one[i] < two[j]) {
            	res.add(one[i]);
            	i++;
            }
            else if(one[i] > two[j]) {
            	res.add(two[j]);
            	j++;
            }
            else {
            	res.add(one[i]);
            	i++;
            	j++;
            }
            	
        }
        return res;
    }
	public static void main(String[] args) {
		int one[] = {5,7,10,10,10,20,30,30,50,60,60,60,80};
		int two[] = {10,10,15,20,30,30,30,60,70,80,80,90};
		
		ArrayList <Integer> ans = intersection(one,two);
		
		for(int val:ans)
			System.out.print(val+" ");
		System.out.println();
		
ArrayList <Integer> res = union(one,two);
		
		for(int val:res)
			System.out.print(val+" ");
		//Collections.sort(ans);

	}

}
