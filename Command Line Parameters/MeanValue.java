/**
 * Finds mean of numbers
 * 
 * @Dale Yu
 * @1/24/13
 */
public class MeanValue
{
    public static void main (int[] args)
    {
        int total = 0, meanInt;
        double mean = 0;
        String output = "The mean value of ";
        if (args.length == 0)
        {
            System.out.println("There are no ints in the array");
        }
        else if (args.length == 1)
        {
            System.out.println(output + args[0] + " is " + args[0] + ".");
        }
        else
        {
            for (int i = 0; i < args.length; i++)
            {
                total += args[i];
                mean = (double)total/i;
                if (i < (args.length - 1))
                {
                    output += args[i] + ", ";
                }
                else
                {
                    output += "and " + args[i];
                }
            }
            if (mean % 1 == 0)
            {
                meanInt = (int)mean;
                System.out.println(output + " is " + meanInt + ".");
            }
            else
            {
                System.out.println(output + " is " + mean + ".");
            }
        }
    }
}
