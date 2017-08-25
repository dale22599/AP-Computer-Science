
/**
 * Allows frogs to be created
 * Contains methods that allow things to happen to frogs, and allows them to interact with other animals
 * Demonstrates use of object oriented programming
 * 
 * @Dale Yu
 * @10/30/13
 */
public class Frog
{
    private String aAn, frogName, frogColors;
    private int frogAge;
    private boolean living;

    public Frog()
    {
        frogName = "";
        frogAge = 0;
        frogColors = "";
        living = false;
    }

    public Frog(String name, int age, String colors, boolean alive)
    {
        frogName = name;
        living = alive;
        frogAge = age;
        frogColors = colors;       
    }

    public void setFrogName(String frogName)
    {
        this.frogName = frogName;
    }

    public void setFrogLiving(boolean living)
    {
        this.living = living;
    }

    public String getFrogName()
    {
        return this.frogName;
    }

    public boolean getFrogLives()
    {
        return this.living;
    }

    public void speak()
    {
        if (living)
        {
            System.out.println(frogName + ": RIBBIT!");
        }
        else
        {
            System.out.println(frogName + " is dead and is therefore unable to communicate.");
        }
    }

    public void hitByCar()
    {
        if (living)
        {
            living = false;
            System.out.println(frogName + " has been hit by a car and died.");
        }
        else
        {
            System.out.println(frogName + " is already dead, and can no longer be hit by cars.");
        }
    }

    public void chase(Dog dog)
    {
        if (living)
        {
            if(dog.getDogLives())
            {
                System.out.println(frogName + " the frog isn't silly enough to chase " + dog.getDogName() + " the dog.");
            }
            else
            {
                System.out.println(dog.getDogName() + " is dead and is therefore unable to be chased.");
            }
        }
        else
        {
            System.out.println(frogName + " is dead and is therefore unable to chase.");
        }
    }

    public void chase(Cat cat)
    {
        if (living)
        {
            if(cat.getCatLives() > 0)
            {
                System.out.println(frogName + " the frog isn't silly enough to chase " + cat.getCatName() + " the cat.");
            }
            else
            {
                System.out.println(cat.getCatName() + " is dead and is therefore unable to be chased.");
            }
        }
        else
        {
            System.out.println(frogName + " is dead and is therefore unable to chase.");
        }
    }

    public void chase (Frog frog)
    {
        if (living)
        {
            if (frog.living)
            {
                if (frog == this)
                {
                    System.out.println(frogName + " the frog isn't silly enough to chase itself.");
                }
                else
                {
                    System.out.println(frogName + " the frog chases " + frog.frogName + " the frog.");
                }
            }
            else
            {
                System.out.println(frog.frogName + " is dead and is therefore unable to be chased.");
            }
        }
        else
        {
            System.out.println(frogName + " is dead and is therefore unable to chase.");
        }
    }

    public void jump()
    {
        if (living)
        {
            System.out.println(frogName + " the frog jumps.");
        }
        else
        {
            System.out.println(frogName + " is dead and is therefore unable to jump.");
        }
    }

    public void jump(Dog dog)
    {
        if (living)
        {
            if (dog.getDogLives())
            {
                System.out.println(frogName + " the frog jumps over " + dog.getDogName() + " the dog.");
            }
            else
            {
                System.out.println(frogName + " the frog jumps over " + dog.getDogName() + " the dog's dead body.");
            }
        }
        else
        {
            System.out.println(frogName + " is dead and is therefore unable to jump.");
        }
    }

    public void jump(Cat cat)
    {
        if (living)
        {
            if (cat.getCatLives() > 0)
            {
                System.out.println(frogName + " the frog jumps over " + cat.getCatName() + " the cat.");
            }
            else
            {
                System.out.println(frogName + " the frog jumps over " + cat.getCatName() + " the cat's dead body.");
            }
        }
        else
        {
            System.out.println(frogName + " is dead and is therefore unable to jump.");
        }
    }

    public void jump(Frog frog)
    {
        if (living)
        {
            if (frog == this)
            {
                System.out.println(frogName + " the frog can't jump over itself.");
            }
            else
            {
                if (frog.living)
                {
                    System.out.println(frogName + " the frog jumps over " + frog.frogName + " the frog.");
                }
                else
                {
                    System.out.println(frogName + " the frog jumps over " + frog.frogName + " the frog's dead body.");
                }
            }
        }
        else
        {
            System.out.println(frogName + " is dead and is therefore unable to jump.");
        }
    }

    public void jump(Dog dogA, Dog dogB)
    {
        if (living)
        {
            if (dogA == dogB)
            {
                System.out.println(frogName + " the frog jumps over " + dogA.getDogName() + " the dog twice.");
            }
            else
            {
                System.out.println(frogName + " the frog jumps over " + dogA.getDogName() + " the dog and " + dogB.getDogName() + " the dog.");
            }
        }
        else
        {
            System.out.println(frogName + " is dead and is therefore unable to jump.");
        }
    }

    public void jump(Dog dog, Cat cat)
    {
        if (living)
        {
            System.out.println(frogName + " the frog jumps over " + dog.getDogName() + " the dog and " + cat.getCatName() + " the cat.");
        }
        else
        {
            System.out.println(frogName + " is dead and is therefore unable to jump.");
        }
    }

    public void jump(Dog dog, Frog frog)
    {
        if (living)
        {
            if (frog == this)
            {
                System.out.println(frogName + " the frog can't jump over itself.");
            }
            else
            {
                System.out.println(frogName + " the frog jumps over " + dog.getDogName() + " the dog and " + frog.frogName + " the frog.");
            }
        }
        else
        {
            System.out.println(frogName + " is dead and is therefore unable to jump.");
        }
    }

    public void jump(Cat cat, Dog dog)
    {
        if (living)
        {
            System.out.println(frogName + " the frog jumps over " + cat.getCatName() + " the cat and " + dog.getDogName() + " the dog.");
        }
        else
        {
            System.out.println(frogName + " is dead and is therefore unable to jump.");
        }
    }

    public void jump(Cat catA, Cat catB)
    {
        if (living)
        {
            if (catA == catB)
            {
                System.out.println(frogName + " the frog jumps over " + catA.getCatName() + " the cat twice.");
            }
            else
            {
                System.out.println(frogName + " the frog jumps over " + catA.getCatName() + " the cat and " + catB.getCatName() + " the cat.");
            }
        }
        else
        {
            System.out.println(frogName + " is dead and is therefore unable to jump.");
        }
    }

    public void jump(Cat cat, Frog frog)
    {
        if (living)
        {
            if (frog == this)
            {
                System.out.println(frogName + " the frog can't jump over itself.");
            }
            else
            {
                System.out.println(frogName + " the frog jumps over " + cat.getCatName() + " the cat and " + frog.frogName + " the frog.");
            }
        }
        else
        {
            System.out.println(frogName + " is dead and is therefore unable to jump.");
        }
    }

    public void jump(Frog frog, Dog dog)
    {
        if (living)
        {
            if (frog == this)
            {
                System.out.println(frogName + " the frog can't jump over itself.");
            }
            else
            {
                System.out.println(frogName + " the frog jumps over " + frog.frogName + " the frog and " + dog.getDogName() + " the dog.");
            }
        }
        else
        {
            System.out.println(frogName + " is dead and is therefore unable to jump.");
        }
    }

    public void jump(Frog frog, Cat cat)
    {
        if (living)
        {
            if (frog == this)
            {
                System.out.println(frogName + " the frog can't jump over itself.");
            }
            else
            {
                System.out.println(frogName + " the frog jumps over " + frog.frogName + " the frog and " + cat.getCatName() + " the cat.");
            }
        }
        else
        {
            System.out.println(frogName + " is dead and is therefore unable to jump.");
        }
    }

    public void jump(Frog frogA, Frog frogB)
    {
        if (living)
        {
            if ((frogA == this) || (frogB == this))
            {                
                System.out.println(frogName + " the frog can't jump over itself.");
            }
            else
            {
                if (frogA == frogB)
                {
                    System.out.println(frogName + " the frog jumps over " + frogA.frogName + " the frog twice.");
                }
                else
                {
                    System.out.println(frogName + " the frog jumps over " + frogA.frogName + " the frog and " + frogB.frogName + " the frog.");
                }
            }
        }
        else
        {
            System.out.println(frogName + " is dead and is therefore unable to jump.");
        }
    }

    public String toString()
    {
        String frogStats;
        if (living)
        {
            if (("" + frogAge).charAt(0) == '8')
            {
                aAn = "an";
            }
            else
            {
                aAn = "a";
            }
            frogStats = frogName + " is " + aAn + " " + frogAge + " year old " + frogColors + " frog who is alive.";
        }
        else
        {
            if (frogColors.charAt(0) == 'a' || frogColors.charAt(0) == 'e' || frogColors.charAt(0) == 'i' || frogColors.charAt(0) == 'o' || frogColors.charAt(0) == 'u')
            {
                aAn = "an";
            }
            else
            {
                aAn = "a";
            }
            frogStats = frogName + " was " + aAn + " " + frogColors + " frog who died at the age of " + frogAge + ".";
        }

        return frogStats;
    }
}