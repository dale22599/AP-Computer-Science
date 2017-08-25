
/**
 * Plays a dice game where 2 dice are rolled
 * Player A wins when a sum of 12 is rolled
 * Player B wins when two consecutive sums of 7 are rolled
 * 
 * @Dale Yu
 * @11/7/13
 */
public class DiceGame
{        
    public static void main (String[] args)
    {
        // instance variables
        int value1, value2, i = 0, aWin = 0, bWin = 0, k, l;
        
        // for loop to play the game 1000000 times
        for (k = 1; k <= 1000000; k++)
        {
            // resets values of dice to 0
            value1 = 0;
            value2 = 0;
            
            // for each game, rolls dice until one of the players wins
            do
            {
                i++;

                if ((i % 2) == 1)
                {
                    value1 = Die.sumOfTwoDice();
                }
                else if ((i % 2) == 0)
                {
                    value2 = Die.sumOfTwoDice();
                }
            }
            while (((value1 != 12) && (value2 != 12)) && ((value1 != 7) || (value2 != 7)));
            
            // keeps track of wins
            if ((value1 == 12) || (value2 == 12))
            {
                aWin++;
            }
            else if ((value1 == 7) && (value2 == 7))
            {
                bWin++;
            }            
        }
        
        // outputs number of wins of each player
        System.out.println("Out of " + (k - 1) + " games,");
        System.out.println("Player A won " + aWin + " times, " + ((double)(aWin) * 100 / (k-1)) + " percent of the time.");
        System.out.println("Player B won " + bWin + " times, " + ((double)(bWin) * 100 / (k-1)) + " percent of the time.");
    }
}