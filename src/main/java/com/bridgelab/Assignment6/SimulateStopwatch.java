package com.bridgelab.Assignment6;
import java.util.Scanner;

/**
 * @author atik
 * calculating time difference between start and stop position
 */
public class SimulateStopwatch {
public static void main(String[] args) {
	SimulateStopwatch stopWatch = new SimulateStopwatch();
	stopWatch.calculateTime();	
}
 void calculateTime(){
	Scanner scanner = new Scanner(System.in);	
	long time1 = 0, time2 = 0;	//variables to store times of clicks
	System.out.println("Press the key \"Enter\" twice two measure the time difference between them");
	String input = scanner.nextLine();	//stores user input
	
	if(input.isEmpty()) {	//	enter key pressed
		time1	= System.currentTimeMillis();
	}
	
	input = scanner.nextLine();
	if(input.isEmpty()) {	//	enter key pressed
		time2	= System.currentTimeMillis();
	}
	scanner.close();
	System.out.println("Diffrence between two clicks is: " + ((int)(time2 - time1) / 1000) + " seconds.");
}
}