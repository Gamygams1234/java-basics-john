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
	
		myDog.eat();
		
		myDog.isLoved();
		
		// the cat will have a different eat since we overrided it
		myCat.eat();
	
	}

}
