
package BusinessLogic.Models;

/**
 */
public class CommandState {

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
 }
