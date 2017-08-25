
/**
 * Allows cats to be created
 * Contains methods that allow things to happen to cats, and allows them to interact with other animals
 * Demonstrates use of object oriented programming
 * 
 * @Dale Yu
 * @10/30/13
 */
public class Cat
{
    private String aAn, lifeLives, catName, catColors;
    private int catLives, catAge;

    public Cat()
    {
        catName = "";
        catAge = 0;
        catColors = "";
        catLives = 0;
    }

    public Cat(String name, int age, String colors, int lives)
    {
        catName = name;
        catColors = colors;
        catLives = lives;
        catAge = age;        
    }

    public void setCatName(String catName)
    {
        this.catName = catName;
    }

    public void setCatLives(int catLives)
    {
        this.catLives = catLives;
    }

    public String getCatName()
    {
        return this.catName;
    }

    public int getCatLives()
    {
        return this.catLives;
    }

    public void speak()
    {
        if (catLives > 0)
        {
            System.out.println(catName + ": MEOW!");
        }
        else
        {
            System.out.println(catName + " is dead and is therefore unable to communicate.");
        }
    }

    public void hitByCar()
    {
        if (catLives > 0)
        {
            catLives--;
            System.out.println(catName + " has been hit by a car and lost a life.");
        }
        else
        {
            System.out.println(catName + " is already dead, and can no longer be hit by cars.");
        }
    }        

    public void chase(Dog dog)
    {
        if (catLives > 0)
        {
            if (dog.getDogLives())
            {
                System.out.println(catName + " the cat isn't silly enough to chase " + dog.getDogName() + " the dog.");
            }
            else
            {
                System.out.println(dog.getDogName() + " is dead and is therefore unable to be chased.");
            }
        }
        else
        {
            System.out.println(catName + " is dead and is therefore unable to chase.");
        }
    }

    public void chase(Cat cat)
    {
        if (catLives > 0)
        {
            if (cat.catLives > 0)
            {
                if (cat == this)
                {
                    System.out.println(catName + " the cat isn't silly enough to chase itself.");
                }
                else
                {
                    System.out.println(catName + " the cat chases " + cat.catName + " the cat.");
                }
            }
            else
            {
                System.out.println(cat.catName + " is dead and is therefore unable to be chased.");
            }
        }
        else
        {
            System.out.println(catName + " is dead and is therefore unable to chase.");
        }
    }

    public void chase(Frog frog)
    {
        if (catLives > 0)
        {
            if (frog.getFrogLives())
            {
                System.out.println(catName + " the cat chases " + frog.getFrogName() + " the frog.");
            }
            else
            {
                System.out.println(frog.getFrogName() + " is dead and is therefore unable to be chased.");
            }
        }
        else
        {
            System.out.println(catName + " is dead and is therefore unable to chase.");
        }
    }
    
    public void jump()
    {
        if (catLives > 0)
        {
            System.out.println(catName + " the cat jumps.");
        }
        else
        {
            System.out.println(catName + " is dead and is therefore unable to jump.");
        }
    }

    public void jump(Dog dog)
    {
        if (catLives > 0)
        {
            if (dog.getDogLives())
            {
                System.out.println(catName + " the cat jumps over " + dog.getDogName() + " the dog.");
            }
            else
            {
                System.out.println(catName + " the cat jumps over " + dog.getDogName() + " the dog's dead body");
            }
        }
        else
        {
            System.out.println(catName + " is dead and is therefore unable to jump.");
        }
    }

    public void jump(Cat cat)
    {
        if (catLives > 0)
        {
            if (cat == this)
            {
                System.out.println(catName + " the cat can't jump over itself.");
            }
            else
            {
                if (cat.catLives > 0)
                {
                    System.out.println(catName + " the cat jumps over " + cat.catName + " the cat.");
                }
                else
                {
                    System.out.println(catName + " the cat jumps over " + cat.catName + " the cat's dead body.");
                }
            }
        }
        else
        {
            System.out.println(catName + " is dead and is therefore unable to jump.");
        }
    }

    public void jump(Frog frog)
    {
        if (catLives > 0)
        {
            if (frog.getFrogLives())
            {
                System.out.println(catName + " the cat jumps over " + frog.getFrogName() + " the frog.");
            }
            else
            {
                System.out.println(catName + " the cat jumps over " + frog.getFrogName() + " the frog's dead body");
            }
        }
        else
        {
            System.out.println(catName + " is dead and is therefore unable to jump.");
        }
    }

    public String toString()
    {
        String catStats;
        if (catLives > 0)
        {
            if (("" + catAge).charAt(0) == '8')
            {
                aAn = "an";
            }
            else
            {
                aAn = "a";
            }
            if (catLives == 1)
            {
                lifeLives = "life";
            }
            else
            {
                lifeLives = "lives";
            }
            catStats = catName + " is " + aAn + " " + catAge + " year old " + catColors + " cat who has " + catLives + " " + lifeLives + ".";
        }
        else
        {
            if (catColors.charAt(0) == 'a' || catColors.charAt(0) == 'e' || catColors.charAt(0) == 'i' || catColors.charAt(0) == 'o' || catColors.charAt(0) == 'u')
            {
                aAn = "an";
            }
            else
            {
                aAn = "a";
            }
            catStats = catName + " was " + aAn + " " + catColors + " cat who died at the age of " + catAge + ".";
        }

        return catStats;
    }
}
