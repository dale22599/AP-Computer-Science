
/**
 * Creates Symbols: characters that can be hidden or unhidden
 * 
 * @Dale Yu
 * @12/9/13
 */
public class Symbol
{
    private char ch;
    private boolean hidden = false;

    public Symbol(char c)
    {
        ch = c;
    }
    
    public void setHidden(boolean b)
    {
        this.hidden = b;
    }
    
    public char getCh()
    {
        return this.ch;
    }
    
    public boolean getHidden()
    {
        return this.hidden;
    }
}
