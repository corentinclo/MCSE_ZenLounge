
package BusinessLogic.Models;

// TODO: Auto-generated Javadoc
/**
 * The Class CommandState.
 */
public class CommandState implements ModelIt{

/** The libel state. */
    private final String libelState;

/** The order. */
    public java.util.Collection order = new java.util.TreeSet();

/**
 * Gets the libel state.
 *
 * @return the libel state
 */
    public String getLibelState() {        
        return libelState;
    } 
    
    /**
     * Instantiates a new command state.
     */
    public CommandState ()
    {
    	this("");
    }
    
    /**
     * Instantiates a new command state.
     *
     * @param aString the a string
     */
    public CommandState (String aString)
    {
    	libelState=aString;
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
