

package BusinessLogic.Models;
/**
 */
public class CartLine implements ModelIt{

/**
 */
    private int quantProd;

/**
 * @return 
 */
    public int getQuantProd() {        
        return quantProd;
    } 

/**
 * @param _quantProd 
 */
    public void setQuantProd(int _quantProd) {        
        quantProd = _quantProd;
    } 
/**
 */
    public BusinessLogic.Models.Product product;
/**
 */
    public BusinessLogic.Models.ShoppingCart shoppingCart;

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
