
package BusinessLogic.Facades;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import BusinessLogic.Models.User;

/**
 */
public abstract class UserManagement {

/**
 * @param id 
 * @param lastName 
 * @param firstName 
 * @param mail 
 * @param tel 
 * @param password 
 */
    public static void registerUser(String id, String lastName, String firstName, String mail, String tel, String password) {
    	try {
			User.registerUser(id, lastName, firstName, mail, tel, password);
		} catch (UnsupportedEncodingException | NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
    }

}
