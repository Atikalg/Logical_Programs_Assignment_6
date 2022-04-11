package com.bridgelab.Assignment6;
import Utility.Util;
/**
 * @author atik
 * Printing Fibonacci Series of given number
 */
public class FibonacciSeries {
	public static void main(String[] args) {
		int number = Util.getPositiveInt(); //taking input from user
		 Util.fibonacci(number);            // printing fibonacci series 
}
}