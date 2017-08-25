
/**
 * Finds the sum of an integers digits, and figures out if the sum is divisible by 7
 * 
 * @Dale Yu
 * @3/18/14
 */
public class Checksum
{    
    public static void main (String[] args)
    {
        System.out.println(sumDigits(-5));
        System.out.println(sumDigits(5));
        System.out.println(sumDigits(15));
        System.out.println(sumDigits(12345));
        System.out.println(sumDigits(832737183));
        System.out.println(checkSum7(-5));
        System.out.println(checkSum7(5));
        System.out.println(checkSum7(15));
        System.out.println(checkSum7(12345));
        System.out.println(checkSum7(832737183));
    }
    
    public static int sumDigits(int code)
    {                
        if (code <= 0)
        {
            System.out.println("ERROR! Code must be positive.");
            return -1;
        }
        else if (code < 10)
        {
            return code;
        }
        else
        {            
            return (code % 10) + sumDigits((int)(code / 10));
        }
    }
    
    public static boolean checkSum7(int sum)
    {
        if ((sumDigits(sum) % 7) == 0)
        {
            System.out.println(sum + " PASSES the checksum test for divisibility by 7.");
            return true;
        }
        else
        {
            System.out.println(sum + " FAILS the checksum test for divisibility by 7.");
            return false;
        }
    }
}
