
import java.util.Arrays;

/**
 * Allows strings to be sorted by alphabetical order
 * 
 * @Dale Yu
 * @1/24/13
 */
public class SortStrings
{
    public static void main (String[] args)
    {        
        if (args.length == 0)
        {
            System.out.println("There are no strings in the array");
        }
        else
        {
            for (int i = 0; i < args.length; i++)
            {
                System.out.println(args[i]);
            }
            System.out.println();
            Arrays.sort(args);
            for (int i = 0; i < args.length; i++)
            {
                System.out.println(args[i]);
            }
        }
    }
}
