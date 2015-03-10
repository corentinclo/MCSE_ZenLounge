
package BusinessLogic.Models;

// TODO: Auto-generated Javadoc
/**
 * The Class PaymentType.
 */
public class PaymentType implements ModelIt{

/** The libel payment. */
    private String libelPayment;

/** The order. */
    public java.util.Collection order = new java.util.TreeSet();

/**
 * Gets the libel payment.
 *
 * @return the libel payment
 */
    public String getLibelPayment() {        
        return libelPayment;
    } 

/**
 * Sets the libel payment.
 *
 * @param _libelPayment the new libel payment
 */
    public void setLibelPayment(String _libelPayment) {        
        libelPayment = _libelPayment;
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
