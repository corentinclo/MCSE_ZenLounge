
package BusinessLogic.Models;

// TODO: Auto-generated Javadoc
/**
 * The Class Accessory.
 */
public class Accessory implements ModelIt{

/** The wording acc. */
    private final int wordingAcc;

/** The accessory line. */
    public java.util.Collection accessoryLine = new java.util.TreeSet();

/**
 * Instantiates a new accessory.
 *
 * @param aNum the a num
 */
    public Accessory(int aNum)
    {
    	wordingAcc=aNum;
    }
    
    /**
     * Instantiates a new accessory.
     */
    public Accessory() {
    	this(-1);
    }
    
    /**
     * Gets the wording acc.
     *
     * @return the wording acc
     */
    public int getWordingAcc() {        
        return wordingAcc;
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
