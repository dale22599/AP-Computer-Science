
import java.util.Scanner;

/**
 * Checks if a phrase is a palindrome
 * 
 * @Dale Yu
 * @3/18/14
 */
public class Palindrome
{
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        String choice, str;

        System.out.println("What phrase would you like to check to see if it is a palindrome?");        
        str = in.nextLine();
        System.out.println("\nWould you like to check your phrase including or ignoring spaces?");
        do
        {
            System.out.println("Enter 1 to include spaces\tEnter 2 to ignore spaces");
            choice = in.nextLine();
        }
        while (!choice.equals("1") && !choice.equals("2"));
        if (choice.equals("1"))
        {
            if (palindrome(str))
            {
                System.out.println("\"" + str + "\"" + " IS a palindrome!");
            }
            else
            {
                System.out.println("\"" + str + "\"" + " IS NOT a palindrome!");
            }
        }
        else
        {
            if (palindromeIW(str))
            {
                System.out.println("\"" + str + "\"" + " IS a palindrome!");
            }
            else
            {
                System.out.println("\"" + str + "\"" + " IS NOT a palindrome!");
            }
        }
    }

    public static boolean palindrome(String s)
    {
        if (s.length() < 2)
        {
            return true;
        }
        else
        {
            if (s.toLowerCase().charAt(0) == (s.toLowerCase().charAt(s.length() - 1)) && palindrome(s.substring(1, s.length() - 1)))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }
    
    public static boolean palindromeIW(String s)
    {
        s = s.replaceAll("\\s", "");
        return palindrome(s);
    }
}
