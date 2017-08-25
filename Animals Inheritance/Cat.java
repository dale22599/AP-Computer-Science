
/**
 * Allows cats to be created
 * Contains methods that allow things to happen to cats, and allows them to interact with other animals
 * 
 * @Dale Yu
 * @3/4/14
 */
public class Cat extends Animal
{
    public Cat(String n, String c, String b, int a)
    {
        super(n, c, b, a);
        type = "cat";
        lives = 9;
        saying = "MEOW!";
    }
}
