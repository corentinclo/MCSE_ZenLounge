
package BusinessLogic.Models;

// TODO: Auto-generated Javadoc
/**
 * The Class Room.
 */
public abstract class Room {

/** The num room. */
    private final int numRoom;

/** The room area. */
    private float roomArea;

/** The event. */
    public java.util.Collection event = new java.util.TreeSet();

/** The accessory line. */
    public java.util.Collection accessoryLine = new java.util.TreeSet();

    //constructeur
    /**
     * Instantiates a new room.
     */
    public Room()
    {
    	this(-1);
    }
    
    /**
     * Instantiates a new room.
     *
     * @param aNum the a num
     */
    public Room(int aNum)
    {
    	numRoom=aNum;
    }

/**
 * Gets the num room.
 *
 * @return the num room
 */
    public int getNumRoom() {        
        return numRoom;
    } 

/**
 * Gets the room area.
 *
 * @return the room area
 */
    public float getRoomArea() {        
        return roomArea;
    } 

/**
 * Sets the room area.
 *
 * @param _roomArea the new room area
 */
    public void setRoomArea(float _roomArea) {        
        roomArea = _roomArea;
    } 
 }
