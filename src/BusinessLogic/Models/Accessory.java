
package BusinessLogic.Models;

/**
 */
public class Accessory implements ModelIt{

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
	@Override
	public boolean store() {
		return false;
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean remove() {
		return false;
		// TODO Auto-generated method stub
		
	}
 }
