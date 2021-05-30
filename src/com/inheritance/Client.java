package com.inheritance;

public class Client {

	public static void main(String[] args) {
		
		
		//case1 
		P obj1 = new P();
		System.out.println(obj1.d); //10
		System.out.println(obj1.d); // 10
		
		obj1.fun();  // void fun
		obj1.fun1(); // void fun1

		//case2
		P obj2 = new C();
		System.out.println(obj2.d); // 10 as P's reference 
		System.out.println(obj2.d1);
		//System.out.println(obj2.d2); error as the reference is of P type
		System.out.println(((C)obj2).d2); // C's reference so 20 //type casted to C type
		System.out.println();
		System.out.println();
		obj2.fun(); //void fun of C
		System.out.println();
		((P)obj2).fun(); // here C fun will be executed not parents fun will be executed that's why we use super
		obj2.fun1(); // void fun1
		  // obj2.fun2(); error
		   ((C)obj2).fun2();
		   
		   
		   //case 3
//		   C obj3 = new P();
		   // not allowed C obj3 = new P(); in any programming languages.
//		   System.out.println(obj3.d);
//		   System.out.println(obj3.d1);
//		   System.out.println(obj3.d2);
		   
		   
		   //case 4
		   C obj4 = new C();
		   System.out.println(obj4.d);
		   System.out.println(obj4.d1);
		   System.out.println(obj4.d2); // variable of C as reference is of C
		   obj4.fun(); // new of C so function of C
		   obj4.fun1();
		   obj4.fun2();
	}

}
