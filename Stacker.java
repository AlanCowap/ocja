/**
 * Sample code to demonstrate usage of Error/Exception Handling
 *	
 * @author Alan Cowap
 * @version 1.0 Basic class crashing with StackOverFlowError
 * 
 * 
 * 
 * 
 * 
 */
//package com.alancowap.ocjp.flowcontroletc;

public class Stacker {
	private static long count = 0L; //count the number of stack frames
	public static void main(String[] args){
		new Stacker().doThis();	
	}

	private void doThis(){
		++count;
		doThat();
	}

	private void doThat(){
		++count;
		doThis();
	}
	
}
