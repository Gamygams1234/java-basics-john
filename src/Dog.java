

public class Dog {
	String name;
	int age;
	String breed;
	String color;
	int numberOfLegs;
	
	// default constuctor no args
	public Dog() {
		this.name = "Lassie";
		this.numberOfLegs=4;
	}
	
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
		this.numberOfLegs=4;
	}
	void bark() {
		System.out.println("Bark, my name is " + this.name);
	}

}
