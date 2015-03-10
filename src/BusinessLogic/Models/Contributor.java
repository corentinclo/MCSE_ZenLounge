
package BusinessLogic.Models;

// TODO: Auto-generated Javadoc
/**
 * The Class Contributor.
 */
public class Contributor extends User implements ModelIt {

    /** The adress contrib. */
    private String adressContrib;
    
    /** The descriptif contrib. */
    private String descriptifContrib;

    
	/**
	 * Instantiates a new contributor.
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
	 * @param desc the desc
	 */
	public Contributor(int num, String id, String lastName,
			String firstName, String mail, String tel, String password,
			String sufix, String prefix, String adress, String desc) {
		super(num, id, lastName, firstName, mail, tel, password, sufix, prefix);
		adressContrib = adress;
		descriptifContrib = desc;
	}
    
    
/**
 * Gets the adress contrib.
 *
 * @return the adress contrib
 */
    public String getAdressContrib() {        
        return adressContrib;
    } 

/**
 * Sets the adress contrib.
 *
 * @param _adressContrib the new adress contrib
 */
    public void setAdressContrib(String _adressContrib) {        
        adressContrib = _adressContrib;
    } 

/**
 * Gets the descriptif contrib.
 *
 * @return the descriptif contrib
 */
    public String getDescriptifContrib() {        
        return descriptifContrib;
    } 

/**
 * Sets the descriptif contrib.
 *
 * @param _descriptifContrib the new descriptif contrib
 */
    public void setDescriptifContrib(String _descriptifContrib) {        
        descriptifContrib = _descriptifContrib;
    } 
 }
