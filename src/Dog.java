

public class Dog {
	
	static int dogCount = 0;
	String name;
	int age;
	String breed;
	String color;
	int numberOfLegs;
	
	public Dog() {
		this.dogCount++;
	}
	


	void bark() {
		System.out.println("Bark, my name is " + this.name);
	}
	
	static void printMetaDogInfo() {
		System.out.println("Total dogs in program "+ dogCount);
	}

}
