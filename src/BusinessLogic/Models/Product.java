
package BusinessLogic.Models;

/**
 */
public class Product extends Category implements ModelIt {

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
    
//contructeur
    public Product()
    {
    	this(-1);
    }
    
    public Product(int aNum)
    {
    	numProduct=aNum;
    }
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
