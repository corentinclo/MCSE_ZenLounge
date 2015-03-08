
package BusinessLogic.Models;

/**
 */
public class PaymentType implements ModelIt{

/**
 */
    private String libelPayment;
/**
 */
    public java.util.Collection order = new java.util.TreeSet();

/**
 * @return 
 */
    public String getLibelPayment() {        
        return libelPayment;
    } 

/**
 * @param _libelPayment 
 */
    public void setLibelPayment(String _libelPayment) {        
        libelPayment = _libelPayment;
    }

@Override
public boolean store() {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean remove() {
	// TODO Auto-generated method stub
	return false;
}


 }
