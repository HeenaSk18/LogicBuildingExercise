package com.ArmStrongNumber;

public class ArmStrongNumber {

	public static void main(String[] args) {
		int number = 152;
		int copyNumber = number;
		int lastDigit;
		int armStrong = 0;

		while (copyNumber != 0) {
			lastDigit = copyNumber % 10;
			armStrong = armStrong + (lastDigit * lastDigit * lastDigit);
			copyNumber = copyNumber / 10;
		}
		if (number == armStrong) {
			System.out.println("It is an armstrong number");
		} else {
			System.out.println("No it is not armstrong number");
		}

	}

}
