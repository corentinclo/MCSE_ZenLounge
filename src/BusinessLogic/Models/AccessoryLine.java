

package BusinessLogic.Models;
// TODO: Auto-generated Javadoc

/**
 * The Class AccessoryLine.
 */
public class AccessoryLine implements ModelIt{

/** The quantity acc. */
    private int quantityAcc;

/**
 * Gets the quantity acc.
 *
 * @return the quantity acc
 */
    public int getQuantityAcc() {        
        return quantityAcc;
    } 

/**
 * Sets the quantity acc.
 *
 * @param _quantityAcc the new quantity acc
 */
    public void setQuantityAcc(int _quantityAcc) {        
        quantityAcc = _quantityAcc;
    } 

/** The accessory. */
    public BusinessLogic.Models.Accessory accessory;

/** The room. */
    public BusinessLogic.Models.Room room;

/* (non-Javadoc)
 * @see BusinessLogic.Models.ModelIt#store()
 */
@Override
public boolean store() {
	return false;
	// TODO Auto-generated method stub
	
}

/* (non-Javadoc)
 * @see BusinessLogic.Models.ModelIt#remove()
 */
@Override
public boolean remove() {
	return false;
	// TODO Auto-generated method stub
	
}

 }
