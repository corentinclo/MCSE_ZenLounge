
package BusinessLogic.Models;

/**
 */
public class NotificationCenter {

/**
 */
    private final int numCenter;
/**
 */
    public BusinessLogic.Models.User user;
/**
 */
    public java.util.Collection notification = new java.util.TreeSet();


    //constructeur 
    public NotificationCenter()
    {
    	this(-1);
    }
    
    public NotificationCenter(int aNum)
    {
    	numCenter=aNum;
    }
    
    /**
     * @return 
     */
    public int getNumCenter() {        
        return numCenter;
    } 
 }
