
/**
 * Allows dogs to be created
 * Contains methods that allow things to happen to dogs, and allows them to interact with other animals
 * Demonstrates use of object oriented programming
 * 
 * @Dale Yu
 * @10/30/13
 */
public class Dog
{
    private String aAn, dogName, dogColors, dogBreed, catName;
    private int dogAge, catLives;
    private boolean living;

    public Dog()
    {
        dogName = "";
        dogAge = 0;
        dogColors = "";
        dogBreed = "";
        living = false;
    }

    public Dog(String name, int age, String colors, String breed, boolean alive)
    {
        dogName = name;
        dogAge = age;
        dogColors = colors;
        dogBreed = breed;
        living = alive;                
    }

    public void setDogName(String dogName)
    {
        this.dogName = dogName;
    }

    public void setDogLiving(boolean living)
    {
        this.living = living;
    }

    public String getDogName()
    {
        return this.dogName;
    }

    public boolean getDogLives()
    {
        return this.living;
    }

    public void speak()
    {
        if (living)
        {
            System.out.println(dogName + ": WOOF!");
        }
        else
        {
            System.out.println(dogName + " is dead and is therefore unable to communicate.");
        }
    }

    public void hitByCar()
    {
        if (living)
        {
            living = false;
            System.out.println(dogName + " has been hit by a car and died.");
        }
        else
        {
            System.out.println(dogName + " is already dead, and can no longer be hit by cars.");
        }
    }

    public void chase(Dog dog)
    {
        if (living)
        {
            if (dog.living)
            {
                if (dog == this)
                {
                    System.out.println(dogName + " the dog chases its own tail");
                }
                else
                {
                    System.out.println(dogName + " the dog chases " + dog.dogName + " the dog.");
                }
            }
            else
            {
                System.out.println(dog.dogName + " is dead and is therefore unable to be chased.");
            }
        }
        else
        {
            System.out.println(dogName + " is dead and is therefore unable to chase.");
        }
    }

    public void chase(Cat cat)
    {
        if (living)
        {
            if (cat.getCatLives() > 0)
            {
                System.out.println(dogName + " the dog chases " + cat.getCatName() + " the cat.");
            }
            else
            {
                System.out.println(cat.getCatName() + " is dead and is therefore unable to be chased.");
            }
        }
        else
        {
            System.out.println(dogName + " is dead and is therefore unable to chase.");
        }
    }

    public void chase(Frog frog)
    {
        if (living)
        {
            if (frog.getFrogLives())
            {
                System.out.println(dogName + " the dog chases " + frog.getFrogName() + " the frog.");
            }
            else
            {
                System.out.println(frog.getFrogName() + " is dead and is therefore unable to be chased.");
            }
        }
        else
        {
            System.out.println(dogName + " is dead and is therefore unable to chase.");
        }
    }

    public void jump()
    {
        if (living)
        {
            System.out.println(dogName + " the dog jumps.");
        }
        else
        {
            System.out.println(dogName + " is dead and is therefore unable to jump.");
        }
    }

    public void jump(Dog dog)
    {
        if (living)
        {
            if (dog == this)
            {
                System.out.println(dogName + " the dog can't jump over itself.");
            }
            else
            {
                if (dog.living)
                {
                    System.out.println(dogName + " the dog jumps over " + dog.dogName + " the dog.");
                }
                else
                {
                    System.out.println(dogName + " the dog jumps over " + dog.dogName + " the dog's dead body.");
                }
            }
        }
        else
        {
            System.out.println(dogName + " is dead and is therefore unable to jump.");
        }
    }

    public void jump(Cat cat)
    {
        if (living)
        {
            if (cat.getCatLives() > 0)
            {
                System.out.println(dogName + " the dog jumps over " + cat.getCatName() + " the cat.");
            }
            else
            {
                System.out.println(dogName + " the dog jumps over " + cat.getCatName() + " the cat's dead body.");
            }
        }
        else
        {
            System.out.println(dogName + " is dead and is therefore unable to jump.");
        }
    }

    public void jump(Frog frog)
    {
        if (living)
        {
            if (frog.getFrogLives())
            {
                System.out.println(dogName + " the dog jumps over " + frog.getFrogName() + " the frog.");
            }
            else
            {
                System.out.println(dogName + " the dog jumps over " + frog.getFrogName() + " the frog's dead body.");
            }
        }
        else
        {
            System.out.println(dogName + " is dead and is therefore unable to jump.");
        }
    }

    public String toString()
    {
        String dogStats;
        if (living)
        {
            if (("" + dogAge).charAt(0) == '8')
            {
                aAn = "an";
            }
            else
            {
                aAn = "a";
            }
            dogStats = dogName + " is " + aAn + " " + dogAge + " year old " + dogColors + " " + dogBreed + " who is alive.";
        }
        else
        {
            if (dogColors.charAt(0) == 'a' || dogColors.charAt(0) == 'e' || dogColors.charAt(0) == 'i' || dogColors.charAt(0) == 'o' || dogColors.charAt(0) == 'u')
            {
                aAn = "an";
            }
            else
            {
                aAn = "a";
            }
            dogStats = dogName + " was " + aAn + " " + dogColors + " " + dogBreed + " who died at the age of " + dogAge + ".";
        }     

        return dogStats;
    }
}