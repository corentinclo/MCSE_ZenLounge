
package BusinessLogic.Models;

/**
 */
public class EventType {

/**
 */
    private final String wordingType;

    //constructeur 
    public EventType()
    {
    	this("");
    }
    
    public EventType(String aWordingType)
    {
    	wordingType=aWordingType;
    }
    
/**
 * @return 
 */
    public String getWordingType() {        
        return wordingType;
    } 
 }
