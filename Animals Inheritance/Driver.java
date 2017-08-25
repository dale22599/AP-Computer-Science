
/**
 * Driver class of Animals
 * Creates dogs, cats, and frogs, and allows them to interact through methods from the Dog, Cat, and Frog classes
 * 
 * @Dale Yu
 * @3/4/14
 */
public class Driver
{
    public static void main (String[] args)
    {
        Dog d1 = new Dog("Q", "yellow black gold", "chihuahua", 18);
        Dog d2 = new Dog("Mo", "pink purple", "poodle", 17);
        Cat c1 = new Cat("Ed", "orange", "tiger", 11);
        Cat c2 = new Cat("Jake", "green", "cougar", 1);
        Frog f1 = new Frog("Michael", "red orange yellow green blue indigo violet", "horny toad", 879);
        Frog f2 = new Frog("Dan", "ecru", "poisonous dart", 9001);        
        
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(f1);
        System.out.println(f2);
        
        d1.speak();
        d2.speak();
        c1.speak();
        c2.speak();
        c2.hitByCar();
        f1.speak();
        f2.speak();
        
        d2.hitByCar();
        c1.hitByCar();
        f2.hitByCar();
        c1.hitByCar();
        c1.hitByCar();
        
        System.out.println(c1);
        
        c1.hitByCar();
        c1.hitByCar();
        c1.hitByCar();
        c1.hitByCar();
        c1.hitByCar();
        c1.hitByCar();
        c1.hitByCar();
        
        d1.speak();
        d2.speak();
        c1.speak();
        c2.speak();
        f1.speak();
        f2.speak();
        
        d1.jump();
        c1.jump();
        f1.jump();
        
        d1.jump(d2);
        d2.jump(d1);
        c2.jump(f1);
        f1.jump(f1);
        
        f1.jump(f1, f2);
        f1.jump(d1, c2);
        f2.jump(d2, c1);
        d1.jump(f1, f2);
        
        d1.chase(d2);
        c1.chase(c2);
        d1.chase(c2);
        d1.chase(d1);
        c2.chase(d1);
        c2.chase(d2);
        c2.chase(c2);
        c2.chase(f1);
        f1.chase(c2);
                        
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(f1);
        System.out.println(f2);
        
        
    }
}
