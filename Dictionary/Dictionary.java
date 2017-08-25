
/**
 * Receives four words from the user and outputs them in alphabetical order
 * Output uses same case as input
 * If inputs are the same except for case, uppercase comes before lowercase
 * Demonstrates use of if and else statements, compound comparisons, and String comparisons
 * 
 * @Dale Yu
 * @10/4/13
 */

import java.util.Scanner;

public class Dictionary
{
    public static void main (String[] args)
    {        
        // instance variables
        String word1, word2, word3, word4, word5, word1LC, word2LC, word3LC, word4LC, first, second, third, fourth;
        
        // input any four words in any order
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter four words: ");
        word1 = in.next();
        word2 = in.next();
        word3 = in.next();
        word4 = in.next();
        
        // changes words to lowercase
        word1LC = word1.toLowerCase();
        word2LC = word2.toLowerCase();
        word3LC = word3.toLowerCase();
        word4LC = word4.toLowerCase();
        
        // determines alphabetical order of each pair of words
        int dif12 = word1LC.compareTo(word2LC);
        int dif13 = word1LC.compareTo(word3LC);
        int dif14 = word1LC.compareTo(word4LC);
        int dif23 = word2LC.compareTo(word3LC);
        int dif24 = word2LC.compareTo(word4LC);
        int dif34 = word3LC.compareTo(word4LC);
        
        // if two or more words are identical except for case, will make sure uppercase comes before lowercase
        if (dif12 == 0)
        {
            dif12 = word1.compareTo(word2);
        }
        if (dif13 == 0)
        {
            dif13 = word1.compareTo(word3);
        }
        if (dif14 == 0)
        {
            dif14 = word1.compareTo(word4);
        }
        if (dif23 == 0)
        {
            dif23 = word2.compareTo(word3);
        }
        if (dif24 == 0)
        {
            dif24 = word2.compareTo(word4);
        }
        if (dif34 == 0)
        {
            dif34 = word3.compareTo(word4);
        }
        
        // finds first word and sets it as word1; greatly shortens code
        if ((dif12 <= 0) && (dif13 <= 0) && (dif14 <= 0))
        {
            word1 = word1;
        }
        else if ((dif12 >= 0) && (dif23 <= 0) && (dif24 <= 0))
        {
            word5 = word1;
            word1 = word2;
            word2 = word5;
        }
        else if ((dif13 >= 0) && (dif23 >= 0) && (dif34 <= 0))
        {
            word5 = word1;
            word1 = word3;
            word3 = word5;
        }
        else if ((dif14 >= 0) && (dif24 >= 0) && (dif34 >= 0))
        {
            word5 = word1;
            word1 = word4;
            word4 = word5;
        }
        
        // changes words to lowercase
        word2LC = word2.toLowerCase();
        word3LC = word3.toLowerCase();
        word4LC = word4.toLowerCase();
        
        // determines alphabetical order of each pair of words
        int difference23 = word2LC.compareTo(word3LC);
        int difference24 = word2LC.compareTo(word4LC);
        int difference34 = word3LC.compareTo(word4LC);
        
        // if two or more words are identical except for case, will make sure uppercase comes before lowercase
        if (difference23 == 0)
        {
            difference23 = word2.compareTo(word3);
        }
        if (difference24 == 0)
        {
            difference24 = word2.compareTo(word4);
        }
        if (difference34 == 0)
        {
            difference34 = word3.compareTo(word4);
        }
        
        // determines alphabetical order of last three words
        // numbers indicate alphabetical order of words, where 1 is word1, 2 is word2, 3 is word3, 4 is word4
        first = word1;
        if ((difference23 <= 0) && (difference24 <= 0))
        {
            second = word2;
            if (difference34 <= 0)
            {
                third = word3;
                fourth = word4;
                // 1234
            }
            else
            {
                third = word4;
                fourth = word3;
                // 1243
            }
        }
        else if ((difference23 >= 0) && (difference34 <= 0))
        {
            second = word3;
            if (difference24 <= 0)
            {
                third = word2;
                fourth = word4;
                // 1324
            }
            else
            {
                third = word4;
                fourth = word2;
                // 1342
            }
        }
        else
        {
            second = word4;
            if (difference23 <= 0)
            {
                third = word2;
                fourth = word3;
                // 1423
            }
            else
            {
                third = word3;
                fourth = word2;
                // 1432
            }
        }
                              
        // outputs the four words in alphabetical order
        System.out.println("\nYour four words in alphabetical order are:");
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);    
    }
}
