
package BusinessLogic.Models;

/**
 */
public class Manager extends BusinessLogic.Models.User {

/**
 */
    private final int numMan;

/**
 */
    private final String adressMan;

/**
 */
    private final String telMan;
/**
 */
    public java.util.Collection activite = new java.util.TreeSet();

    //constructeur
    public Manager()
    {
    	this(-1,"","");
    }
    
    public Manager(int aNum, String anAdress, String aTel)
    {
    	numMan=aNum;
    	adressMan=anAdress;
    	telMan=aTel;
    }
/**
 * @return 
 */
    public int getNumMan() {        
        return numMan;
    } 

/**
 * @return 
 */
    public String getAdressMan() {        
        return adressMan;
    } 

/**
 * @return 
 */
    public String getTelMan() {        
        return telMan;
    } 
 }
