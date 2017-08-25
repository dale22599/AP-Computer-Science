//*******************************************************
// Account.java
//
// A bank account class with methods to deposit to, withdraw from,
// change the name on, charge a fee to, and print a summary of the account.
//
// @Dale Yu
// @11/24/13
//*******************************************************

import java.text.DecimalFormat;

public class Account
{
    private double balance;
    private String name, balString;
    private static String aD = "0", aW = "0", netChange = "0";
    private long acctNum;
    DecimalFormat df = new DecimalFormat("#.00");
    private static int numDeposits, numWithdrawals;
    private static double amountDeposited, amountWithdrawn;

    //----------------------------------------------
    //Constructor -- initializes balance, owner, and account number
    //----------------------------------------------
    public Account(double initBal, String owner, long number)
    {
        balance = initBal;
        name = owner;
        acctNum = number;        
        balString = df.format(balance);
    }

    //----------------------------------------------
    // Checks to see if balance is sufficient for withdrawal.
    // If so, decrements balance by amount; if not, prints message.
    //----------------------------------------------
    public void withdraw(double amount)
    {
        if (balance >= amount)
        {
            balance = Double.parseDouble(balString);
            amountWithdrawn = Double.parseDouble(aW);
            balance -= amount;
            balString = df.format(balance);
            amountWithdrawn += amount;
            numWithdrawals++;
            aW = df.format(amountWithdrawn); 
            netChange = df.format(amountDeposited - amountWithdrawn);
        }
        else
        {
            System.out.println("Insufficient funds");
        }
    }

    //----------------------------------------------
    // Adds deposit amount to balance.
    //----------------------------------------------
    public void deposit(double amount)
    {
        balance = Double.parseDouble(balString);
        amountDeposited = Double.parseDouble(aD);
        balance += amount;
        balString = df.format(balance);        
        amountDeposited += amount;
        numDeposits++;
        aD = df.format(amountDeposited);   
        netChange = df.format(amountDeposited - amountWithdrawn);
    }
    
    //----------------------------------------------
    // Resets variables to 0.
    //----------------------------------------------
    public static void resetAll()
    {
        numDeposits = 0;
        numWithdrawals = 0;
        amountDeposited = 0;
        amountWithdrawn = 0;
    }
    
    public static void resetNumDeposits()
    {
        numDeposits = 0;
    }
    
    public static void resetNumWithdrawn()
    {
        numWithdrawals = 0;
    }
    
    public static void resetAmountDeposited()
    {
        amountDeposited = 0;
    }
    
    public static void resetAmountWithdrawn()
    {
        amountWithdrawn = 0;
    }

    //----------------------------------------------
    // Returns balance.
    //----------------------------------------------
    public String getBalance()
    {
        balance = Double.parseDouble(balString);
        balString = df.format(balance);
        return balString;
    }

    //----------------------------------------------
    // Sets balance.
    //----------------------------------------------
    public void setBalance(double b)
    {
        this.balance = b;
        balString = df.format(balance);
    }

    //----------------------------------------------
    // Returns account number.
    //----------------------------------------------
    public long getAcctNum()
    {
        return acctNum;
    }

    //----------------------------------------------
    // Tranfers money to acc.
    //----------------------------------------------
    public void transfer(Account acc, double money)
    {
        if (balance >= money)
        {
            balance = Double.parseDouble(balString);
            amountDeposited = Double.parseDouble(aD);
            amountWithdrawn = Double.parseDouble(aW);
            this.withdraw(money);
            acc.deposit(money);
            System.out.println("$" + df.format(money) + " has been transferred from account " + this.getAcctNum() + " to " + acc.getAcctNum() + ".");
            balString = df.format(balance);
        }
        else
        {
            System.out.println("Insufficient funds.");
        }
    }
    
    public static void transfer(Account acct1, Account acct2, double amount)
    {
        acct1.transfer(acct2, amount);
    }
    
    //----------------------------------------------
    // Keeps track of withdrawals and deposits.
    //----------------------------------------------
    public static int getNumDeposits()
    {
        return numDeposits;
    }
    
    public static int getNumWithdrawals()
    {
        return numWithdrawals;
    }
    
    public static String getAmountDeposited()
    {
        return aD;
    }
    
    public static String getAmountWithdrawn()
    {
        return aW;
    }
    
    public static String getNetChange()
    {
        return netChange;
    }

    //----------------------------------------------
    // Returns a string containing the name, account number, and balance.
    //----------------------------------------------
    public String toString()
    {
        return "Owner: " + name + "; Account number: " + acctNum + "; Balance: " + balString + ";";
    }
}