
package BusinessLogic.Models;

/**
 */
public class Classroom extends Room implements ModelIt {

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
