
/**
 * Outputs a multiplication table from 1x1 to 12x12
 * Demonstrates use of for loops
 * 
 * @Dale Yu
 * @10/17/13
 */
public class MultTable
{
    public static void main (String[] args)
    {
        // instance variables
        String space;

        // prints "X" and "|" at top left
        System.out.print("  X |");

        for(int k = 1; k <= 12; k++)
        {
            // makes numbers line up by ones digit
            if(k < 10)
            {
                space = "   ";
            }
            else
            {
                space = "  ";
            }

            // prints top labels
            System.out.print(space + k);
        }

        // prints line seperating top labels from body
        System.out.println("\n------------------------------------------------------");

        for(int i = 1; i <= 12; i++)
        {             
            // makes numbers line up by ones digit
            if(i < 10)
            {
                space = "  ";
            }
            else
            {
                space = " ";
            }                       

            // prints side labels
            System.out.print(space + i + " |");

            for(int j = 1; j <= 12; j++)
            {            
                // makes numbers line up by ones digit
                if((i * j) < 10)
                {
                    space = "   ";
                }
                else if ((i * j) < 100)
                {
                    space = "  ";
                }
                else
                {
                    space = " ";
                }

                // prints body
                System.out.print(space + i * j);
                // makes sure only 12 numbers per line
                if((j % 12) == 0)
                {
                    System.out.println();
                }
            }
        }
    }    
}
