// showing what package
// default is com.revature
package mainpackageexample;

import animal.Cat;
import animal.Dog;

public class PackageExampleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog myDog = new Dog();
		Cat myCat = new Cat();
		System.out.println(myDog.getName());
		
		// the dog inherits the eat 
		myDog.eat();
		
		// the cat will have a different eat since we overrided it
		myCat.eat();
	
	}

}
