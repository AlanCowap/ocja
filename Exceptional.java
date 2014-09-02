/**
 * Sample code to demonstrate usage of Exception Handling
 *	
 * @author Alan Cowap
 * @version 1.0 Basic class crashing with sample Exception (NullPointerException)
 * 
 * 
 * 
 * 
 * 
 */

class Exceptional{

	public static void main(String... args){
		new Exceptional().handleExceptions();
	}

	private void handleExceptions(){
		String str = null;
		System.out.println(str.length());
	}

	
}

