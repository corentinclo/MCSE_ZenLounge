
package BusinessLogic.Models;

// TODO: Auto-generated Javadoc
/**
 * The Class CommandState.
 */
public class CommandState implements ModelIt{

/** The libel state. */
	private int numState;
    private String wordingState;

/** The order. */
    public java.util.Collection order = new java.util.TreeSet();


    /**
     * Instantiates a new command state.
     */
    public CommandState ()
    {
    	this(-1,"");
    }
    
    /**
     * Instantiates a new command state.
     *
     * @param aString the a string
     * @param aNum the number of the command state
     */
    public CommandState (int aNum, String aString)
    {
    	numState=aNum;
    	wordingState=aString;
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

	public String getWordingState() {
		return wordingState;
	}

	public void setWordingState(String wordingState) {
		this.wordingState = wordingState;
	}

	public int getNumState() {
		return numState;
	}

	public void setNumState(int numState) {
		this.numState = numState;
	}

 }
