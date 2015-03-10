
package BusinessLogic.Models;

// TODO: Auto-generated Javadoc
/**
 * The Class Category.
 */
public class Category implements ModelIt{

/** The wording cat. */
    private final String wordingCat;

/**
 * Gets the wording cat.
 *
 * @return the wording cat
 */
    public String getWordingCat() {        
        return wordingCat;
    } 
    
/**
 * Instantiates a new category.
 */
    public Category ()
    {
    	this("");
    }

    /**
     * Instantiates a new category.
     *
     * @param aString the a string
     */
    public Category(String aString) 
	{
    	wordingCat=aString;
	}

	/* (non-Javadoc)
	 * @see BusinessLogic.Models.ModelIt#store()
	 */
	@Override
	public boolean store() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see BusinessLogic.Models.ModelIt#remove()
	 */
	@Override
	public boolean remove() {
		// TODO Auto-generated method stub
		return false;
	}
 }
