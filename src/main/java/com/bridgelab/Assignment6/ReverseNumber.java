package com.bridgelab.Assignment6;
import Utility.Util;
/**
 * @author atik
 * Printing given number in reverse order
 */
public class ReverseNumber {
	public static void main(String[] args) {
		int number = Util.getPositiveInt();
		int revNum = Util.reverseNum(number);
		System.out.println("The reverse of the given number is: " + revNum);
	}
}
