
package BusinessLogic.Models;

/**
 */
public class SubCategory extends BusinessLogic.Models.Category {

/**
 */
    private final String wordingSubCat;

    //constructeur
    public SubCategory()
    {
    	this("");
    }
    
    public SubCategory(String aWord)
    {
    	wordingSubCat=aWord;
    }
/**
 * @return 
 */
    public String getWordingSubCat() {        
        return wordingSubCat;
    } 
 }
