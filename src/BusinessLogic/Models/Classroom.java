
package BusinessLogic.Models;

// TODO: Auto-generated Javadoc
/**
 * The Class Classroom.
 */
public class Classroom extends Room implements ModelIt {

/** The room capacity. */
    private int roomCapacity;

/**
 * Gets the room capacity.
 *
 * @return the room capacity
 */
    public int getRoomCapacity() {        
        return roomCapacity;
    } 

/**
 * Sets the room capacity.
 *
 * @param _roomCapacity the new room capacity
 */
    public void setRoomCapacity(int _roomCapacity) {        
        roomCapacity = _roomCapacity;
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
