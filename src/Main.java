
public class Main {
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.name = "John";
		dog.bark();

		dog.age= 1;
		dog.breed = "Golden Retriever";
	
		System.out.println(dog.name);
		
		Dog otherDog = new Dog();
		otherDog.name = "Fido";
		otherDog.bark();

		otherDog.age= 3;
		otherDog.breed = "Lab";
	}

}
