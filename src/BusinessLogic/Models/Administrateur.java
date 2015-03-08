
package BusinessLogic.Models;

/**
 */
public class Administrateur extends BusinessLogic.Models.User {

/**
 */
    private final int numAdmin;

/**
 * @return 
 */
    public int getNumAdmin() {        
        return numAdmin;
    } 
    
 /**
 * 
 */
    public Administrateur ()
    {
    	this(-1);
    }
    
/**
* @param aNum  
*/
     public Administrateur (int aNum)
     {
        numAdmin=aNum;
     }
 }
