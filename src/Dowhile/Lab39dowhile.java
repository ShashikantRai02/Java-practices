package Dowhile;

public class Lab39dowhile {
    public static void main(String[] args) {
        //Guess a number between 1 to 100
        int numberToGuess = (int) (Math.random() * 100) + 1; // generate a random number between 1 and 100
        int userGuess = 0; // variable to store user's guess
        java.util.Scanner scanner = new java.util.Scanner(System.in); // create a Scanner object to read input
        System.out.println("Welcome to the Guessing Game! Try to guess the number between 1 and 100."); // welcome message
        do {
            System.out.print("Enter your guess: "); // prompt the user for their guess
            userGuess = scanner.nextInt(); // read the user's guess
            if (userGuess < numberToGuess) // if the guess is too low
            {
                System.out.println("Too low! Try again."); // feedback for too low
            } else if (userGuess > numberToGuess) // if the guess is too high
            {
                System.out.println("Too high! Try again."); // feedback for too high
            } else {
                System.out.println("Congratulations! You've guessed the number!"); // success message
            }
        } while (userGuess != numberToGuess); // loop until the user guesses the correct number
    }
}
