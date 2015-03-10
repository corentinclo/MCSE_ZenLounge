
package BusinessLogic.Models;

// TODO: Auto-generated Javadoc
/**
 * The Class RegularEvent.
 */
public class RegularEvent extends Event implements ModelIt {

/** The time slot. */
    public java.util.Collection timeSlot = new java.util.TreeSet();

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
