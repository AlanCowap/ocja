/**
 * Sample code to demonstrate usage of Exception Handling
 *	
 * @author Alan Cowap
 * @version 1.0 Basic class crashing with sample Exception (NullPointerException)
 * @version 1.1 Add Exception Handling Code (Aside: NPE is not a Checked Exception)
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
		try{
			String str = null;
			System.out.println(str.length());
		}catch(NullPointerException npe){
			System.out.println("Oops, a NPE ocurred"); //Exception handled :)
		}
		System.out.println("Goodbye!"); //Our program continues to execute :)
	}

	
}

