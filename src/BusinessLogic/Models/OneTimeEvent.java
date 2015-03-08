package BusinessLogic.Models;

import java.sql.Timestamp;

/**
 */
public class OneTimeEvent extends Event implements ModelIt {

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
