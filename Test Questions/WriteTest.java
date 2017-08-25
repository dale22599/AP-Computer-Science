
import java.util.Scanner;
import java.io.*;

/**
 * Driver for Test Questions
 * 
 * @Dale Yu
 * @2/26/14
 */
public class WriteTest
{
    public static void main(String[] args) throws IOException
    {
        Scanner scan = new Scanner(new File("TestBank.dat"));
        
        int numQuestions = scan.nextInt();
        // gets rid of blank space
        scan.nextLine();
        for (int i = 1; i <= numQuestions; i++)
        {
            String typeQuestion = scan.nextLine();
            if (typeQuestion.equals("e"))
            {
                System.out.print(i + ". ");
                Essay ess = new Essay();
                ess.readQuestion(scan);
                System.out.println(ess);
            }
            else if (typeQuestion.equals("m"))
            {
                MultChoice mult = new MultChoice();
                mult.readQuestion(scan);
                System.out.print(i + ". ");
                System.out.println(mult);
            }
            else
            {
                System.out.println("No valid input detected");
            }
            System.out.println();
        }        
    }
}
