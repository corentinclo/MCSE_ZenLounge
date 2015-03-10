
package BusinessLogic.Models;

// TODO: Auto-generated Javadoc
/**
 * The Class NotificationType.
 */
public class NotificationType implements ModelIt{

/** The wording notif type. */
    private final String wordingNotifType;

/** The notification. */
    public java.util.Collection notification = new java.util.TreeSet();
//constructeur
    /**
 * Instantiates a new notification type.
 */
public NotificationType()
    {
    	this("");
    }
    
    /**
     * Instantiates a new notification type.
     *
     * @param aWord the a word
     */
    public NotificationType(String aWord)
    {
    	wordingNotifType=aWord;
    }
    
/**
 * Gets the wording notif type.
 *
 * @return the wording notif type
 */
    public String getWordingNotifType() {        
        return wordingNotifType;
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
