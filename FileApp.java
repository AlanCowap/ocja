/**
 * Sample code to demonstrate usage of Error/Exception Handling
 *	
 * @author Alan Cowap
 * @version 1.0 Basic class using Checked Exceptions for File IO (Requires file.txt)
 * 
 * 
 * 
 */
import java.io.*;

class FileApp{
	public static void main(String[] args){
		new FileApp().echoFile("file.txt");
	}

	private void echoFile(String fileName){
		FileReader freader = null;
		try{
			char [] data = new char[100];
			File file = new File(fileName);
			freader = new FileReader(file);
			int size = freader.read(data);
			System.out.print(size + " ");
			for(char c: data){
				 System.out.print(c);
			}
		}catch(IOException io){
			System.out.println("A File IO Error Occurred");
		}
		finally{
			if(null != freader){
				try{
					freader.close();
				}catch(IOException io){
					System.out.println("Unable to close file");
				}
			}
		}

	}


}//class
