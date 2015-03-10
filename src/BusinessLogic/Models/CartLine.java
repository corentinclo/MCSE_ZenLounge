

package BusinessLogic.Models;
// TODO: Auto-generated Javadoc

/**
 * The Class CartLine.
 */
public class CartLine implements ModelIt{

/** The quant prod. */
    private int quantProd;

/**
 * Gets the quant prod.
 *
 * @return the quant prod
 */
    public int getQuantProd() {        
        return quantProd;
    } 

/**
 * Sets the quant prod.
 *
 * @param _quantProd the new quant prod
 */
    public void setQuantProd(int _quantProd) {        
        quantProd = _quantProd;
    } 

/** The product. */
    public BusinessLogic.Models.Product product;

/** The shopping cart. */
    public BusinessLogic.Models.ShoppingCart shoppingCart;

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
