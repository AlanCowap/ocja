/**
 * Sample code to demonstrate Inheritance, and Polymorphism
 *	
 * @author Alan Cowap
 * @version 1.0 Basic classes (Person, InheritApp)
 * @version 1.1 Add a Cat class
 * @version 1.2 Add a Dog class
 * @version 1.3 Add an Animal superclass, and do initial refactor
 * @version 1.4 Override Object.toString() method in Animal class
 * @version 1.5 Inherit an abstract method (move) from an abstract superclass and implement it
 * @version 1.6 Create an Edible interface, and a class Chicken that implements Edible
 * @version 1.7 Create Plant class and subclasses.
*/

interface Edible{
	public void eatMe();
}


public class InheritApp{

	public static void main(String[] args){
		System.out.println("Hello world");
		InheritApp ia = new InheritApp();
		
		Person p = new Person("Tyler");		
		ia.testNoise(p);
		p.move();

		Cat c = new Cat("Charlie");
		ia.testNoise(c);
		c.move();

		Dog d = new Dog("Scooby");
		ia.testNoise(d);
		d.move();

		Chicken chick = new Chicken("Chooky");
		ia.testEdible(chick);

		Carrot carrot = new Carrot();
		ia.testEdible(carrot);

		System.out.println(p +" "+ c +" "+ d);
		
	}


	private void testNoise(Animal animal){
		animal.makeNoise();
	}

	private void testMove(Animal animal){
		animal.move();
	}

	private void testEdible(Edible edible){
		edible.eatMe();
	}

}

abstract class Animal{
	private String name;
	private String noise;

	public Animal(String name, String noise){
		this.name = name;
		this.noise = noise;
	}
	
	public abstract void move();
	
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

	public void move(){
		System.out.println("Move like a Person");
	}

}


class Cat extends Animal{
	private static final String CAT_NOISE = "meow";

	public Cat(String name){
		super(name, CAT_NOISE);
	}

	public void move(){
		System.out.println("Move like a Cat");
	}
	
}

class Dog extends Animal{
	private static final String DOG_NOISE = "woof";

	public Dog(String name){
		super(name, DOG_NOISE);
	}

	public void move(){
		System.out.println("Move like a Dog");
	}

}

class Chicken extends Animal implements Edible{
	private static final String CHICKEN_NOISE = "bok";

	public Chicken(String name){
		super(name, CHICKEN_NOISE);
	}
	public void move(){
		System.out.println("Move like a Chicken");
	}

	public void eatMe(){
		System.out.println("How do I taste asks ChickenLickin");
	}
}


class Plant{
}


class Carrot extends Plant implements Edible{
	public void eatMe(){
		System.out.println("How do I taste asks the talking Carrot");
	}
}

class Tree extends Plant{	
}

