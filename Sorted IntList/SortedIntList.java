
import java.util.Arrays;

/**
 * Write a description of class SortedIntList here.
 * 
 * @Dale Yu
 * @2/12/2014
 */
public class SortedIntList extends IntList
{
    public SortedIntList(int size)
    {
        super(size);
    }

    public void add(int value)
    {        
        if (numElements == list.length)
        {
            System.out.println("Can't add, list is full");
        }
        else
        {   
            if (numElements == 0)
            {
                list[0] = value;
            }
            else
            {
                int index = -1;
                if (value <= list[0])
                {
                    index = 0;
                }
                else if (value >= list[numElements-1])
                {
                    index = numElements;
                }
                else
                {
                    for (int i = 0; value >= list[i]; i++)
                    {
                        if (value < list[i+1])
                        {
                            index = i + 1;
                        }
                    }
                }
                for (int j = numElements; j > index; j--)
                {
                    list[j] = list[j-1];
                }
                list[index] = value;
            }
            numElements++;            
        }
    }    
}
