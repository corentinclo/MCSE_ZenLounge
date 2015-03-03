
package BusinessLogic.Models;

import java.sql.Timestamp;

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
//constructeur
    public Order()
    {
    	this(-1);
    }
    
    public Order(int aNum)
    {
    	numOrder=aNum;
    }
/**
 * @return 
 */
    public int getNumOrder() {        
        return numOrder;
    } 

/**
 * @return 
 */
    public Timestamp getDate() {        
        return date;
    } 

/**
 * @param _date 
 */
    public void setDate(Timestamp _date) {        
        date = _date;
    } 
 }
