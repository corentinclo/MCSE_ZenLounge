
package BusinessLogic.Models;

import java.util.Collection;
import java.util.TreeSet;

/**
 */
public class Member extends User implements ModelIt {

    public Collection<AdhesionYear> adhesionYears = new TreeSet();
    public Collection<Event> eventsInscriptions = new TreeSet();
    public Collection<Product> sellingProducts = new TreeSet();

    //constructeur
	public Member(int num, String id, String lastName,
			String firstName, String mail, String tel, String password,
			String sufix, String prefix, String adress) {
		super(num, id, lastName, firstName, mail, tel, password, sufix, prefix);
	}
 }
