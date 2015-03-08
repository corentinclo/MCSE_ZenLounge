
package BusinessLogic.Models;

/**
 */
public class Contributor extends BusinessLogic.Models.User {

    private String adressContrib;
    private String descriptifContrib;

    
	public Contributor(int num, String id, String lastName,
			String firstName, String mail, String tel, String password,
			String sufix, String prefix, String adress, String desc) {
		super(num, id, lastName, firstName, mail, tel, password, sufix, prefix);
		adressContrib = adress;
		descriptifContrib = desc;
	}
    
    
/**
 * @return 
 */
    public String getAdressContrib() {        
        return adressContrib;
    } 

/**
 * @param _adressContrib 
 */
    public void setAdressContrib(String _adressContrib) {        
        adressContrib = _adressContrib;
    } 

/**
 * @return 
 */
    public String getDescriptifContrib() {        
        return descriptifContrib;
    } 

/**
 * @param _descriptifContrib 
 */
    public void setDescriptifContrib(String _descriptifContrib) {        
        descriptifContrib = _descriptifContrib;
    } 
 }
