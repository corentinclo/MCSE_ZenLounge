
package BusinessLogic.Models;

// TODO: Auto-generated Javadoc
/**
 * The Class Event.
 */
public abstract class Event {

/** The num event. */
    private final int numEvent;

/** The wording event. */
    private String wordingEvent;

/** The price. */
    private int price;

/** The activite. */
    public BusinessLogic.Models.Activite activite;

/** The room. */
    public BusinessLogic.Models.Room room;

/** The inscription. */
    public java.util.Collection inscription = new java.util.TreeSet();

    //constructeur
    /**
     * Instantiates a new event.
     */
    public Event ()
    {
    	this(-1,"");
    }
    
    /**
     * Instantiates a new event.
     *
     * @param aNum the a num
     * @param aWordingEvent the a wording event
     */
    public Event (int aNum, String aWordingEvent)
    {
    	numEvent=aNum;
    	wordingEvent=aWordingEvent;
    }

/**
 * Gets the num event.
 *
 * @return the num event
 */
    public int getNumEvent() {        
        return numEvent;
    } 

/**
 * Gets the wording event.
 *
 * @return the wording event
 */
    public String getWordingEvent() {        
        return wordingEvent;
    } 

/**
 * Sets the wording event.
 *
 * @param _wordingEvent the new wording event
 */
    public void setWordingEvent(String _wordingEvent) {        
        wordingEvent = _wordingEvent;
    } 

/**
 * Gets the price.
 *
 * @return the price
 */
    public int getPrice() {        
        return price;
    } 

/**
 * Sets the price.
 *
 * @param _price the new price
 */
    public void setPrice(int _price) {        
        price = _price;
    } 
 }
