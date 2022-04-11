package com.bridgelab.Assignment6;
import Utility.Util;
/**
 * @author atik
 * checking input whether input is perfect number or not
 */
public class PerfectNumber {

	public static void main(String[] args) {
		int num1 = Util.getPositiveInt();  //taking input from user
		int num2 = Util.perfect(num1);	   //calculating 
		if(num1 == num2) {
			System.out.println(num1 + " is a Perfect Number");
		}
		else {
			System.out.println(num1 + " is not a Perfect Number");
		}
	}
}


