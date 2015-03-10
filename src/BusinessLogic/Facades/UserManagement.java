
package BusinessLogic.Facades;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import BusinessLogic.Models.User;

// TODO: Auto-generated Javadoc
/**
 * The Class UserManagement.
 */
public abstract class UserManagement {

/**
 * Register user.
 *
 * @param id the id
 * @param lastName the last name
 * @param firstName the first name
 * @param mail the mail
 * @param tel the tel
 * @param password the password
 */
    public static void registerUser(String id, String lastName, String firstName, String mail, String tel, String password) {
    	try {
			User.registerUser(id, lastName, firstName, mail, tel, password);
		} catch (UnsupportedEncodingException | NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
    }

}
