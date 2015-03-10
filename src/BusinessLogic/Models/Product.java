
package BusinessLogic.Models;

// TODO: Auto-generated Javadoc
/**
 * The Class Product.
 */
public class Product extends Category implements ModelIt {

/** The num product. */
    private int numProduct;

/** The libel product. */
    private String libelProduct;

/** The stock productt. */
    private int stockProductt;

/** The reduction product. */
    private int reductionProduct;

/** The command line. */
    public java.util.Collection commandLine = new java.util.TreeSet();

/** The cart line. */
    public java.util.Collection cartLine = new java.util.TreeSet();

/** The member. */
    public java.util.Collection member = new java.util.TreeSet();
    
//contructeur
    /**
 * Instantiates a new product.
 */
public Product()
    {
    	this(-1);
    }
    
    /**
     * Instantiates a new product.
     *
     * @param aNum the a num
     */
    public Product(int aNum)
    {
    	numProduct=aNum;
    }

/**
 * Gets the libel product.
 *
 * @return the libel product
 */
    public String getLibelProduct() {        
        return libelProduct;
    } 

/**
 * Sets the libel product.
 *
 * @param _libelProduct the new libel product
 */
    public void setLibelProduct(String _libelProduct) {        
        libelProduct = _libelProduct;
    } 

/**
 * Gets the stock productt.
 *
 * @return the stock productt
 */
    public int getStockProductt() {        
        return stockProductt;
    } 

/**
 * Sets the stock productt.
 *
 * @param _stockProductt the new stock productt
 */
    public void setStockProductt(int _stockProductt) {        
        stockProductt = _stockProductt;
    } 

/**
 * Gets the reduction product.
 *
 * @return the reduction product
 */
    public int getReductionProduct() {        
        return reductionProduct;
    } 

/**
 * Sets the reduction product.
 *
 * @param _reductionProduct the new reduction product
 */
    public void setReductionProduct(int _reductionProduct) {        
        reductionProduct = _reductionProduct;
    } 

/**
 * Gets the num product.
 *
 * @return the num product
 */
    public int getNumProduct() {        
        return numProduct;
    } 
 }
