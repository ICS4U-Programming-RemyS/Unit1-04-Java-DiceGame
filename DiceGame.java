import java.util.Scanner;


/**.
* This program will check if the user guessed the correct number
* Between 1 and 6 with a random number generator and display
* If the number is higher or lower
*
* @author  Remy Skelton
* @version 1.0
* @since   2025-February-26
*/


final class DiceGame {
    /**.
    * MIN_NUM as int constant
    **/
    private static final int MIN_NUM = 1;
    /**.
    * MAX_NUM as int constant
    **/
    private static final int MAX_NUM = 6;

    /**
    * This is a private constructor used to satisfy the style checker.
    *
    * @exception IllegalStateException Utility class.
    * @see IllegalStateException
    */
    private DiceGame() {
        throw new IllegalStateException("Utility class");
    }


    /**
    * This is the main method.
    *
    * @param args Unused.
    */
    public static void main(final String[] args) {
        // Welcome message
        System.out.println("This program will generate a random number on"
                + " a dice and you will have to guess the number");

        // Use a scanner to get the userGuess from the user
        Scanner scanner = new Scanner(System.in);

        // Declare numberOfGuess as int variable
        int numberOfGuess = 1;

        // Declare guessAsInt as int variable
        int guessAsInt = 0;

        // Declare correctGuess int variable and
        // make it a random number >=1 and <=6
        int correctGuess = (int) (Math.random() * (MAX_NUM) + 1);

        // Do while loop to run until correct guess is entered
        do {
            // Message to ask user for guess
            System.out.println("Please enter an"
                    + " Integer between 1 and 6: ");
            // Get the guess as a string
            String guessAString = scanner.nextLine();

            try {

                // Convert string to int
                guessAsInt = Integer.parseInt(guessAString);

                if (guessAsInt >= MIN_NUM && guessAsInt <= MAX_NUM) {
                    // If statement for valid guess
                    if (guessAsInt == correctGuess) {
                        // Display the user got the correct guess
                        // And amount of guesses it took
                        System.out.print("Congratulations! ");
                        System.out.print("You guessed the correct number: ");
                        System.out.print(correctGuess);
                        System.out.print(". It took you ");
                        System.out.print(numberOfGuess);
                        System.out.println(" guesses.");
                    } else if (guessAsInt < correctGuess) {
                        // Display message if guess is lower
                        System.out.print("The number is lower than ");
                        System.out.println(guessAsInt);
                        // Increment the number of guesses
                        numberOfGuess = numberOfGuess + 1;
                    } else {
                        // Display message if guess is higher
                        System.out.print("The number is lower than ");
                        System.out.println(guessAsInt);
                        // Increment the number of guesses
                        numberOfGuess = numberOfGuess + 1;
                    }

                } else {
                    // Error message for invalid input
                    System.out.println("Invalid input: " + guessAString
                            + ". Please enter an Integer between 1 and 6.");
                }
            } catch (NumberFormatException error) {
                // Error message for invalid input
                System.out.println("Invalid input: " + guessAString
                        + ". Please enter an Integer between 1 and 6.");
           }
        // While the guess does not equal the correct guess
        } while (guessAsInt != correctGuess);

    // Close scanner
    scanner.close();
    }
}
