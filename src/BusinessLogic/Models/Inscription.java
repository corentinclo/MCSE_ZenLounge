

package BusinessLogic.Models;
/**
 */
public class Inscription {

/**
 */
    private final int numIns;

/**
 */
    private String paymenMethodeIns;

/**
 * @return 
 */
    public int getNumIns() {        
        return numIns;
    } 

/**
 * @return 
 */
    public String getPaymenMethodeIns() {        
        return paymenMethodeIns;
    } 

/**
 * @param _paymenMethodeIns 
 */
    public void setPaymenMethodeIns(String _paymenMethodeIns) {        
        paymenMethodeIns = _paymenMethodeIns;
    } 
/**
 */
    public BusinessLogic.Models.Event event;
/**
 */
    public BusinessLogic.Models.Member member;
 }
