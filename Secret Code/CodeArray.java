
/**
 * Allows parts of a String code to be hidden or revealed
 * 
 * @Dale Yu 
 * @12/9/13
 */
public class CodeArray
{
    private String str;
    private Symbol[] symbolsArray = new Symbol[21];

    public CodeArray(String s)
    {
        str = s;
        for (int i = 0; i < symbolsArray.length; i++)
        {
            symbolsArray[i] = new Symbol(str.charAt(i));
        }
    }

    public void hide(int p1, int p2)
    {
        for (int i = p1; i < p2; i++)
        {            
            symbolsArray[i].setHidden(true);
        }
    }

    public void recover(int p1, int p2)
    {
        for (int i = p1; i < p2; i++)
        {
            symbolsArray[i].setHidden(false);
        }
    }

    public String toString()
    {
        String toStr = "";
        for (int i = 0; i < symbolsArray.length; i++)
        {            
            if (symbolsArray[i].getHidden())
            {
                // if Symbol is hidden, adds a * to the code
                toStr += '*';
            }
            else
            {
                // if Symbol is not hidden, adds the next letter to the code
                toStr += symbolsArray[i].getCh();
            }            
        }
        return toStr;
    }
}