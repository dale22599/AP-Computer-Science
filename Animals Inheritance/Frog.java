
/**
 * Allows frogs to be created
 * Contains methods that allow things to happen to frogs, and allows them to interact with other animals
 * 
 * @Dale Yu
 * @3/4/14
 */
public class Frog extends Animal
{
    public Frog(String n, String c, String b, int a)
    {
        super(n, c, b, a);
        type = "frog";
        lives = 1;
        saying = "RIBBIT!";
    }
}