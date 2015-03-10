package BusinessLogic.Models;

// TODO: Auto-generated Javadoc
/**
 * The Class AlreadySetNumberException.
 */
public class AlreadySetNumberException extends Exception {

	/**
	 * Instantiates a new already set number exception.
	 */
	public AlreadySetNumberException() {
		super("The primary unique number for this Model is already set.");
	}

	/**
	 * Instantiates a new already set number exception.
	 *
	 * @param message the message
	 */
	public AlreadySetNumberException(String message) {
		super(message);
	}

	/**
	 * Instantiates a new already set number exception.
	 *
	 * @param message the message
	 * @param cause the cause
	 */
	public AlreadySetNumberException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Instantiates a new already set number exception.
	 *
	 * @param cause the cause
	 */
	public AlreadySetNumberException(Throwable cause) {
		super(cause);
	}

}
