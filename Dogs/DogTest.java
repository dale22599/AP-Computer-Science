// ****************************************************************
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.
//          
// ****************************************************************

public class DogTest
{
    public static void main(String[] args)
    {
        Labrador lab = new Labrador("Lolly", "pink");
        Yorkshire york = new Yorkshire("Yonk");

        System.out.println(lab.getName() + " says " + lab.speak());
        System.out.println(york.getName() + " says " + york.speak());
        System.out.println("Average weight of labrador: " + lab.avgBreedWeight());    
        System.out.println("Average weight of yorkshire: " + york.avgBreedWeight());
    }
}