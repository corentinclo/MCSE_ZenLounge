
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
    public Accessory(int aNum)
    {
    	wordingAcc=aNum;
    }
    public Accessory() {
    	this(-1);
    }
    
    public int getWordingAcc() {        
        return wordingAcc;
    } 
 }
