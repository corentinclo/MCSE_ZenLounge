
package BusinessLogic.Models;

/**
 */
public class ShoppingCart implements ModelIt{

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

@Override
public boolean store() {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean remove() {
	// TODO Auto-generated method stub
	return false;
}

 }
