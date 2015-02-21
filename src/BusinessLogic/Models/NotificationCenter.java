
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

/**
 * @return 
 */
    public int getNumCenter() {        
        return numCenter;
    } 
 }
