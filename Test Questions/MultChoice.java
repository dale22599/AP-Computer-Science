
import java.util.Scanner;

/**
 * Allows multiple choice questions to be created and printed
 * 
 * @Dale Yu
 * @2/25/14
 */
public class MultChoice extends TestQuestion
{
    private String[] answers;
    
    // no-argument constructor for MultChoice
    public MultChoice()
    {
        super();
        answers = null;
    }

    public void readQuestion(Scanner s)
    {
        answers = new String[s.nextInt()];
        // gets rid of blank space
        s.nextLine();
        question = s.nextLine();
        for (int j = 0; j < answers.length; j++)
        {
            answers[j] = s.nextLine();
        }
    }

    public String toString()
    {
        String str = "";
        str += question + "\n";
        // prints answers
        for (int i = 0; i < answers.length; i++)
        {
            str += "\t" + (char)(i+97) + ") " + answers[i] + "\n";
        }
        
        return str;
    }
}
