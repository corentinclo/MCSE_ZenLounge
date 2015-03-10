
package BusinessLogic.Models;

// TODO: Auto-generated Javadoc
/**
 * The Class EventType.
 */
public class EventType implements ModelIt{

/** The wording type. */
    private String wordingType;

    //constructeur 
    /**
     * Instantiates a new event type.
     */
    public EventType()
    {
    	this("");
    }
    
    /**
     * Instantiates a new event type.
     *
     * @param aWordingType the a wording type
     */
    public EventType(String aWordingType)
    {
    	wordingType=aWordingType;
    }
    
/**
 * Gets the wording type.
 *
 * @return the wording type
 */
    public String getWordingType() {        
        return wordingType;
    }

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
