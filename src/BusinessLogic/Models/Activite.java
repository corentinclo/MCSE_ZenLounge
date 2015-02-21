
package BusinessLogic.Models;

/**
 */
public class Activite {

/**
 */
    private final int numAct;

/**
 */
    private String nomActi;

/**
 */
    private String shortDescAct;

/**
 */
    private String longDescAct;
/**
 */
    public java.util.Collection user = new java.util.TreeSet();
/**
 */
    public java.util.Collection event = new java.util.TreeSet();
/**
 */
    public BusinessLogic.Models.Manager manager;

/**
 * @return 
 */
    public int getNumAct() {        
        return numAct;
    } 

/**
 * @return 
 */
    public String getNomActi() {        
        return nomActi;
    } 

/**
 * @param _nomActi 
 */
    public void setNomActi(String _nomActi) {        
        nomActi = _nomActi;
    } 

/**
 * @return 
 */
    public String getShortDescAct() {        
        return shortDescAct;
    } 

/**
 * @param _shortDescAct 
 */
    public void setShortDescAct(String _shortDescAct) {        
        shortDescAct = _shortDescAct;
    } 

/**
 * @return 
 */
    public String getLongDescAct() {        
        return longDescAct;
    } 

/**
 * @param _longDescAct 
 */
    public void setLongDescAct(String _longDescAct) {        
        longDescAct = _longDescAct;
    } 
 }
