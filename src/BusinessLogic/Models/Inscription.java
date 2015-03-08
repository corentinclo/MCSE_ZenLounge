

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

    //constructeur 
    public Inscription()
    {
    	this(-1);
    }
    
    public Inscription(int aNum)
    {
    	numIns=aNum;
    }
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
