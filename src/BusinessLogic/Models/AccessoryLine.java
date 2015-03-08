

package BusinessLogic.Models;
/**
 */
public class AccessoryLine implements ModelIt{

/**
 */
    private int quantityAcc;

/**
 * @return 
 */
    public int getQuantityAcc() {        
        return quantityAcc;
    } 

/**
 * @param _quantityAcc 
 */
    public void setQuantityAcc(int _quantityAcc) {        
        quantityAcc = _quantityAcc;
    } 
/**
 */
    public BusinessLogic.Models.Accessory accessory;
/**
 */
    public BusinessLogic.Models.Room room;

@Override
public boolean store() {
	return false;
	// TODO Auto-generated method stub
	
}

@Override
public boolean remove() {
	return false;
	// TODO Auto-generated method stub
	
}

 }
