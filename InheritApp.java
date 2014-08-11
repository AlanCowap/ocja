/**
 * Sample code ...
 *	
 * @author Alan Cowap
 * @version 1.0 Basic classes (Person, InheritApp)
 * @version 1.1 Add a Cat class
*/


public class InheritApp{

	public static void main(String[] args){
		System.out.println("Hello world");
		InheritApp ia = new InheritApp();
		Person p = new Person("Tyler");		
		ia.testNoise(p);

		Cat c = new Cat("Charlie");
		ia.testNoise(c);

	}

	private void testNoise(Person person){
		person.makeNoise();
	}

	private void testNoise(Cat cat){
		cat.makeNoise();
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


class Cat{

	private String name;

	public Cat(String name){
		this.name = name;
	}

	public void makeNoise(){
		System.out.println(name + " says Meow");
	}
}

