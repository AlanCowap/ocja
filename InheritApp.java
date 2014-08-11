/**
 * Sample code to demonstrate Inheritance, and Polymorphism
 *	
 * @author Alan Cowap
 * @version 1.0 Basic classes (Person, InheritApp)
 * @version 1.1 Add a Cat class
 * @version 1.1 Add a Dog class
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

	}

	private void testNoise(Person person){
		person.makeNoise();
	}

	private void testNoise(Cat cat){
		cat.makeNoise();
	}

	private void testNoise(Dog dog){
		dog.makeNoise();
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

class Dog{

	private String name;

	public Dog(String name){
		this.name = name;
	}

	public void makeNoise(){
		System.out.println(name + " says woof");
	}
}

