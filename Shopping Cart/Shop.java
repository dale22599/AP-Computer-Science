
/**
 * Driver for Shopping Cart
 * 
 * @Dale Yu
 * @1/11/14
 */
public class Shop
{
    public static void main (String[] args)
    {
        ShoppingCart sc = new ShoppingCart();        
        
        sc.addToCart("Apple", 1.50, 3);        
        sc.addToCart("Banana", 2.50, 4);        
        sc.addToCart("Cow", 100.00, 5);        
        sc.addToCart("Dog", 0.01, 6);        
        sc.addToCart("Elephant", 99.99, 100);        
        sc.addToCart("Flower", 100.01, 50);        
        sc.addToCart("Gorilla", 1.69, 1);        
        sc.removeFromCart("Cow");        
        sc.updateQuantity("Gorilla", 5);        
        sc.updateQuantity("Banana", 0);        
        sc.addToCart("Box", 123.45, 1);
        sc.addToCart("Flower", 100.01, 10);
        sc.removeFromCart("Krabby Patty");
        sc.updateQuantity("Monkey", 123456789);
        sc.addToCart("Juice", 3.21, 0);
        sc.updateQuantity("Apple", -1);
        
        System.out.println(sc);
    }
}
