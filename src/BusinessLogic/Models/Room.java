
package BusinessLogic.Models;

/**
 */
public abstract class Room {

/**
 */
    private final int numRoom;

/**
 */
    private float roomArea;
/**
 */
    public java.util.Collection event = new java.util.TreeSet();
/**
 */
    public java.util.Collection accessoryLine = new java.util.TreeSet();

/**
 * @return 
 */
    public int getNumRoom() {        
        return numRoom;
    } 

/**
 * @return 
 */
    public float getRoomArea() {        
        return roomArea;
    } 

/**
 * @param _roomArea 
 */
    public void setRoomArea(float _roomArea) {        
        roomArea = _roomArea;
    } 
 }
