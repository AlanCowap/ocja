/**
 * Sample code to demonstrate usage of Error/Exception Handling
 *	
 * @author Alan Cowap
 * @version 1.0 Basic class crashing with OutOfMemoryError
 * @version 1.1 Add try-catch clause
 * 
 * 
 * 
 * 
 */
//package com.alancowap.ocjp.flowcontroletc;

import java.util.ArrayList;
public class Heaper {
	private ArrayList<Bloat> al = new ArrayList<Bloat>();
	private static int count = 0;

	public static void main(String[] args) {
		new Heaper().heap();
	}
	
	private void heap(){
//		fill();
		try{
			fill();
		}catch(OutOfMemoryError mem){
			System.out.println("Oops I'm heaped " + count +" "+ al.size());
		}
		catch(Error e){
			System.out.println("An Unknown Error Occurred");
		}
		System.out.println("Life goes on " + al.size());
	}
	
	private void fill(){
		while(true){
			al.add(new Bloat());
			++count;
		}
	}
}
class Bloat{	
	private double[][][][] da = new double[10][10][10][10];
}
