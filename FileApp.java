/**
 * Sample code to demonstrate usage of Error/Exception Handling
 *	
 * @author Alan Cowap
 * @version 1.0 Basic class using Checked Exceptions for File IO (Requires file.txt)
 * @version 1.1 Enhance to use try-with-resources (since J2SEv7)
 * 
 * 
 */
import java.io.*;

class FileApp{
	public static void main(String[] args){
		new FileApp().echoFile("file.txt");
	}

	private void echoFile(String fileName){
		File file = new File(fileName);
		try(FileReader freader = new FileReader(file)){ //try-with-resources
			char [] data = new char[100];
			int size = freader.read(data);
			System.out.print(size + " ");
			for(char c: data){
				 System.out.print(c);
			}
		}catch(IOException io){
			System.out.println("A File IO Error Occurred");
		}
	}
}//class
