
package BusinessLogic.Models;

import java.util.Collection;
import java.util.TreeSet;

/**
 */
public class Manager extends User implements ModelIt {

    private final String adressMan;
    public Collection<Activite> activites = new TreeSet();

    //constructeur
	public Manager(int num, String id, String lastName,
			String firstName, String mail, String tel, String password,
			String sufix, String prefix, String adress) {
		super(num, id, lastName, firstName, mail, tel, password, sufix, prefix);
		adressMan = adress;
	}

/**
 * @return 
 */
    public String getAdressMan() {        
        return adressMan;
    } 
 }
