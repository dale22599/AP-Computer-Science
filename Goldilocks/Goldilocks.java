
/**
 * Outputs description of porridge temperature
 * Demonstrates use of nested conditional statements
 * 
 * @Dale Yu
 * @9/30/13
 */

import java.util.Scanner;

public class Goldilocks
{
    public static void main (String[] args)
    {
        // instance variables
        double temperature;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("What is the temperature of your porridge? (in degrees Fahrenheit)");
        
        // input from keyboard porridge temperature; checks for valid input to prevent runtime errors
        while (!in.hasNextDouble()) {
            System.out.println("Error. Please enter a valid number:");
            in.next();
        }
        temperature = in.nextDouble();
        
        // outputs to screen a description of the porridge temperature
        if (temperature >= 120 && temperature <= 140)
        {
            if (temperature == 131.8)
            {
                System.out.println("Your porridge is at a perfect temperature!");
            }
            else
            {
                System.out.println("Your porridge is at a desirable temperature!");
            }
        }
        else
        {
            if (temperature < 120)
            {
                System.out.println("That's too cold!");
            }
            else if (temperature > 140)
            {
                System.out.println("That's too hot!");
            }
        }              
    }
}