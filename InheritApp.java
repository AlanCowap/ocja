/**
 * Sample code ...
 *	
 * @author Alan Cowap
 * @version 1.0 Basic class 
 * 
*/


public class InheritApp{

	public static void main(String[] args){
		System.out.println("Hello world");
		InheritApp ia = new InheritApp();
		Person p = new Person("Tyler");
		p.makeNoise();
		ia.testNoise(p);
	}

	private void testNoise(Person person){
		person.makeNoise();
	}	

}


class Person{

	private String name;

	public Person(String name){
		this.name = name;
	}

	public void makeNoise(){
		System.out.println(name + " says everybody make some noise");
	}
}
