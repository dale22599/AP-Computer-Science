// ****************************************************************
// MagicSquareTest.java
//
// Uses the Square class to read in square data and tell if 
// each square is magic.
//          
// ****************************************************************

import java.util.Scanner;
import java.io.*;

public class MagicSquareTest
{
    public static void main(String[] args) throws IOException
    {
        Scanner scan = new Scanner(new File("MagicData.txt"));

        int count = 1;                 //count which square we're on
        int size = scan.nextInt();     //size of next square

        //Expecting -1 at bottom of input file
        while (size != -1)
        {
            //create a new Square of the given size
            Square sq = new Square(size);
            //call its read method to read the values of the square
            sq.readSquare(scan);
            System.out.println("\n******** Square " + count + " ********");
            //print the square
            sq.printSquare();
            System.out.println();
            //print the sums of its rows
            for (int i = 0; i < size; i++)
            {
                System.out.println("Row " + (i + 1) + ": " + sq.sumRow(i));
            }
            System.out.println();
            //print the sums of its columns
            for (int i = 0; i < size; i++)
            {
                System.out.println("Column " + (i + 1) + ": " + sq.sumCol(i));
            }
            System.out.println();
            //print the sum of the main diagonal
            System.out.println("Main diagonal: " + sq.sumMainDiag());
            //print the sum of the other diagonal
            System.out.println("Other diagonal: " + sq.sumOtherDiag());
            System.out.println();
            //determine and print whether it is a magic square
            if (sq.magic())
            {
                System.out.println("This square is MAGICAL!");
            }
            else
            {
                System.out.println("This square is NOT magical!");
            }
            //get size of next square
            size = scan.nextInt();
            //update the number of the square to be printed
            count++;
        }
    }
}