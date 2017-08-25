
/**
 * Driver for Shopping Cart Array List
 * 
 * @Dale Yu
 * @1/31
 */
public class Driver
{
    public static void main (String[] args)
    {
        ShoppingCartAL cart = new ShoppingCartAL();
        
        Item banana = new Item("banana", 1, 3);
        Item juice = new Item("juice", 3, 5);
        Item apple = new Item("apple", 2, 12);
        Item apple2 = new Item("apple", 2, 50);
        Item grape = new Item("grape", 10, 43);
        Item computer = new Item("computer", 500, 235);
        
        cart.addToCart(banana);
        cart.removeFromCart(juice);
        cart.addToCart(juice);
        cart.updateQuantity(computer, 1234567890);
        cart.updateQuantity(banana, 2);
        cart.removeFromCart(banana);
        cart.addToCart(juice);
        cart.addToCart(apple);
        cart.updateQuantity(juice, -10);
        cart.addToCart(grape);
        cart.addToCart(computer);
        cart.updateQuantity(computer, -500);
        cart.updateQuantity(computer, -230);
        cart.addToCart(grape);
        cart.addToCart(apple2);
        
        System.out.println(cart);
    }
}
