
package BusinessLogic.Models;

/**
 */
public class NotificationType {

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
 }
