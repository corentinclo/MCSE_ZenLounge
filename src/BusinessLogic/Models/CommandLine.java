

package BusinessLogic.Models;
// TODO: Auto-generated Javadoc

/**
 * The Class CommandLine.
 */
public class CommandLine implements ModelIt{

/** The quant product. */
    private int quantProduct;

/**
 * Gets the quant product.
 *
 * @return the quant product
 */
    public int getQuantProduct() {        
        return quantProduct;
    } 

/**
 * Sets the quant product.
 *
 * @param _quantProduct the new quant product
 */
    public void setQuantProduct(int _quantProduct) {        
        quantProduct = _quantProduct;
    } 

/** The product. */
    public BusinessLogic.Models.Product product;

/** The order. */
    public BusinessLogic.Models.Order order;

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
