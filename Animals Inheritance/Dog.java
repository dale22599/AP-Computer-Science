
/**
 * Allows dogs to be created
 * Contains methods that allow things to happen to dogs, and allows them to interact with other animals
 * 
 * @Dale Yu
 * @3/4/14
 */
public class Dog extends Animal
{
    public Dog(String n, String c, String b, int a)
    {
        super(n, c, b, a);
        type = "dog";
        lives = 1;
        saying = "WOOF!";
    }    
}