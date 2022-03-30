package animal;

public class Dog extends Animal{
	static int dogCount = 0;
	private int age;
	private String breed;
	private String color;
	private int numberOfLegs;
	
	public Dog() {
		Dog.dogCount++;
		this.name = "Fido";
	}
	


	void bark() {
		System.out.println("Bark, my name is " + this.name);
	}
	
	static void printMetaDogInfo() {
		System.out.println("Total dogs in program "+ dogCount);
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		// cannot name the dog Donk
		if (name.toLowerCase().equals("donk")) {
			return;
		}else {
			this.name = name;
		}

	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getBreed() {
		return breed;
	}



	public void setBreed(String breed) {
		this.breed = breed;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public int getNumberOfLegs() {
		return numberOfLegs;
	}



	public void setNumberOfLegs(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}

}
