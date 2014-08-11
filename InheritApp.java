/**
 * Sample code to demonstrate Inheritance, and Polymorphism
 *	
 * @author Alan Cowap
 * @version 1.0 Basic classes (Person, InheritApp)
 * @version 1.1 Add a Cat class
 * @version 1.2 Add a Dog class
 * @version 1.3 Add an Animal superclass, and do initial refactor
 * @version 1.4 Override Object.toString() method in Animal class
*/


public class InheritApp{

	public static void main(String[] args){
		System.out.println("Hello world");
		InheritApp ia = new InheritApp();
		Person p = new Person("Tyler");		
		ia.testNoise(p);

		Cat c = new Cat("Charlie");
		ia.testNoise(c);

		Dog d = new Dog("Scooby");
		ia.testNoise(d);

		System.out.println(p +" "+ c +" "+ d);
		
	}


	private void testNoise(Animal animal){
		animal.makeNoise();
	}

}

abstract class Animal{
	private String name;
	private String noise;

	public Animal(String name, String noise){
		this.name = name;
		this.noise = noise;
	}

	public void makeNoise(){
		System.out.println(name + " says " + noise);
	}

	public String toString(){
		return this.name;
	}

}

class Person extends Animal{
	private static final String PERSON_NOISE = "everybody make some noise";

	public Person(String name){
		super(name, PERSON_NOISE);
	}


}


class Cat extends Animal{
	private static final String CAT_NOISE = "meow";

	public Cat(String name){
		super(name, CAT_NOISE);
	}

	
}

class Dog extends Animal{
	private static final String DOG_NOISE = "woof";

	public Dog(String name){
		super(name, DOG_NOISE);
	}

}

