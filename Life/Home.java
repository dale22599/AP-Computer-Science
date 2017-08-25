
/**
 * Allows homes to be created
 * Contains methods to allow things to happen to homes
 * 
 * @Dale Yu
 * @11/15/13
 */
public class Home
{
    private String address, color;
    private boolean lock, rob;
    private Person owner;

    public Home()
    {
        address = "";
        color = "";
        lock = false;
        rob = false;
        owner = null;
    }

    public Home(String a, String c, boolean l, boolean r, Person o)
    {
        address = a;
        color = c;
        lock = l;
        rob = r;
        owner = o;
        // sets owner's home to this
        o.setHome(this);
    }

    public void paint(String newColor)
    {
        if (newColor == color)
        {
            System.out.println(owner.getName() + " puts another layer of " + color + " paint on their house.");
        }
        else
        {
            System.out.println(owner.getName() + " repaints their house at " + address + " " + newColor + ".");
            color = newColor;
        }
    }

    public void rob(Person person)
    {
        if (person.getJob() == null)
        {
            if (person.getHome() == this)
            {
                System.out.println(person.getName() + " nearly robs themself but then realizes how silly they are.");
            }
            else
            {
                if (lock)
                {
                    System.out.println(person.getName() + " attempts to rob " + owner.getName() + "'s house but it is locked.");
                }
                else
                {
                    if (owner.getAtWork())
                    {
                        if (rob)
                        {
                            System.out.println(person.getName() + " sneaks into " + owner.getName() + "'s house intending to rob it, but finds out it has already been robbed.");
                        }
                        else
                        {
                            rob = true;
                            System.out.println(person.getName() + " robs " + owner.getName() + "'s house at " + address + " and escapes.");
                        }
                    }
                    else
                    {
                        System.out.println(person.getName() + " attempts to rob " + owner.getName() + "'s house but " + owner.getName() + " chases them away");
                    }
                }
            }
        }
        else
        {
            System.out.println(person.getName() + " won't rob " + owner.getName() + "'s house because they are employed.");
        }
    }

    public void setLock(boolean l)
    {
        this.lock = l;
    }

    public boolean getLock()
    {
        return this.lock;
    }

    public String getAddress()
    {
        return this.address;
    }

    public void setRob(boolean r)
    {
        this.rob = r;
    }

    public boolean getRob()
    {
        return this.rob;
    }

    public Person getOwner()
    {
        return this.owner;
    }

    public String toString()
    {
        String lockOrNo, robOrNo;

        if (lock)
        {
            lockOrNo = "";
        }
        else
        {
            lockOrNo = " not";
        }

        if (rob)
        {
            robOrNo = "";
        }
        else
        {
            robOrNo = " not";
        }

        return owner.getName() + "'s " + color + " house at " + address + " is" + lockOrNo + " locked and has" + robOrNo + " been robbed.";
    }
}
