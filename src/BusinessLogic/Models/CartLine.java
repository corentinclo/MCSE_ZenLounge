

package BusinessLogic.Models;
/**
 */
public class CartLine {

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
 }
