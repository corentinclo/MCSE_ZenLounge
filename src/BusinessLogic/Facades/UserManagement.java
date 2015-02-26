
package BusinessLogic.Facades;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

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
    	String cryptPassword = null;
    	SecureRandom random = new SecureRandom();
    	String prefix = null;
    	String sufix = null;
		try {
			prefix = new String(random.generateSeed(8),"UTF-16");
			sufix = new String(random.generateSeed(8),"UTF-16");
			cryptPassword = cryptPassword(password,prefix,sufix);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		
    	User newUser = new User(-1,id,lastName,firstName,mail,tel,cryptPassword,prefix,sufix);
    	newUser.store();
    } 
    
    public static String cryptPassword(String password,String prefix, String sufix) throws NoSuchAlgorithmException, UnsupportedEncodingException{
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		md.update((prefix+password+sufix).getBytes());
		md.digest();
    	return new String(md.digest(), "UTF-16");
    }

}
