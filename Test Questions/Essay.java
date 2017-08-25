
import java.util.Scanner;

/**
 * Allows essay questions to be created and printed
 * 
 * @Dale Yu
 * @2/25/14
 */
public class Essay extends TestQuestion
{
    private int lines;
    
    // no-argument constructor for MultChoice
    public Essay()
    {
        super();
        this.lines = 0;
    }

    public void readQuestion(Scanner s)
    {
        lines = s.nextInt();
        // gets rid of blank space
        s.nextLine();
        question = s.nextLine();
    }

    public String toString()
    {
        String str = "";
        str += question + "\n";
        // prints lines
        for (int i = 0; i < lines; i++)
        {
            for (int j = 0; j < 50; j++)
            {
                str += "_";
            }
            str += "\n";
        }
        
        return str;
    }
}
