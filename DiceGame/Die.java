public class Die
{
    private int numFaces;
    private int value;

    public Die()
    {
        numFaces = 6;
        value = 1;
    }
    
    public Die(int numSides)
    {
        if(numSides < 4)        // check that there is a valid number of faces
            numFaces = 6;
        else
            numFaces = numSides;
            
        value = 1;
    }
    
    public int roll()
    {
        value = (int)(Math.random() * numFaces + 1);
        
        return value;
    }
    
    public int getValue()
    {
        return value;
    }
             
    public static int sumOfTwoDice()
    {
        return (int)(Math.random() * 6 + 1) + (int)(Math.random() * 6 + 1);
    }
    
}