
/**
 * @Dale Yu
 * @3/14/14
 */
public class RecursiveMethods
{    
    public static void main(String[] args)
    {
        //test factorial method
        System.out.println("5! = " + factorial(5) );
        System.out.println("8! = " + factorial(8) );
        System.out.println("1! = " + factorial(1) );
        
        //test nonnegative integer powers method
        System.out.println("3 to the power of 7 is " + nonNegIntPower(3, 7) );
        System.out.println("4 to the power of 5 is " + nonNegIntPower(4, 5) );
        System.out.println("-2.5 to the power of 3 is " + nonNegIntPower(-2.5, 3) );
        System.out.println("-1.5 to the power of 4 is " + nonNegIntPower(-1.5, 4) );

        //test nonnegative integer powers method
        System.out.println("2 to the power of -3 is " + intPower(2, -3) );
        System.out.println("-2.4 to the power of -3 is " + intPower(-2.4, -3) );
        System.out.println("2 to the power of 7 is " + intPower(2, 7) );
    }

    public static int factorial(int i)
    {
        if (i < 0)
        {
            System.out.println("ERROR! Factorial cannot be taken of a negative.");
            return 0;
        }
        else
        {
            if (i == 0)
            {
                return 1;
            }
            else
            {
                return i * factorial(i-1);
            }
        }
    }

    public static double nonNegIntPower(double base, int pow)
    {
        if (pow < 0)
        {
            System.out.println("ERROR! Power cannot negative.");
            return 0;
        }
        else
        {
            if (pow == 0)
            {
                return 1;
            }
            else
            {
                return base * nonNegIntPower(base, pow - 1);
            }
        }
    }

    public static double intPower(double base, int pow)
    {
        if (pow >= 0)
        {
            return nonNegIntPower(base, pow);
        }
        else
        {
            return 1 / nonNegIntPower(base, -pow);
        }
    }    
}