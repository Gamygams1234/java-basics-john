// showing what package
// default is com.revature
package mainpackageexample;

// this wiil import the animals
import animals.Dog;

public class PackageExampleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog myDog = new Dog();
		// if getName was private then getName could not be accessed
		System.out.println(myDog.getName());
	}

}
