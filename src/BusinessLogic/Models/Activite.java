
package BusinessLogic.Models;

public class Activite {


    private final int numAct;
    private String nomActi;
    private String shortDescAct;
    private String longDescAct;

    public java.util.Collection user = new java.util.TreeSet();
    public java.util.Collection event = new java.util.TreeSet();
    public BusinessLogic.Models.Manager manager;

    //constructeur
    public Activite() {
    	this(-1);
    }
    
    public Activite(int aNum) {
    	numAct=aNum;
    }
    
    //getter
    public int getNumAct() {        
        return numAct;
    } 
    
    public String getNomActi() {        
        return nomActi;
    } 

    //setter
    public void setNomActi(String _nomActi) {        
        nomActi = _nomActi;
    } 


    public String getShortDescAct() {        
        return shortDescAct;
    } 

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
