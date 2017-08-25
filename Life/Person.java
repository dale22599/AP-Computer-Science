
/**
 * Allows people to be created
 * Contains methods that allow people to do things, and allows them to interact with other people
 * 
 * @Dale Yu
 * @11/15/13
 */
public class Person
{    
    private String name;
    private int age;
    private boolean male, atWork;
    private Home home;
    private Job job;

    public Person()
    {
        name = "";
        age = 0;
        male = false;
        job = null;
        home = null;
        atWork = false;        
    }

    public Person(String n, int a, boolean m, Job j, Home h, boolean atW)
    {
        name = n;
        age = a;
        male = m;
        job = j;
        home = h;
        atWork = atW;
    }

    public void toWork()
    {
        if (job == null)
        {
            System.out.println(name + " can't go to work because they do not have a job.");
        }
        else
        {
            if (!atWork)
            {
                System.out.println(name + " goes to work.");
                atWork = true;
            }
            else
            {
                System.out.println(name + " is already at work.");
            }
        }
    }

    public void toHome()
    {        
        if (atWork)
        {
            System.out.println(name + " goes home.");
            atWork = false;
        }
        else
        {
            System.out.println(name + " is already at home");
        }
    }

    public void lockHome()
    {
        if (home.getLock())
        {
            System.out.println(name + "'s house is already locked.");
        }
        else
        {
            home.setLock(true);     
            System.out.println(name + " locks their house.");
        }
    }

    public void unlockHome()
    {
        if (home.getLock())
        {
            home.setLock(false);
            System.out.println(name + " unlocks their house.");
        }
        else
        {    
            System.out.println(name + "'s house is already unlocked.");
        }        
    }

    public void enterHome(Home h)
    {
        if (atWork)
        {
            System.out.println(name + " can not enter " + h.getOwner().getName() + "'s house because " + name + " is at work");
        }
        else
        {
            if (h.getLock())
            {
                if (h == home)
                {
                    System.out.println(name + " realizes their house is locked and looks for their key.");
                }
                else
                {
                    System.out.println(name + " can not get into the house at " + h.getAddress() + " because it is locked.");
                }
            }
            else
            {
                if (h == home)
                {
                    if (h.getRob())
                    {
                        System.out.println(name + " screams in anguish upon finding out their home has been robbed.");
                    }
                    else
                    {
                        System.out.println(name + " peacefully walks into their house.");
                    }
                }
                else
                {
                    if (h.getOwner().getAtWork())
                    {
                        if (job == null)
                        {
                            if (h.getRob())
                            {
                                System.out.println(name + " sneaks into " + h.getOwner().getName() + "'s house intending to rob it, but finds out it has already been robbed.");
                            }
                            else
                            {
                                h.setRob(true);
                                System.out.println(name + " robs " + h.getOwner().getName() + "'s house at " + h.getAddress() + " and escapes.");
                            }
                        }
                        else
                        {
                            if (h.getRob())
                            {
                                System.out.println(name + " enters "  + h.getOwner().getName() + "'s house at " + h.getAddress() + " and notices that it has been robbed.");
                            }
                            else
                            {
                                System.out.println(name + " enters "  + h.getOwner().getName() + "'s house at " + h.getAddress() + " and admires its beauty.");
                            }
                        }
                    }
                    else
                    {
                        System.out.println(name + " does not enter " + h.getOwner().getName() + "'s house because they are home.");
                    }
                }
            }
        }        
    }

    public String getName()
    {
        return this.name;
    }       

    public void setJob(Job j)
    {
        this.job = j;
    }

    public Job getJob()
    {
        return this.job;
    }

    public boolean getAtWork()
    {
        return this.atWork;
    }
    
    public void setAtWork(boolean atW)
    {
        atWork = atW;
    }
    
    public Home getHome()
    {
        return this.home;
    }

    public void setHome(Home h)
    {
        this.home = h;
    }

    public String toString()
    {
        String gender, homeWork;

        if (male)
        {
            if (age < 18)
            {
                gender = "boy";
            }
            else
            {
                gender = "man";
            }
        }
        else
        {
            if (age < 18)
            {
                gender = "girl";
            }
            else
            {
                gender = "woman";
            }            
        }

        if (atWork)
        {
            homeWork = "work";
        }
        else
        {
            homeWork = "home";
        }

        if (job == null)
        {
            return name + " is a " + age + " year old " + gender + " who lives at " + home.getAddress() + " and does not have a job. They are currently at home.";
        }
        else
        {
            return name + " is a " + age + " year old " + gender + " who lives at " + home.getAddress() + " and works as a " + job.getJobName() + ". They are currently at " + homeWork + ".";
        }        
    }
}
