/**
 * Elisa is lost in the 3D world of Arraysia - can you find her?
 *	
 * @author Alan Cowap
*/
public class ArraysiaApp{	
	private boolean[][][] arraysia = new boolean[100][100][100];

	public static void main(String[] args){
		ArraysiaApp arr = new ArraysiaApp();
		arr.hideElisa();
		System.out.println(arr.findElisa());
		//arr.checkRandom();
	}

	/**
	 * Hide Elisa in the 3D world
	 *	
	 * 
	*/	
	private void hideElisa(){
		int x = (int) (Math.random()*100);
		int y = (int) (Math.random()*100);
		int z = (int) (Math.random()*100);
		arraysia[x][y][z] = true;
		//System.out.println(x +","+ y +","+ z);
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
					if(arraysia[i][j][k]) return (i +","+ j +","+ k);
				}
			}
		}
		return "Can't find Elisa!";
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