
package BusinessLogic.Models;

/**
 */
public class TimeSlot {

/**
 */
    private final String daySlot;

/**
 */
    private final int hourSlot;

/**
 */
    private int durationSlot;

/**
 * @return 
 */
    public String getDaySlot() {        
        return daySlot;
    } 

/**
 * @return 
 */
    public int getHourSlot() {        
        return hourSlot;
    } 

/**
 * @return 
 */
    public int getDurationSlot() {        
        return durationSlot;
    } 

/**
 * @param _durationSlot 
 */
    public void setDurationSlot(int _durationSlot) {        
        durationSlot = _durationSlot;
    } 
/**
 */
    public java.util.Collection regularEvent = new java.util.TreeSet();
 }
