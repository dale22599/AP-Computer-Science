
/**
 * Calculates the total value of coins
 * Demonstrates use of the Scanner class
 * 
 * @Dale Yu
 * @9/27/13
 */

import java.util.Scanner;

public class AddChange
{
    public static void main (String[] args)
    {
        // instance variables
        double quarter, dime, nickel, penny, number;
        double valueQuarter, valueDime, valueNickel, valuePenny, valueCoins;
        
        // input from keyboard number of each coin; checks for valid input to prevent runtime errors
        Scanner in = new Scanner(System.in);
        do{
            System.out.println("Pennies: ");
            while (!in.hasNextInt()) {
                System.out.println("Error. Please enter a valid number.\nPennies: ");
                in.next();
            }
            number = in.nextInt();
            penny = number;
        }while (!checkNumber(number));
        do{
            System.out.println("Nickels: ");
            while (!in.hasNextInt()) {
                System.out.println("Error. Please enter a valid number.\nNickels: ");
                in.next();
            }
            number = in.nextInt();
            nickel = number;
        }while (!checkNumber(number));
        do{
            System.out.println("Dimes: ");
            while (!in.hasNextInt()) {
                System.out.println("Error. Please enter a valid number.\nDimes: ");
                in.next();
            }
            number = in.nextInt();
            dime = number;
        }while (!checkNumber(number));
        do{
            System.out.println("Quarters: ");
            while (!in.hasNextInt()) {
                System.out.println("Error. Please enter a valid number.\nQuarters: ");
                in.next();
            }
            number = in.nextInt();
            quarter = number;
        }while (!checkNumber(number));
        
        // calculates total value of coins
        valueQuarter = 0.25 * quarter;
        valueDime = 0.1 * dime;
        valueNickel = 0.05 * nickel;
        valuePenny = 0.01 * penny;
        valueCoins = valuePenny + valueNickel + valueDime + valueQuarter;
        
        // displays to screen total value of coins
        System.out.printf("Total value of coins: $%.2f", valueCoins);
    }
        
    // makes sure input isn't negative
    private static boolean checkNumber(double number){
        if (number < 0) {
            System.out.println("Error. Please enter a valid number. ");
            return false;
        }
        return true;
    }
}
