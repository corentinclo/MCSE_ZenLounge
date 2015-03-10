
package BusinessLogic.Models;

import java.util.Collection;
import java.util.TreeSet;

// TODO: Auto-generated Javadoc
/**
 * The Class Member.
 */
public class Member extends User implements ModelIt {

    /** The adhesion years. */
    public Collection<AdhesionYear> adhesionYears = new TreeSet();
    
    /** The events inscriptions. */
    public Collection<Event> eventsInscriptions = new TreeSet();
    
    /** The selling products. */
    public Collection<Product> sellingProducts = new TreeSet();

    //constructeur
	/**
     * Instantiates a new member.
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
     * @param adress the adress
     */
    public Member(int num, String id, String lastName,
			String firstName, String mail, String tel, String password,
			String sufix, String prefix, String adress) {
		super(num, id, lastName, firstName, mail, tel, password, sufix, prefix);
	}
 }
