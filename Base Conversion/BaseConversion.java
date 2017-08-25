
import java.util.Scanner;

/**
 * Converts bases
 * 
 * @Dale Yu
 * @3/19/14
 */
public class BaseConversion
{
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        int num, base;

        System.out.println("What number would you like to convert to another base?");  
        do
        {
            System.out.println("Please enter a positive integer.");
            while (!in.hasNextInt())
            {
                System.out.println("Please enter a positive integer.");
                in.next();
            }
            num = in.nextInt();
        }
        while (num < 0);
        System.out.println("What base would you like to convert " + num + " to?");
        do
        {
            System.out.println("Please enter a positive integer.");
            while (!in.hasNextInt())
            {
                System.out.println("Please enter a positive integer.");
                in.next();
            }
            base = in.nextInt();
        }
        while (base < 0);
        System.out.println(num + "(base 10) is equal to " + convert(num, base) + "(base " + base + ").");
    }

    public static String convert(int num, int base)
    {
        int quotient, remainder;
        char remain;
        quotient = num / base;
        remainder = num % base;
        if (remainder > 9)
        {
            remain = (char)(remainder + 55);
        }
        else
        {
            remain = (char)(remainder + 48);
        }

        if (quotient == 0)
        {
            return "" + remain;
        }
        else
        {
            return convert(quotient, base) + (remain);
        }
    }
}
