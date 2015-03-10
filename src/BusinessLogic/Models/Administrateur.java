package BusinessLogic.Models;

// TODO: Auto-generated Javadoc
/**
 * The Class Administrateur.
 */
public class Administrateur extends User implements ModelIt {

	/**
	 * Instantiates a new administrateur.
	 *
	 * @param num the num
	 * @param id the id
	 * @param lastName the last name
	 * @param firstName the first name
	 * @param mail the mail
	 * @param tel the tel
	 * @param password the password
	 * @param sufix the sufix
	 * @param prefix the prefix
	 */
	public Administrateur(int num, String id, String lastName,
			String firstName, String mail, String tel, String password,
			String sufix, String prefix) {
		super(num, id, lastName, firstName, mail, tel, password, sufix, prefix);
	}

	/* (non-Javadoc)
	 * @see BusinessLogic.Models.User#store()
	 */
	@Override
	public boolean store() {
		return false;
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see BusinessLogic.Models.User#remove()
	 */
	@Override
	public boolean remove() {
		return false;
		// TODO Auto-generated method stub
		
	}
}
