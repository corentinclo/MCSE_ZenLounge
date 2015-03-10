
package BusinessLogic.Models;

// TODO: Auto-generated Javadoc
/**
 * The Class AdhesionYear.
 */
public class AdhesionYear implements ModelIt{

/** The member. */
	private Member member; 
    
    /** The year. */
    private int year;
    
    /** The amount contribution. */
    private int amountContribution;

/**
 * Gets the year.
 *
 * @return the year
 */
    public int getYear() {        
        return year;
    } 

/**
 * Gets the amount contribution.
 *
 * @return the amount contribution
 */
    public int getAmountContribution() {        
        return amountContribution;
    } 

/**
 * Sets the amount contribution.
 *
 * @param _amountContribution the new amount contribution
 */
    public void setAmountContribution(int _amountContribution) {        
        amountContribution = _amountContribution;
    }

/* (non-Javadoc)
 * @see BusinessLogic.Models.ModelIt#store()
 */
@Override
public boolean store() {
	return false;
	// TODO Auto-generated method stub
	
}

/* (non-Javadoc)
 * @see BusinessLogic.Models.ModelIt#remove()
 */
@Override
public boolean remove() {
	return false;
	// TODO Auto-generated method stub
	
}

 }
