package BusinessLogic.Models;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Collection;
import java.util.TreeSet;

import BusinessLogic.Facades.NotificationCenter;

// TODO: Auto-generated Javadoc
/**
 * The Class User.
 */
public class User implements ModelIt{

	/** The num user. */
	private int numUser;
	
	/** The prefix user. */
	private String prefixUser;
	
	/** The sufix user. */
	private String sufixUser;
	
	/** The id user. */
	private String idUser;
	
	/** The mail user. */
	private String mailUser;
	
	/** The name user. */
	private String nameUser;
	
	/** The first name user. */
	private String firstNameUser;
	
	/** The tel user. */
	private String telUser;
	
	/** The password user. */
	private String passwordUser;
	
	/** The order. */
	public Order order;

	/** The shopping cart. */
	public Collection<Product> 	shoppingCart = new TreeSet<Product>();

	/** The notification center. */
	public NotificationCenter	notificationCenter;

	/** The activite. */
	public Collection<Activite>	activite = new TreeSet<Activite>();

	/**
	 * Instantiates a new user.
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
	 */
	public User(int num, String id, String lastName, String firstName,
			String mail, String tel, String password, String sufix,
			String prefix) {
		setNameUser(lastName);
		setFirstNameUser(firstName);
		setMailUser(mail);
		setTelUser(tel);
		setPasswordUser(password);
		setPrefixUser(prefix);
		setSufixUser(sufix);
		setIdUser(id);
		setNumUser(num);
	}

	/**
	 * Instantiates a new user.
	 */
	public User () {
		
	}

	/**
	 * Crypt password.
	 *
	 * @param password the password
	 * @param prefix the prefix
	 * @param sufix the sufix
	 * @return the string
	 * @throws NoSuchAlgorithmException the no such algorithm exception
	 * @throws UnsupportedEncodingException the unsupported encoding exception
	 */
	public static String cryptPassword(String password,String prefix, String sufix) throws NoSuchAlgorithmException, UnsupportedEncodingException{
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		md.update((prefix+password+sufix).getBytes());
		md.digest();
    	return new String(md.digest(), "UTF-16");
    }
	
	/**
	 * Register user.
	 *
	 * @param id the id
	 * @param lastName the last name
	 * @param firstName the first name
	 * @param mail the mail
	 * @param tel the tel
	 * @param password the password
	 * @throws UnsupportedEncodingException the unsupported encoding exception
	 * @throws NoSuchAlgorithmException the no such algorithm exception
	 */
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
    
	/**
	 * Gets the firs name user.
	 *
	 * @return the firs name user
	 */
	public String getFirsNameUser() {
		return getFirstNameUser();
	}
	
	/**
	 * Gets the first name user.
	 *
	 * @return the first name user
	 */
	public String getFirstNameUser() {
		return firstNameUser;
	}

	/**
	 * Gets the id user.
	 *
	 * @return the id user
	 */
	public String getIdUser() {
		return idUser;
	}

	/**
	 * Gets the mail user.
	 *
	 * @return the mail user
	 */
	public String getMailUser() {
		return mailUser;
	}

	/**
	 * Gets the name user.
	 *
	 * @return the name user
	 */
	public String getNameUser() {
		return nameUser;
	}

	/**
	 * Gets the num user.
	 *
	 * @return the num user
	 */
	public int getNumUser() {
		return numUser;
	}

	/**
	 * Gets the password user.
	 *
	 * @return the password user
	 */
	public String getPasswordUser() {
		return passwordUser;
	}

	/**
	 * Gets the prefix user.
	 *
	 * @return the prefix user
	 */
	public String getPrefixUser() {
		return prefixUser;
	}

	/**
	 * Gets the sufix user.
	 *
	 * @return the sufix user
	 */
	public String getSufixUser() {
		return sufixUser;
	}

	/**
	 * Gets the tel user.
	 *
	 * @return the tel user
	 */
	public String getTelUser() {
		return telUser;
	}

	/* (non-Javadoc)
	 * @see BusinessLogic.Models.ModelIt#remove()
	 */
	@Override
	public boolean remove() {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * Sets the firs name user.
	 *
	 * @param _firsNameUser the new firs name user
	 */
	public void setFirsNameUser(String _firsNameUser) {
		setFirstNameUser(_firsNameUser);
	}

	/**
	 * Sets the first name user.
	 *
	 * @param firstNameUser the new first name user
	 */
	public void setFirstNameUser(String firstNameUser) {
		this.firstNameUser = firstNameUser;
	}

	/**
	 * Sets the id user.
	 *
	 * @param _idUser the new id user
	 */
	public void setIdUser(String _idUser) {
		idUser = _idUser;
	}

	/**
	 * Sets the mail user.
	 *
	 * @param _mailUser the new mail user
	 */
	public void setMailUser(String _mailUser) {
		mailUser = _mailUser;
	}

	/**
	 * Sets the name user.
	 *
	 * @param _nameUser the new name user
	 */
	public void setNameUser(String _nameUser) {
		nameUser = _nameUser;
	}

	/**
	 * Sets the num user.
	 *
	 * @param numUser the new num user
	 */
	public void setNumUser(int numUser) {
		this.numUser = numUser;
	}

	/**
	 * Sets the password user.
	 *
	 * @param _passwordUser the new password user
	 */
	public void setPasswordUser(String _passwordUser) {
		passwordUser = _passwordUser;
	}

	/**
	 * Sets the prefix user.
	 *
	 * @param prefixUser the new prefix user
	 */
	public void setPrefixUser(String prefixUser) {
		this.prefixUser = prefixUser;
	}

	/**
	 * Sets the sufix user.
	 *
	 * @param sufixUser the new sufix user
	 */
	public void setSufixUser(String sufixUser) {
		this.sufixUser = sufixUser;
	}

	/**
	 * Sets the tel user.
	 *
	 * @param _telUser the new tel user
	 */
	public void setTelUser(String _telUser) {
		telUser = _telUser;
	}

	/* (non-Javadoc)
	 * @see BusinessLogic.Models.ModelIt#store()
	 */
	@Override
	public boolean store() {
		System.out.println("Num : " + getNumUser());
		System.out.println("Id : " + getIdUser());
		System.out.println("Name : " + getNameUser());
		System.out.println("First name : " + getFirstNameUser());
		System.out.println("Mail : " + getMailUser());
		System.out.println("Tel : " + getTelUser());
		System.out.println("Pass : " + getPasswordUser());
		System.out.println("Prefix : " + getPrefixUser());
		System.out.println("Suffix : " + getSufixUser());
		return true;
	}
}
