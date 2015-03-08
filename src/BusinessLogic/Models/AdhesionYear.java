
package BusinessLogic.Models;

/**
 */
public class AdhesionYear {

/**
 */
	private Member member; 
    private int year;
    private int amountContribution;

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
