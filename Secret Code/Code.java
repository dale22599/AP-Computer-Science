/**
 * Allows parts of a String code to be hidden or revealed
 * Demonstrates knowledge of object-oriented programming and proficiency with String class methods
 * 
 * @Dale Yu
 * @10/29/13
 */
public class Code
{
    // instance variables
    private String myCode, myCode2;

    // Code method, allows code to be manipulated in Code class
    public Code(String code)
    {
        // original code
        myCode = code;
        // new code after each method is used
        myCode2 = code;
    }

    //Pre:  p1>=0, p1<p2, p2<=mycode.length()
    //Post:  Replaces the characters in the code starting at position p1 until
    //       position p2 - 1 (inclusive) with the character 'X'
    public void hide(int p1, int p2)
    {
        // converts String to StringBuilder to be manipulated
        StringBuilder sbCode1 = new StringBuilder(myCode2);
        for (int first = p1; first < p2; first++)
        {
            sbCode1.setCharAt(first, 'X');            
        }       
        // converts StringBuilder to String
        myCode2 = sbCode1.toString();
    }

    //Pre:  p1>=0, p1<p2, p2<=mycode.length()
    //Post:  Restores to their original values the characters in the code
    //       starting at position p1 until position p2 - 1 (inclusive)
    public void recover(int p1, int p2)
    {
        // converts String to StringBuilder to be manipulated
        StringBuilder sbCode2 = new StringBuilder(myCode2);
        for (int first = p1; first < p2; first++)
        {
            char ch = myCode.charAt(first);
            sbCode2.setCharAt(first, ch);
        }
        // converts StringBuilder to String
        myCode2 = sbCode2.toString(); 
    }

    // Allows String myCode2 to be returned instead of the file location
    public String toString()
    {
        return myCode2;
    }
}