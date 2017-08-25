
import java.util.Scanner;

/**
 * Allows the user to play the Number Permutation Game
 * 
 * @Dale Yu
 * @12/12/13
 */
public class PlayNPGame
{
    public static void main (String[] args)
    {        
        Scanner in = new Scanner(System.in);
        int flip, tries;
        String replay;

        do
        {
            NPGame game = new NPGame();
            tries = 0;
            
            System.out.println("Welcome to the Number Permutation Game!");
            System.out.println("The rules are simple: at the start of the game, you will be given a randomly generated number containing one of each of the digits from 0 to 9.");
            System.out.println("Each round, you must choose a number that will flip the first that many digits. You must do this until the number becomes 0123456789.");
            System.out.println("Try to win in as few rounds as possible. Good luck!\n");

            System.out.println(game);                   
            do
            {
                do
                {
                    System.out.println("Please choose a number of digits, 1 to 10, to flip, starting from the beginning.");
                    System.out.println("Enter 0 to quit.");
                    while (!in.hasNextInt())
                    {
                        System.out.println("Please choose a number of digits, 1 to 10, to flip, starting from the beginning.");
                        System.out.println("Enter 0 to quit.");
                        in.next();
                    }
                    flip = in.nextInt();
                }
                while ((flip < 0) || (flip > 10));
                game.flipPrefix(flip);
                System.out.println("\n" + game);
                tries++;
            }
            while ((!game.toString().equals("0123456789")) && (flip != 0));

            if ((flip == 0) && (tries == 2))
            {
                System.out.println("You quit after 1 try.");
            }
            else if (flip == 0)
            {
                System.out.println("You quit after " + (tries - 1) + " tries.");
            }
            else if (tries == 1)
            {
                System.out.println("Congratulations! You won in 1 try!");
            }
            else
            {            
                System.out.println("Congratulations! You won in " + tries + " tries!");
            }

            do
            {
                System.out.println("Would you like to play again? (y/n)");
                replay = in.next();
            }
            while ((!replay.equalsIgnoreCase("y")) && (!replay.equalsIgnoreCase("n")));

            System.out.println();
        }
        while (replay.equalsIgnoreCase("y"));
    }
}
