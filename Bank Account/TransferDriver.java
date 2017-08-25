import java.util.Scanner;

/**
 * Allows the user to transfer money from one account to another
 * Uses instance version of the transfer method
 * 
 * @Dale Yu
 * @11/24/13
 */
public class TransferDriver
{
    public static void main (String[] args)
    {        
        long acctNum;
        Scanner in = new Scanner(System.in);

        Account acct1 = new Account(1000000, "Q", 314159);
        Account acct2 = new Account(1000000, "Mo", 271828);

        do
        {
            System.out.println(acct1);
            System.out.println(acct2);
            System.out.println("Enter the account number of the account you would like to transfer from. If you would like to quit, enter \"0\".\n");

            while (!in.hasNextLong())
            {
                System.out.println("Invalid input");
                System.out.println("Enter the account number of the account you would like to transfer from. If you would like to quit, enter \"0\".\n");
                in.next();
            }
            acctNum = in.nextLong();
            while ((acctNum != acct1.getAcctNum() && acctNum != acct2.getAcctNum()) && acctNum != 0)
            {
                System.out.println("Invalid input");
                System.out.println("Enter the account number of the account you would like to transfer from. If you would like to quit, enter \"0\".\n");
                while (!in.hasNextLong())
                {
                    System.out.println("Invalid input");
                    System.out.println("Enter the account number of the account you would like to transfer from. If you would like to quit, enter \"0\".\n");
                    in.next();
                }
                acctNum = in.nextLong();
            }

            if (acctNum == acct1.getAcctNum())
            {
                System.out.println("How much would you like to transfer from account " + acct1.getAcctNum() + " to " + acct2.getAcctNum() + "?");
                while (!in.hasNextDouble())
                {
                    System.out.println("Invalid input");
                    System.out.println("How much would you like to transfer from account " + acct1.getAcctNum() + " to " + acct2.getAcctNum() + "?");
                    in.next();
                }
                double amountTrans = in.nextDouble();
                acct1.transfer(acct2, amountTrans);
            }
            else if (acctNum == acct2.getAcctNum())
            {
                System.out.println("How much would you like to transfer from account " + acct2.getAcctNum() + " to " + acct1.getAcctNum() + "?");
                while (!in.hasNextDouble())
                {
                    System.out.println("Invalid input");
                    System.out.println("How much would you like to transfer from account " + acct1.getAcctNum() + " to " + acct2.getAcctNum() + "?");
                    in.next();
                }
                double amountTrans = in.nextDouble();
                acct2.transfer(acct1, amountTrans);
            }            
        }
        while (acctNum != 0);
        
        System.out.println();
        System.out.println(acct1);
        System.out.println(acct2);
    }
}
