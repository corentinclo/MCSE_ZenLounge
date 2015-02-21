

package BusinessLogic.Models;
/**
 */
public class CommandLine {

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
 }
