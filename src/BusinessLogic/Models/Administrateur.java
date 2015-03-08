package BusinessLogic.Models;

/**
 */
public class Administrateur extends BusinessLogic.Models.User {

	/**
	 * @param aNum
	 */
	public Administrateur(int num, String id, String lastName,
			String firstName, String mail, String tel, String password,
			String sufix, String prefix) {
		super(num, id, lastName, firstName, mail, tel, password, sufix, prefix);
	}
}
