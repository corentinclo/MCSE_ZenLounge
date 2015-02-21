
package BusinessLogic.Models;

/**
 */
public class Product extends BusinessLogic.Models.SubCategory {

/**
 */
    private final int numProduct;

/**
 */
    private String libelProduct;

/**
 */
    private int stockProductt;

/**
 */
    private int reductionProduct;
/**
 */
    public java.util.Collection commandLine = new java.util.TreeSet();
/**
 */
    public java.util.Collection cartLine = new java.util.TreeSet();
/**
 */
    public java.util.Collection member = new java.util.TreeSet();

/**
 * @return 
 */
    public String getLibelProduct() {        
        return libelProduct;
    } 

/**
 * @param _libelProduct 
 */
    public void setLibelProduct(String _libelProduct) {        
        libelProduct = _libelProduct;
    } 

/**
 * @return 
 */
    public int getStockProductt() {        
        return stockProductt;
    } 

/**
 * @param _stockProductt 
 */
    public void setStockProductt(int _stockProductt) {        
        stockProductt = _stockProductt;
    } 

/**
 * @return 
 */
    public int getReductionProduct() {        
        return reductionProduct;
    } 

/**
 * @param _reductionProduct 
 */
    public void setReductionProduct(int _reductionProduct) {        
        reductionProduct = _reductionProduct;
    } 

/**
 * @return 
 */
    public int getNumProduct() {        
        return numProduct;
    } 
 }
