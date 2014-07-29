/**
 * Elisa is lost in the 3D world of Arraysia - can you find her?
 *	
 * @author Alan Cowap
 * @version 1.1 Allow for different size for array dimensions
 * @version 1.2 Add Threads so there are concurrent searches
*/
public class ArraysiaApp{
	private static final int X_SIZE = 100;
	private static final int Y_SIZE = 100;
	private static final int Z_SIZE = 100;
	
	private boolean[][][] arraysia = new boolean[X_SIZE][Y_SIZE][Z_SIZE];

	public static void main(String[] args){
		ArraysiaApp arr = new ArraysiaApp();
		arr.hideElisa();
		//System.out.println(arr.findElisa());
		//arr.checkRandom();
		Thread t1 = new Thread(new Finder(arr.arraysia, "Hero"));
		Thread t2 = new Thread(new Finder(arr.arraysia, "Reaper"));
		t1.start();
		t2.start();
	}

	/**
	 * Hide Elisa in the 3D world
	 *	
	 * 
	*/	
	private void hideElisa(){
		int x = (int) (Math.random()*X_SIZE);
		int y = (int) (Math.random()*Y_SIZE);
		int z = (int) (Math.random()*Z_SIZE);
		arraysia[x][y][z] = true;
		//System.out.println(x +","+ y +","+ z);
	}
	


	/**
	 * Check some stats (min, mean, max) of 10000 "random" values
	 *	
	 * 
	*/	
	private void checkRandom(){
		int min=100,max=0,total=0;
		for(int i = 0; i <10000; ++i){
			int x = (int) (Math.random()*100);
			if(min>x) min = x;
			if(max<x) max = x;
			total+=x;
		}
		System.out.println("Min: "+ min +"Mean: " + (total/10000) +" Max: "+ max + " Total: " + total);
	}

}



class Finder implements Runnable{
	private boolean[][][] arraysia;
	private String name;

	Finder(boolean[][][] arraysia, String name){
		this.arraysia = arraysia;
		this.name=name;
	}
	public void run(){
		System.out.println(findElisa());
	}

	/**
	 * Find Elisa in the 3D world
	 *	
	 * @return	A String representing the x,y,z, coordinates of Elisas location
	 */
	private String findElisa(){
		for(int i=0; i < arraysia.length; ++i){
			for(int j=0; j < arraysia[i].length; ++j){
				for(int k=0; k < arraysia[i][j].length; ++k){
				synchronized(Finder.class){
					if(arraysia[i][j][k]){
						arraysia[i][j][k] = false; //She's gone now!
						return (this.name +" found Elisa at "+ i +","+ j +","+ k);		
					}
				}
				}
			}
		}
		return this.name + " can't find Elisa!";
	}

}
