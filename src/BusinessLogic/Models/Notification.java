
package BusinessLogic.Models;


// TODO: Auto-generated Javadoc
/**
 * The Class Notification.
 */
public class Notification implements ModelIt{

/** The num notif. */
    private final int numNotif;
    
    /** The send date notif. */
    private java.sql.Timestamp sendDateNotif;
    
    /** The recep date notif. */
    private java.sql.Timestamp recepDateNotif;
    
    /** The object notif. */
    private String objectNotif;
    
    /** The message notif. */
    private String messageNotif;
    
    /** The receiver. */
    private User receiver;
    
    /** The notification type. */
    public BusinessLogic.Models.NotificationType notificationType;

    /** The notification center. */
    public java.util.Collection notificationCenter = new java.util.TreeSet();

    //contructeurs
    /**
     * Instantiates a new notification.
     *
     * @param aNum the a num
     */
    public Notification(int aNum)
    {
    	numNotif=aNum;
    }
    
    /**
     * Instantiates a new notification.
     */
    public Notification ()
    {
    	this(-1);
    }

/**
 * Gets the send date notif.
 *
 * @return the send date notif
 */
    public java.sql.Timestamp getSendDateNotif() {        
        return sendDateNotif;
    } 

/**
 * Sets the send date notif.
 *
 * @param _sendDateNotif the new send date notif
 */
    public void setSendDateNotif(java.sql.Timestamp _sendDateNotif) {        
        sendDateNotif = _sendDateNotif;
    } 

/**
 * Gets the recep date notif.
 *
 * @return the recep date notif
 */
    public java.sql.Timestamp getRecepDateNotif() {        
        return recepDateNotif;
    } 

/**
 * Sets the recep date notif.
 *
 * @param _recepDateNotif the new recep date notif
 */
    public void setRecepDateNotif(java.sql.Timestamp _recepDateNotif) {        
        recepDateNotif = _recepDateNotif;
    } 

/**
 * Gets the object notif.
 *
 * @return the object notif
 */
    public String getObjectNotif() {        
        return objectNotif;
    } 

/**
 * Sets the object notif.
 *
 * @param _objectNotif the new object notif
 */
    public void setObjectNotif(String _objectNotif) {        
        objectNotif = _objectNotif;
    } 

/**
 * Gets the message notif.
 *
 * @return the message notif
 */
    public String getMessageNotif() {        
        return messageNotif;
    } 

/**
 * Sets the message notif.
 *
 * @param _messageNotif the new message notif
 */
    public void setMessageNotif(String _messageNotif) {        
        messageNotif = _messageNotif;
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
