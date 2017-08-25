/**
 * @Dale Yu
 * @1/11/14
 */

// **********************************************************************
//   ShoppingCart.java
//
//   Represents a shopping cart as an array of items
// **********************************************************************

import java.text.NumberFormat;
import java.util.Arrays;

public class ShoppingCart
{
    private int itemCount;      // total number of items in the cart
    private double totalPrice;  // total price of items in the cart
    private int capacity;       // current cart capacity
    private Item[] cart;

    // -----------------------------------------------------------
    //  Creates an empty shopping cart with a capacity of 5 items.
    // -----------------------------------------------------------
    public ShoppingCart()
    {
        capacity = 5;
        itemCount = 0;
        totalPrice = 0.0;
        cart = new Item[capacity];
    }

    // -------------------------------------------------------
    //  Adds an item to the shopping cart.
    // -------------------------------------------------------
    public void addToCart(String itemName, double price, int quantity)
    {        
        int index = this.search(itemName);
        if (index != -1)    // item already in cart; adds to quantity of item
        {
            this.updateQuantity(itemName, cart[index].getQuantity() + quantity);
        }
        else if (quantity <= 0) // quantity chosen negative or 0
        {
            System.out.println("Please choose a quantity greater than 0\n");
        }
        else
        {
            cart[itemCount] = new Item(itemName, price, quantity);       
            itemCount ++;
            totalPrice += (quantity * price);
            System.out.println("The following has been added to your cart:\n" + quantity + " X " + itemName + "\n");
            if (itemCount == capacity)
            {
                this.increaseSize();
            }
        }
    }

    // -------------------------------------------------------
    //  Removes an item from the cart
    // -------------------------------------------------------
    public void removeFromCart(String itemName)
    {
        int index = this.search(itemName);
        if (index == -1)    // items not in cart
        {
            System.out.println(itemName + " not found\n");
        }
        else
        {
            itemCount--;             
            totalPrice -= (cart[index].getQuantity() * cart[index].getPrice());
            System.out.println("The following has been removed from your cart:\n" + cart[index].getQuantity() + " X " + itemName + "\n");
            for (int i = index; i <= itemCount; i++)
            {
                cart[i] = cart[i + 1];
            }
        }
    }

    // -------------------------------------------------------
    //  Sets the quantity of an item
    // -------------------------------------------------------
    public void updateQuantity(String itemName, int num)
    {
        int index = this.search(itemName);
        if (index == -1)    // item not in cart
        {
            System.out.println(itemName + " not found\n");
        }
        else if (num < 0)   // quantity chosen less than 0
        {
            System.out.println("Please choose a quantity of at least 0\n");
        }
        else if (num == 0)  // quantity chosen of 0
        {
            this.removeFromCart(itemName);                    
        }
        else
        {
            int prevNum = cart[index].getQuantity();
            cart[index].setQuantity(num);
            totalPrice += ((num - prevNum) * (cart[index].getPrice()));
            System.out.println("The following item quantity has been updated:\n" + cart[index].getQuantity() + " X " + itemName + "\n");
        }
    }

    // -------------------------------------------------------
    //  Returns index of an item using the item's name
    // -------------------------------------------------------
    public int search(String itemName)
    {
        int index = -1;
        for (int i = 0; i < itemCount; i++)
        {
            if (itemName.equals(cart[i].getName()))
            {
                index = i;
            }            
        }
        return index;
    }

    // -------------------------------------------------------
    //  Returns the contents of the cart together with
    //  summary information.
    // -------------------------------------------------------
    public String toString()
    {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();

        String contents = "\nShopping Cart\n";
        contents += "\nItem\t\tUnit Price\tQuantity\tTotal\n";

        for (int i = 0; cart[i] != null; i++)
            contents += String.format("%-15s $%-14.2f %-15d $%-15.2f", cart[i].getName(), cart[i].getPrice(), cart[i].getQuantity(), cart[i].getPrice() * cart[i].getQuantity()) + "\n";

        contents += "\nTotal Price: " + fmt.format(totalPrice);

        return contents;
    }

    // ---------------------------------------------------------
    //  Increases the capacity of the shopping cart by 3
    // ---------------------------------------------------------
    private void increaseSize()
    {        
        capacity += 3;
        cart = Arrays.copyOf(cart, capacity + 3);
    }
}