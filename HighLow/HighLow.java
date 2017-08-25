
/**
 * Allows the user to play the High Low game
 * The user tries to guess the randomly generated number from 0 to 500 by being told higher or lower to modify their guess
 * Demonstrates use of loops
 * 
 * @Dale Yu
 * @10/14/13
 */

import java.util.Scanner;

public class HighLow
{
    public static void main (String[] args)
    {
        // instance variables
        int guess, number, numGuess;
        numGuess = 0;
        
        // randomly generates the target number
        number = (int)(Math.random() * 501);
        
        // welcome message
        System.out.println("Welcome to the High Low game! Please guess any integer from 0 to 500.");
        
        // do-while loop to continue the game after each incorrect guess
        do
        {            
            Scanner in = new Scanner(System.in);
            
            // checks for valid input and also stores the user's guess
            while (!in.hasNextInt()) 
            {
                System.out.println("Please guess any integer from 0 to 500.");
                in.next();
            }
            guess = in.nextInt();
            while ((guess < 0) || (guess > 500))
            {                
                System.out.println("Please guess any integer from 0 to 500.");
                while (!in.hasNextInt())
                {
                    System.out.println("Please guess any integer from 0 to 500.");
                    in.next();
                }
                guess = in.nextInt();
            }            
            
            // tells user whether the target number is higher or lower than their guess
            if (guess < number)
            {
                System.out.println("Higher");
            }
            else if (guess > number)
            {
                System.out.println("Lower");
            }
            
            // keeps track of number of guesses
            numGuess++;
        }
        while (guess != number);
                
        // congratulations message after the user wins
        System.out.println("Congratulations! You won in " + numGuess + " tries!");
    }
}
