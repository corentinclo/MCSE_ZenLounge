
package BusinessLogic.Models;

/**
 */
public class Year {

/**
 */
    private final int year;

/**
 */
    private int amountContribution;
/**
 */
    public java.util.Collection member = new java.util.TreeSet();

    //constructeur 
    public Year()
    {
    	this(-1);
    }
    
    public Year(int aYear)
    {
    	year=aYear;
    }
/**
 * @return 
 */
    public int getYear() {        
        return year;
    } 

/**
 * @return 
 */
    public int getAmountContribution() {        
        return amountContribution;
    } 

/**
 * @param _amountContribution 
 */
    public void setAmountContribution(int _amountContribution) {        
        amountContribution = _amountContribution;
    } 
 }
