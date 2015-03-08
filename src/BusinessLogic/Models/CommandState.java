
package BusinessLogic.Models;

/**
 */
public class CommandState implements ModelIt{

/**
 */
    private final String libelState;
/**
 */
    public java.util.Collection order = new java.util.TreeSet();

/**
 * @return 
 */
    public String getLibelState() {        
        return libelState;
    } 
    
    /**
     * @return 
     */
    public CommandState ()
    {
    	this("");
    }
    
    public CommandState (String aString)
    {
    	libelState=aString;
    }

	@Override
	public boolean store() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove() {
		// TODO Auto-generated method stub
		return false;
	}

 }
