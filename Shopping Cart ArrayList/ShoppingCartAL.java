/**
 * @Dale Yu
 * @1/29/14
 */

// **********************************************************************
//   ShoppingCart.java
//
//   Represents a shopping cart as an array of items
// **********************************************************************

import java.text.NumberFormat;
import java.util.ArrayList;

public class ShoppingCartAL
{
    private int itemCount;      // total number of items in the cart
    private double totalPrice;  // total price of items in the cart
    private ArrayList<Item> cart;     // ArrayList that holds the items in the cart

    // -----------------------------------------------------------
    //  Creates an empty shopping cart with a capacity of 5 items.
    // -----------------------------------------------------------
    public ShoppingCartAL()
    {
        itemCount = 0;
        totalPrice = 0.0;
        cart = new ArrayList<Item>(5);
    }

    // -------------------------------------------------------
    //  Adds an item to the shopping cart.
    //  If an item already exists in the cart, the item's information will be updated
    // -------------------------------------------------------
    public void addToCart(Item item)
    {
        int index = cart.indexOf(item);
        if (index != -1)
        {
            updateQuantity(cart.get(index), item.getQuantity());
        }
        else
        {
            cart.add(item);
            itemCount++;
            totalPrice += (item.getQuantity() * item.getPrice());
            System.out.println(item.getQuantity() + " X " + item.getName() + " has been added to the cart.");
        }
    }   

    // completely removes an item from the cart and updates cart state accordingly
    public void removeFromCart(Item item)
    {
        if (cart.contains(item))
        {
            itemCount--;
            totalPrice -= (item.getQuantity() * item.getPrice());
            cart.remove(item);
            System.out.println(item.getQuantity() + " X " + item.getName() + " has been removed from the cart.");
        }
        else
        {
            System.out.println(item.getName() + " not found");
        }
    }

    // increases the quantity of an item that already exists in the ArrayList by quant
    // if quant is negative, the quantity of an item will decrease
    // updates cart state acoordingly
    public void updateQuantity(Item item, int quant)
    {
        int index = cart.indexOf(item);
        if (index != -1)
        {
            if (cart.get(index).getQuantity() + quant < 0)
            {
                System.out.println("The quantity can not be negative");
            }
            else if(cart.get(index).getQuantity() + quant == 0)
            {
                removeFromCart(item);
            }
            else
            {
                cart.get(index).setQuantity(cart.get(index).getQuantity() + quant);
                totalPrice += (quant * cart.get(index).getPrice());
                if (quant >= 0)
                {
                    System.out.println(quant + " X " + cart.get(index).getName() + " has been added to the cart, for a total of " + item.getQuantity());
                }
                else
                {
                    System.out.println(-quant + " X " + cart.get(index).getName() + " has been removed from the cart, for a total of " + item.getQuantity());
                }
            }
        }
        else
        {
            System.out.println(item.getName() + " not found");
        }
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

        for (int i = 0; i < cart.size(); i++)
            contents += String.format("%-15s $%-14.2f %-15d $%-15.2f", cart.get(i).getName(), cart.get(i).getPrice(), cart.get(i).getQuantity(), cart.get(i).getPrice() * cart.get(i).getQuantity()) + "\n";

        contents += "\nTotal Price: " + fmt.format(totalPrice);

        return contents;
    }

}