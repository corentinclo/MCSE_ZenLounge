package BusinessLogic.Models;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Collection;
import java.util.TreeSet;

import BusinessLogic.Facades.NotificationCenter;

/**
 * @author florent
 *
 */
public class User {

	private final int numUser;
	private final String prefixUser;
	private final String sufixUser;
	private String idUser;
	private String mailUser;
	private String nameUser;
	private String firstNameUser;
	private String telUser;
	private String passwordUser;
	public Order order;
	public Collection<Product> 	shoppingCart = new TreeSet<Product>();
	public NotificationCenter	notificationCenter;
	public Collection<Activite>	activite = new TreeSet<Activite>();

	public User(int num, String id, String lastName, String firstName,
			String mail, String tel, String password, String sufix,
			String prefix) {
		nameUser 		= lastName;
		firstNameUser	= firstName;
		mailUser		= mail;
		telUser			= tel;
		passwordUser 	= password;
		prefixUser 		= prefix;
		sufixUser 		= sufix;
		idUser 			= id;
		numUser 		= num;
	}
	
    public static void registerUser(String id, String lastName, String firstName, String mail, String tel, String password) 
    		throws UnsupportedEncodingException, NoSuchAlgorithmException {        
    	String cryptPassword	= null;
    	SecureRandom random 	= new SecureRandom();
    	String prefix 			= null;
    	String sufix 			= null;
		prefix 	= new String(random.generateSeed(8),"UTF-16");
		sufix 	= new String(random.generateSeed(8),"UTF-16");
		cryptPassword = cryptPassword(password,prefix,sufix);
		
    	User newUser = new User(-1,id,lastName,firstName,mail,tel,cryptPassword,prefix,sufix);
    	newUser.store();
    } 
    
    public static String cryptPassword(String password,String prefix, String sufix) throws NoSuchAlgorithmException, UnsupportedEncodingException{
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		md.update((prefix+password+sufix).getBytes());
		md.digest();
    	return new String(md.digest(), "UTF-16");
    }

	/**
	 * @return
	 */
	public String getFirsNameUser() {
		return firstNameUser;
	}

	/**
	 * @return
	 */
	public String getIdUser() {
		return idUser;
	}

	/**
	 * @return
	 */
	public String getMailUser() {
		return mailUser;
	}

	/**
	 * @return
	 */
	public String getNameUser() {
		return nameUser;
	}

	/**
	 * @return
	 */
	public int getNumUser() {
		return numUser;
	}

	/**
	 * @return
	 */
	public String getPasswordUser() {
		return passwordUser;
	}

	/**
	 * @return
	 */
	public String getPrefixUser() {
		return prefixUser;
	}

	/**
	 * @return
	 */
	public String getSufixUser() {
		return sufixUser;
	}

	/**
	 * @return
	 */
	public String getTelUser() {
		return telUser;
	}

	/**
	 * @param _firsNameUser
	 */
	public void setFirsNameUser(String _firsNameUser) {
		firstNameUser = _firsNameUser;
	}

	/**
	 * @param _idUser
	 */
	public void setIdUser(String _idUser) {
		idUser = _idUser;
	}

	/**
	 * @param _mailUser
	 */
	public void setMailUser(String _mailUser) {
		mailUser = _mailUser;
	}

	/**
	 * @param _nameUser
	 */
	public void setNameUser(String _nameUser) {
		nameUser = _nameUser;
	}

	/**
	 * @param _passwordUser
	 */
	public void setPasswordUser(String _passwordUser) {
		passwordUser = _passwordUser;
	}

	/**
	 * @param _telUser
	 */
	public void setTelUser(String _telUser) {
		telUser = _telUser;
	}

	/**
	 * @return
	 */
	public Boolean store() {

		return null;
	}
}
