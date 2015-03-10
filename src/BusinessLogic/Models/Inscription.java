

package BusinessLogic.Models;
// TODO: Auto-generated Javadoc

/**
 * The Class Inscription.
 */
public class Inscription implements ModelIt{

/** The num ins. */
    private int numIns;

/** The paymen methode ins. */
    private String paymenMethodeIns;

    //constructeur 
    /**
     * Instantiates a new inscription.
     */
    public Inscription()
    {
    	this(-1);
    }
    
    /**
     * Instantiates a new inscription.
     *
     * @param aNum the a num
     */
    public Inscription(int aNum)
    {
    	numIns=aNum;
    }

/**
 * Gets the num ins.
 *
 * @return the num ins
 */
    public int getNumIns() {        
        return numIns;
    } 

/**
 * Gets the paymen methode ins.
 *
 * @return the paymen methode ins
 */
    public String getPaymenMethodeIns() {        
        return paymenMethodeIns;
    } 

/**
 * Sets the paymen methode ins.
 *
 * @param _paymenMethodeIns the new paymen methode ins
 */
    public void setPaymenMethodeIns(String _paymenMethodeIns) {        
        paymenMethodeIns = _paymenMethodeIns;
    } 

/** The event. */
    public BusinessLogic.Models.Event event;

/** The member. */
    public BusinessLogic.Models.Member member;

/* (non-Javadoc)
 * @see BusinessLogic.Models.ModelIt#store()
 */
@Override
public boolean store() {
	// TODO Auto-generated method stub
	return false;
}

/* (non-Javadoc)
 * @see BusinessLogic.Models.ModelIt#remove()
 */
@Override
public boolean remove() {
	// TODO Auto-generated method stub
	return false;
}
 }
