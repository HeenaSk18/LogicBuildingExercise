package com.swapnumbers;

public class example2 {

	public static void main(String[] args) {
		int a =10;
		int b =20;
		
		a=a+b;
//		System.out.println("a "+a); //a=30 current value
		
		b= a-b;
		System.out.println("b "+b);
		
		a=a-b;
		System.out.println("a "+a);
	}

}
