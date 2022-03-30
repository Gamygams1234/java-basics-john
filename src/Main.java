import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		String name;
		int age;
		float shoeSize;
		
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please enter your name.");
		// this will wait for the user to input and hit enter
		name = userInput.nextLine();
		System.out.println(name);
		System.out.println("Please enter your age.");
		// this will wait for the user to input and hit enter
		age = userInput.nextInt();
		System.out.println(age);
		System.out.println("Please enter your shoesize");
		// this will wait for the user to input and hit enter
		shoeSize = userInput.nextFloat();
		System.out.println(shoeSize);
		
		System.out.println("Your name is "+ name +". Your age is "+age+". Your shoe size is "+shoeSize);
	}

}
