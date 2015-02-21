
package BusinessLogic.Models;

/**
 */
public class Classroom extends BusinessLogic.Models.Room {

/**
 */
    private int roomCapacity;

/**
 * @return 
 */
    public int getRoomCapacity() {        
        return roomCapacity;
    } 

/**
 * @param _roomCapacity 
 */
    public void setRoomCapacity(int _roomCapacity) {        
        roomCapacity = _roomCapacity;
    } 
 }
