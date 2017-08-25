
/**
 * Driver class of Animals
 * Creates dogs, cats, and frogs, and allows them to interact through methods from the Dog, Cat, and Frog classes
 * Demonstrates use of object oriented programming
 * 
 * @Dale Yu
 * @10/30/13
 */
public class Animals
{
    public static void main (String[] args)
    {
        Dog dog1 = new Dog("Annie", 2, "green", "pug", true);
        Dog dog2 = new Dog("Billy", 4, "orange", "golden retriever", true);
        Dog dog3 = new Dog("Joey", 1, "black and blue", "german shepherd", true);
        Cat cat1 = new Cat("Kitty", 8, "black", 9);
        Cat cat2 = new Cat("MoMo", 3, "purple", 9);
        Cat cat3 = new Cat("Q", 5, "turquoise", 9);
        Frog frog1 = new Frog("Mario", 2, "green", true);
        Frog frog2 = new Frog("Charlie", 843835, "pink", true);
        Frog frog3 = new Frog("Chewy", 5, "rainbow colored", true);

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(cat3);
        System.out.println(frog1);
        System.out.println(frog2);
        System.out.println(frog3);
        dog1.speak();
        cat3.speak();
        frog2.speak();
        dog1.chase(cat2);
        cat3.chase(cat2);
        dog2.hitByCar();
        dog2.chase(cat3);
        frog1.chase(frog2);
        frog1.chase(dog1);
        frog1.jump();
        frog2.jump(frog2, frog3);
        frog2.jump(dog2, frog3);
        cat2.jump(dog1);
        dog2.jump(frog1);
        frog3.hitByCar();
        cat3.hitByCar();
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(cat3);
        System.out.println(frog1);
        System.out.println(frog2);
        System.out.println(frog3);        
    }
}
