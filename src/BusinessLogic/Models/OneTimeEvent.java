package BusinessLogic.Models;

import java.sql.Timestamp;

/**
 */
public class OneTimeEvent extends BusinessLogic.Models.Event {

/**
 */
    private Timestamp durationOTE;

/**
 */
    private int dateOTE;

/**
 * @return 
 */
    public Timestamp getDurationOTE() {
        return durationOTE;
    }

/**
 * @param _durationOTE 
 */
    public void setDurationOTE(Timestamp _durationOTE) {
        durationOTE = _durationOTE;
    }

/**
 * @return 
 */
    public int getDateOTE() {
        return dateOTE;
    }

/**
 * @param _dateOTE 
 */
    public void setDateOTE(int _dateOTE) {
        dateOTE = _dateOTE;
    }
 }
