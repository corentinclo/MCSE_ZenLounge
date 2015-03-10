
package BusinessLogic.Models;

// TODO: Auto-generated Javadoc
/**
 * The Class ShoppingCart.
 */
public class ShoppingCart implements ModelIt{

/** The num cart. */
    private int numCart;

/** The cart line. */
    public java.util.Collection cartLine = new java.util.TreeSet();

/** The user. */
    public BusinessLogic.Models.User user;

    //constructeur
    /**
     * Instantiates a new shopping cart.
     */
    public ShoppingCart()
    {
    	this(-1);
    }
    
    /**
     * Instantiates a new shopping cart.
     *
     * @param aNum the a num
     */
    public ShoppingCart(int aNum)
    {
    	numCart=aNum;
    }

/**
 * Gets the num cart.
 *
 * @return the num cart
 */
    public int getNumCart() {        
        return numCart;
    }

/* (non-Javadoc)
 * @see BusinessLogic.Models.ModelIt#store()
 */
@Override
public boolean store() {
	// TODO Auto-generated method stub
	return false;
}

/* (non-Javadoc)
 * @see BusinessLogic.Models.ModelIt#remove()
 */
@Override
public boolean remove() {
	// TODO Auto-generated method stub
	return false;
}

 }
