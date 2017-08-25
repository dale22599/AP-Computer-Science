
/**
 * Driver class for Life
 * 
 * @Dale Yu
 * @11/15/13
 */
public class Driver
{
    public static void main (String[] args)
    {
        Person person1 = new Person("Joe", 14, true, null, null, false);
        Person person2 = new Person("Qumo", 200, false, null, null, true);
        Person person3 = new Person("Barack", 52, true, null, null, false);
        Home home1 = new Home("123 Rainbow Road", "rainbow colored", true, false, person1);
        Home home2 = new Home("1 Mountain Road", "black", false, false, person2);
        Home home3 = new Home("1600 Pennsylvania Avenue", "white", true, false, person3);
        Job job1 = new Job("hotdog eater", 1000000, person2);
        Job job2 = new Job("President", 400000, person3);
        Job job3 = new Job("programmer", 5000000, null);
                        
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(home1);
        System.out.println(home2);
        System.out.println(home3);
        System.out.println(job1);
        System.out.println(job2);
        System.out.println(job3);
        
        System.out.println();
        
        person2.toHome();
        person2.enterHome(home1);
        person1.unlockHome();        
        person2.enterHome(home1);
        person1.toWork();
        job3.hire(person2);
        job3.hire(person1);
        person1.toWork();
        person2.enterHome(home1);
        job2.fire();
        person3.enterHome(home1);
        person2.enterHome(home1);
        person1.enterHome(home1);
        person1.toHome();
        person1.enterHome(home1);
        person1.lockHome();
        home1.paint("blood red");
        person1.toWork();
        job3.fire();
        home2.rob(person1);
        job2.hire(person2);
        job2.hire(person1);
        job2.hire(person3);
        person1.unlockHome();
        person1.toWork();
        job2.changeSalary(5);
        home1.rob(person3);
        home3.rob(person3);
        job1.changeSalary(9999999.99);
        
        System.out.println();
        
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(home1);
        System.out.println(home2);
        System.out.println(home3);
        System.out.println(job1);
        System.out.println(job2);
        System.out.println(job3);
    }
}
