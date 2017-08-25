
/**
 * Allows arrays of randomly generated permutations of the numbers 1 through 9 to be created and manipulated
 * 
 * @Dale Yu
 * @12/12/13
 */
public class NPGame
{
    private int[] intArray = new int[10];
    private boolean[] booArray = new boolean[10];
    private int num;

    public NPGame()
    {
        for (int i = 0; i < intArray.length; i++)
        {
            do
            {
                num = (int)(Math.random() * 10);
            }
            while (booArray[num]);
            intArray[i] = num;
            booArray[num] = true;
        }
    }

    public void flipPrefix(int n)
    {
        int[] intArray2 = new int[10];
        System.arraycopy(intArray, 0, intArray2, 0, 10);
        for (int i = 0; i < n; i++)
        {
            intArray2[i] = intArray[n-i-1];
        }
        System.arraycopy(intArray2, 0, intArray, 0, 10);
    }
    
    public String toString()
    {
        String toStr = "";
        for (int i = 0; i < intArray.length; i++)
        {
            toStr += intArray[i];
        }
        return toStr;
    }       
}
