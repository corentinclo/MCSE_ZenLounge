
package BusinessLogic.Models;

/**
 */
public class EventType implements ModelIt{

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
