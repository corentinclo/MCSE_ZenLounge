
package BusinessLogic.Models;

/**
 */
public abstract class Event {

/**
 */
    private final int numEvent;

/**
 */
    private String wordingEvent;

/**
 */
    private int price;
/**
 */
    public BusinessLogic.Models.Activite activite;
/**
 */
    public BusinessLogic.Models.Room room;
/**
 */
    public java.util.Collection inscription = new java.util.TreeSet();

    //constructeur
    public Event ()
    {
    	this(-1,"");
    }
    
    public Event (int aNum, String aWordingEvent)
    {
    	numEvent=aNum;
    	wordingEvent=aWordingEvent;
    }
/**
 * @return 
 */
    public int getNumEvent() {        
        return numEvent;
    } 

/**
 * @return 
 */
    public String getWordingEvent() {        
        return wordingEvent;
    } 

/**
 * @param _wordingEvent 
 */
    public void setWordingEvent(String _wordingEvent) {        
        wordingEvent = _wordingEvent;
    } 

/**
 * @return 
 */
    public int getPrice() {        
        return price;
    } 

/**
 * @param _price 
 */
    public void setPrice(int _price) {        
        price = _price;
    } 
 }
