package com.bridgelab.Assignment6;
import Utility.Util;
/**
 * @author atik
 * checking input whether Prime number or not
 */
public class PrimeNumber {

	public static void main(String[] args) {
		int number = Util.getPositiveInt();
		if (number == 1 || number == 0) {
			System.err.println("0 and 1 are neither prime nor composite");
			System.exit(0);
		}
		boolean isPrime = Util.prime(number);
		if (isPrime == true) {
			System.out.println(number + " is a Prime Number");
		} else {
			System.out.println(number + " is not a Prime Number");
		}

	}

}
