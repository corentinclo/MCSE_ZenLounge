package BusinessLogic.Models;

import java.sql.Timestamp;

// TODO: Auto-generated Javadoc
/**
 * The Class OneTimeEvent.
 */
public class OneTimeEvent extends Event implements ModelIt {

/** The duration ote. */
    private Timestamp durationOTE;

/** The date ote. */
    private int dateOTE;

/**
 * Gets the duration ote.
 *
 * @return the duration ote
 */
    public Timestamp getDurationOTE() {
        return durationOTE;
    }

/**
 * Sets the duration ote.
 *
 * @param _durationOTE the new duration ote
 */
    public void setDurationOTE(Timestamp _durationOTE) {
        durationOTE = _durationOTE;
    }

/**
 * Gets the date ote.
 *
 * @return the date ote
 */
    public int getDateOTE() {
        return dateOTE;
    }

/**
 * Sets the date ote.
 *
 * @param _dateOTE the new date ote
 */
    public void setDateOTE(int _dateOTE) {
        dateOTE = _dateOTE;
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
