
import java.util.ArrayList;

/**
 * Parent class of each animal class
 * Contains variables and methods
 * 
 * @Dale Yu
 * @3/4/14
 */
public abstract class Animal
{
    protected String name, color, breed, saying, type;
    protected int age, lives;    

    public Animal(String n, String c, String b, int a)
    {
        name = n;
        color = Animal.toList(c);        
        breed = b;
        age = a;
    }

    protected boolean isAlive()
    {
        if (lives == 0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public void speak()
    {
        if (isAlive())
        {
            System.out.println(name + ": " + saying);
        }
        else
        {            
            System.out.println(name + " is dead and is therefore unable to communicate.");
        }
    }

    public void hitByCar()
    {
        if (isAlive())
        {
            String death;
            lives--;
            if (this instanceof Cat)
            {
                death = "lost a life";
            }
            else
            {
                death = "died";
            }
            System.out.println(name + " has been hit by a car and " + death + ".");
        }
        else
        {
            System.out.println(name + " is already dead, and can no longer be hit by cars.");
        }
    }

    public void chase(Animal a)
    {
        if (this.isAlive())
        {
            if (a.isAlive())
            {
                if (((this instanceof Frog) && !(a instanceof Frog)) || ((this instanceof Cat) && (a instanceof Dog)))
                {
                    System.out.println(name + " the " + type + " isn't silly enough to chase " + a.name + " the " + a.type + ".");
                }
                else
                {
                    if (this == a)
                    {
                        if (this instanceof Dog)
                        {
                            System.out.println(name + " the dog chases its own tail.");
                        }
                        else
                        {
                            System.out.println(name + " the " + type + " isn't silly enough to chase itself.");
                        }
                    }
                    else
                    {
                        System.out.println(name + " the " + type + " chases " + a.name + " the frog.");
                    }
                }
            }
            else
            {
                System.out.println(a.name + " is dead and is therefore unable to be chased.");
            }
        }
        else
        {
            System.out.println(name + " is dead and is therefore unable to chase.");
        }
    }

    // changes a list of words seperated by spaces to a list seperated by commas
    public static String toList(String s)
    {
        String str = "";

        if (s.contains(" "))
        {
            String[] parts = s.split(" ");
            if (parts.length == 2)
            {
                str = parts[0] + " and " + parts[1];
            }
            else
            {
                for (int i = 0; i < parts.length - 1; i++)
                {
                    str += parts[i] + ", ";
                }
                str += "and " + parts[parts.length-1];
            }
        }
        else
        {
            str = s;
        }

        return str;
    }

    public void jump()
    {
        if (this.isAlive())
        {
            System.out.println(name + " the " + type + " jumps.");
        }
        else
        {
            System.out.println(name + " is dead and is therefore unable to jump.");
        }
    }

    public void jump(Animal a)
    {
        if (this.isAlive())
        {
            if (this == a)
            {
                System.out.println(name + " the " + type + " can't jump over itself.");
            }
            else
            {
                System.out.println(name + " the " + type + " jumps over " + a.name + " the " + a.type + ".");            
            }
        }
        else
        {
            System.out.println(name + " is dead and is therefore unable to jump.");
        }
    }
    
    public void jump(Animal a1, Animal a2)
    {
        if (this instanceof Frog)
        {
            if (this.isAlive())
            {
                if (this == a1 || this == a2)
                {
                    System.out.println(name + " the frog can't jump over itself.");
                }
                else
                {
                    System.out.println(name + " the frog jumps over " + a1.name + " the " + a1.type + " and " + a2.name + " the " + a2.type + ".");            
                }
            }
            else
            {
                System.out.println(name + " is dead and is therefore unable to jump.");
            }
        }
        else
        {
            System.out.println(name + " is  a " + type + " and can't jump over two animals.");
        }
    }

    public String toString()
    {
        String str, aAn, catLives = "";

        if (this instanceof Cat)
        {
            catLives = " with " + lives + " lives left";
        }

        if (this.isAlive())
        {
            if (("" + age).charAt(0) == '8' || age == 11 || age == 18)
            {
                aAn = "an";
            }
            else
            {
                aAn = "a";
            }
            str = name + " is " + aAn + " " + age + " year old " + color + " " + breed + " " + type + " who is alive" + catLives + ".";
        }
        else
        {
            if (color.charAt(0) == 'a' || color.charAt(0) == 'e' || color.charAt(0) == 'i' || color.charAt(0) == 'o' || color.charAt(0) == 'u')
            {
                aAn = "an";
            }
            else
            {
                aAn = "a";
            }
            str = name + " was " + aAn + " " + color + " " + breed + " " + type + " who died at the age of " + age + ".";
        }     

        return str;
    }
}
