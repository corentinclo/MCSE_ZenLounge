package BusinessLogic.Models;

/**
 */
public class Administrateur extends User implements ModelIt {

	/**
	 * @param aNum
	 */
	public Administrateur(int num, String id, String lastName,
			String firstName, String mail, String tel, String password,
			String sufix, String prefix) {
		super(num, id, lastName, firstName, mail, tel, password, sufix, prefix);
	}

	@Override
	public boolean store() {
		return false;
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean remove() {
		return false;
		// TODO Auto-generated method stub
		
	}
}
