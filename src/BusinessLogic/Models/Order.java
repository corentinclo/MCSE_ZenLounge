
package BusinessLogic.Models;

/**
 */
public class Order {

/**
 */
    private final int numOrder;

/**
 */
    private java.sql.Timestamp date;
/**
 */
    public BusinessLogic.Models.PaymentType paymentType;
/**
 */
    public java.util.Collection user = new java.util.TreeSet();
/**
 */
    public BusinessLogic.Models.CommandState commandState;
/**
 */
    public java.util.Collection commandLine = new java.util.TreeSet();

/**
 * @return 
 */
    public int getNumOrder() {        
        return numOrder;
    } 

/**
 * @return 
 */
    public TIMESTAMP getDate() {        
        return date;
    } 

/**
 * @param _date 
 */
    public void setDate(TIMESTAMP _date) {        
        date = _date;
    } 
 }
