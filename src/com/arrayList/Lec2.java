package com.arrayList;

import java.util.ArrayList;

public class Lec2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> list = new ArrayList<>();
		
		System.out.println(list);
		System.out.println(list.size());
		
		// add range 0-> size
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);
		System.out.println(list.size());
		
		
		list.add(0,50);
		System.out.println(list);
		list.add(list.size(),200);
		System.out.println(list);
		
		System.out.println(list.get(0));
		//get range 0 -> size -1
		
		System.out.println(list.set(0, 100)); //update
		System.out.println(list);
		
		
		list.add(0,100);//add
		System.out.println(list);
		
		
		//remove range 0-> size -1
		System.out.println(list.remove(list.size()-1));
		System.out.println(list);
		
		
		for(int i = 0; i < list.size();i++)
			System.out.println(list.get(i));
		System.out.println();
		//Arrays.sort(one);
		for(int val : list)
			System.out.println(val);

	}

}
