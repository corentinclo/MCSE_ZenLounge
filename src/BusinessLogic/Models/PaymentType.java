
package BusinessLogic.Models;

/**
 */
public class PaymentType {

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
 }
