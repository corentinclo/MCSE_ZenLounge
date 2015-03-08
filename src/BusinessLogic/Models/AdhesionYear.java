
package BusinessLogic.Models;

/**
 */
public class AdhesionYear implements ModelIt{

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

@Override
public boolean store() {
	return false;
	// TODO Auto-generated method stub
	
}

@Override
public boolean remove() {
	return false;
	// TODO Auto-generated method stub
	
}

 }
