
import java.util.Arrays;
import java.util.Scanner;

/**
 * Shows possibility of coin flips
 * 
 * @Dale Yu
 * @3/14/14
 */
public class CoinFlip
{
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("What number of coins would you like to see all of the possible flips for?");
        
        while (!in.hasNextInt())
        {
            System.out.println("Please enter an integer.");
            in.next();
        }
        
        int numCoins = in.nextInt();
        
        System.out.println("Every possible permutation of flips for " + numCoins + " coins is:\n" + Arrays.toString(flip(numCoins)));
    }

    public static String[] flip(int numCoins)
    {
        String[] coins = new String[(int)Math.pow(2, numCoins)];
        if (numCoins < 1)
        {
            System.out.println("ERROR! Number of coins must be positive.");
            return new String[] {};
        }
        else
        {
            if (numCoins == 1)
            {
                coins = new String[] {"H", "T"};
                return coins;
            }
            else
            {
                for (int i = 0; i < coins.length; i++)
                {
                    if (i < (coins.length / 2))
                    {
                        coins[i] = "H" + flip(numCoins - 1)[i];
                    }
                    else
                    {
                        coins[i] = "T" + flip(numCoins - 1)[i - (coins.length / 2)];
                    }
                }
                return coins;
            }
        }
    }
}
