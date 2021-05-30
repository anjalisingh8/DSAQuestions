package com.array;

import java.util.Arrays;

public class SumofPairs {
	public static void targetSum(int a[],int target) {
		Arrays.sort(a);
		//logic
		int i = 0;
		int j = a.length-1;
		while(i<j) {
			if(a[i] + a[j] > target)
				j--;
			else if(a[i] + a[j] < target)
				i++;
			else {
				System.out.println(a[i] + " " + a[j]);
				i++;
				j--;
			}
				
		}
		
	}

	public static void main(String[] args) {
		

	}

}
//Scanner scan = new Scanner(System.in);
//int n = scan.nextInt();
//int a[] = new int[n];
//for(int i = 0; i< n; i++){
//    a[i] = scan.nextInt();
//}
//int target = scan.nextInt();
//Arrays.sort(a);
//triplet(a,target);
//import java.util.*;
//public class Main {
//    public static void triplet(int a[],int target){
//        int[] temp = new int[3];
//        for(int i = 0; i< a.length - 2; i++){
//            for(int j = i+1; j< a.length -1 ;j++){
//                for(int k = j+1; k < a.length;k++){
//                    if(a[i]+a[j]+a[k] == target){
//                        temp[0] = a[i];
//                        temp[1] = a[j];
//                        temp[2] = a[k];
//                        Arrays.sort(temp);
//						System.out.println(temp[0]+ ","+" "+temp[1]+" and "+temp[2]);
//                    }
//                }
//            }
//        }
//    }
//    public static void main(String args[]) {
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        int a[] = new int[n];
//        for(int i = 0; i< n; i++){
//            a[i] = scan.nextInt();
//        }
//        int target = scan.nextInt();
//        Arrays.sort(a);
//        triplet(a,target);
//
//    }
//}