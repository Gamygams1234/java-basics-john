import java.util.Random;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Random rand = new Random();
		int randomNumber = rand.nextInt(100) + 1;
		
		int guess;
		Scanner userInput = new Scanner(System.in);
		System.out.println("Welcome to the guessing game.");
		System.out.println("Please enter your guess.");
		guess = userInput.nextInt();
		

			
			while(guess!= randomNumber) {
			if (guess< randomNumber) {
				System.out.println("You have to guess higher. Try again");
				guess = userInput.nextInt();
				
				}else {
					System.out.println("You have to guess lower. Try again");
					guess = userInput.nextInt();
				}
			}
		
			if (guess == randomNumber) {
				System.out.println("Bitch you guessed it! You was right!");
				System.out.println("The number was " + guess);
			}	

	}
}
