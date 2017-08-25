
import java.util.Scanner;

/**
 * Parent class of Essay and MultChoice, containing abstract method readQuestion
 * 
 * @Dale Yu
 * @2/25/2014
 */
public abstract class TestQuestion
{
    protected String question;
    protected Scanner s;
    
    // no-argument constructor for TestQuestion
    public TestQuestion()
    {
        this.question = "";
    }
    
    public abstract void readQuestion(Scanner s);
}
