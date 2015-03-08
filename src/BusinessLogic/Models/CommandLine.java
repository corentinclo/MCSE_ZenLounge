

package BusinessLogic.Models;
/**
 */
public class CommandLine implements ModelIt{

/**
 */
    private int quantProduct;

/**
 * @return 
 */
    public int getQuantProduct() {        
        return quantProduct;
    } 

/**
 * @param _quantProduct 
 */
    public void setQuantProduct(int _quantProduct) {        
        quantProduct = _quantProduct;
    } 
/**
 */
    public BusinessLogic.Models.Product product;
/**
 */
    public BusinessLogic.Models.Order order;

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
