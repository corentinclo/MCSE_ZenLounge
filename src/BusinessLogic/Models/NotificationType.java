
package BusinessLogic.Models;

/**
 */
public class NotificationType implements ModelIt{

/**
 */
    private final String wordingNotifType;
/**
 */
    public java.util.Collection notification = new java.util.TreeSet();
//constructeur
    public NotificationType()
    {
    	this("");
    }
    
    public NotificationType(String aWord)
    {
    	wordingNotifType=aWord;
    }
    
/**
 * @return 
 */
    public String getWordingNotifType() {        
        return wordingNotifType;
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
