
/**
 * Allows the user to play the High Low game
 * The user tries to guess the randomly generated number from 0 to 500 by being told higher or lower to modify their guess
 * Demonstrates use of loops
 * 
 * @Dale Yu
 * @10/14/13
 */

import java.util.Scanner;

public class HighLow2
{
    public static void main (String[] args)
    {
        // instance variables
        boolean replay;
        int total, numRound;
        double average;
        numRound = 0;
        total = 0;
        
        // do-while loop to continue the game if the user wishes to play again
        do
        {
            // instance variables
            int guess, number, numGuess, previousLow, previousHigh;
            String tries, yn;
            boolean redo;
            numGuess = 0;
            guess = 0;
            previousLow = -1;
            previousHigh = 501;

            // randomly generates the target number
            number = (int)(Math.random() * 501);

            Scanner in = new Scanner(System.in);

            // welcome message
            System.out.println("\nWelcome to the High Low game! Please guess any integer from 0 to 500.");
            System.out.println("Enter a negative integer to quit.\n");

            // while loop to continue game after each incorrect guess
            while ((guess != number) && (guess >= 0))
            {                        
                // checks for valid input and stores user's guess
                while (!in.hasNextInt()) 
                {
                    System.out.println("Please guess any integer from 0 to 500.");
                    System.out.println("Enter a negative integer to quit.\n");
                    in.next();
                }
                guess = in.nextInt();
                while (guess > 500)
                {                
                    System.out.println("Please guess any integer from 0 to 500.");
                    System.out.println("Enter a negative integer to quit.\n");
                    while (!in.hasNextInt())
                    {
                        System.out.println("Please guess any integer from 0 to 500.");
                        System.out.println("Enter a negative integer to quit.\n");
                        in.next();
                    }
                    guess = in.nextInt();
                }            

                // if guessed number had already been ruled out, alerts user; does not count misguess as a guess 
                if (((guess <= previousLow) || (guess >= previousHigh)) && (guess >= 0))
                {
                    System.out.println("That number has already been ruled out.");
                    System.out.println("Based on previous guesses, the valid range of possibilities is " + (previousLow + 1) + " to " + (previousHigh - 1) + " inclusive.");
                    System.out.println("Please guess again.");
                    System.out.println("Enter a negative integer to quit.\n");
                }
                else
                {
                    // keeps track of number of guesses
                    numGuess++;
                    // tells user whether the target number is higher or lower than their guess
                    if ((guess < number) && (guess >= 0))
                    {
                        System.out.println("Higher");
                        System.out.println("Enter a negative integer to quit.\n");
                        previousLow = guess;
                    }
                    else if ((guess > number) && (guess >= 0))
                    {
                        System.out.println("Lower");
                        System.out.println("Enter a negative integer to quit.\n");
                        previousHigh = guess;
                    }
                }                
            }        

            // makes sure correct form of the word "try" is used in output
            if (guess < 0)
            {
                if (numGuess == 2)
                {
                    tries = "try";
                }
                else
                {
                    tries = "tries";
                }
            }
            else
            {
                if (numGuess == 1)
                {
                    tries = "try";
                }
                else
                {
                    tries = "tries";
                }
            }

            // congratulations message or quitting message; tells user number of tries required
            if (guess == number)
            {
                System.out.println("\nCongratulations! You won in " + numGuess + " " + tries + "!");
            }
            else
            {
                System.out.println("\nYou quit after " + (numGuess - 1) + " " + tries + ".");
            }

            // finds average; if user quit, their guesses for that round are not counted
            if (guess == number)
            {
                total += numGuess;
                numRound++;
            }          
            average = (double)total / numRound;

            // outputs the average of guesses per round only if the user played at least one round
            if (numRound > 0)
            {
                System.out.println("Your average number of guesses for each round won is " + average + ".");
            }

            // asks user if they want to play again; checks for valid input
            do
            {
                System.out.println("\nWould you like to play again?");
                System.out.println("Enter Y to play again or N to quit.\n");

                yn = in.next();
                if (yn.toUpperCase().equals("Y"))
                {
                    replay = true;
                    redo = false;
                }
                else if (yn.toUpperCase().equals("N"))
                {
                    replay = false;
                    redo = false;
                }
                else
                {
                    redo = true;
                    replay = false;
                }
            }
            while (redo);
        }
        while (replay);
    }
}
