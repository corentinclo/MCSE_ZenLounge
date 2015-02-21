
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
