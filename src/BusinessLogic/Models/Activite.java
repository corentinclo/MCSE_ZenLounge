
package BusinessLogic.Models;

// TODO: Auto-generated Javadoc
/**
 * The Class Activite.
 */
public class Activite implements ModelIt{


    /** The num act. */
    private int numAct;
    
    /** The nom acti. */
    private String nomActi;
    
    /** The short desc act. */
    private String shortDescAct;
    
    /** The long desc act. */
    private String longDescAct;

    /** The user. */
    public java.util.Collection user = new java.util.TreeSet();
    
    /** The event. */
    public java.util.Collection event = new java.util.TreeSet();
    
    /** The manager. */
    public BusinessLogic.Models.Manager manager;

    //constructeur
    /**
     * Instantiates a new activite.
     */
    public Activite() {
    	this(-1);
    }
    
    /**
     * Instantiates a new activite.
     *
     * @param aNum the a num
     */
    public Activite(int aNum) {
    	numAct=aNum;
    }
    
    //getter
    /**
     * Gets the num act.
     *
     * @return the num act
     */
    public int getNumAct() {        
        return numAct;
    } 
    
    /**
     * Gets the nom acti.
     *
     * @return the nom acti
     */
    public String getNomActi() {        
        return nomActi;
    } 

    //setter
    /**
     * Sets the nom acti.
     *
     * @param _nomActi the new nom acti
     */
    public void setNomActi(String _nomActi) {        
        nomActi = _nomActi;
    } 


    /**
     * Gets the short desc act.
     *
     * @return the short desc act
     */
    public String getShortDescAct() {        
        return shortDescAct;
    } 

    /**
     * Sets the short desc act.
     *
     * @param _shortDescAct the new short desc act
     */
    public void setShortDescAct(String _shortDescAct) {        
        shortDescAct = _shortDescAct;
    } 

/**
 * Gets the long desc act.
 *
 * @return the long desc act
 */
    public String getLongDescAct() {        
        return longDescAct;
    } 

/**
 * Sets the long desc act.
 *
 * @param _longDescAct the new long desc act
 */
    public void setLongDescAct(String _longDescAct) {        
        longDescAct = _longDescAct;
    }

/* (non-Javadoc)
 * @see BusinessLogic.Models.ModelIt#store()
 */
@Override
public boolean store() {
	return false;
	// TODO Auto-generated method stub
	
}

/* (non-Javadoc)
 * @see BusinessLogic.Models.ModelIt#remove()
 */
@Override
public boolean remove() {
	return false;
	// TODO Auto-generated method stub
	
}

 }
