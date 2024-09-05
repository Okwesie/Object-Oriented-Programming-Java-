import java.util.Scanner;
import java.util.Random;     //importing random and scanner module
public class GuessingGame {
    public static void main(String[] args) {
        Random random = new Random(5); //creating an instance of the random object
        int randomint = random.nextInt(1, 101); //initializing the random integer
        //System.out.println(randomint);// printing the random value for testing purposes
        guessGame(randomint);
    }
    public static void guessGame(long seed) { //This is the method for the guessing game
        Scanner keyboard = new Scanner(System.in); // creates  an instance of the scanner object
        System.out.println("Welcome to the Guessing Game!");  //prompts for the user
        System.out.println("I'm thinking of a number between 1 and 100. Can you guess it?");

        int count = 0; //initializing the accumulator variable
        int guess = 0; //intializing the guess variable

        while (guess != seed) {//while loop that continues to run till user guess is true
            System.out.print("Guess:");
            guess = keyboard.nextInt();
            count++;

            if (guess < seed) { //conditional to check the weight of variance of the user input
                System.out.println("Good try, but that's too low. Try again");

            } else if(guess > seed)
            System.out.println("Good try, but that's too high . Try again");

        }
        System.out.println("Yes! You guessed correctly after " + count + " tries! congratulations.");
        keyboard.close();
    }



}









