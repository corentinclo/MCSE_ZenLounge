
package BusinessLogic.Models;

/**
 */
public class Accessory {

/**
 */
    private final int wordingAcc;
/**
 */
    public java.util.Collection accessoryLine = new java.util.TreeSet();

/**
 * @return 
 */
    public Accessory() {
    	wordingAcc=0;
    }
    
    public int getWordingAcc() {        
        return wordingAcc;
    } 
 }
