import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		int num1 = 8;
		int num2 = 16;
	
		System.out.println("The sum is "+ add(num1, num2));
		sayHi();
	}
	// private means that it will only be accessed by this class
	
	private static int add(int a, int b){
		return a + b;
		
	}
	
	private static void sayHi() {
		System.out.println("Hi");
	}


}
