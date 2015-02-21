

package BusinessLogic.Models;
/**
 */
public class AccessoryLine {

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
 }
