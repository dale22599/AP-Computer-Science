
/**
 * Generates a random phone number for political cold calls
 * 
 * @Dale Yu
 * @9/24/2013
 */
public class PhoneNumber
{
    public static void main (String[] args)
    {
        int areaCode = (int)(Math.random() * 800 + 200);
        int number = (int)(Math.random() * 8000000 + 2000000);
        String numberString = Integer.toString(number);
        String first = numberString.substring(0, 3);
        String last = numberString.substring(3, 7);
        System.out.println (areaCode + "-" + first + "-" + last);
    }
}
