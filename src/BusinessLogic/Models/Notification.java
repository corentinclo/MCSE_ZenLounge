
package BusinessLogic.Models;


/**
 */
public class Notification {

/**
 */
    private final int numNotif;
    private java.sql.Timestamp sendDateNotif;
    private java.sql.Timestamp recepDateNotif;
    private String objectNotif;
    private String messageNotif;
    private User receiver;
    public BusinessLogic.Models.NotificationType notificationType;

    public java.util.Collection notificationCenter = new java.util.TreeSet();

    //contructeurs
    public Notification(int aNum)
    {
    	numNotif=aNum;
    }
    
    public Notification ()
    {
    	this(-1);
    }
/**
 * @return 
 */
    public java.sql.Timestamp getSendDateNotif() {        
        return sendDateNotif;
    } 

/**
 * @param _sendDateNotif 
 */
    public void setSendDateNotif(java.sql.Timestamp _sendDateNotif) {        
        sendDateNotif = _sendDateNotif;
    } 

/**
 * @return 
 */
    public java.sql.Timestamp getRecepDateNotif() {        
        return recepDateNotif;
    } 

/**
 * @param _recepDateNotif 
 */
    public void setRecepDateNotif(java.sql.Timestamp _recepDateNotif) {        
        recepDateNotif = _recepDateNotif;
    } 

/**
 * @return 
 */
    public String getObjectNotif() {        
        return objectNotif;
    } 

/**
 * @param _objectNotif 
 */
    public void setObjectNotif(String _objectNotif) {        
        objectNotif = _objectNotif;
    } 

/**
 * @return 
 */
    public String getMessageNotif() {        
        return messageNotif;
    } 

/**
 * @param _messageNotif 
 */
    public void setMessageNotif(String _messageNotif) {        
        messageNotif = _messageNotif;
    } 
 }
