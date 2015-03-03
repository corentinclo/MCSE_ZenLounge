
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
//constructeur
    public TimeSlot()
    {
    	this("",-1);
    }
    
    public TimeSlot(String aDay, int aHour)
    {
    	daySlot=aDay;
    	hourSlot=aHour;
    }
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
