
package BusinessLogic.Models;

/**
 */
public class ShoppingCart {

/**
 */
    private final int numCart;
/**
 */
    public java.util.Collection cartLine = new java.util.TreeSet();
/**
 */
    public BusinessLogic.Models.User user;

    //constructeur
    public ShoppingCart()
    {
    	this(-1);
    }
    
    public ShoppingCart(int aNum)
    {
    	numCart=aNum;
    }
/**
 * @return 
 */
    public int getNumCart() {        
        return numCart;
    } 
 }
