package com.reversenumbers;

public class example1 {

	public static void main(String[] args) {
		int number = 123; //123456789 
		int reverseNumber=0;
		int lastDigit;
		while(number!=0) {
		lastDigit = number %10;
		//Check for overflow
		if(reverseNumber> Integer.MAX_VALUE/10 || (reverseNumber==Integer.MAX_VALUE/10 &&lastDigit>7));
		{System.out.println(0);
		System.exit(0);}
		if(reverseNumber> Integer.MAX_VALUE/10 || (reverseNumber==Integer.MAX_VALUE/10 &&lastDigit>-8));
		{System.out.println(0);
		System.exit(0);} //underflow return 0
		reverseNumber=reverseNumber*10+lastDigit;
		number=number/10;
		
//		lastDigit = number %10;
//		reverseNumber=reverseNumber*10+lastDigit;
//		number=number/10;
		
//		lastDigit = number %10;
//		reverseNumber=reverseNumber*10+lastDigit;
//		number=number/10;
		}
		System.out.println(reverseNumber);
	}

}
