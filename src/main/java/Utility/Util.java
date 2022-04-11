package Utility;

import java.util.Scanner;

public class Util {
	public static Scanner sc = new Scanner(System.in);
//Taking input from user
	public static int getPositiveInt()
	{
		String str;
	    int time=0;
		boolean valid = false;
		while (!valid) 
		{
		    try 
		    {
		    	System.out.println("Please Enter a number");
		       	str = Util.sc.next();  
		        time = Integer.parseInt(str);
		        if (time > 0) 
		        valid = true;
		    }
		    catch (NumberFormatException e) 
		    {
		    	System.out.println("Error, not a number. Please TRY AGAIN" + e);
		    }
		}
		return time;
	}
//checking perfect number
public static int perfect(int number) {
		int sum = 0;
		for(int i = 1 ; i < number ; i++) {
			if(number % i == 0)  {
				sum = sum + i;
			}
		}
		return sum;
	}
//creating fibonacci series
public static void fibonacci(int number) {
		int nextNumber = 0 ;
		int previousNumber = 0;
		int currentNumber = 1;
		System.out.print("Fibonacci Series of " + number + " : ");
		for (int i = 2; i <= number; i++) {
		nextNumber = previousNumber + currentNumber;
		previousNumber = currentNumber;
		currentNumber = nextNumber;
		System.out.print(" " + nextNumber);
	}
}
//calculation for prime number
public static boolean prime(int number) {
	boolean flag = true;
	for (int i = 2; i<= number/2; i++) {
		if ((number % i) == 0) {
			 flag = false;
		}
	}
	return flag;
}
//changing order of input number into reverse
public static int reverseNum(int number) {
	int reverse = 0;
	while(number != 0) {  
	int remainder = number % 10;  
	reverse = reverse * 10 + remainder;  
	number = number/10;  
	} 
	return reverse;
}
}
