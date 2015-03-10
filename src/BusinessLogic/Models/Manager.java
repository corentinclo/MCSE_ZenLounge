
package BusinessLogic.Models;

import java.util.Collection;
import java.util.TreeSet;

// TODO: Auto-generated Javadoc
/**
 * The Class Manager.
 */
public class Manager extends User implements ModelIt {

    /** The adress man. */
    private String adressMan;
    
    /** The activites. */
    public Collection<Activite> activites = new TreeSet();

    //constructeur
	/**
     * Instantiates a new manager.
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
    public Manager(int num, String id, String lastName,
			String firstName, String mail, String tel, String password,
			String sufix, String prefix, String adress) {
		super(num, id, lastName, firstName, mail, tel, password, sufix, prefix);
		adressMan = adress;
	}

/**
 * Gets the adress man.
 *
 * @return the adress man
 */
    public String getAdressMan() {        
        return adressMan;
    } 
 }
