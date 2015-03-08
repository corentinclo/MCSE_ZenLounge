
package BusinessLogic.Models;

/**
 */
public class Category implements ModelIt{

/**
 */
    private final String wordingCat;

/**
 * @return 
 */
    public String getWordingCat() {        
        return wordingCat;
    } 
    
/**
* 
*/
    public Category ()
    {
    	this("");
    }

    public Category(String aString) 
	{
    	wordingCat=aString;
	}

	@Override
	public boolean store() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove() {
		// TODO Auto-generated method stub
		return false;
	}
 }
