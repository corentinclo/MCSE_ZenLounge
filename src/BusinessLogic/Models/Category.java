
package BusinessLogic.Models;

/**
 */
public class Category {

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
 }
