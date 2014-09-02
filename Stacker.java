/**
 * Sample code to demonstrate usage of Error/Exception Handling
 *	
 * @author Alan Cowap
 * @version 1.0 Basic class crashing with StackOverFlowError
 * @version 1.1 Add Error handling code with try-catch
 * 
 * 
 * 
 * 
 */
//package com.alancowap.ocjp.flowcontroletc;

public class Stacker {
	private static long count = 0L; //count the number of stack frames
	public static void main(String[] args){
//		new Stacker().doThis();	// this will throw a StackOverFlowError

		try{
			new Stacker().doThis();
		}catch(StackOverflowError soe){
			System.out.println("Oops I'm stacked :) " + count);
		}
		catch(Error er){	
			System.out.println("An Unknown Error Occurred " + count);
		}		
		System.out.println("Stack 'em and Rack 'em");
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
