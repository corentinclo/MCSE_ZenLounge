
package BusinessLogic.Models;

import java.sql.Timestamp;

// TODO: Auto-generated Javadoc
/**
 * The Class Order.
 */
public class Order implements ModelIt{

/** The num order. */
    private final int numOrder;

/** The date. */
    private java.sql.Timestamp date;

/** The payment type. */
    public BusinessLogic.Models.PaymentType paymentType;

/** The user. */
    public java.util.Collection user = new java.util.TreeSet();

/** The command state. */
    public BusinessLogic.Models.CommandState commandState;

/** The command line. */
    public java.util.Collection commandLine = new java.util.TreeSet();
//constructeur
    /**
 * Instantiates a new order.
 */
public Order()
    {
    	this(-1);
    }
    
    /**
     * Instantiates a new order.
     *
     * @param aNum the a num
     */
    public Order(int aNum)
    {
    	numOrder=aNum;
    }

/**
 * Gets the num order.
 *
 * @return the num order
 */
    public int getNumOrder() {        
        return numOrder;
    } 

/**
 * Gets the date.
 *
 * @return the date
 */
    public Timestamp getDate() {        
        return date;
    } 

/**
 * Sets the date.
 *
 * @param _date the new date
 */
    public void setDate(Timestamp _date) {        
        date = _date;
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
